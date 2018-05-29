/**
 */
package robomodel.robo.command;

import robomodel.robo.condition.Condition;

import robomodel.robo.expression.Expr;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robomodel.robo.command.Drive#getDistance <em>Distance</em>}</li>
 *   <li>{@link robomodel.robo.command.Drive#getUntil <em>Until</em>}</li>
 *   <li>{@link robomodel.robo.command.Drive#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see robomodel.robo.command.CommandPackage#getDrive()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UntilOrDistance UntilOnlyWhenForwardOrBackward'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UntilOrDistance='(distance &lt;&gt; null) xor (until &lt;&gt; null)' UntilOnlyWhenForwardOrBackward='(until &lt;&gt; null) implies (direction = Direction::FORWARD or direction = Direction::BACKWARD)'"
 * @generated
 */
public interface Drive extends Command {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(Expr)
	 * @see robomodel.robo.command.CommandPackage#getDrive_Distance()
	 * @model containment="true"
	 * @generated
	 */
	Expr getDistance();

	/**
	 * Sets the value of the '{@link robomodel.robo.command.Drive#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Expr value);

	/**
	 * Returns the value of the '<em><b>Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until</em>' containment reference.
	 * @see #setUntil(Condition)
	 * @see robomodel.robo.command.CommandPackage#getDrive_Until()
	 * @model containment="true"
	 * @generated
	 */
	Condition getUntil();

	/**
	 * Sets the value of the '{@link robomodel.robo.command.Drive#getUntil <em>Until</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until</em>' containment reference.
	 * @see #getUntil()
	 * @generated
	 */
	void setUntil(Condition value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link robomodel.robo.command.Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see robomodel.robo.command.Direction
	 * @see #setDirection(Direction)
	 * @see robomodel.robo.command.CommandPackage#getDrive_Direction()
	 * @model required="true"
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link robomodel.robo.command.Drive#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see robomodel.robo.command.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

} // Drive
