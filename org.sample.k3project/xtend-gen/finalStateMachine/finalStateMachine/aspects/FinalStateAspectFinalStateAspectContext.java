package finalStateMachine.finalStateMachine.aspects;

import finalStateMachine.FinalState;
import finalStateMachine.finalStateMachine.aspects.FinalStateAspectFinalStateAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class FinalStateAspectFinalStateAspectContext {
  public final static FinalStateAspectFinalStateAspectContext INSTANCE = new FinalStateAspectFinalStateAspectContext();
  
  public static FinalStateAspectFinalStateAspectProperties getSelf(final FinalState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new finalStateMachine.finalStateMachine.aspects.FinalStateAspectFinalStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FinalState, FinalStateAspectFinalStateAspectProperties> map = new java.util.WeakHashMap<finalStateMachine.FinalState, finalStateMachine.finalStateMachine.aspects.FinalStateAspectFinalStateAspectProperties>();
  
  public Map<FinalState, FinalStateAspectFinalStateAspectProperties> getMap() {
    return map;
  }
}
