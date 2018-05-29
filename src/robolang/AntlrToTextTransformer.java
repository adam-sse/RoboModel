package robolang;

import robolang.RoboLangParser.AssignmentContext;
import robolang.RoboLangParser.BranchContext;
import robolang.RoboLangParser.CommandContext;
import robolang.RoboLangParser.ConditionContext;
import robolang.RoboLangParser.DriveContext;
import robolang.RoboLangParser.ExprContext;
import robolang.RoboLangParser.ProgramContext;
import robolang.RoboLangParser.RobotContext;
import robolang.RoboLangParser.TurnContext;

@Deprecated
public class AntlrToTextTransformer extends RoboLangBaseVisitor<String> {

    private int indentation = 0;
    
    private void appendLine(StringBuilder builder, String line) {
        for (int i = 0; i < indentation; i++) {
            builder.append("\t");
        }
        builder.append(line);
        builder.append("\n");
    }
    
    @Override
    public String visitRobot(RobotContext ctx) {
        for (ProgramContext prgm : ctx.program()) {
            visitProgram(prgm);
        }
        return null;
    }
    
    @Override
    public String visitProgram(ProgramContext ctx) {
        StringBuilder code = new StringBuilder();
        
        String name = ctx.name.getText();
        
        appendLine(code, "import lejos.hardware.*;");
        appendLine(code, "import lejos.hardware.motor.*;");
        appendLine(code, "import lejos.hardware.sensor.*;");
        appendLine(code, "import lejos.utility.*;");
        appendLine(code, "import lejos.robotics.*;");
        appendLine(code, "import java.util.*;");
        appendLine(code, "");
        appendLine(code, "public class " + name + " implements RegulatedMotorListener {");
        appendLine(code, "");
        
        indentation++;
        appendLine(code, "private volatile boolean turning = false;");
        appendLine(code, "");
        
        appendLine(code, "public void rotationStarted(RegulatedMotor motor, int tachoCount, boolean stalled, long timeStamp) {");
        indentation++;
        appendLine(code, "synchronized (this) {");
        indentation++;
        appendLine(code, "turning = true;");
        indentation--;
        appendLine(code, "}");
        indentation--;
        appendLine(code, "}");
        appendLine(code, "");
        
        appendLine(code, "public void rotationStopped(RegulatedMotor motor, int tachoCount, boolean stalled, long timeStamp) {");
        indentation++;
        appendLine(code, "synchronized (this) {");
        indentation++;
        appendLine(code, "turning = false;");
        appendLine(code, "notifyAll();");
        indentation--;
        appendLine(code, "}");
        indentation--;
        appendLine(code, "}");
        appendLine(code, "");
        
        appendLine(code, "private void waitUntilDone() {");
        indentation++;
        appendLine(code, "synchronized (this) {");
        indentation++;
        appendLine(code, "while (turning) {");
        indentation++;
        appendLine(code, "try {");
        indentation++;
        appendLine(code, "wait();");
        indentation--;
        appendLine(code, "} catch (InterruptedException e) {");
        appendLine(code, "}");
        indentation--;
        appendLine(code, "}");
        indentation--;
        appendLine(code, "}");
        indentation--;
        appendLine(code, "}");
        appendLine(code, "");
        
        appendLine(code, "private float readSensor(SensorMode mode) {");
        indentation++;
        appendLine(code, "float[] sample = new float[mode.sampleSize()];");
        appendLine(code, "mode.fetchSample(sample, 0);");
        appendLine(code, "return sample[0];");
        indentation--;
        appendLine(code, "}");
        appendLine(code, "");
        
        appendLine(code, "private double getOrDeafult(Map<String, Double> map, String variable) {");
        indentation++;
        appendLine(code, "Double result = map.get(variable);");
        appendLine(code, "if (result == null) {");
        indentation++;
        appendLine(code, "result = 0.0;");
        indentation--;
        appendLine(code, "}");
        appendLine(code, "return result;");
        indentation--;
        appendLine(code, "}");
        appendLine(code, "");
        
        appendLine(code, "public void run() {");
        indentation++;
        appendLine(code, "Brick ev3 = BrickFinder.getDefault();");
        appendLine(code, "");
        
        appendLine(code, "EV3ColorSensor sensor = new EV3ColorSensor(ev3.getPort(\"S3\"));");
        appendLine(code, "SensorMode mode = sensor.getRedMode();");
        appendLine(code, "float[] sample = new float[mode.sampleSize()];");
        appendLine(code, "mode.fetchSample(sample, 0);");
        appendLine(code, "");
        
        appendLine(code, "RegulatedMotor a = new EV3MediumRegulatedMotor(ev3.getPort(\"A\"));");
        appendLine(code, "RegulatedMotor b = new EV3LargeRegulatedMotor(ev3.getPort(\"B\"));");
        appendLine(code, "RegulatedMotor c = new EV3LargeRegulatedMotor(ev3.getPort(\"C\"));");
        appendLine(code, "a.setSpeed(60);");
        appendLine(code, "b.synchronizeWith(new RegulatedMotor[] { c });");
        appendLine(code, "b.setSpeed(50);");
        appendLine(code, "c.setSpeed(50);");
        appendLine(code, "b.addListener(this);");
        appendLine(code, "");

        appendLine(code, "Map<String, Double> variables = new HashMap<>();");
        appendLine(code, "");
        
        for (CommandContext cmnd : ctx.command()) {
            String command = cmnd.accept(this);
            code.append(command);
        }
        appendLine(code, "");
        appendLine(code, "sensor.close();");
        appendLine(code, "a.close();");
        appendLine(code, "b.close();");
        appendLine(code, "c.close();");
        indentation--;
        appendLine(code, "}");
        appendLine(code, "");
        
        appendLine(code, "public static void main(String[] args) {");
        indentation++;
        appendLine(code, "new " + name + "().run();");
        indentation--;
        appendLine(code, "}");
        appendLine(code, "");
        
        indentation--;
        appendLine(code, "}");
        
        System.out.println(code);
        
        return code.toString();
    }
    
