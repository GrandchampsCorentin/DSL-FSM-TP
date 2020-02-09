package finalStateMachine.finalStateMachine.aspects;

import finalStateMachine.InitialState;
import finalStateMachine.finalStateMachine.aspects.InitialStateAspectInitialStateAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class InitialStateAspectInitialStateAspectContext {
  public final static InitialStateAspectInitialStateAspectContext INSTANCE = new InitialStateAspectInitialStateAspectContext();
  
  public static InitialStateAspectInitialStateAspectProperties getSelf(final InitialState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new finalStateMachine.finalStateMachine.aspects.InitialStateAspectInitialStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<InitialState, InitialStateAspectInitialStateAspectProperties> map = new java.util.WeakHashMap<finalStateMachine.InitialState, finalStateMachine.finalStateMachine.aspects.InitialStateAspectInitialStateAspectProperties>();
  
  public Map<InitialState, InitialStateAspectInitialStateAspectProperties> getMap() {
    return map;
  }
}
