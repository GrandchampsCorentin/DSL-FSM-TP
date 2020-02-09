/**
 */
package finalStateMachine.impl;

import finalStateMachine.FinalStateMachinePackage;
import finalStateMachine.State;
import finalStateMachine.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finalStateMachine.impl.TransitionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link finalStateMachine.impl.TransitionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link finalStateMachine.impl.TransitionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected State input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected State output;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalStateMachinePackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject) input;
			input = (State) eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FinalStateMachinePackage.TRANSITION__INPUT, oldInput, input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(State newInput) {
		State oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalStateMachinePackage.TRANSITION__INPUT, oldInput,
					input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject) output;
			output = (State) eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FinalStateMachinePackage.TRANSITION__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(State newOutput) {
		State oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalStateMachinePackage.TRANSITION__OUTPUT,
					oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalStateMachinePackage.TRANSITION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FinalStateMachinePackage.TRANSITION__INPUT:
			if (resolve)
				return getInput();
			return basicGetInput();
		case FinalStateMachinePackage.TRANSITION__OUTPUT:
			if (resolve)
				return getOutput();
			return basicGetOutput();
		case FinalStateMachinePackage.TRANSITION__NAME:
			return getName();
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
		case FinalStateMachinePackage.TRANSITION__INPUT:
			setInput((State) newValue);
			return;
		case FinalStateMachinePackage.TRANSITION__OUTPUT:
			setOutput((State) newValue);
			return;
		case FinalStateMachinePackage.TRANSITION__NAME:
			setName((String) newValue);
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
		case FinalStateMachinePackage.TRANSITION__INPUT:
			setInput((State) null);
			return;
		case FinalStateMachinePackage.TRANSITION__OUTPUT:
			setOutput((State) null);
			return;
		case FinalStateMachinePackage.TRANSITION__NAME:
			setName(NAME_EDEFAULT);
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
		case FinalStateMachinePackage.TRANSITION__INPUT:
			return input != null;
		case FinalStateMachinePackage.TRANSITION__OUTPUT:
			return output != null;
		case FinalStateMachinePackage.TRANSITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
