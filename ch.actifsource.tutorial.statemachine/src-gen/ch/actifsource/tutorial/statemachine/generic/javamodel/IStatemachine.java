package ch.actifsource.tutorial.statemachine.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IStatemachine extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b3b9f2e3-ee35-11ef-9f0b-350e377473d3");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.tutorial.statemachine.generic.javamodel.IEvent> selectEvent();
  
  public java.util.List<? extends ch.actifsource.tutorial.statemachine.generic.javamodel.IState> selectState();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b3b9f2e3-ee35-11ef-9f0b-350e377473d3,T+kltzCaqiZNZAJQJWILgSiHwEo=] */
