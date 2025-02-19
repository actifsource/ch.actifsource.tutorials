package ch.actifsource.graphviz.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Composition extends DynamicResource implements IComposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComposition>() {
    
    @Override
    public IComposition create() {
      return new Composition();
    }
    
    @Override
    public IComposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Composition(resourceRepository, resource);
    }
  
  };

  public Composition() {
    super(IComposition.TYPE_ID);
  }
  
  public Composition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComposition.TYPE_ID);
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

  public Composition setCardinality(ch.actifsource.graphviz.generic.javamodel.ICardinality cardinality) {
    _setSingle(ch.actifsource.graphviz.generic.GenericPackage.Association_cardinality, cardinality);
    return this;
  }
    
  @Override
  public ch.actifsource.graphviz.generic.javamodel.IClass selectTarget() {
    return _getSingle(ch.actifsource.graphviz.generic.javamodel.IClass.class, ch.actifsource.graphviz.generic.GenericPackage.Association_target);
  }

  public Composition setTarget(ch.actifsource.graphviz.generic.javamodel.IClass target) {
    _setSingle(ch.actifsource.graphviz.generic.GenericPackage.Association_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Composition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,39f8171b-ee7c-11ef-8f29-099ac721970d,T0k4yMq8gBdMiQNasGRXWb4NG9A=] */
