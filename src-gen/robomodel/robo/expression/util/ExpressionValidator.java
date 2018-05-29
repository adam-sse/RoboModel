/**
 */
package robomodel.robo.expression.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import robomodel.robo.expression.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see robomodel.robo.expression.ExpressionPackage
 * @generated
 */
public class ExpressionValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ExpressionValidator INSTANCE = new ExpressionValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "robomodel.robo.expression";

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
	public ExpressionValidator() {
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
		return ExpressionPackage.eINSTANCE;
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
		case ExpressionPackage.EXPR:
			return validateExpr((Expr) value, diagnostics, context);
		case ExpressionPackage.VARIABLE:
			return validateVariable((Variable) value, diagnostics, context);
		case ExpressionPackage.OPERATION:
			return validateOperation((Operation) value, diagnostics, context);
		case ExpressionPackage.LITERAL:
			return validateLiteral((Literal) value, diagnostics, context);
		case ExpressionPackage.EXPR_OPERATION:
			return validateExprOperation((ExprOperation) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpr(Expr expr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operation, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOperation_LeftCanOnlyBeOmmittedIfUnaryMinus(operation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the LeftCanOnlyBeOmmittedIfUnaryMinus constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__LEFT_CAN_ONLY_BE_OMMITTED_IF_UNARY_MINUS__EEXPRESSION = "left = null implies operator = ExprOperation::MINUS";

	/**
	 * Validates the LeftCanOnlyBeOmmittedIfUnaryMinus constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_LeftCanOnlyBeOmmittedIfUnaryMinus(Operation operation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(ExpressionPackage.Literals.OPERATION, operation, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "LeftCanOnlyBeOmmittedIfUnaryMinus",
				OPERATION__LEFT_CAN_ONLY_BE_OMMITTED_IF_UNARY_MINUS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteral(Literal literal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExprOperation(ExprOperation exprOperation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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

} //ExpressionValidator
