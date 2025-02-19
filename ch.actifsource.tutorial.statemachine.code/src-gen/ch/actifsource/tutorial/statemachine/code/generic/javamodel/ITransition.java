package ch.actifsource.tutorial.statemachine.code.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITransition extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("320f88a8-ee5e-11ef-883f-ab05a42d3347");
  
  // relations
  
  public ch.actifsource.tutorial.statemachine.code.generic.javamodel.IState selectTargetState();
  
  public ch.actifsource.tutorial.statemachine.code.generic.javamodel.IEvent selectEvent();
  
  public ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet selectCondition();
  
  public ch.actifsource.codesnippet.metamodel.element.javamodel.ICodeSnippet selectAction();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,320f88a8-ee5e-11ef-883f-ab05a42d3347,FDVG4i5i7RCSlKKwZFYazDDPdZU=] */
