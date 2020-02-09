package finalStateMachine.finalStateMachine.aspects;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import finalStateMachine.FSM;
import finalStateMachine.FinalState;
import finalStateMachine.InitialState;
import finalStateMachine.State;
import finalStateMachine.finalStateMachine.aspects.FSMAspectFSMAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.concurrent.TimeUnit;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Aspect(className = FSM.class)
@SuppressWarnings("all")
public class FSMAspect {
  public static void execute(final FSM _self) {
    final finalStateMachine.finalStateMachine.aspects.FSMAspectFSMAspectProperties _self_ = finalStateMachine.finalStateMachine.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof finalStateMachine.FSM){
    	finalStateMachine.finalStateMachine.aspects.FSMAspect._privk3_execute(_self_, (finalStateMachine.FSM)_self);
    };
  }
  
  private static State currentState(final FSM _self) {
    final finalStateMachine.finalStateMachine.aspects.FSMAspectFSMAspectProperties _self_ = finalStateMachine.finalStateMachine.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State currentState()
    if (_self instanceof finalStateMachine.FSM){
    	result = finalStateMachine.finalStateMachine.aspects.FSMAspect._privk3_currentState(_self_, (finalStateMachine.FSM)_self);
    };
    return (finalStateMachine.State)result;
  }
  
  private static void currentState(final FSM _self, final State currentState) {
    final finalStateMachine.finalStateMachine.aspects.FSMAspectFSMAspectProperties _self_ = finalStateMachine.finalStateMachine.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentState(State)
    if (_self instanceof finalStateMachine.FSM){
    	finalStateMachine.finalStateMachine.aspects.FSMAspect._privk3_currentState(_self_, (finalStateMachine.FSM)_self,currentState);
    };
  }
  
  private static State finalState(final FSM _self) {
    final finalStateMachine.finalStateMachine.aspects.FSMAspectFSMAspectProperties _self_ = finalStateMachine.finalStateMachine.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State finalState()
    if (_self instanceof finalStateMachine.FSM){
    	result = finalStateMachine.finalStateMachine.aspects.FSMAspect._privk3_finalState(_self_, (finalStateMachine.FSM)_self);
    };
    return (finalStateMachine.State)result;
  }
  
  private static void finalState(final FSM _self, final State finalState) {
    final finalStateMachine.finalStateMachine.aspects.FSMAspectFSMAspectProperties _self_ = finalStateMachine.finalStateMachine.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void finalState(State)
    if (_self instanceof finalStateMachine.FSM){
    	finalStateMachine.finalStateMachine.aspects.FSMAspect._privk3_finalState(_self_, (finalStateMachine.FSM)_self,finalState);
    };
  }
  
  protected static void _privk3_execute(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    try {
      FSMAspect.currentState(_self, ((State[])Conversions.unwrapArray(Iterables.<InitialState>filter(_self.getState(), InitialState.class), State.class))[0]);
      FSMAspect.finalState(_self, ((State[])Conversions.unwrapArray(Iterables.<FinalState>filter(_self.getState(), FinalState.class), State.class))[0]);
      System.out.println("INITIAL");
      String _name = FSMAspect.currentState(_self).getName();
      String _plus = ("CurrentState = " + _name);
      System.out.println(_plus);
      String _name_1 = FSMAspect.finalState(_self).getName();
      String _plus_1 = ("FinalState = " + _name_1);
      System.out.println(_plus_1);
      while ((!Objects.equal(FSMAspect.currentState(_self), FSMAspect.finalState(_self)))) {
        {
          int j1 = 0;
          while ((j1 < _self.getTransition().size())) {
            State _currentState = FSMAspect.currentState(_self);
            State _input = _self.getTransition().get(j1).getInput();
            boolean _equals = Objects.equal(_currentState, _input);
            if (_equals) {
              TimeUnit.SECONDS.sleep(2);
              String _name_2 = _self.getTransition().get(j1).getInput().getName();
              String _plus_2 = (_name_2 + "->");
              String _name_3 = _self.getTransition().get(j1).getOutput().getName();
              String _plus_3 = (_plus_2 + _name_3);
              System.out.println(_plus_3);
              FSMAspect.currentState(_self, _self.getTransition().get(j1).getOutput());
              j1 = _self.getTransition().size();
              String _name_4 = FSMAspect.currentState(_self).getName();
              String _plus_4 = ("CurrentState = " + _name_4);
              System.out.println(_plus_4);
            } else {
              j1++;
            }
          }
        }
      }
      System.out.println("FINAL");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static State _privk3_currentState(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (finalStateMachine.State) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentState;
  }
  
  protected static void _privk3_currentState(final FSMAspectFSMAspectProperties _self_, final FSM _self, final State currentState) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentState);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentState = currentState;
    }
  }
  
  protected static State _privk3_finalState(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getFinalState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (finalStateMachine.State) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.finalState;
  }
  
  protected static void _privk3_finalState(final FSMAspectFSMAspectProperties _self_, final FSM _self, final State finalState) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setFinalState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, finalState);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.finalState = finalState;
    }
  }
}
