package ch.actifsource.tutorial.diagramm.ports.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProcess extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d8c499cb-ee72-11ef-8f29-099ac721970d");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_In> selectPort_In();
  
  public java.util.List<? extends ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_Out> selectPort_Out();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d8c499cb-ee72-11ef-8f29-099ac721970d,Kj67EyAA+3NimFv5hDw+rV3mdj8=] */
