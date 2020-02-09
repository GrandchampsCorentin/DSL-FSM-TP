package finalStateMachine.finalStateMachine.aspects;

import finalStateMachine.FSM;
import finalStateMachine.FinalStateMachinePackage;
import finalStateMachine.finalStateMachine.aspects.FSMAspect;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class Interpreter {
  public static void main(final String[] args) {
    FinalStateMachinePackage.eINSTANCE.getClass();
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    Resource resource = new ResourceSetImpl().getResource(URI.createURI("\\M1_ICE\\HorsGit\\gemoc_studio\\workspace\\FinalStateMachine\\model\\FSM.xmi"), true);
    EObject _get = resource.getContents().get(0);
    FSM myFSM = ((FSM) _get);
    FSMAspect.execute(myFSM);
  }
}
