package ch.actifsource.tutorial.diagramm.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Transition extends DynamicResource implements ITransition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITransition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITransition>() {
    
    @Override
    public ITransition create() {
      return new Transition();
    }
    
    @Override
    public ITransition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Transition(resourceRepository, resource);
    }
  
  };

  public Transition() {
    super(ITransition.TYPE_ID);
  }
  
  public Transition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITransition.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.tutorial.diagramm.generic.javamodel.IEvent selectEvent() {
    return _getSingle(ch.actifsource.tutorial.diagramm.generic.javamodel.IEvent.class, ch.actifsource.tutorial.diagramm.generic.GenericPackage.Transition_event);
  }

  public Transition setEvent(ch.actifsource.tutorial.diagramm.generic.javamodel.IEvent event) {
    _setSingle(ch.actifsource.tutorial.diagramm.generic.GenericPackage.Transition_event, event);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Transition setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.tutorial.diagramm.generic.javamodel.IState selectTargetState() {
    return _getSingle(ch.actifsource.tutorial.diagramm.generic.javamodel.IState.class, ch.actifsource.tutorial.diagramm.generic.GenericPackage.Transition_targetState);
  }

  public Transition setTargetState(ch.actifsource.tutorial.diagramm.generic.javamodel.IState targetState) {
    _setSingle(ch.actifsource.tutorial.diagramm.generic.GenericPackage.Transition_targetState, targetState);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Transition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.tutorial.diagramm.generic.javamodel.IEvent.class, ch.actifsource.tutorial.diagramm.generic.GenericPackage.Transition_event, visitor);
    _acceptSingle(ch.actifsource.tutorial.diagramm.generic.javamodel.IState.class, ch.actifsource.tutorial.diagramm.generic.GenericPackage.Transition_targetState, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ch.actifsource.tutorial.diagramm.generic.javamodel.ITransition> selectToMeTargetState(ch.actifsource.tutorial.diagramm.generic.javamodel.IState object) {
    return _getToMeList(object.getRepository(), ch.actifsource.tutorial.diagramm.generic.javamodel.ITransition.class, ch.actifsource.tutorial.diagramm.generic.GenericPackage.Transition_targetState, object.getResource());
  }
  
  public static java.util.List<ch.actifsource.tutorial.diagramm.generic.javamodel.ITransition> selectToMeEvent(ch.actifsource.tutorial.diagramm.generic.javamodel.IEvent object) {
    return _getToMeList(object.getRepository(), ch.actifsource.tutorial.diagramm.generic.javamodel.ITransition.class, ch.actifsource.tutorial.diagramm.generic.GenericPackage.Transition_event, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cbf3352f-ee76-11ef-8f29-099ac721970d,S/ubzo8Z8sw8z5u2uQ5lk7hb6Hc=] */
