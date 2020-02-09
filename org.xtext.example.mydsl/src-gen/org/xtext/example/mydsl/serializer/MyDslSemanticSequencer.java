/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import finalStateMachine.FSM;
import finalStateMachine.FinalState;
import finalStateMachine.FinalStateMachinePackage;
import finalStateMachine.InitialState;
import finalStateMachine.State;
import finalStateMachine.Transition;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FinalStateMachinePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FinalStateMachinePackage.FSM:
				sequence_FSM(context, (FSM) semanticObject); 
				return; 
			case FinalStateMachinePackage.FINAL_STATE:
				sequence_FinalState(context, (FinalState) semanticObject); 
				return; 
			case FinalStateMachinePackage.INITIAL_STATE:
				sequence_InitialState(context, (InitialState) semanticObject); 
				return; 
			case FinalStateMachinePackage.STATE:
				sequence_State_Impl(context, (State) semanticObject); 
				return; 
			case FinalStateMachinePackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     FSM returns FSM
	 *
	 * Constraint:
	 *     (name=EString state+=InitialState state+=FinalState (state+=State | transition+=Transition)*)
	 */
	protected void sequence_FSM(ISerializationContext context, FSM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns FinalState
	 *     FinalState returns FinalState
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_FinalState(ISerializationContext context, FinalState semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FinalStateMachinePackage.Literals.STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FinalStateMachinePackage.Literals.STATE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFinalStateAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     State returns InitialState
	 *     InitialState returns InitialState
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_InitialState(ISerializationContext context, InitialState semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FinalStateMachinePackage.Literals.STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FinalStateMachinePackage.Literals.STATE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInitialStateAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *     State_Impl returns State
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_State_Impl(ISerializationContext context, State semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FinalStateMachinePackage.Literals.STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FinalStateMachinePackage.Literals.STATE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getState_ImplAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (input=[State|EString] output=[State|EString]?)
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
