/**
 */
package robomodel.robo.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robomodel.robo.Motor;
import robomodel.robo.MotorPort;
import robomodel.robo.MotorType;
import robomodel.robo.RoboPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robomodel.robo.impl.MotorImpl#getPort <em>Port</em>}</li>
 *   <li>{@link robomodel.robo.impl.MotorImpl#getType <em>Type</em>}</li>
 *   <li>{@link robomodel.robo.impl.MotorImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link robomodel.robo.impl.MotorImpl#isReversed <em>Reversed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MotorImpl extends MinimalEObjectImpl.Container implements Motor {
	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final MotorPort PORT_EDEFAULT = MotorPort.A;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected MotorPort port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MotorType TYPE_EDEFAULT = MotorType.LARGE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MotorType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double SPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected double speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #isReversed() <em>Reversed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReversed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVERSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReversed() <em>Reversed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReversed()
	 * @generated
	 * @ordered
	 */
	protected boolean reversed = REVERSED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboPackage.Literals.MOTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotorPort getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(MotorPort newPort) {
		MotorPort oldPort = port;
		port = newPort == null ? PORT_EDEFAULT : newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboPackage.MOTOR__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MotorType newType) {
		MotorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboPackage.MOTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(double newSpeed) {
		double oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboPackage.MOTOR__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReversed() {
		return reversed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReversed(boolean newReversed) {
		boolean oldReversed = reversed;
		reversed = newReversed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboPackage.MOTOR__REVERSED, oldReversed, reversed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RoboPackage.MOTOR__PORT:
			return getPort();
		case RoboPackage.MOTOR__TYPE:
			return getType();
		case RoboPackage.MOTOR__SPEED:
			return getSpeed();
		case RoboPackage.MOTOR__REVERSED:
			return isReversed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RoboPackage.MOTOR__PORT:
			setPort((MotorPort) newValue);
			return;
		case RoboPackage.MOTOR__TYPE:
			setType((MotorType) newValue);
			return;
		case RoboPackage.MOTOR__SPEED:
			setSpeed((Double) newValue);
			return;
		case RoboPackage.MOTOR__REVERSED:
			setReversed((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RoboPackage.MOTOR__PORT:
			setPort(PORT_EDEFAULT);
			return;
		case RoboPackage.MOTOR__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case RoboPackage.MOTOR__SPEED:
			setSpeed(SPEED_EDEFAULT);
			return;
		case RoboPackage.MOTOR__REVERSED:
			setReversed(REVERSED_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RoboPackage.MOTOR__PORT:
			return port != PORT_EDEFAULT;
		case RoboPackage.MOTOR__TYPE:
			return type != TYPE_EDEFAULT;
		case RoboPackage.MOTOR__SPEED:
			return speed != SPEED_EDEFAULT;
		case RoboPackage.MOTOR__REVERSED:
			return reversed != REVERSED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (port: ");
		result.append(port);
		result.append(", type: ");
		result.append(type);
		result.append(", speed: ");
		result.append(speed);
		result.append(", reversed: ");
		result.append(reversed);
		result.append(')');
		return result.toString();
	}

} //MotorImpl
