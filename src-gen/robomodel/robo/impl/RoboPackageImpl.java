/**
 */
package robomodel.robo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import robomodel.robo.Motor;
import robomodel.robo.MotorPort;
import robomodel.robo.MotorType;
import robomodel.robo.Program;
import robomodel.robo.RoboFactory;
import robomodel.robo.RoboPackage;

import robomodel.robo.Robot;
import robomodel.robo.Sensor;
import robomodel.robo.SensorMode;
import robomodel.robo.SensorPort;
import robomodel.robo.SensorType;
import robomodel.robo.Setup;
import robomodel.robo.command.CommandPackage;

import robomodel.robo.command.impl.CommandPackageImpl;

import robomodel.robo.condition.ConditionPackage;

import robomodel.robo.condition.impl.ConditionPackageImpl;

import robomodel.robo.expression.ExpressionPackage;

import robomodel.robo.expression.impl.ExpressionPackageImpl;
import robomodel.robo.util.RoboValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoboPackageImpl extends EPackageImpl implements RoboPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setupEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motorEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum motorPortEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum motorTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensorPortEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensorTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensorModeEEnum = null;

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
	 * @see robomodel.robo.RoboPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RoboPackageImpl() {
		super(eNS_URI, RoboFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RoboPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RoboPackage init() {
		if (isInited)
			return (RoboPackage) EPackage.Registry.INSTANCE.getEPackage(RoboPackage.eNS_URI);

		// Obtain or create and register package
		RoboPackageImpl theRoboPackage = (RoboPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RoboPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RoboPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CommandPackageImpl theCommandPackage = (CommandPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CommandPackage.eNS_URI) instanceof CommandPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CommandPackage.eNS_URI)
						: CommandPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI)
						: ExpressionPackage.eINSTANCE);
		ConditionPackageImpl theConditionPackage = (ConditionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ConditionPackage.eNS_URI) instanceof ConditionPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ConditionPackage.eNS_URI)
						: ConditionPackage.eINSTANCE);

		// Create package meta-data objects
		theRoboPackage.createPackageContents();
		theCommandPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theConditionPackage.createPackageContents();

		// Initialize created meta-data
		theRoboPackage.initializePackageContents();
		theCommandPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theConditionPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theRoboPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return RoboValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theRoboPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RoboPackage.eNS_URI, theRoboPackage);
		return theRoboPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobot() {
		return robotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Programms() {
		return (EReference) robotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobot_Setup() {
		return (EReference) robotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetup() {
		return setupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetup_LeftMotor() {
		return (EReference) setupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetup_RightMotor() {
		return (EReference) setupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetup_Sensors() {
		return (EReference) setupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotor() {
		return motorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotor_Port() {
		return (EAttribute) motorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotor_Type() {
		return (EAttribute) motorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotor_Speed() {
		return (EAttribute) motorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotor_Reversed() {
		return (EAttribute) motorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Port() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Type() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Mode() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Name() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgram_Name() {
		return (EAttribute) programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Commands() {
		return (EReference) programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMotorPort() {
		return motorPortEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMotorType() {
		return motorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensorPort() {
		return sensorPortEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensorType() {
		return sensorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensorMode() {
		return sensorModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboFactory getRoboFactory() {
		return (RoboFactory) getEFactoryInstance();
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
		robotEClass = createEClass(ROBOT);
		createEReference(robotEClass, ROBOT__PROGRAMMS);
		createEReference(robotEClass, ROBOT__SETUP);

		setupEClass = createEClass(SETUP);
		createEReference(setupEClass, SETUP__LEFT_MOTOR);
		createEReference(setupEClass, SETUP__RIGHT_MOTOR);
		createEReference(setupEClass, SETUP__SENSORS);

		motorEClass = createEClass(MOTOR);
		createEAttribute(motorEClass, MOTOR__PORT);
		createEAttribute(motorEClass, MOTOR__TYPE);
		createEAttribute(motorEClass, MOTOR__SPEED);
		createEAttribute(motorEClass, MOTOR__REVERSED);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__PORT);
		createEAttribute(sensorEClass, SENSOR__TYPE);
		createEAttribute(sensorEClass, SENSOR__MODE);
		createEAttribute(sensorEClass, SENSOR__NAME);

		programEClass = createEClass(PROGRAM);
		createEAttribute(programEClass, PROGRAM__NAME);
		createEReference(programEClass, PROGRAM__COMMANDS);

		// Create enums
		motorPortEEnum = createEEnum(MOTOR_PORT);
		motorTypeEEnum = createEEnum(MOTOR_TYPE);
		sensorPortEEnum = createEEnum(SENSOR_PORT);
		sensorTypeEEnum = createEEnum(SENSOR_TYPE);
		sensorModeEEnum = createEEnum(SENSOR_MODE);
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
		CommandPackage theCommandPackage = (CommandPackage) EPackage.Registry.INSTANCE
				.getEPackage(CommandPackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionPackage.eNS_URI);
		ConditionPackage theConditionPackage = (ConditionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ConditionPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCommandPackage);
		getESubpackages().add(theExpressionPackage);
		getESubpackages().add(theConditionPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRobot_Programms(), this.getProgram(), null, "programms", null, 0, -1, Robot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobot_Setup(), this.getSetup(), null, "setup", null, 1, 1, Robot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(setupEClass, Setup.class, "Setup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetup_LeftMotor(), this.getMotor(), null, "leftMotor", null, 1, 1, Setup.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSetup_RightMotor(), this.getMotor(), null, "rightMotor", null, 1, 1, Setup.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetup_Sensors(), this.getSensor(), null, "sensors", null, 0, -1, Setup.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(motorEClass, Motor.class, "Motor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotor_Port(), this.getMotorPort(), "port", null, 1, 1, Motor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotor_Type(), this.getMotorType(), "type", null, 1, 1, Motor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotor_Speed(), ecorePackage.getEDouble(), "speed", null, 1, 1, Motor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotor_Reversed(), ecorePackage.getEBoolean(), "reversed", "false", 1, 1, Motor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Port(), this.getSensorPort(), "port", null, 1, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Type(), this.getSensorType(), "type", null, 1, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Mode(), this.getSensorMode(), "mode", null, 1, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Name(), ecorePackage.getEString(), "name", null, 1, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Program.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Commands(), theCommandPackage.getCommand(), null, "commands", null, 0, -1,
				Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(motorPortEEnum, MotorPort.class, "MotorPort");
		addEEnumLiteral(motorPortEEnum, MotorPort.A);
		addEEnumLiteral(motorPortEEnum, MotorPort.B);
		addEEnumLiteral(motorPortEEnum, MotorPort.C);
		addEEnumLiteral(motorPortEEnum, MotorPort.D);

		initEEnum(motorTypeEEnum, MotorType.class, "MotorType");
		addEEnumLiteral(motorTypeEEnum, MotorType.LARGE);
		addEEnumLiteral(motorTypeEEnum, MotorType.MEDIUM);

		initEEnum(sensorPortEEnum, SensorPort.class, "SensorPort");
		addEEnumLiteral(sensorPortEEnum, SensorPort.S1);
		addEEnumLiteral(sensorPortEEnum, SensorPort.S2);
		addEEnumLiteral(sensorPortEEnum, SensorPort.S3);
		addEEnumLiteral(sensorPortEEnum, SensorPort.S4);

		initEEnum(sensorTypeEEnum, SensorType.class, "SensorType");
		addEEnumLiteral(sensorTypeEEnum, SensorType.COLOR);

		initEEnum(sensorModeEEnum, SensorMode.class, "SensorMode");
		addEEnumLiteral(sensorModeEEnum, SensorMode.RED);
		addEEnumLiteral(sensorModeEEnum, SensorMode.AMBIENT);
		addEEnumLiteral(sensorModeEEnum, SensorMode.COLOR_ID);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
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
		addAnnotation(setupEClass, source, new String[] { "constraints", "DifferentMotorPorts" });
		addAnnotation(sensorEClass, source, new String[] { "constraints", "ModeAndTypeMatches" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(setupEClass, source, new String[] { "DifferentMotorPorts", "leftMotor.port <> rightMotor.port" });
		addAnnotation(sensorEClass, source, new String[] { "ModeAndTypeMatches",
				"\n\t\t\t(mode = SensorMode::RED implies type = SensorType::COLOR)\n\t\t\tand (mode = SensorMode::AMBIENT implies type = SensorType::COLOR)\n\t\t\tand (mode = SensorMode::COLOR_ID implies type = SensorType::COLOR)\n\t\t" });
	}

} //RoboPackageImpl
