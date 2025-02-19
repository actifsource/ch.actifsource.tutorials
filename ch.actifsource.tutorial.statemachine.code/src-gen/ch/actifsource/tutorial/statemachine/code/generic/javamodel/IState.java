package ch.actifsource.tutorial.statemachine.code.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IState extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("320f889e-ee5e-11ef-883f-ab05a42d3347");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.tutorial.statemachine.code.generic.javamodel.ITransition> selectTransition();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,320f889e-ee5e-11ef-883f-ab05a42d3347,nq3JWbrFXs5q5PsQhETsDSLTTG0=] */
