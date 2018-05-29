/**
 */
package robomodel.robo.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import robomodel.robo.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see robomodel.robo.RoboPackage
 * @generated
 */
public class RoboValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RoboValidator INSTANCE = new RoboValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "robomodel.robo";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return RoboPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case RoboPackage.ROBOT:
			return validateRobot((Robot) value, diagnostics, context);
		case RoboPackage.SETUP:
			return validateSetup((Setup) value, diagnostics, context);
		case RoboPackage.MOTOR:
			return validateMotor((Motor) value, diagnostics, context);
		case RoboPackage.SENSOR:
			return validateSensor((Sensor) value, diagnostics, context);
		case RoboPackage.PROGRAM:
			return validateProgram((Program) value, diagnostics, context);
		case RoboPackage.MOTOR_PORT:
			return validateMotorPort((MotorPort) value, diagnostics, context);
		case RoboPackage.MOTOR_TYPE:
			return validateMotorType((MotorType) value, diagnostics, context);
		case RoboPackage.SENSOR_PORT:
			return validateSensorPort((SensorPort) value, diagnostics, context);
		case RoboPackage.SENSOR_TYPE:
			return validateSensorType((SensorType) value, diagnostics, context);
		case RoboPackage.SENSOR_MODE:
			return validateSensorMode((SensorMode) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRobot(Robot robot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(robot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetup(Setup setup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(setup, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(setup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(setup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(setup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(setup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(setup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(setup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(setup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(setup, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSetup_DifferentMotorPorts(setup, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DifferentMotorPorts constraint of '<em>Setup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SETUP__DIFFERENT_MOTOR_PORTS__EEXPRESSION = "leftMotor.port <> rightMotor.port";

	/**
	 * Validates the DifferentMotorPorts constraint of '<em>Setup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetup_DifferentMotorPorts(Setup setup, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RoboPackage.Literals.SETUP, setup, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "DifferentMotorPorts",
				SETUP__DIFFERENT_MOTOR_PORTS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMotor(Motor motor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(motor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sensor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSensor_ModeAndTypeMatches(sensor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ModeAndTypeMatches constraint of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SENSOR__MODE_AND_TYPE_MATCHES__EEXPRESSION = "\n"
			+ "\t\t\t(mode = SensorMode::RED implies type = SensorType::COLOR)\n"
			+ "\t\t\tand (mode = SensorMode::AMBIENT implies type = SensorType::COLOR)\n"
			+ "\t\t\tand (mode = SensorMode::COLOR_ID implies type = SensorType::COLOR)\n" + "\t\t";

	/**
	 * Validates the ModeAndTypeMatches constraint of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor_ModeAndTypeMatches(Sensor sensor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(RoboPackage.Literals.SENSOR, sensor, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ModeAndTypeMatches",
				SENSOR__MODE_AND_TYPE_MATCHES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(program, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMotorPort(MotorPort motorPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMotorType(MotorType motorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensorPort(SensorPort sensorPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensorType(SensorType sensorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensorMode(SensorMode sensorMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RoboValidator
