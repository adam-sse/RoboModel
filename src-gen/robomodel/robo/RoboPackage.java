/**
 */
package robomodel.robo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robomodel.robo.RoboFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RoboPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/robo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoboPackage eINSTANCE = robomodel.robo.impl.RoboPackageImpl.init();

	/**
	 * The meta object id for the '{@link robomodel.robo.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robomodel.robo.impl.RobotImpl
	 * @see robomodel.robo.impl.RoboPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Programms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__PROGRAMMS = 0;

	/**
	 * The feature id for the '<em><b>Setup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__SETUP = 1;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robomodel.robo.impl.SetupImpl <em>Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robomodel.robo.impl.SetupImpl
	 * @see robomodel.robo.impl.RoboPackageImpl#getSetup()
	 * @generated
	 */
	int SETUP = 1;

	/**
	 * The feature id for the '<em><b>Left Motor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP__LEFT_MOTOR = 0;

	/**
	 * The feature id for the '<em><b>Right Motor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP__RIGHT_MOTOR = 1;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP__SENSORS = 2;

	/**
	 * The number of structural features of the '<em>Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robomodel.robo.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robomodel.robo.impl.MotorImpl
	 * @see robomodel.robo.impl.RoboPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__PORT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__SPEED = 2;

	/**
	 * The feature id for the '<em><b>Reversed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR__REVERSED = 3;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robomodel.robo.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robomodel.robo.impl.SensorImpl
	 * @see robomodel.robo.impl.RoboPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PORT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = 3;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robomodel.robo.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robomodel.robo.impl.ProgramImpl
	 * @see robomodel.robo.impl.RoboPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__COMMANDS = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robomodel.robo.MotorPort <em>Motor Port</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robomodel.robo.MotorPort
	 * @see robomodel.robo.impl.RoboPackageImpl#getMotorPort()
	 * @generated
	 */
	int MOTOR_PORT = 5;

	/**
	 * The meta object id for the '{@link robomodel.robo.MotorType <em>Motor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robomodel.robo.MotorType
	 * @see robomodel.robo.impl.RoboPackageImpl#getMotorType()
	 * @generated
	 */
	int MOTOR_TYPE = 6;

	/**
	 * The meta object id for the '{@link robomodel.robo.SensorPort <em>Sensor Port</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robomodel.robo.SensorPort
	 * @see robomodel.robo.impl.RoboPackageImpl#getSensorPort()
	 * @generated
	 */
	int SENSOR_PORT = 7;

	/**
	 * The meta object id for the '{@link robomodel.robo.SensorType <em>Sensor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robomodel.robo.SensorType
	 * @see robomodel.robo.impl.RoboPackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 8;

	/**
	 * The meta object id for the '{@link robomodel.robo.SensorMode <em>Sensor Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robomodel.robo.SensorMode
	 * @see robomodel.robo.impl.RoboPackageImpl#getSensorMode()
	 * @generated
	 */
	int SENSOR_MODE = 9;

	/**
	 * Returns the meta object for class '{@link robomodel.robo.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see robomodel.robo.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the containment reference list '{@link robomodel.robo.Robot#getProgramms <em>Programms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programms</em>'.
	 * @see robomodel.robo.Robot#getProgramms()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Programms();

	/**
	 * Returns the meta object for the containment reference '{@link robomodel.robo.Robot#getSetup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Setup</em>'.
	 * @see robomodel.robo.Robot#getSetup()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Setup();

	/**
	 * Returns the meta object for class '{@link robomodel.robo.Setup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setup</em>'.
	 * @see robomodel.robo.Setup
	 * @generated
	 */
	EClass getSetup();

	/**
	 * Returns the meta object for the containment reference '{@link robomodel.robo.Setup#getLeftMotor <em>Left Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Motor</em>'.
	 * @see robomodel.robo.Setup#getLeftMotor()
	 * @see #getSetup()
	 * @generated
	 */
	EReference getSetup_LeftMotor();

	/**
	 * Returns the meta object for the containment reference '{@link robomodel.robo.Setup#getRightMotor <em>Right Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Motor</em>'.
	 * @see robomodel.robo.Setup#getRightMotor()
	 * @see #getSetup()
	 * @generated
	 */
	EReference getSetup_RightMotor();

	/**
	 * Returns the meta object for the containment reference list '{@link robomodel.robo.Setup#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see robomodel.robo.Setup#getSensors()
	 * @see #getSetup()
	 * @generated
	 */
	EReference getSetup_Sensors();

	/**
	 * Returns the meta object for class '{@link robomodel.robo.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see robomodel.robo.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for the attribute '{@link robomodel.robo.Motor#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see robomodel.robo.Motor#getPort()
	 * @see #getMotor()
	 * @generated
	 */
	EAttribute getMotor_Port();

	/**
	 * Returns the meta object for the attribute '{@link robomodel.robo.Motor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see robomodel.robo.Motor#getType()
	 * @see #getMotor()
	 * @generated
	 */
	EAttribute getMotor_Type();

	/**
	 * Returns the meta object for the attribute '{@link robomodel.robo.Motor#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see robomodel.robo.Motor#getSpeed()
	 * @see #getMotor()
	 * @generated
	 */
	EAttribute getMotor_Speed();

	/**
	 * Returns the meta object for the attribute '{@link robomodel.robo.Motor#isReversed <em>Reversed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reversed</em>'.
	 * @see robomodel.robo.Motor#isReversed()
	 * @see #getMotor()
	 * @generated
	 */
	EAttribute getMotor_Reversed();

	/**
	 * Returns the meta object for class '{@link robomodel.robo.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see robomodel.robo.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link robomodel.robo.Sensor#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see robomodel.robo.Sensor#getPort()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Port();

	/**
	 * Returns the meta object for the attribute '{@link robomodel.robo.Sensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see robomodel.robo.Sensor#getType()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Type();

	/**
	 * Returns the meta object for the attribute '{@link robomodel.robo.Sensor#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see robomodel.robo.Sensor#getMode()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Mode();

	/**
	 * Returns the meta object for the attribute '{@link robomodel.robo.Sensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robomodel.robo.Sensor#getName()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Name();

	/**
	 * Returns the meta object for class '{@link robomodel.robo.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see robomodel.robo.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link robomodel.robo.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robomodel.robo.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link robomodel.robo.Program#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see robomodel.robo.Program#getCommands()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Commands();

	/**
	 * Returns the meta object for enum '{@link robomodel.robo.MotorPort <em>Motor Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Motor Port</em>'.
	 * @see robomodel.robo.MotorPort
	 * @generated
	 */
	EEnum getMotorPort();

	/**
	 * Returns the meta object for enum '{@link robomodel.robo.MotorType <em>Motor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Motor Type</em>'.
	 * @see robomodel.robo.MotorType
	 * @generated
	 */
	EEnum getMotorType();

	/**
	 * Returns the meta object for enum '{@link robomodel.robo.SensorPort <em>Sensor Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Port</em>'.
	 * @see robomodel.robo.SensorPort
	 * @generated
	 */
	EEnum getSensorPort();

	/**
	 * Returns the meta object for enum '{@link robomodel.robo.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Type</em>'.
	 * @see robomodel.robo.SensorType
	 * @generated
	 */
	EEnum getSensorType();

	/**
	 * Returns the meta object for enum '{@link robomodel.robo.SensorMode <em>Sensor Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Mode</em>'.
	 * @see robomodel.robo.SensorMode
	 * @generated
	 */
	EEnum getSensorMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RoboFactory getRoboFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robomodel.robo.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robomodel.robo.impl.RobotImpl
		 * @see robomodel.robo.impl.RoboPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Programms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__PROGRAMMS = eINSTANCE.getRobot_Programms();

		/**
		 * The meta object literal for the '<em><b>Setup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__SETUP = eINSTANCE.getRobot_Setup();

		/**
		 * The meta object literal for the '{@link robomodel.robo.impl.SetupImpl <em>Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robomodel.robo.impl.SetupImpl
		 * @see robomodel.robo.impl.RoboPackageImpl#getSetup()
		 * @generated
		 */
		EClass SETUP = eINSTANCE.getSetup();

		/**
		 * The meta object literal for the '<em><b>Left Motor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETUP__LEFT_MOTOR = eINSTANCE.getSetup_LeftMotor();

		/**
		 * The meta object literal for the '<em><b>Right Motor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETUP__RIGHT_MOTOR = eINSTANCE.getSetup_RightMotor();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETUP__SENSORS = eINSTANCE.getSetup_Sensors();

		/**
		 * The meta object literal for the '{@link robomodel.robo.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robomodel.robo.impl.MotorImpl
		 * @see robomodel.robo.impl.RoboPackageImpl#getMotor()
		 * @generated
		 */
		EClass MOTOR = eINSTANCE.getMotor();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTOR__PORT = eINSTANCE.getMotor_Port();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTOR__TYPE = eINSTANCE.getMotor_Type();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTOR__SPEED = eINSTANCE.getMotor_Speed();

		/**
		 * The meta object literal for the '<em><b>Reversed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTOR__REVERSED = eINSTANCE.getMotor_Reversed();

		/**
		 * The meta object literal for the '{@link robomodel.robo.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robomodel.robo.impl.SensorImpl
		 * @see robomodel.robo.impl.RoboPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__PORT = eINSTANCE.getSensor_Port();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TYPE = eINSTANCE.getSensor_Type();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__MODE = eINSTANCE.getSensor_Mode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__NAME = eINSTANCE.getSensor_Name();

		/**
		 * The meta object literal for the '{@link robomodel.robo.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robomodel.robo.impl.ProgramImpl
		 * @see robomodel.robo.impl.RoboPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__COMMANDS = eINSTANCE.getProgram_Commands();

		/**
		 * The meta object literal for the '{@link robomodel.robo.MotorPort <em>Motor Port</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robomodel.robo.MotorPort
		 * @see robomodel.robo.impl.RoboPackageImpl#getMotorPort()
		 * @generated
		 */
		EEnum MOTOR_PORT = eINSTANCE.getMotorPort();

		/**
		 * The meta object literal for the '{@link robomodel.robo.MotorType <em>Motor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robomodel.robo.MotorType
		 * @see robomodel.robo.impl.RoboPackageImpl#getMotorType()
		 * @generated
		 */
		EEnum MOTOR_TYPE = eINSTANCE.getMotorType();

		/**
		 * The meta object literal for the '{@link robomodel.robo.SensorPort <em>Sensor Port</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robomodel.robo.SensorPort
		 * @see robomodel.robo.impl.RoboPackageImpl#getSensorPort()
		 * @generated
		 */
		EEnum SENSOR_PORT = eINSTANCE.getSensorPort();

		/**
		 * The meta object literal for the '{@link robomodel.robo.SensorType <em>Sensor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robomodel.robo.SensorType
		 * @see robomodel.robo.impl.RoboPackageImpl#getSensorType()
		 * @generated
		 */
		EEnum SENSOR_TYPE = eINSTANCE.getSensorType();

		/**
		 * The meta object literal for the '{@link robomodel.robo.SensorMode <em>Sensor Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robomodel.robo.SensorMode
		 * @see robomodel.robo.impl.RoboPackageImpl#getSensorMode()
		 * @generated
		 */
		EEnum SENSOR_MODE = eINSTANCE.getSensorMode();

	}

} //RoboPackage
