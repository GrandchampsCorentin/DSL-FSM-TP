package finalStateMachine.finalStateMachine.aspects;

import finalStateMachine.InitialState;
import finalStateMachine.finalStateMachine.aspects.StateAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = InitialState.class)
@SuppressWarnings("all")
public class InitialStateAspect extends StateAspect {
}
