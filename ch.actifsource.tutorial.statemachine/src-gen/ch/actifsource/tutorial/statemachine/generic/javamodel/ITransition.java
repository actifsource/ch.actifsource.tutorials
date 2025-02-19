package ch.actifsource.tutorial.statemachine.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITransition extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bf8b4f8b-ee35-11ef-9f0b-350e377473d3");
  
  // relations
  
  public ch.actifsource.tutorial.statemachine.generic.javamodel.IState selectTargetState();
  
  public ch.actifsource.tutorial.statemachine.generic.javamodel.IEvent selectEvent();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bf8b4f8b-ee35-11ef-9f0b-350e377473d3,V1z80/KsqW6eRXotO/hGeRb3o2g=] */
