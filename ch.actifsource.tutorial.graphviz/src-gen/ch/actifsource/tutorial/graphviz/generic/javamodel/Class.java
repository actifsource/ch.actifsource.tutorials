package ch.actifsource.tutorial.graphviz.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Class extends DynamicResource implements IClass {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IClass> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IClass>() {
    
    @Override
    public IClass create() {
      return new Class();
    }
    
    @Override
    public IClass create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Class(resourceRepository, resource);
    }
  
  };

  public Class() {
    super(IClass.TYPE_ID);
  }
  
  public Class(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IClass.TYPE_ID);
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
  public java.util.List<? extends ch.actifsource.tutorial.graphviz.generic.javamodel.IAssociation> selectAssociation() {
    return _getList(ch.actifsource.tutorial.graphviz.generic.javamodel.IAssociation.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_association);
  }

  public Class setAssociation(java.util.List<? extends ch.actifsource.tutorial.graphviz.generic.javamodel.IAssociation> association) {
    _setList(ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_association, association);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.tutorial.graphviz.generic.javamodel.IAttribute> selectAttribute() {
    return _getList(ch.actifsource.tutorial.graphviz.generic.javamodel.IAttribute.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_attribute);
  }

  public Class setAttribute(java.util.List<? extends ch.actifsource.tutorial.graphviz.generic.javamodel.IAttribute> attribute) {
    _setList(ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_attribute, attribute);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.tutorial.graphviz.generic.javamodel.IClass> selectExtends() {
    return _getList(ch.actifsource.tutorial.graphviz.generic.javamodel.IClass.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_extends);
  }

  public Class setExtends(java.util.List<? extends ch.actifsource.tutorial.graphviz.generic.javamodel.IClass> extends_) {
    _setList(ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_extends, extends_);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.tutorial.graphviz.generic.javamodel.IMethod> selectMethod() {
    return _getList(ch.actifsource.tutorial.graphviz.generic.javamodel.IMethod.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_method);
  }

  public Class setMethod(java.util.List<? extends ch.actifsource.tutorial.graphviz.generic.javamodel.IMethod> method) {
    _setList(ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_method, method);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Class setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.tutorial.graphviz.generic.javamodel.IAssociation.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_association, visitor);
    _acceptList(ch.actifsource.tutorial.graphviz.generic.javamodel.IAttribute.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_attribute, visitor);
    _acceptList(ch.actifsource.tutorial.graphviz.generic.javamodel.IClass.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_extends, visitor);
    _acceptList(ch.actifsource.tutorial.graphviz.generic.javamodel.IMethod.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_method, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ch.actifsource.tutorial.graphviz.generic.javamodel.IClass> selectToMeExtends(ch.actifsource.tutorial.graphviz.generic.javamodel.IClass object) {
    return _getToMeList(object.getRepository(), ch.actifsource.tutorial.graphviz.generic.javamodel.IClass.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_extends, object.getResource());
  }
  
  public static ch.actifsource.tutorial.graphviz.generic.javamodel.IClass selectToMeMethod(ch.actifsource.tutorial.graphviz.generic.javamodel.IMethod object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.graphviz.generic.javamodel.IClass.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_method, object.getResource());
  }
  
  public static ch.actifsource.tutorial.graphviz.generic.javamodel.IClass selectToMeAttribute(ch.actifsource.tutorial.graphviz.generic.javamodel.IAttribute object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.graphviz.generic.javamodel.IClass.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_attribute, object.getResource());
  }
  
  public static ch.actifsource.tutorial.graphviz.generic.javamodel.IClass selectToMeAssociation(ch.actifsource.tutorial.graphviz.generic.javamodel.IAssociation object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.graphviz.generic.javamodel.IClass.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Class_association, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,39f8170b-ee7c-11ef-8f29-099ac721970d,ZojaxQeeRCGjZJJNZKCeHU5z5Vc=] */
