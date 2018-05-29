/**
 */
package robomodel.robo.expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robomodel.robo.expression.Operation#getLeft <em>Left</em>}</li>
 *   <li>{@link robomodel.robo.expression.Operation#getRight <em>Right</em>}</li>
 *   <li>{@link robomodel.robo.expression.Operation#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see robomodel.robo.expression.ExpressionPackage#getOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LeftCanOnlyBeOmmittedIfUnaryMinus'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot LeftCanOnlyBeOmmittedIfUnaryMinus='left = null implies operator = ExprOperation::MINUS'"
 * @generated
 */
public interface Operation extends Expr {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expr)
	 * @see robomodel.robo.expression.ExpressionPackage#getOperation_Left()
	 * @model containment="true"
	 * @generated
	 */
	Expr getLeft();

	/**
	 * Sets the value of the '{@link robomodel.robo.expression.Operation#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expr value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expr)
	 * @see robomodel.robo.expression.ExpressionPackage#getOperation_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getRight();

	/**
	 * Sets the value of the '{@link robomodel.robo.expression.Operation#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expr value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link robomodel.robo.expression.ExprOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see robomodel.robo.expression.ExprOperation
	 * @see #setOperator(ExprOperation)
	 * @see robomodel.robo.expression.ExpressionPackage#getOperation_Operator()
	 * @model required="true"
	 * @generated
	 */
	ExprOperation getOperator();

	/**
	 * Sets the value of the '{@link robomodel.robo.expression.Operation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see robomodel.robo.expression.ExprOperation
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ExprOperation value);

} // Operation
