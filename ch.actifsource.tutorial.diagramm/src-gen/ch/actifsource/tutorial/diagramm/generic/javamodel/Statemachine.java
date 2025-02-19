package ch.actifsource.tutorial.diagramm.generic.javamodel;

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
  public java.util.List<? extends ch.actifsource.tutorial.diagramm.generic.javamodel.IEvent> selectEvent() {
    return _getList(ch.actifsource.tutorial.diagramm.generic.javamodel.IEvent.class, ch.actifsource.tutorial.diagramm.generic.GenericPackage.Statemachine_event);
  }

  public Statemachine setEvent(java.util.List<? extends ch.actifsource.tutorial.diagramm.generic.javamodel.IEvent> event) {
    _setList(ch.actifsource.tutorial.diagramm.generic.GenericPackage.Statemachine_event, event);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.tutorial.diagramm.generic.javamodel.IState> selectState() {
    return _getList(ch.actifsource.tutorial.diagramm.generic.javamodel.IState.class, ch.actifsource.tutorial.diagramm.generic.GenericPackage.Statemachine_state);
  }

  public Statemachine setState(java.util.List<? extends ch.actifsource.tutorial.diagramm.generic.javamodel.IState> state) {
    _setList(ch.actifsource.tutorial.diagramm.generic.GenericPackage.Statemachine_state, state);
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
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.tutorial.diagramm.generic.javamodel.IEvent.class, ch.actifsource.tutorial.diagramm.generic.GenericPackage.Statemachine_event, visitor);
    _acceptList(ch.actifsource.tutorial.diagramm.generic.javamodel.IState.class, ch.actifsource.tutorial.diagramm.generic.GenericPackage.Statemachine_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.tutorial.diagramm.generic.javamodel.IStatemachine selectToMeEvent(ch.actifsource.tutorial.diagramm.generic.javamodel.IEvent object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.diagramm.generic.javamodel.IStatemachine.class, ch.actifsource.tutorial.diagramm.generic.GenericPackage.Statemachine_event, object.getResource());
  }
  
  public static ch.actifsource.tutorial.diagramm.generic.javamodel.IStatemachine selectToMeState(ch.actifsource.tutorial.diagramm.generic.javamodel.IState object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.diagramm.generic.javamodel.IStatemachine.class, ch.actifsource.tutorial.diagramm.generic.GenericPackage.Statemachine_state, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cbf33521-ee76-11ef-8f29-099ac721970d,0mBrlASnEDjQaXwrNijlyJqtFEM=] */
