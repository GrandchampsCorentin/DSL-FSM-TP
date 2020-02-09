package finalStateMachine.finalStateMachine.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import finalStateMachine.FSM
import finalStateMachine.State
import finalStateMachine.Transition
import finalStateMachine.FinalState
import finalStateMachine.InitialState

import static extension finalStateMachine.finalStateMachine.aspects.FSMAspect.*
import static extension finalStateMachine.finalStateMachine.aspects.StateAspect.*
import static extension finalStateMachine.finalStateMachine.aspects.TransitionAspect.*
import static extension finalStateMachine.finalStateMachine.aspects.FinalStateAspect.*
import static extension finalStateMachine.finalStateMachine.aspects.InitialStateAspect.*
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI
import finalStateMachine.FinalStateMachinePackage
import java.util.concurrent.TimeUnit

class Interpreter {
	def static void main(String[] args) {
		FinalStateMachinePackage.eINSTANCE.class
		Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
		var Resource resource = new ResourceSetImpl().getResource(URI.createURI('\\M1_ICE\\HorsGit\\gemoc_studio\\workspace\\FinalStateMachine\\model\\FSM.xmi'), true)
		var myFSM = resource.contents.get(0) as FSM
		myFSM.execute
	}
}


@Aspect(className=FSM)
class FSMAspect {
	var State currentState;
	var State finalState;
	def void execute(){
		_self.currentState = _self.state.filter(InitialState).get(0);
		_self.finalState = _self.state.filter(FinalState).get(0);
		System.out.println("INITIAL");
 		System.out.println("CurrentState = " + _self.currentState.name);
 		System.out.println("FinalState = " + _self.finalState.name);
		 while(_self.currentState != _self.finalState) {
			 var int j1 = 0;
			 while(j1 < _self.transition.size()) {
				 if(_self.currentState == _self.transition.get(j1).getInput()) {
					TimeUnit.SECONDS.sleep(2);
			 		System.out.println(_self.transition.get(j1).getInput().getName() + "->" + _self.transition.get(j1).getOutput().getName());
			 		_self.currentState = _self.transition.get(j1).getOutput();
			 		j1 = _self.transition.size();
			 		System.out.println("CurrentState = " + _self.currentState.name);
			 	} else {
			 		j1++;
			 	}
			 }			 
		 }
	 	System.out.println("FINAL");
	}
}

@Aspect(className=State)
class StateAspect {

}

@Aspect(className=Transition)
class TransitionAspect {

}

@Aspect(className=FinalState)
class FinalStateAspect extends StateAspect {

}

@Aspect(className=InitialState)
class InitialStateAspect extends StateAspect {

}



