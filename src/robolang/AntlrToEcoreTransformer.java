package robolang;

import robolang.RoboLangParser.CommandContext;
import robolang.RoboLangParser.MotorContext;
import robolang.RoboLangParser.ProgramContext;
import robolang.RoboLangParser.RobotContext;
import robolang.RoboLangParser.SensorContext;
import robolang.RoboLangParser.SetupContext;
import robomodel.robo.Motor;
import robomodel.robo.MotorPort;
import robomodel.robo.MotorType;
import robomodel.robo.Program;
import robomodel.robo.RoboFactory;
import robomodel.robo.Robot;
import robomodel.robo.Sensor;
import robomodel.robo.SensorMode;
import robomodel.robo.SensorPort;
import robomodel.robo.SensorType;
import robomodel.robo.Setup;
import robomodel.robo.command.Command;
import robomodel.robo.impl.RoboFactoryImpl;

public class AntlrToEcoreTransformer {

	private RoboFactory factory = new RoboFactoryImpl();
	
	private ExprToEcoreTransformer exprTransformer = new ExprToEcoreTransformer();
	
	private ConditionToEcoreTransformer conditionTransformer = new ConditionToEcoreTransformer(exprTransformer);
	
	private CommandToEcoreTransformer commandTransformer = new CommandToEcoreTransformer(exprTransformer, conditionTransformer);
	
    public Robot visitRobot(RobotContext ctx) {
		Robot robot = factory.createRobot();
		
		robot.setSetup(visitSetup(ctx.setup()));
		
        for (ProgramContext prgm : ctx.program()) {
        	robot.getProgramms().add(visitProgram(prgm));
        }
        
        return robot;
    }
    
    private Setup visitSetup(SetupContext ctx) {
    	Setup setup = factory.createSetup();
    	
    	setup.setLeftMotor(visitMotor(ctx.left));
    	setup.setRightMotor(visitMotor(ctx.right));
    	
    	for (SensorContext sensor : ctx.sensor()) {
    		setup.getSensors().add(visitSensor(sensor));
    	}
    	
    	return setup;
    }
    
    private Motor visitMotor(MotorContext ctx) {
    	Motor m = factory.createMotor();
    	
    	switch (ctx.port.getText()) {
    	case "A":
    		m.setPort(MotorPort.A);
    		break;
    	case "B":
    		m.setPort(MotorPort.B);
    		break;
    	case "C":
    		m.setPort(MotorPort.C);
    		break;
    	case "D":
    		m.setPort(MotorPort.D);
    		break;
    	default:
    		throw new RuntimeException("Unknown port");
    	}
    	
    	switch (ctx.type.getText()) {
    	case "Large":
    		m.setType(MotorType.LARGE);
    		break;
    	case "Medium":
    		m.setType(MotorType.MEDIUM);
    		break;
    	default:
    		throw new RuntimeException("Unknown type");
    	}
    	
    	m.setSpeed(Double.parseDouble(ctx.speed.getText()));
    	
    	if (ctx.reverse != null) {
    		m.setReversed(Boolean.parseBoolean(ctx.reverse.getText()));
    	}
    	
    	return m;
    }
    
    private Sensor visitSensor(SensorContext ctx) {
    	Sensor s = factory.createSensor();
    	
    	switch (ctx.port.getText()) {
    	case "S1":
    		s.setPort(SensorPort.S1);
    		break;
    	case "S2":
    		s.setPort(SensorPort.S2);
    		break;
    	case "S3":
    		s.setPort(SensorPort.S3);
    		break;
    	case "S4":
    		s.setPort(SensorPort.S4);
    		break;
    	default:
    		throw new RuntimeException("Unknown port");
    	}
    	
    	switch (ctx.type.getText()) {
    	case "ColorSensor":
    		s.setType(SensorType.COLOR);
    		break;
    	default:
    		throw new RuntimeException("Unknown type");
    	}
    	
    	switch (ctx.modus.getText()) {
    	case "RedMode":
    		s.setMode(SensorMode.RED);
    		break;
    	case "AmbientMode":
    		s.setMode(SensorMode.AMBIENT);
    		break;
    	case "ColorIdMode":
    		s.setMode(SensorMode.COLOR_ID);
    		break;
    	default:
    		throw new RuntimeException("Unknown mode");
    	}
    	
    	s.setName(ctx.name.getText());
    	
    	return s;
    }
    
    private Program visitProgram(ProgramContext ctx) {
    	Program prgm = factory.createProgram();
    	prgm.setName(ctx.name.getText());
    	
    	
    	for (CommandContext command : ctx.command()) {
    		Command c = commandTransformer.visitCommand(command);
    		if (c != null) {
    			prgm.getCommands().add(c);
    		}
    	}
    	
    	return prgm;
    }
    
}