    @Override
    public String visitDrive(DriveContext ctx) {
        StringBuilder code = new StringBuilder();
        
        if (ctx.distance != null) {
            String expr = visitExpr(ctx.distance);
            if (ctx.direction.getText().equals("forward")) {
                expr = "-(" + expr + ")";
            }
            
            appendLine(code, "/* drive " + expr + "; */");
            appendLine(code, "b.startSynchronization();");
            appendLine(code, "b.rotate((int) (" + expr + "));");
            appendLine(code, "c.rotate((int) (" + expr + "));");
            appendLine(code, "b.endSynchronization();");
            appendLine(code, "waitUntilDone();");
        } else {
            String condition = visitCondition(ctx.until);
            
            appendLine(code, "/* drive " + ctx.direction.getText() + " until " + condition + "; */");
            appendLine(code, "while (!(" + condition + ")) {");
            indentation++;
            appendLine(code, "b.startSynchronization();");
            if (ctx.direction.getText().equals("forward")) {
                appendLine(code, "b.backward();");
                appendLine(code, "c.backward();");
            } else {
                appendLine(code, "b.forward();");
                appendLine(code, "c.forward();");
            }
            appendLine(code, "b.endSynchronization();");
            appendLine(code, "Delay.msDelay(50);");
            indentation--;
            appendLine(code, "}");
            appendLine(code, "b.startSynchronization();");
            appendLine(code, "b.stop();");
            appendLine(code, "c.stop();");
            appendLine(code, "b.endSynchronization();");
        }
        appendLine(code, "");
        
        return code.toString();
    }
    
    @Override
    public String visitTurn(TurnContext ctx) {
        StringBuilder code = new StringBuilder();
        
        String expr = visitExpr(ctx.amount);
        
        appendLine(code, "/* turn " + ctx.direction.getText() + " " + expr + "; */");
        
        appendLine(code, "b.startSynchronization();");
        if (ctx.direction.getText().equals("left")) {
            appendLine(code, "b.rotate((int) (" + expr + "));");
            appendLine(code, "c.rotate(-(int) (" + expr + "));");
        } else {
            appendLine(code, "b.rotate(-(int) (" + expr + "));");
            appendLine(code, "c.rotate((int) (" + expr + "));");
        }
        appendLine(code, "b.endSynchronization();");
        appendLine(code, "waitUntilDone();");
        appendLine(code, "");
        
        return code.toString();
    }
    
    @Override
    public String visitBranch(BranchContext ctx) {
        StringBuilder code = new StringBuilder();
        
        String condition = visitCondition(ctx.condition());
        appendLine(code, "/* " + ctx.kind.getText() + " " + condition + " */");
        appendLine(code, ctx.kind.getText() + " (" + condition + ") {");
        indentation++;
        
        for (CommandContext cmnd : ctx.command()) {
            code.append(visitCommand(cmnd));
        }
        
        indentation--;
        appendLine(code, "}");
        
        return code.toString();
    }
    
    @Override
    public String visitAssignment(AssignmentContext ctx) {
        StringBuilder code = new StringBuilder();
        
        String expr = visitExpr(ctx.value);
        appendLine(code, "/* set " + ctx.variable.getText() + " = " + expr + "*/");
        appendLine(code, "variables.put(\"" + ctx.variable.getText() + "\", (double) (" + expr + "));");
        
        return code.toString();
    }
    
    @Override
    public String visitCondition(ConditionContext ctx) {
        StringBuilder code = new StringBuilder();
        
        if (ctx.comparison != null) {
            String lExpr = visitExpr(ctx.lExpr);
            String rExpr = visitExpr(ctx.rExpr);
            code.append(lExpr + " " + ctx.comparison.getText() + " " + rExpr);
            
        } else if (ctx.bracketed != null) {
            code.append("(" + visitCondition(ctx.bracketed) + ")");
        } else if (ctx.op != null) {
            if (ctx.left != null) {
                code.append(visitCondition(ctx.left) + " ");
            }
            code.append(ctx.op.getText() + " ");
            code.append(visitCondition(ctx.right));
        }
        
        return code.toString();
    }
    
    @Override
    public String visitExpr(ExprContext ctx) {
        StringBuilder code = new StringBuilder();
        
        if (ctx.value != null) {
            code.append(ctx.value.getText());
            
        } else if (ctx.bracketed != null) {
            code.append("(" + visitExpr(ctx.bracketed) + ")");
            
        } else if (ctx.variable != null && ctx.variable.getText().equals("sensor")) {
            code.append("readSensor(mode)");
            
        } else if (ctx.variable != null) {
            code.append("getOrDeafult(variables, \"" + ctx.variable.getText() + "\")");
            
        } else if (ctx.op != null) {
            if (ctx.left != null) {
                code.append(visitExpr(ctx.left) + " ");
            }
            code.append(ctx.op.getText() + " ");
            code.append(visitExpr(ctx.right));
        }
        
        return code.toString();
    }
    
}
