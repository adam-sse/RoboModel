/**
 */
package robomodel.robo.command;

import org.eclipse.emf.common.util.EList;

import robomodel.robo.condition.Condition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robomodel.robo.command.Loop#getCondition <em>Condition</em>}</li>
 *   <li>{@link robomodel.robo.command.Loop#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see robomodel.robo.command.CommandPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Command {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see robomodel.robo.command.CommandPackage#getLoop_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link robomodel.robo.command.Loop#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link robomodel.robo.command.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see robomodel.robo.command.CommandPackage#getLoop_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

} // Loop
