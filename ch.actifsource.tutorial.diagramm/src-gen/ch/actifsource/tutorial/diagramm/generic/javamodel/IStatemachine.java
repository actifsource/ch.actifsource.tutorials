package ch.actifsource.tutorial.diagramm.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IStatemachine extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cbf33521-ee76-11ef-8f29-099ac721970d");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.tutorial.diagramm.generic.javamodel.IEvent> selectEvent();
  
  public java.util.List<? extends ch.actifsource.tutorial.diagramm.generic.javamodel.IState> selectState();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cbf33521-ee76-11ef-8f29-099ac721970d,y+e+60Lrj4ScgE00xMZkGxvTSdg=] */
