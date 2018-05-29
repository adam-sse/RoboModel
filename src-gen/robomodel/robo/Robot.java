/**
 */
package robomodel.robo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robomodel.robo.Robot#getProgramms <em>Programms</em>}</li>
 *   <li>{@link robomodel.robo.Robot#getSetup <em>Setup</em>}</li>
 * </ul>
 *
 * @see robomodel.robo.RoboPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends EObject {
	/**
	 * Returns the value of the '<em><b>Programms</b></em>' containment reference list.
	 * The list contents are of type {@link robomodel.robo.Program}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programms</em>' containment reference list.
	 * @see robomodel.robo.RoboPackage#getRobot_Programms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Program> getProgramms();

	/**
	 * Returns the value of the '<em><b>Setup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setup</em>' containment reference.
	 * @see #setSetup(Setup)
	 * @see robomodel.robo.RoboPackage#getRobot_Setup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Setup getSetup();

	/**
	 * Sets the value of the '{@link robomodel.robo.Robot#getSetup <em>Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setup</em>' containment reference.
	 * @see #getSetup()
	 * @generated
	 */
	void setSetup(Setup value);

} // Robot
