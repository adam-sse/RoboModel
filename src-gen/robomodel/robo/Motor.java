/**
 */
package robomodel.robo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robomodel.robo.Motor#getPort <em>Port</em>}</li>
 *   <li>{@link robomodel.robo.Motor#getType <em>Type</em>}</li>
 *   <li>{@link robomodel.robo.Motor#getSpeed <em>Speed</em>}</li>
 *   <li>{@link robomodel.robo.Motor#isReversed <em>Reversed</em>}</li>
 * </ul>
 *
 * @see robomodel.robo.RoboPackage#getMotor()
 * @model
 * @generated
 */
public interface Motor extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The literals are from the enumeration {@link robomodel.robo.MotorPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see robomodel.robo.MotorPort
	 * @see #setPort(MotorPort)
	 * @see robomodel.robo.RoboPackage#getMotor_Port()
	 * @model required="true"
	 * @generated
	 */
	MotorPort getPort();

	/**
	 * Sets the value of the '{@link robomodel.robo.Motor#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see robomodel.robo.MotorPort
	 * @see #getPort()
	 * @generated
	 */
	void setPort(MotorPort value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link robomodel.robo.MotorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see robomodel.robo.MotorType
	 * @see #setType(MotorType)
	 * @see robomodel.robo.RoboPackage#getMotor_Type()
	 * @model required="true"
	 * @generated
	 */
	MotorType getType();

	/**
	 * Sets the value of the '{@link robomodel.robo.Motor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see robomodel.robo.MotorType
	 * @see #getType()
	 * @generated
	 */
	void setType(MotorType value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(double)
	 * @see robomodel.robo.RoboPackage#getMotor_Speed()
	 * @model required="true"
	 * @generated
	 */
	double getSpeed();

	/**
	 * Sets the value of the '{@link robomodel.robo.Motor#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(double value);

	/**
	 * Returns the value of the '<em><b>Reversed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reversed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reversed</em>' attribute.
	 * @see #setReversed(boolean)
	 * @see robomodel.robo.RoboPackage#getMotor_Reversed()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isReversed();

	/**
	 * Sets the value of the '{@link robomodel.robo.Motor#isReversed <em>Reversed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reversed</em>' attribute.
	 * @see #isReversed()
	 * @generated
	 */
	void setReversed(boolean value);

} // Motor
