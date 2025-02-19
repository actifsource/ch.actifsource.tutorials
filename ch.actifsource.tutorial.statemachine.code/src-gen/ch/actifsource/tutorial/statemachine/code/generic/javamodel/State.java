package ch.actifsource.tutorial.statemachine.code.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class State extends DynamicResource implements IState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IState>() {
    
    @Override
    public IState create() {
      return new State();
    }
    
    @Override
    public IState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new State(resourceRepository, resource);
    }
  
  };

  public State() {
    super(IState.TYPE_ID);
  }
  
  public State(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IState.TYPE_ID);
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
  public java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.tutorial.statemachine.code.generic.javamodel.ITransition> selectTransition() {
    return _getMap(ch.actifsource.tutorial.statemachine.code.generic.javamodel.ITransition.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.State_transition);
  }

  public State setTransition(java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.tutorial.statemachine.code.generic.javamodel.ITransition> transition) {
    _setMap(ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.State_transition, transition);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public State setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptMap(ch.actifsource.tutorial.statemachine.code.generic.javamodel.ITransition.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.State_transition, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.tutorial.statemachine.code.generic.javamodel.IState selectToMeTransition(ch.actifsource.tutorial.statemachine.code.generic.javamodel.ITransition object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.statemachine.code.generic.javamodel.IState.class, ch.actifsource.tutorial.statemachine.code.generic.GenericPackage.State_transition, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,320f889e-ee5e-11ef-883f-ab05a42d3347,gNmjLD6CMXekhkusMn/GTnKjWQY=] */
