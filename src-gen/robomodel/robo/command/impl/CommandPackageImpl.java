/**
 */
package robomodel.robo.command.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import robomodel.robo.RoboPackage;

import robomodel.robo.command.Assignment;
import robomodel.robo.command.Branch;
import robomodel.robo.command.Command;
import robomodel.robo.command.CommandFactory;
import robomodel.robo.command.CommandPackage;
import robomodel.robo.command.Direction;
import robomodel.robo.command.Drive;
import robomodel.robo.command.Loop;
import robomodel.robo.command.util.CommandValidator;
import robomodel.robo.condition.ConditionPackage;

import robomodel.robo.condition.impl.ConditionPackageImpl;

import robomodel.robo.expression.ExpressionPackage;

import robomodel.robo.expression.impl.ExpressionPackageImpl;

import robomodel.robo.impl.RoboPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandPackageImpl extends EPackageImpl implements CommandPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

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
	 * @see robomodel.robo.command.CommandPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommandPackageImpl() {
		super(eNS_URI, CommandFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommandPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommandPackage init() {
		if (isInited)
			return (CommandPackage) EPackage.Registry.INSTANCE.getEPackage(CommandPackage.eNS_URI);

		// Obtain or create and register package
		CommandPackageImpl theCommandPackage = (CommandPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CommandPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CommandPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RoboPackageImpl theRoboPackage = (RoboPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RoboPackage.eNS_URI) instanceof RoboPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RoboPackage.eNS_URI)
						: RoboPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI)
						: ExpressionPackage.eINSTANCE);
		ConditionPackageImpl theConditionPackage = (ConditionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ConditionPackage.eNS_URI) instanceof ConditionPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI)
						: ConditionPackage.eINSTANCE);

		// Create package meta-data objects
		theCommandPackage.createPackageContents();
		theRoboPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theConditionPackage.createPackageContents();

		// Initialize created meta-data
		theCommandPackage.initializePackageContents();
		theRoboPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theConditionPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theCommandPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return CommandValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theCommandPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommandPackage.eNS_URI, theCommandPackage);
		return theCommandPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrive() {
		return driveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrive_Distance() {
		return (EReference) driveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrive_Until() {
		return (EReference) driveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrive_Direction() {
		return (EAttribute) driveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_Condition() {
		return (EReference) loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_Commands() {
		return (EReference) loopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_Condition() {
		return (EReference) branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_Commands() {
		return (EReference) branchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_Variable() {
		return (EAttribute) assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Value() {
		return (EReference) assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandFactory getCommandFactory() {
		return (CommandFactory) getEFactoryInstance();
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
		commandEClass = createEClass(COMMAND);

		driveEClass = createEClass(DRIVE);
		createEReference(driveEClass, DRIVE__DISTANCE);
		createEReference(driveEClass, DRIVE__UNTIL);
		createEAttribute(driveEClass, DRIVE__DIRECTION);

		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__CONDITION);
		createEReference(loopEClass, LOOP__COMMANDS);

		branchEClass = createEClass(BRANCH);
		createEReference(branchEClass, BRANCH__CONDITION);
		createEReference(branchEClass, BRANCH__COMMANDS);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEAttribute(assignmentEClass, ASSIGNMENT__VARIABLE);
		createEReference(assignmentEClass, ASSIGNMENT__VALUE);

		// Create enums
		directionEEnum = createEEnum(DIRECTION);
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
		ConditionPackage theConditionPackage = (ConditionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ConditionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		driveEClass.getESuperTypes().add(this.getCommand());
		loopEClass.getESuperTypes().add(this.getCommand());
		branchEClass.getESuperTypes().add(this.getCommand());
		assignmentEClass.getESuperTypes().add(this.getCommand());

		// Initialize classes, features, and operations; add parameters
		initEClass(commandEClass, Command.class, "Command", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(driveEClass, Drive.class, "Drive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDrive_Distance(), theExpressionPackage.getExpr(), null, "distance", null, 0, 1, Drive.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrive_Until(), theConditionPackage.getCondition(), null, "until", null, 0, 1, Drive.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrive_Direction(), this.getDirection(), "direction", null, 1, 1, Drive.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_Condition(), theConditionPackage.getCondition(), null, "condition", null, 1, 1,
				Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_Commands(), this.getCommand(), null, "commands", null, 0, -1, Loop.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranch_Condition(), theConditionPackage.getCondition(), null, "condition", null, 1, 1,
				Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_Commands(), this.getCommand(), null, "commands", null, 0, -1, Branch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssignment_Variable(), ecorePackage.getEString(), "variable", null, 1, 1, Assignment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_Value(), theExpressionPackage.getExpr(), null, "value", null, 1, 1,
				Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.FORWARD);
		addEEnumLiteral(directionEEnum, Direction.BACKWARD);
		addEEnumLiteral(directionEEnum, Direction.LEFT);
		addEEnumLiteral(directionEEnum, Direction.RIGHT);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(driveEClass, source,
				new String[] { "constraints", "UntilOrDistance UntilOnlyWhenForwardOrBackward" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(driveEClass, source, new String[] { "UntilOrDistance", "(distance <> null) xor (until <> null)",
				"UntilOnlyWhenForwardOrBackward",
				"(until <> null) implies (direction = Direction::FORWARD or direction = Direction::BACKWARD)" });
	}

} //CommandPackageImpl
