package ch.actifsource.tutorial.diagramm.ports.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystem extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d5f6ac95-ee72-11ef-8f29-099ac721970d");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IProcess> selectProcess();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d5f6ac95-ee72-11ef-8f29-099ac721970d,3ujaa49hMAEUdmulBmsdh0e3xIg=] */
