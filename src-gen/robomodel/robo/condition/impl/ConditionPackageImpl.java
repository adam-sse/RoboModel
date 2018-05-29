/**
 */
package robomodel.robo.condition.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import robomodel.robo.RoboPackage;

import robomodel.robo.command.CommandPackage;

import robomodel.robo.command.impl.CommandPackageImpl;

import robomodel.robo.condition.Comparison;
import robomodel.robo.condition.ComparisonOperator;
import robomodel.robo.condition.Condition;
import robomodel.robo.condition.ConditionFactory;
import robomodel.robo.condition.ConditionPackage;

import robomodel.robo.expression.ExpressionPackage;

import robomodel.robo.expression.impl.ExpressionPackageImpl;

import robomodel.robo.impl.RoboPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionPackageImpl extends EPackageImpl implements ConditionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see robomodel.robo.condition.ConditionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConditionPackageImpl() {
		super(eNS_URI, ConditionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConditionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConditionPackage init() {
		if (isInited)
			return (ConditionPackage) EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI);

		// Obtain or create and register package
		ConditionPackageImpl theConditionPackage = (ConditionPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ConditionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ConditionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RoboPackageImpl theRoboPackage = (RoboPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RoboPackage.eNS_URI) instanceof RoboPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RoboPackage.eNS_URI)
						: RoboPackage.eINSTANCE);
		CommandPackageImpl theCommandPackage = (CommandPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CommandPackage.eNS_URI) instanceof CommandPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CommandPackage.eNS_URI)
						: CommandPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI)
						: ExpressionPackage.eINSTANCE);

		// Create package meta-data objects
		theConditionPackage.createPackageContents();
		theRoboPackage.createPackageContents();
		theCommandPackage.createPackageContents();
		theExpressionPackage.createPackageContents();

		// Initialize created meta-data
		theConditionPackage.initializePackageContents();
		theRoboPackage.initializePackageContents();
		theCommandPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConditionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConditionPackage.eNS_URI, theConditionPackage);
		return theConditionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCondition__Evaluate() {
		return conditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparison() {
		return comparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparison_Left() {
		return (EReference) comparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparison_Right() {
		return (EReference) comparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparison_Operator() {
		return (EAttribute) comparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonOperator() {
		return comparisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionFactory getConditionFactory() {
		return (ConditionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		conditionEClass = createEClass(CONDITION);
		createEOperation(conditionEClass, CONDITION___EVALUATE);

		comparisonEClass = createEClass(COMPARISON);
		createEReference(comparisonEClass, COMPARISON__LEFT);
		createEReference(comparisonEClass, COMPARISON__RIGHT);
		createEAttribute(comparisonEClass, COMPARISON__OPERATOR);

		// Create enums
		comparisonOperatorEEnum = createEEnum(COMPARISON_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExpressionPackage theExpressionPackage = (ExpressionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		comparisonEClass.getESuperTypes().add(this.getCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCondition__Evaluate(), ecorePackage.getEBoolean(), "evaluate", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(comparisonEClass, Comparison.class, "Comparison", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparison_Left(), theExpressionPackage.getExpr(), null, "left", null, 1, 1, Comparison.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparison_Right(), theExpressionPackage.getExpr(), null, "right", null, 1, 1,
				Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparison_Operator(), this.getComparisonOperator(), "operator", null, 1, 1, Comparison.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparisonOperatorEEnum, ComparisonOperator.class, "ComparisonOperator");
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS_OR_EQUAL);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER_OR_EQUAL);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.EQUAL);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.UNEQUAL);
	}

} //ConditionPackageImpl
