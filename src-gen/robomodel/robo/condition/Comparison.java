/**
 */
package robomodel.robo.condition;

import robomodel.robo.expression.Expr;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robomodel.robo.condition.Comparison#getLeft <em>Left</em>}</li>
 *   <li>{@link robomodel.robo.condition.Comparison#getRight <em>Right</em>}</li>
 *   <li>{@link robomodel.robo.condition.Comparison#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see robomodel.robo.condition.ConditionPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends Condition {
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
	 * @see robomodel.robo.condition.ConditionPackage#getComparison_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getLeft();

	/**
	 * Sets the value of the '{@link robomodel.robo.condition.Comparison#getLeft <em>Left</em>}' containment reference.
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
	 * @see robomodel.robo.condition.ConditionPackage#getComparison_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getRight();

	/**
	 * Sets the value of the '{@link robomodel.robo.condition.Comparison#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expr value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link robomodel.robo.condition.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see robomodel.robo.condition.ComparisonOperator
	 * @see #setOperator(ComparisonOperator)
	 * @see robomodel.robo.condition.ConditionPackage#getComparison_Operator()
	 * @model required="true"
	 * @generated
	 */
	ComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link robomodel.robo.condition.Comparison#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see robomodel.robo.condition.ComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparisonOperator value);

} // Comparison
