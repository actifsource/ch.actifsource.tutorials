package ch.actifsource.graphviz.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Cardinality extends DynamicResource implements ICardinality {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICardinality> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICardinality>() {
    
    @Override
    public ICardinality create() {
      return new Cardinality();
    }
    
    @Override
    public ICardinality create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Cardinality(resourceRepository, resource);
    }
  
  };

  public Cardinality() {
    super(ICardinality.TYPE_ID);
  }
  
  public Cardinality(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICardinality.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectMax() {
    return _getSingleAttribute(java.lang.Integer.class, ch.actifsource.graphviz.generic.GenericPackage.Cardinality_max);
  }
    
  public void setMax(java.lang.Integer max) {
     _setSingleAttribute(ch.actifsource.graphviz.generic.GenericPackage.Cardinality_max, max);
  }

  @Override
  public java.lang.Integer selectMin() {
    return _getSingleAttribute(java.lang.Integer.class, ch.actifsource.graphviz.generic.GenericPackage.Cardinality_min);
  }
    
  public void setMin(java.lang.Integer min) {
     _setSingleAttribute(ch.actifsource.graphviz.generic.GenericPackage.Cardinality_min, min);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Cardinality setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, ch.actifsource.graphviz.generic.GenericPackage.Cardinality_max, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, ch.actifsource.graphviz.generic.GenericPackage.Cardinality_min, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,39f81714-ee7c-11ef-8f29-099ac721970d,qOgCW50YiWWYQ/ywv2bipcIokWA=] */
