package ch.actifsource.tutorial.refactoring.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CallGroup extends DynamicResource implements ICallGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICallGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICallGroup>() {
    
    @Override
    public ICallGroup create() {
      return new CallGroup();
    }
    
    @Override
    public ICallGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CallGroup(resourceRepository, resource);
    }
  
  };

  public CallGroup() {
    super(ICallGroup.TYPE_ID);
  }
  
  public CallGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICallGroup.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAsync() {
    return _getSingleAttribute(java.lang.Boolean.class, ch.actifsource.tutorial.refactoring.generic.GenericPackage.CallGroup_async);
  }
    
  public void setAsync(java.lang.Boolean async) {
     _setSingleAttribute(ch.actifsource.tutorial.refactoring.generic.GenericPackage.CallGroup_async, async);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends ch.actifsource.tutorial.refactoring.generic.javamodel.ICall> selectCall() {
    return _getList(ch.actifsource.tutorial.refactoring.generic.javamodel.ICall.class, ch.actifsource.tutorial.refactoring.generic.GenericPackage.CallGroup_call);
  }

  public CallGroup setCall(java.util.List<? extends ch.actifsource.tutorial.refactoring.generic.javamodel.ICall> call) {
    _setList(ch.actifsource.tutorial.refactoring.generic.GenericPackage.CallGroup_call, call);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CallGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, ch.actifsource.tutorial.refactoring.generic.GenericPackage.CallGroup_async, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.tutorial.refactoring.generic.javamodel.ICall.class, ch.actifsource.tutorial.refactoring.generic.GenericPackage.CallGroup_call, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.tutorial.refactoring.generic.javamodel.ICallGroup selectToMeCall(ch.actifsource.tutorial.refactoring.generic.javamodel.ICall object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.refactoring.generic.javamodel.ICallGroup.class, ch.actifsource.tutorial.refactoring.generic.GenericPackage.CallGroup_call, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6b58ee37-df07-11ef-8ed1-6d608a3329cb,dtfx0KxUxSPwuqeZ7So76g/kbmk=] */
