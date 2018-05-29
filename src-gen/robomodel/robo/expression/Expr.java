/**
 */
package robomodel.robo.expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see robomodel.robo.expression.ExpressionPackage#getExpr()
 * @model abstract="true"
 * @generated
 */
public interface Expr extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	double evaluate();

} // Expr
