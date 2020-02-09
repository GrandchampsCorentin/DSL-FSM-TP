package finalStateMachine.finalStateMachine.aspects;

import finalStateMachine.FinalState;
import finalStateMachine.finalStateMachine.aspects.StateAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
}
