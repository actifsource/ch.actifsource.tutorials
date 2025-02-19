package ch.actifsource.tutorial.statemachine.code.generic.javamodel;

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
  public ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet selectAction() {
    return _getSingle(ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_action);
  }

  public Transition setAction(ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet action) {
    _setSingle(ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_action, action);
    return this;
  }
    
  @Override
  public ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet selectCondition() {
    return _getSingle(ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_condition);
  }

  public Transition setCondition(ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet condition) {
    _setSingle(ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_condition, condition);
    return this;
  }
    
  @Override
  public ch.actifsource.tutorial.statemachine.code.generic.javamodel.IEvent selectEvent() {
    return _getSingle(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IEvent.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_event);
  }

  public Transition setEvent(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IEvent event) {
    _setSingle(ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_event, event);
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
  public ch.actifsource.tutorial.statemachine.code.generic.javamodel.IState selectTargetState() {
    return _getSingle(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IState.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_targetState);
  }

  public Transition setTargetState(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IState targetState) {
    _setSingle(ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_targetState, targetState);
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
    _acceptSingle(ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_action, visitor);
    _acceptSingle(ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_condition, visitor);
    _acceptSingle(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IEvent.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_event, visitor);
    _acceptSingle(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IState.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_targetState, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ch.actifsource.tutorial.statemachine.code.generic.javamodel.ITransition> selectToMeTargetState(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IState object) {
    return _getToMeList(object.getRepository(), ch.actifsource.tutorial.statemachine.code.generic.javamodel.ITransition.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_targetState, object.getResource());
  }
  
  public static java.util.List<ch.actifsource.tutorial.statemachine.code.generic.javamodel.ITransition> selectToMeEvent(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IEvent object) {
    return _getToMeList(object.getRepository(), ch.actifsource.tutorial.statemachine.code.generic.javamodel.ITransition.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_event, object.getResource());
  }
  
  public static ch.actifsource.tutorial.statemachine.code.generic.javamodel.ITransition selectToMeCondition(ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.statemachine.code.generic.javamodel.ITransition.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_condition, object.getResource());
  }
  
  public static ch.actifsource.tutorial.statemachine.code.generic.javamodel.ITransition selectToMeAction(ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.statemachine.code.generic.javamodel.ITransition.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Transition_action, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,320f88a8-ee5e-11ef-883f-ab05a42d3347,03qxO64Zc3BYNhWDorbALXkaJy0=] */
