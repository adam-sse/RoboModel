/**
 */
package robomodel.robo.command.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import robomodel.robo.command.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see robomodel.robo.command.CommandPackage
 * @generated
 */
public class CommandValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CommandValidator INSTANCE = new CommandValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "robomodel.robo.command";

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
	public CommandValidator() {
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
		return CommandPackage.eINSTANCE;
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
		case CommandPackage.COMMAND:
			return validateCommand((Command) value, diagnostics, context);
		case CommandPackage.DRIVE:
			return validateDrive((Drive) value, diagnostics, context);
		case CommandPackage.LOOP:
			return validateLoop((Loop) value, diagnostics, context);
		case CommandPackage.BRANCH:
			return validateBranch((Branch) value, diagnostics, context);
		case CommandPackage.ASSIGNMENT:
			return validateAssignment((Assignment) value, diagnostics, context);
		case CommandPackage.DIRECTION:
			return validateDirection((Direction) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommand(Command command, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(command, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrive(Drive drive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(drive, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(drive, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(drive, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(drive, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(drive, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(drive, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(drive, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(drive, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(drive, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDrive_UntilOrDistance(drive, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDrive_UntilOnlyWhenForwardOrBackward(drive, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UntilOrDistance constraint of '<em>Drive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DRIVE__UNTIL_OR_DISTANCE__EEXPRESSION = "(distance <> null) xor (until <> null)";

	/**
	 * Validates the UntilOrDistance constraint of '<em>Drive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrive_UntilOrDistance(Drive drive, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CommandPackage.Literals.DRIVE, drive, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UntilOrDistance",
				DRIVE__UNTIL_OR_DISTANCE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UntilOnlyWhenForwardOrBackward constraint of '<em>Drive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DRIVE__UNTIL_ONLY_WHEN_FORWARD_OR_BACKWARD__EEXPRESSION = "(until <> null) implies (direction = Direction::FORWARD or direction = Direction::BACKWARD)";

	/**
	 * Validates the UntilOnlyWhenForwardOrBackward constraint of '<em>Drive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrive_UntilOnlyWhenForwardOrBackward(Drive drive, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CommandPackage.Literals.DRIVE, drive, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UntilOnlyWhenForwardOrBackward",
				DRIVE__UNTIL_ONLY_WHEN_FORWARD_OR_BACKWARD__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoop(Loop loop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(branch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignment(Assignment assignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirection(Direction direction, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //CommandValidator
