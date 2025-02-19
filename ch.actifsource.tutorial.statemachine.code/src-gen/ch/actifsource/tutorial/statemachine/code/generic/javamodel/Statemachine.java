package ch.actifsource.tutorial.statemachine.code.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Statemachine extends DynamicResource implements IStatemachine {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStatemachine> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStatemachine>() {
    
    @Override
    public IStatemachine create() {
      return new Statemachine();
    }
    
    @Override
    public IStatemachine create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Statemachine(resourceRepository, resource);
    }
  
  };

  public Statemachine() {
    super(IStatemachine.TYPE_ID);
  }
  
  public Statemachine(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStatemachine.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends ch.actifsource.tutorial.statemachine.code.generic.javamodel.IEvent> selectEvent() {
    return _getList(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IEvent.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Statemachine_event);
  }

  public Statemachine setEvent(java.util.List<? extends ch.actifsource.tutorial.statemachine.code.generic.javamodel.IEvent> event) {
    _setList(ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Statemachine_event, event);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.tutorial.statemachine.code.generic.javamodel.IState> selectState() {
    return _getList(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IState.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Statemachine_state);
  }

  public Statemachine setState(java.util.List<? extends ch.actifsource.tutorial.statemachine.code.generic.javamodel.IState> state) {
    _setList(ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Statemachine_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Statemachine setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.tutorial.statemachine.code.generic.javamodel.IVariable> selectVariable() {
    return _getList(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IVariable.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Statemachine_variable);
  }

  public Statemachine setVariable(java.util.List<? extends ch.actifsource.tutorial.statemachine.code.generic.javamodel.IVariable> variable) {
    _setList(ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Statemachine_variable, variable);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IEvent.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Statemachine_event, visitor);
    _acceptList(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IState.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Statemachine_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IVariable.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Statemachine_variable, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.tutorial.statemachine.code.generic.javamodel.IStatemachine selectToMeEvent(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IEvent object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.statemachine.code.generic.javamodel.IStatemachine.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Statemachine_event, object.getResource());
  }
  
  public static ch.actifsource.tutorial.statemachine.code.generic.javamodel.IStatemachine selectToMeState(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IState object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.statemachine.code.generic.javamodel.IStatemachine.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Statemachine_state, object.getResource());
  }
  
  public static ch.actifsource.tutorial.statemachine.code.generic.javamodel.IStatemachine selectToMeVariable(ch.actifsource.tutorial.statemachine.code.generic.javamodel.IVariable object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.statemachine.code.generic.javamodel.IStatemachine.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.Statemachine_variable, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,320f889a-ee5e-11ef-883f-ab05a42d3347,zl75a90t1dadfTMcVHuxjcw0tJY=] */
