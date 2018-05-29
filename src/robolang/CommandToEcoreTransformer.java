package robolang;

import java.util.LinkedList;
import java.util.List;

import robolang.RoboLangParser.AssignmentContext;
import robolang.RoboLangParser.BranchContext;
import robolang.RoboLangParser.CommandContext;
import robolang.RoboLangParser.DriveContext;
import robolang.RoboLangParser.TurnContext;
import robomodel.robo.command.Assignment;
import robomodel.robo.command.Branch;
import robomodel.robo.command.Command;
import robomodel.robo.command.CommandFactory;
import robomodel.robo.command.Direction;
import robomodel.robo.command.Drive;
import robomodel.robo.command.Loop;
import robomodel.robo.command.impl.CommandFactoryImpl;
import robomodel.robo.condition.Condition;
import robomodel.robo.expression.Expr;

public class CommandToEcoreTransformer extends RoboLangBaseVisitor<Command> {

	private CommandFactory factory = new CommandFactoryImpl();
	
	private ExprToEcoreTransformer exprTransformer;
	
	private ConditionToEcoreTransformer conditionTransformer;
	
	public CommandToEcoreTransformer(ExprToEcoreTransformer exprTransformer, ConditionToEcoreTransformer conditionTransformer) {
		this.exprTransformer = exprTransformer;
		this.conditionTransformer = conditionTransformer;
	}

	@Override
    public Command visitDrive(DriveContext ctx) {
		Drive drive = factory.createDrive();
		
		if (ctx.direction.getText().equals("backward")) {
        	drive.setDirection(Direction.BACKWARD);
        } else {
        	drive.setDirection(Direction.FORWARD);
        }
		
        if (ctx.distance != null) {
        	Expr expr = exprTransformer.visitExpr(ctx.distance);
            drive.setDistance(expr);
            
        } else {
        	Condition condition = conditionTransformer.visitCondition(ctx.until);
            drive.setUntil(condition);
        }
        
        return drive;
    }
    
    @Override
    public Command visitTurn(TurnContext ctx) {
    	Drive drive = factory.createDrive();
		
		if (ctx.direction.getText().equals("left")) {
        	drive.setDirection(Direction.LEFT);
        } else {
        	drive.setDirection(Direction.RIGHT);
        }
		
		Expr expr = exprTransformer.visitExpr(ctx.amount);
        drive.setDistance(expr);
    	
        return drive;
    }
    
    @Override
    public Command visitBranch(BranchContext ctx) {
    	
    	Condition condition = conditionTransformer.visitCondition(ctx.condition());
    	
    	List<Command> body = new LinkedList<Command>();
    	for (CommandContext cmnd : ctx.command()) {
    		body.add(visitCommand(cmnd));
        }
    	
    	Command result;
    	if (ctx.kind.getText().contentEquals("if")) {
    		Branch branch = factory.createBranch();
    		branch.setCondition(condition);
    		branch.getCommands().addAll(body);
    		result = branch;
    		
    	} else {
    		Loop loop = factory.createLoop();
    		loop.setCondition(condition);
    		loop.getCommands().addAll(body);
    		result = loop;
    	}
    	
        return result;
    }
    
    @Override
    public Command visitAssignment(AssignmentContext ctx) {
    	
    	Assignment ass = factory.createAssignment();
    	
    	ass.setVariable(ctx.variable.getText());
    	ass.setValue(exprTransformer.visitExpr(ctx.value));
        
        return ass;
    }
	
}
