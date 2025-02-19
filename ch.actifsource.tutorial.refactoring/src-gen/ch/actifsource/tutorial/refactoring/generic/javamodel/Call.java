package ch.actifsource.tutorial.refactoring.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Call extends DynamicResource implements ICall {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICall> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICall>() {
    
    @Override
    public ICall create() {
      return new Call();
    }
    
    @Override
    public ICall create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Call(resourceRepository, resource);
    }
  
  };

  public Call() {
    super(ICall.TYPE_ID);
  }
  
  public Call(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICall.TYPE_ID);
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
  public java.util.List<? extends ch.actifsource.tutorial.refactoring.generic.javamodel.IParameter> selectParameter() {
    return _getList(ch.actifsource.tutorial.refactoring.generic.javamodel.IParameter.class, ch.actifsource.tutorial.refactoring.generic.GenericPackage.Call_parameter);
  }

  public Call setParameter(java.util.List<? extends ch.actifsource.tutorial.refactoring.generic.javamodel.IParameter> parameter) {
    _setList(ch.actifsource.tutorial.refactoring.generic.GenericPackage.Call_parameter, parameter);
    return this;
  }
    
  @Override
  public ch.actifsource.tutorial.refactoring.generic.javamodel.IType selectReturnType() {
    return _getSingle(ch.actifsource.tutorial.refactoring.generic.javamodel.IType.class, ch.actifsource.tutorial.refactoring.generic.GenericPackage.Call_returnType);
  }

  public Call setReturnType(ch.actifsource.tutorial.refactoring.generic.javamodel.IType returnType) {
    _setSingle(ch.actifsource.tutorial.refactoring.generic.GenericPackage.Call_returnType, returnType);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Call setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.tutorial.refactoring.generic.javamodel.IParameter.class, ch.actifsource.tutorial.refactoring.generic.GenericPackage.Call_parameter, visitor);
    _acceptSingle(ch.actifsource.tutorial.refactoring.generic.javamodel.IType.class, ch.actifsource.tutorial.refactoring.generic.GenericPackage.Call_returnType, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.tutorial.refactoring.generic.javamodel.ICall selectToMeParameter(ch.actifsource.tutorial.refactoring.generic.javamodel.IParameter object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.refactoring.generic.javamodel.ICall.class, ch.actifsource.tutorial.refactoring.generic.GenericPackage.Call_parameter, object.getResource());
  }
  
  public static java.util.List<ch.actifsource.tutorial.refactoring.generic.javamodel.ICall> selectToMeReturnType(ch.actifsource.tutorial.refactoring.generic.javamodel.IType object) {
    return _getToMeList(object.getRepository(), ch.actifsource.tutorial.refactoring.generic.javamodel.ICall.class, ch.actifsource.tutorial.refactoring.generic.GenericPackage.Call_returnType, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b9dacbcb-dedc-11ef-be08-79ae28358acc,oAdfpG/lHoSicmoLAz2sq9WYk/4=] */
