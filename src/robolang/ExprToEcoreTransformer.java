package robolang;

import robolang.RoboLangParser.ExprContext;
import robomodel.robo.expression.Expr;
import robomodel.robo.expression.ExprOperation;
import robomodel.robo.expression.ExpressionFactory;
import robomodel.robo.expression.Literal;
import robomodel.robo.expression.Operation;
import robomodel.robo.expression.Variable;
import robomodel.robo.expression.impl.ExpressionFactoryImpl;

public class ExprToEcoreTransformer extends RoboLangBaseVisitor<Expr> {

	private ExpressionFactory factory = new ExpressionFactoryImpl();
	
	@Override
	public Expr visitExpr(ExprContext ctx) {
		Expr result = null;
		
		
        if (ctx.value != null) {
        	Literal lit = factory.createLiteral();
        	lit.setValue(Double.parseDouble(ctx.value.getText()));
        	result = lit;
            
        } else if (ctx.bracketed != null) {
        	result = visitExpr(ctx.bracketed);
            
        } else if (ctx.variable != null) {
        	Variable var = factory.createVariable();
        	var.setName(ctx.variable.getText());
        	result = var;
            
        } else if (ctx.op != null) {
        	Operation op = factory.createOperation();
        	
            if (ctx.left != null) {
            	op.setLeft(visitExpr(ctx.left));
            }
            op.setRight(visitExpr(ctx.right));
            
            switch (ctx.op.getText()) {
            case "+":
            	op.setOperator(ExprOperation.PLUS);
            	break;
            case "-":
            	op.setOperator(ExprOperation.MINUS);
            	break;
            case "*":
            	op.setOperator(ExprOperation.MULTIPLY);
            	break;
            case "/":
            	op.setOperator(ExprOperation.DIVIDE);
            	break;
            }
            
            result = op;
        }
        
		return result;
	}
	
}
