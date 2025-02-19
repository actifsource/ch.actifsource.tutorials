package ch.actifsource.graphviz.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Aggregation extends DynamicResource implements IAggregation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAggregation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAggregation>() {
    
    @Override
    public IAggregation create() {
      return new Aggregation();
    }
    
    @Override
    public IAggregation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Aggregation(resourceRepository, resource);
    }
  
  };

  public Aggregation() {
    super(IAggregation.TYPE_ID);
  }
  
  public Aggregation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAggregation.TYPE_ID);
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
  public ch.actifsource.graphviz.generic.javamodel.ICardinality selectCardinality() {
    return _getSingle(ch.actifsource.graphviz.generic.javamodel.ICardinality.class, ch.actifsource.graphviz.generic.GenericPackage.Association_cardinality);
  }

  public Aggregation setCardinality(ch.actifsource.graphviz.generic.javamodel.ICardinality cardinality) {
    _setSingle(ch.actifsource.graphviz.generic.GenericPackage.Association_cardinality, cardinality);
    return this;
  }
    
  @Override
  public ch.actifsource.graphviz.generic.javamodel.IClass selectTarget() {
    return _getSingle(ch.actifsource.graphviz.generic.javamodel.IClass.class, ch.actifsource.graphviz.generic.GenericPackage.Association_target);
  }

  public Aggregation setTarget(ch.actifsource.graphviz.generic.javamodel.IClass target) {
    _setSingle(ch.actifsource.graphviz.generic.GenericPackage.Association_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Aggregation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.graphviz.generic.javamodel.ICardinality.class, ch.actifsource.graphviz.generic.GenericPackage.Association_cardinality, visitor);
    _acceptSingle(ch.actifsource.graphviz.generic.javamodel.IClass.class, ch.actifsource.graphviz.generic.GenericPackage.Association_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,39f8171a-ee7c-11ef-8f29-099ac721970d,8rMM45GUZhgVskxLo+PrvNVUi3A=] */
