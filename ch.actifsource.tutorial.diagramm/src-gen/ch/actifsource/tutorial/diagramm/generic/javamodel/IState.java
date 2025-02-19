package ch.actifsource.tutorial.diagramm.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IState extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cbf33525-ee76-11ef-8f29-099ac721970d");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.tutorial.diagramm.generic.javamodel.ITransition> selectTransition();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cbf33525-ee76-11ef-8f29-099ac721970d,wzI4rU7cXKClm8CUlFusVzTnfXQ=] */
