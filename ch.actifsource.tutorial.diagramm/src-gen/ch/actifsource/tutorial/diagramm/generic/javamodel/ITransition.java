package ch.actifsource.tutorial.diagramm.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITransition extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cbf3352f-ee76-11ef-8f29-099ac721970d");
  
  // relations
  
  public ch.actifsource.tutorial.diagramm.generic.javamodel.IState selectTargetState();
  
  public ch.actifsource.tutorial.diagramm.generic.javamodel.IEvent selectEvent();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cbf3352f-ee76-11ef-8f29-099ac721970d,BdEqzYnCIqEGLsE31JYyo6pgnGg=] */
