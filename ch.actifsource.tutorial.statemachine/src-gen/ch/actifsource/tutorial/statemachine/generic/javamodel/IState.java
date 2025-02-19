package ch.actifsource.tutorial.statemachine.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IState extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bb875351-ee35-11ef-9f0b-350e377473d3");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.tutorial.statemachine.generic.javamodel.ITransition> selectTransition();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bb875351-ee35-11ef-9f0b-350e377473d3,8hEnOSxbM7IRLGmHoEDXu+UrwME=] */
