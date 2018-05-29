package robolang;

import robolang.RoboLangParser.ConditionContext;
import robomodel.robo.condition.Comparison;
import robomodel.robo.condition.ComparisonOperator;
import robomodel.robo.condition.Condition;
import robomodel.robo.condition.ConditionFactory;
import robomodel.robo.condition.impl.ConditionFactoryImpl;

public class ConditionToEcoreTransformer extends RoboLangBaseVisitor<Condition> {

	private ConditionFactory factory = new ConditionFactoryImpl();
	
	private ExprToEcoreTransformer exprTransformer;
	
	public ConditionToEcoreTransformer(ExprToEcoreTransformer exprTransformer) {
		this.exprTransformer = exprTransformer;
	}
	
	@Override
	public Condition visitCondition(ConditionContext ctx) {
		Condition result = null;
		
		if (ctx.comparison != null) {
			Comparison comp = factory.createComparison();
			
			comp.setLeft(exprTransformer.visitExpr(ctx.lExpr));
			comp.setRight(exprTransformer.visitExpr(ctx.rExpr));
			
			switch (ctx.comparison.getText()) {
			case "<":
				comp.setOperator(ComparisonOperator.LESS);
				break;
			case "<=":
				comp.setOperator(ComparisonOperator.LESS_OR_EQUAL);
				break;
			case ">":
				comp.setOperator(ComparisonOperator.GREATER);
				break;
			case ">=":
				comp.setOperator(ComparisonOperator.GREATER_OR_EQUAL);
				break;
			case "==":
				comp.setOperator(ComparisonOperator.EQUAL);
				break;
			case "!=":
				comp.setOperator(ComparisonOperator.UNEQUAL);
				break;
			}
			result = comp;
			
            
        } else if (ctx.bracketed != null) {
        	result = visitCondition(ctx.bracketed);
        	
        } else if (ctx.op != null) {
        	// TODO
//            if (ctx.left != null) {
//                code.append(visitCondition(ctx.left) + " ");
//            }
//            code.append(ctx.op.getText() + " ");
//            code.append(visitCondition(ctx.right));
        }
		
		return result;
	}
	
}
