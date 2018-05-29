/**
 */
package robomodel.robo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robomodel.robo.Motor;
import robomodel.robo.RoboPackage;
import robomodel.robo.Sensor;
import robomodel.robo.Setup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robomodel.robo.impl.SetupImpl#getLeftMotor <em>Left Motor</em>}</li>
 *   <li>{@link robomodel.robo.impl.SetupImpl#getRightMotor <em>Right Motor</em>}</li>
 *   <li>{@link robomodel.robo.impl.SetupImpl#getSensors <em>Sensors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetupImpl extends MinimalEObjectImpl.Container implements Setup {
	/**
	 * The cached value of the '{@link #getLeftMotor() <em>Left Motor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftMotor()
	 * @generated
	 * @ordered
	 */
	protected Motor leftMotor;

	/**
	 * The cached value of the '{@link #getRightMotor() <em>Right Motor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightMotor()
	 * @generated
	 * @ordered
	 */
	protected Motor rightMotor;

	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboPackage.Literals.SETUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motor getLeftMotor() {
		return leftMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftMotor(Motor newLeftMotor, NotificationChain msgs) {
		Motor oldLeftMotor = leftMotor;
		leftMotor = newLeftMotor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RoboPackage.SETUP__LEFT_MOTOR, oldLeftMotor, newLeftMotor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftMotor(Motor newLeftMotor) {
		if (newLeftMotor != leftMotor) {
			NotificationChain msgs = null;
			if (leftMotor != null)
				msgs = ((InternalEObject) leftMotor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RoboPackage.SETUP__LEFT_MOTOR, null, msgs);
			if (newLeftMotor != null)
				msgs = ((InternalEObject) newLeftMotor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RoboPackage.SETUP__LEFT_MOTOR, null, msgs);
			msgs = basicSetLeftMotor(newLeftMotor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboPackage.SETUP__LEFT_MOTOR, newLeftMotor,
					newLeftMotor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motor getRightMotor() {
		return rightMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightMotor(Motor newRightMotor, NotificationChain msgs) {
		Motor oldRightMotor = rightMotor;
		rightMotor = newRightMotor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RoboPackage.SETUP__RIGHT_MOTOR, oldRightMotor, newRightMotor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightMotor(Motor newRightMotor) {
		if (newRightMotor != rightMotor) {
			NotificationChain msgs = null;
			if (rightMotor != null)
				msgs = ((InternalEObject) rightMotor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RoboPackage.SETUP__RIGHT_MOTOR, null, msgs);
			if (newRightMotor != null)
				msgs = ((InternalEObject) newRightMotor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RoboPackage.SETUP__RIGHT_MOTOR, null, msgs);
			msgs = basicSetRightMotor(newRightMotor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboPackage.SETUP__RIGHT_MOTOR, newRightMotor,
					newRightMotor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensors() {
		if (sensors == null) {
			sensors = new EObjectContainmentEList<Sensor>(Sensor.class, this, RoboPackage.SETUP__SENSORS);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RoboPackage.SETUP__LEFT_MOTOR:
			return basicSetLeftMotor(null, msgs);
		case RoboPackage.SETUP__RIGHT_MOTOR:
			return basicSetRightMotor(null, msgs);
		case RoboPackage.SETUP__SENSORS:
			return ((InternalEList<?>) getSensors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RoboPackage.SETUP__LEFT_MOTOR:
			return getLeftMotor();
		case RoboPackage.SETUP__RIGHT_MOTOR:
			return getRightMotor();
		case RoboPackage.SETUP__SENSORS:
			return getSensors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RoboPackage.SETUP__LEFT_MOTOR:
			setLeftMotor((Motor) newValue);
			return;
		case RoboPackage.SETUP__RIGHT_MOTOR:
			setRightMotor((Motor) newValue);
			return;
		case RoboPackage.SETUP__SENSORS:
			getSensors().clear();
			getSensors().addAll((Collection<? extends Sensor>) newValue);
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
		case RoboPackage.SETUP__LEFT_MOTOR:
			setLeftMotor((Motor) null);
			return;
		case RoboPackage.SETUP__RIGHT_MOTOR:
			setRightMotor((Motor) null);
			return;
		case RoboPackage.SETUP__SENSORS:
			getSensors().clear();
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
		case RoboPackage.SETUP__LEFT_MOTOR:
			return leftMotor != null;
		case RoboPackage.SETUP__RIGHT_MOTOR:
			return rightMotor != null;
		case RoboPackage.SETUP__SENSORS:
			return sensors != null && !sensors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SetupImpl
