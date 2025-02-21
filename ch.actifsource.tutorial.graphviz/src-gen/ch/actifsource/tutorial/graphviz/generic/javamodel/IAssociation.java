package ch.actifsource.tutorial.graphviz.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAssociation extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("39f81717-ee7c-11ef-8f29-099ac721970d");
  
  // relations
  
  public ch.actifsource.tutorial.graphviz.generic.javamodel.IClass selectTarget();
  
  public ch.actifsource.tutorial.graphviz.generic.javamodel.ICardinality selectCardinality();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,39f81717-ee7c-11ef-8f29-099ac721970d,ldhfg1YDFp5es4oUNnV3gpmow2I=] */
