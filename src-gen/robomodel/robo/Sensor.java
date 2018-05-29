/**
 */
package robomodel.robo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robomodel.robo.Sensor#getPort <em>Port</em>}</li>
 *   <li>{@link robomodel.robo.Sensor#getType <em>Type</em>}</li>
 *   <li>{@link robomodel.robo.Sensor#getMode <em>Mode</em>}</li>
 *   <li>{@link robomodel.robo.Sensor#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see robomodel.robo.RoboPackage#getSensor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ModeAndTypeMatches'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ModeAndTypeMatches='\n\t\t\t(mode = SensorMode::RED implies type = SensorType::COLOR)\n\t\t\tand (mode = SensorMode::AMBIENT implies type = SensorType::COLOR)\n\t\t\tand (mode = SensorMode::COLOR_ID implies type = SensorType::COLOR)\n\t\t'"
 * @generated
 */
public interface Sensor extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The literals are from the enumeration {@link robomodel.robo.SensorPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see robomodel.robo.SensorPort
	 * @see #setPort(SensorPort)
	 * @see robomodel.robo.RoboPackage#getSensor_Port()
	 * @model required="true"
	 * @generated
	 */
	SensorPort getPort();

	/**
	 * Sets the value of the '{@link robomodel.robo.Sensor#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see robomodel.robo.SensorPort
	 * @see #getPort()
	 * @generated
	 */
	void setPort(SensorPort value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link robomodel.robo.SensorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see robomodel.robo.SensorType
	 * @see #setType(SensorType)
	 * @see robomodel.robo.RoboPackage#getSensor_Type()
	 * @model required="true"
	 * @generated
	 */
	SensorType getType();

	/**
	 * Sets the value of the '{@link robomodel.robo.Sensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see robomodel.robo.SensorType
	 * @see #getType()
	 * @generated
	 */
	void setType(SensorType value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link robomodel.robo.SensorMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see robomodel.robo.SensorMode
	 * @see #setMode(SensorMode)
	 * @see robomodel.robo.RoboPackage#getSensor_Mode()
	 * @model required="true"
	 * @generated
	 */
	SensorMode getMode();

	/**
	 * Sets the value of the '{@link robomodel.robo.Sensor#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see robomodel.robo.SensorMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(SensorMode value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see robomodel.robo.RoboPackage#getSensor_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link robomodel.robo.Sensor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Sensor
