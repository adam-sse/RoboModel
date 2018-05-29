/**
 */
package robomodel.robo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robomodel.robo.Setup#getLeftMotor <em>Left Motor</em>}</li>
 *   <li>{@link robomodel.robo.Setup#getRightMotor <em>Right Motor</em>}</li>
 *   <li>{@link robomodel.robo.Setup#getSensors <em>Sensors</em>}</li>
 * </ul>
 *
 * @see robomodel.robo.RoboPackage#getSetup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DifferentMotorPorts'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot DifferentMotorPorts='leftMotor.port &lt;&gt; rightMotor.port'"
 * @generated
 */
public interface Setup extends EObject {
	/**
	 * Returns the value of the '<em><b>Left Motor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Motor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Motor</em>' containment reference.
	 * @see #setLeftMotor(Motor)
	 * @see robomodel.robo.RoboPackage#getSetup_LeftMotor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Motor getLeftMotor();

	/**
	 * Sets the value of the '{@link robomodel.robo.Setup#getLeftMotor <em>Left Motor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Motor</em>' containment reference.
	 * @see #getLeftMotor()
	 * @generated
	 */
	void setLeftMotor(Motor value);

	/**
	 * Returns the value of the '<em><b>Right Motor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Motor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Motor</em>' containment reference.
	 * @see #setRightMotor(Motor)
	 * @see robomodel.robo.RoboPackage#getSetup_RightMotor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Motor getRightMotor();

	/**
	 * Sets the value of the '{@link robomodel.robo.Setup#getRightMotor <em>Right Motor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Motor</em>' containment reference.
	 * @see #getRightMotor()
	 * @generated
	 */
	void setRightMotor(Motor value);

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link robomodel.robo.Sensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see robomodel.robo.RoboPackage#getSetup_Sensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

} // Setup
