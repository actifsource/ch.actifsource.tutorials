package ch.actifsource.graphviz.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Attribute extends DynamicResource implements IAttribute {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAttribute> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAttribute>() {
    
    @Override
    public IAttribute create() {
      return new Attribute();
    }
    
    @Override
    public IAttribute create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Attribute(resourceRepository, resource);
    }
  
  };

  public Attribute() {
    super(IAttribute.TYPE_ID);
  }
  
  public Attribute(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAttribute.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Attribute setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public ch.actifsource.graphviz.generic.javamodel.IVisibility selectVisibility() {
    return _getSingle(ch.actifsource.graphviz.generic.javamodel.IVisibility.class, ch.actifsource.graphviz.generic.GenericPackage.Attribute_visibility);
  }

  public Attribute setVisibility(ch.actifsource.graphviz.generic.javamodel.IVisibility visibility) {
    _setSingle(ch.actifsource.graphviz.generic.GenericPackage.Attribute_visibility, visibility);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(ch.actifsource.graphviz.generic.javamodel.IVisibility.class, ch.actifsource.graphviz.generic.GenericPackage.Attribute_visibility, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ch.actifsource.graphviz.generic.javamodel.IAttribute> selectToMeVisibility(ch.actifsource.graphviz.generic.javamodel.IVisibility object) {
    return _getToMeList(object.getRepository(), ch.actifsource.graphviz.generic.javamodel.IAttribute.class, ch.actifsource.graphviz.generic.GenericPackage.Attribute_visibility, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,39f81712-ee7c-11ef-8f29-099ac721970d,2IPmTjG040lUOPzHrWfcCN4JjNI=] */
