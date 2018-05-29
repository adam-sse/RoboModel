package robodump;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import robomodel.robo.Motor;
import robomodel.robo.MotorType;
import robomodel.robo.Program;
import robomodel.robo.Robot;
import robomodel.robo.Sensor;
import robomodel.robo.Setup;
import robomodel.robo.command.Assignment;
import robomodel.robo.command.Branch;
import robomodel.robo.command.Command;
import robomodel.robo.command.Direction;
import robomodel.robo.command.Drive;
import robomodel.robo.command.Loop;
import robomodel.robo.condition.Comparison;
import robomodel.robo.condition.Condition;
import robomodel.robo.expression.Expr;
import robomodel.robo.expression.Literal;
import robomodel.robo.expression.Operation;
import robomodel.robo.expression.Variable;

public class EcoreToJavaConverter {
	
	private File outputDir;
	
	private StringBuilder code;
	
	private int indentation = 0;
	
	private Setup setup;
	
	private boolean rightReversed;
	
	private boolean leftReversed;
	
	private Set<String> sensorsToClose;
	
	private Set<String> sensorVariableNames;
	
	public EcoreToJavaConverter(Robot robot, File outputDir) {
		this.outputDir = outputDir;
		this.setup = robot.getSetup();
		this.rightReversed = setup.getRightMotor().isReversed();
		this.leftReversed = setup.getLeftMotor().isReversed();
	}
	
	private String makeNegativeIfReversed(String expr, boolean reversed) {
		if (reversed) {
			return "-(" + expr + ")";
		}
		return expr;
	}
    
    private void addLine(String line) {
        for (int i = 0; i < indentation; i++) {
        	code.append("\t");
        }
        code.append(line);
        code.append("\n");
    }
	
	public File writeProgram(Program p) throws IOException {
		code = new StringBuilder();
		sensorsToClose = new HashSet<String>();
		sensorVariableNames = new HashSet<String>();
		
		writeHeader(p.getName());
		
		for (Command c : p.getCommands()) {
			writeCommand(c);
			addLine("");
		}
		
		writeFooter(p.getName());
		
		return writeFile(p.getName());
	}
	
	private File writeFile(String name) throws IOException {
		File f = new File(outputDir, name + ".java");
		
		try (FileOutputStream out = new FileOutputStream(f)) {
			out.write(code.toString().getBytes());
		}
		
		return f;
	}
	
	private void writeCommand(Command c) {
		if (c instanceof Drive) {
			writeDrive((Drive) c);
			
		} else if (c instanceof Branch) {
			writeBranch((Branch) c);
			
		} else if (c instanceof Loop) {
			writeLoop((Loop) c);
			
		} else if (c instanceof Assignment) {
			writeAssignment((Assignment) c);
		}
	}
	
	private void writeDrive(Drive d) {
		if (d.getDistance() != null) {
			String distance = exprToString(d.getDistance());
			
			switch (d.getDirection()) {
			case BACKWARD:
				distance = "-(" + distance + ")";
				// fall-through
			case FORWARD:
				addLine("/* drive " + distance + "; */");
				addLine("right.startSynchronization();");
				addLine("right.rotate((int) (" + makeNegativeIfReversed(distance, rightReversed) + "));");
				addLine("left.rotate((int) (" + makeNegativeIfReversed(distance, leftReversed) + "));");
				addLine("right.endSynchronization();");
				addLine("waitUntilDone();");
				break;
				
			case LEFT:
				distance = "-(" + distance + ")";
				// fall-through
			case RIGHT:
				addLine("/* turn right " + distance + "; */");
				addLine("right.startSynchronization();");
				addLine("right.rotate((int) -(" + makeNegativeIfReversed(distance, rightReversed) + "));");
				addLine("left.rotate((int) (" + makeNegativeIfReversed(distance, leftReversed) + "));");
				addLine("right.endSynchronization();");
				addLine("waitUntilDone();");
				break;
			default:
				throw new RuntimeException("Unknown direction");
			}
			
			
		} else {
			String condition = conditionToString(d.getUntil());
			
            addLine("/* drive until " + condition + "; */");
            addLine("right.startSynchronization();");
            if (d.getDirection() == Direction.FORWARD) {
            	if (rightReversed) {
            		addLine("right.backward();");
            	} else {
            		addLine("right.forward();");
            	}
            	if (leftReversed) {
            		addLine("left.backward();");
            	} else {
            		addLine("left.forward();");
            	}
            	
            } else {
            	if (rightReversed) {
            		addLine("right.forward();");
            	} else {
            		addLine("right.backward();");
            	}
            	if (leftReversed) {
            		addLine("left.forward();");
            	} else {
            		addLine("left.backward();");
            	}
            }
            addLine("right.endSynchronization();");
            addLine("while (!(" + condition + ")) {");
            indentation++;
            addLine("Delay.msDelay(50);");
            indentation--;
            addLine("}");
            addLine("right.startSynchronization();");
            addLine("right.stop();");
            addLine("left.stop();");
            addLine("right.endSynchronization();");
			
			
		}
	}
	
