/**
 */
package robomodel.robo.command;

import robomodel.robo.expression.Expr;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robomodel.robo.command.Assignment#getVariable <em>Variable</em>}</li>
 *   <li>{@link robomodel.robo.command.Assignment#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see robomodel.robo.command.CommandPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Command {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see robomodel.robo.command.CommandPackage#getAssignment_Variable()
	 * @model required="true"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link robomodel.robo.command.Assignment#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expr)
	 * @see robomodel.robo.command.CommandPackage#getAssignment_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getValue();

	/**
	 * Sets the value of the '{@link robomodel.robo.command.Assignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expr value);

} // Assignment
