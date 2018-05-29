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
import robomodel.robo.Program;
import robomodel.robo.RoboPackage;
import robomodel.robo.Robot;
import robomodel.robo.Setup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robomodel.robo.impl.RobotImpl#getProgramms <em>Programms</em>}</li>
 *   <li>{@link robomodel.robo.impl.RobotImpl#getSetup <em>Setup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotImpl extends MinimalEObjectImpl.Container implements Robot {
	/**
	 * The cached value of the '{@link #getProgramms() <em>Programms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramms()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> programms;

	/**
	 * The cached value of the '{@link #getSetup() <em>Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetup()
	 * @generated
	 * @ordered
	 */
	protected Setup setup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboPackage.Literals.ROBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Program> getProgramms() {
		if (programms == null) {
			programms = new EObjectContainmentEList<Program>(Program.class, this, RoboPackage.ROBOT__PROGRAMMS);
		}
		return programms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setup getSetup() {
		return setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetup(Setup newSetup, NotificationChain msgs) {
		Setup oldSetup = setup;
		setup = newSetup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboPackage.ROBOT__SETUP,
					oldSetup, newSetup);
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
	public void setSetup(Setup newSetup) {
		if (newSetup != setup) {
			NotificationChain msgs = null;
			if (setup != null)
				msgs = ((InternalEObject) setup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoboPackage.ROBOT__SETUP,
						null, msgs);
			if (newSetup != null)
				msgs = ((InternalEObject) newSetup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboPackage.ROBOT__SETUP,
						null, msgs);
			msgs = basicSetSetup(newSetup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboPackage.ROBOT__SETUP, newSetup, newSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RoboPackage.ROBOT__PROGRAMMS:
			return ((InternalEList<?>) getProgramms()).basicRemove(otherEnd, msgs);
		case RoboPackage.ROBOT__SETUP:
			return basicSetSetup(null, msgs);
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
		case RoboPackage.ROBOT__PROGRAMMS:
			return getProgramms();
		case RoboPackage.ROBOT__SETUP:
			return getSetup();
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
		case RoboPackage.ROBOT__PROGRAMMS:
			getProgramms().clear();
			getProgramms().addAll((Collection<? extends Program>) newValue);
			return;
		case RoboPackage.ROBOT__SETUP:
			setSetup((Setup) newValue);
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
		case RoboPackage.ROBOT__PROGRAMMS:
			getProgramms().clear();
			return;
		case RoboPackage.ROBOT__SETUP:
			setSetup((Setup) null);
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
		case RoboPackage.ROBOT__PROGRAMMS:
			return programms != null && !programms.isEmpty();
		case RoboPackage.ROBOT__SETUP:
			return setup != null;
		}
		return super.eIsSet(featureID);
	}

} //RobotImpl