	private void writeBranch(Branch b) {
        String condition = conditionToString(b.getCondition());
        addLine("/* if " + condition + " */");
        addLine("if (" + condition + ") {");
        indentation++;
        
        for (Command cmnd : b.getCommands()) {
        	writeCommand(cmnd);
        	addLine("");
        }
        
        indentation--;
        addLine("}");
	}
	
	private void writeLoop(Loop l) {
		String condition = conditionToString(l.getCondition());
        addLine("/* while " + condition + " */");
        addLine("while (" + condition + ") {");
        indentation++;
        
        for (Command cmnd : l.getCommands()) {
        	writeCommand(cmnd);
        	addLine("");
        }
        
        indentation--;
        addLine("}");
	}
	
	private void writeAssignment(Assignment a) {
		String expr = exprToString(a.getValue());
        addLine("/* set " + a.getVariable() + " = " + expr + "*/");
        addLine("variables.put(\"" + a.getVariable() + "\", (double) (" + expr + "));");
	}
	
	private String exprToString(Expr expr) {
		if (expr instanceof Variable) {
			String name = ((Variable) expr).getName();
			if (sensorVariableNames.contains(name)) {
				return "readSensor(" + name + ")";
			}
			return "getOrDeafult(variables, \"" + name + "\")";
			
		} else if (expr instanceof Literal) {
			return ((Literal) expr).getValue() + "";
			
		} else if (expr instanceof Operation) {
			Operation op = (Operation) expr;

			String left = null;
			if (op.getLeft() != null) {
				left = exprToString(op.getLeft());
			}
			String right = exprToString(op.getRight());
			String operator = "";
			
			switch (op.getOperator()) {
			case PLUS:
				operator = "+";
				break;
			case MINUS:
				operator = "-";
				break;
			case MULTIPLY:
				operator = "*";
				break;
			case DIVIDE:
				operator = "/";
				break;
			default:
				throw new RuntimeException("Unknown operator");
			}
			
			if (left != null) {
				return "(" + left + ") " + operator + " (" + right + ")";
				
			} else {
				return operator + " (" + right + ")";
			}
			
		} else {
			throw new RuntimeException("Unknown expression");
		}
	}
	
	private String conditionToString(Condition c) {
		
		if (c instanceof Comparison) {
			Comparison comp = (Comparison) c;
			String left = exprToString(comp.getLeft());
			String right = exprToString(comp.getRight());
			
			String operator = "";
			switch (comp.getOperator()) {
			case EQUAL:
				operator = "==";
				break;
			case UNEQUAL:
				operator = "!=";
				break;
			case LESS:
				operator = "<";
				break;
			case LESS_OR_EQUAL:
				operator = "<=";
				break;
			case GREATER:
				operator = ">";
				break;
			case GREATER_OR_EQUAL:
				operator = ">=";
				break;
			default:
				throw new RuntimeException("Unknown operator");
			}

			return "(" + left + ") " + operator + " (" + right + ")";
			
		} else {
			throw new RuntimeException("Unknown condition");
		}
	}
	
