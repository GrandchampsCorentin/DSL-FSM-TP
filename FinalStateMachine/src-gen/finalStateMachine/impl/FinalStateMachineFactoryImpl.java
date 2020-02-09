/**
 */
package finalStateMachine.impl;

import finalStateMachine.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinalStateMachineFactoryImpl extends EFactoryImpl implements FinalStateMachineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FinalStateMachineFactory init() {
		try {
			FinalStateMachineFactory theFinalStateMachineFactory = (FinalStateMachineFactory) EPackage.Registry.INSTANCE
					.getEFactory(FinalStateMachinePackage.eNS_URI);
			if (theFinalStateMachineFactory != null) {
				return theFinalStateMachineFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FinalStateMachineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalStateMachineFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FinalStateMachinePackage.FSM:
			return createFSM();
		case FinalStateMachinePackage.STATE:
			return createState();
		case FinalStateMachinePackage.TRANSITION:
			return createTransition();
		case FinalStateMachinePackage.FINAL_STATE:
			return createFinalState();
		case FinalStateMachinePackage.INITIAL_STATE:
			return createInitialState();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM createFSM() {
		FSMImpl fsm = new FSMImpl();
		return fsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalStateMachinePackage getFinalStateMachinePackage() {
		return (FinalStateMachinePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FinalStateMachinePackage getPackage() {
		return FinalStateMachinePackage.eINSTANCE;
	}

} //FinalStateMachineFactoryImpl
