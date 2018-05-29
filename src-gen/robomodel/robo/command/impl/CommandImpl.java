/**
 */
package robomodel.robo.command.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robomodel.robo.command.Command;
import robomodel.robo.command.CommandPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CommandImpl extends MinimalEObjectImpl.Container implements Command {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandPackage.Literals.COMMAND;
	}

} //CommandImpl
