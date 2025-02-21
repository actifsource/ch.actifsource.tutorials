package ch.actifsource.tutorial.graphviz.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Association extends DynamicResource implements IAssociation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAssociation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAssociation>() {
    
    @Override
    public IAssociation create() {
      return new Association();
    }
    
    @Override
    public IAssociation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Association(resourceRepository, resource);
    }
  
  };

  public Association() {
    super(IAssociation.TYPE_ID);
  }
  
  public Association(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAssociation.TYPE_ID);
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
  public ch.actifsource.tutorial.graphviz.generic.javamodel.ICardinality selectCardinality() {
    return _getSingle(ch.actifsource.tutorial.graphviz.generic.javamodel.ICardinality.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Association_cardinality);
  }

  public Association setCardinality(ch.actifsource.tutorial.graphviz.generic.javamodel.ICardinality cardinality) {
    _setSingle(ch.actifsource.tutorial.graphviz.generic.GenericPackage.Association_cardinality, cardinality);
    return this;
  }
    
  @Override
  public ch.actifsource.tutorial.graphviz.generic.javamodel.IClass selectTarget() {
    return _getSingle(ch.actifsource.tutorial.graphviz.generic.javamodel.IClass.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Association_target);
  }

  public Association setTarget(ch.actifsource.tutorial.graphviz.generic.javamodel.IClass target) {
    _setSingle(ch.actifsource.tutorial.graphviz.generic.GenericPackage.Association_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Association setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.tutorial.graphviz.generic.javamodel.ICardinality.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Association_cardinality, visitor);
    _acceptSingle(ch.actifsource.tutorial.graphviz.generic.javamodel.IClass.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Association_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ch.actifsource.tutorial.graphviz.generic.javamodel.IAssociation> selectToMeTarget(ch.actifsource.tutorial.graphviz.generic.javamodel.IClass object) {
    return _getToMeList(object.getRepository(), ch.actifsource.tutorial.graphviz.generic.javamodel.IAssociation.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Association_target, object.getResource());
  }
  
  public static ch.actifsource.tutorial.graphviz.generic.javamodel.IAssociation selectToMeCardinality(ch.actifsource.tutorial.graphviz.generic.javamodel.ICardinality object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.graphviz.generic.javamodel.IAssociation.class, ch.actifsource.tutorial.graphviz.generic.GenericPackage.Association_cardinality, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,39f81717-ee7c-11ef-8f29-099ac721970d,We1FMklhuWTAEex7uEDZ+kBq2dY=] */