	private void writeHeader(String name) {
		addLine("import lejos.hardware.*;");
        addLine("import lejos.hardware.motor.*;");
        addLine("import lejos.hardware.sensor.*;");
        addLine("import lejos.utility.*;");
        addLine("import lejos.robotics.*;");
        addLine("import java.util.*;");
        addLine("");
        addLine("public class " + name + " implements RegulatedMotorListener {");
        addLine("");
        
        indentation++;
        addLine("private volatile boolean turning = false;");
        addLine("");
        
        addLine("public void rotationStarted(RegulatedMotor motor, int tachoCount, boolean stalled, long timeStamp) {");
        indentation++;
        addLine("synchronized (this) {");
        indentation++;
        addLine("turning = true;");
        indentation--;
        addLine("}");
        indentation--;
        addLine("}");
        addLine("");
        
        addLine("public void rotationStopped(RegulatedMotor motor, int tachoCount, boolean stalled, long timeStamp) {");
        indentation++;
        addLine("synchronized (this) {");
        indentation++;
        addLine("turning = false;");
        addLine("notifyAll();");
        indentation--;
        addLine("}");
        indentation--;
        addLine("}");
        addLine("");
        
        addLine("private void waitUntilDone() {");
        indentation++;
        addLine("synchronized (this) {");
        indentation++;
        addLine("while (turning) {");
        indentation++;
        addLine("try {");
        indentation++;
        addLine("wait();");
        indentation--;
        addLine("} catch (InterruptedException e) {");
        addLine("}");
        indentation--;
        addLine("}");
        indentation--;
        addLine("}");
        indentation--;
        addLine("}");
        addLine("");
        
        addLine("private float readSensor(SensorMode mode) {");
        indentation++;
        addLine("float[] sample = new float[mode.sampleSize()];");
        addLine("mode.fetchSample(sample, 0);");
        addLine("return sample[0];");
        indentation--;
        addLine("}");
        addLine("");
        
        addLine("private double getOrDeafult(Map<String, Double> map, String variable) {");
        indentation++;
        addLine("Double result = map.get(variable);");
        addLine("if (result == null) {");
        indentation++;
        addLine("result = 0.0;");
        indentation--;
        addLine("}");
        addLine("return result;");
        indentation--;
        addLine("}");
        addLine("");
        
        addLine("public void run() {");
        indentation++;
        addLine("Brick ev3 = BrickFinder.getDefault();");
        addLine("");
        
        Motor lMotor = setup.getLeftMotor();
        Motor rMotor = setup.getRightMotor();
        String leftName = lMotor.getType() == MotorType.LARGE ? "EV3LargeRegulatedMotor" : "EV3MediumRegulatedMotor";
        String rightName = rMotor.getType() == MotorType.LARGE ? "EV3LargeRegulatedMotor" : "EV3MediumRegulatedMotor";
        
        addLine("RegulatedMotor left = new " + leftName + "(ev3.getPort(\"" + lMotor.getPort().getLiteral() + "\"));");
        addLine("RegulatedMotor right = new " + rightName + "(ev3.getPort(\"" + rMotor.getPort().getLiteral() + "\"));");
        addLine("right.synchronizeWith(new RegulatedMotor[] { left });");
        addLine("right.setSpeed((int) " + rMotor.getSpeed() + ");");
        addLine("left.setSpeed((int) " + lMotor.getSpeed() + ");");
        addLine("right.addListener(this);");
        addLine("");
        
        int i = 0;
        for (Sensor sensor : setup.getSensors()) {
        	sensorVariableNames.add(sensor.getName());
        	
        	String sensorName = "sensor" + i++;
        	sensorsToClose.add(sensorName);
        	
        	String className;
        	switch (sensor.getType()) {
        	case COLOR:
        		className = "EV3ColorSensor";
        		break;
        	default:
        		throw new RuntimeException("Unknown sensor type");
        	}
        	
        	String modeName;
        	switch (sensor.getMode()) {
        	case RED:
        		modeName = "getRedMode()";
        		break;
        	case AMBIENT:
        		modeName = "getAmbientMode()";
        		break;
        	case COLOR_ID:
        		modeName = "getColorIDMode()";
        		break;
        	default:
        		throw new RuntimeException("Unknown sensor mode");
        	}
        	
        	addLine(className + " " + sensorName + " = new " + className + "(ev3.getPort(\"" + sensor.getPort().getLiteral() + "\"));");
        	addLine("SensorMode " + sensor.getName() + " = " + sensorName + "." + modeName + ";");
        	addLine("");
        }
        
        addLine("Map<String, Double> variables = new HashMap<>();");
        addLine("");
	}
	
	private void writeFooter(String name) {
		addLine("");
		for (String sensor : sensorsToClose) {
			addLine(sensor + ".close();");
		}
        addLine("left.close();");
        addLine("right.close();");
        indentation--;
        addLine("}");
        addLine("");
        
        addLine("public static void main(String[] args) {");
        indentation++;
        addLine("new " + name + "().run();");
        indentation--;
        addLine("}");
        addLine("");
        
        indentation--;
        addLine("}");
	}
	

}
