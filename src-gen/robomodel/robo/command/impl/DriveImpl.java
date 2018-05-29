/**
 */
package robomodel.robo.command.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robomodel.robo.command.CommandPackage;
import robomodel.robo.command.Direction;
import robomodel.robo.command.Drive;

import robomodel.robo.condition.Condition;

import robomodel.robo.expression.Expr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robomodel.robo.command.impl.DriveImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link robomodel.robo.command.impl.DriveImpl#getUntil <em>Until</em>}</li>
 *   <li>{@link robomodel.robo.command.impl.DriveImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriveImpl extends CommandImpl implements Drive {
	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected Expr distance;

	/**
	 * The cached value of the '{@link #getUntil() <em>Until</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntil()
	 * @generated
	 * @ordered
	 */
	protected Condition until;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.FORWARD;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandPackage.Literals.DRIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expr getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistance(Expr newDistance, NotificationChain msgs) {
		Expr oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CommandPackage.DRIVE__DISTANCE, oldDistance, newDistance);
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
	public void setDistance(Expr newDistance) {
		if (newDistance != distance) {
			NotificationChain msgs = null;
			if (distance != null)
				msgs = ((InternalEObject) distance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CommandPackage.DRIVE__DISTANCE, null, msgs);
			if (newDistance != null)
				msgs = ((InternalEObject) newDistance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CommandPackage.DRIVE__DISTANCE, null, msgs);
			msgs = basicSetDistance(newDistance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.DRIVE__DISTANCE, newDistance,
					newDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getUntil() {
		return until;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUntil(Condition newUntil, NotificationChain msgs) {
		Condition oldUntil = until;
		until = newUntil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommandPackage.DRIVE__UNTIL,
					oldUntil, newUntil);
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
	public void setUntil(Condition newUntil) {
		if (newUntil != until) {
			NotificationChain msgs = null;
			if (until != null)
				msgs = ((InternalEObject) until).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CommandPackage.DRIVE__UNTIL, null, msgs);
			if (newUntil != null)
				msgs = ((InternalEObject) newUntil).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CommandPackage.DRIVE__UNTIL, null, msgs);
			msgs = basicSetUntil(newUntil, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.DRIVE__UNTIL, newUntil, newUntil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.DRIVE__DIRECTION, oldDirection,
					direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CommandPackage.DRIVE__DISTANCE:
			return basicSetDistance(null, msgs);
		case CommandPackage.DRIVE__UNTIL:
			return basicSetUntil(null, msgs);
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
		case CommandPackage.DRIVE__DISTANCE:
			return getDistance();
		case CommandPackage.DRIVE__UNTIL:
			return getUntil();
		case CommandPackage.DRIVE__DIRECTION:
			return getDirection();
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
		case CommandPackage.DRIVE__DISTANCE:
			setDistance((Expr) newValue);
			return;
		case CommandPackage.DRIVE__UNTIL:
			setUntil((Condition) newValue);
			return;
		case CommandPackage.DRIVE__DIRECTION:
			setDirection((Direction) newValue);
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
		case CommandPackage.DRIVE__DISTANCE:
			setDistance((Expr) null);
			return;
		case CommandPackage.DRIVE__UNTIL:
			setUntil((Condition) null);
			return;
		case CommandPackage.DRIVE__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
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
		case CommandPackage.DRIVE__DISTANCE:
			return distance != null;
		case CommandPackage.DRIVE__UNTIL:
			return until != null;
		case CommandPackage.DRIVE__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //DriveImpl
