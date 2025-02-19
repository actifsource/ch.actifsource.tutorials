package ch.actifsource.tutorial.metamodel.docu.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICall extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d7f66161-ee4f-11ef-8f14-2d157258da62");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.tutorial.metamodel.docu.generic.javamodel.IParameter> selectParameter();
  
  public ch.actifsource.tutorial.metamodel.docu.generic.javamodel.IType selectReturnType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d7f66161-ee4f-11ef-8f14-2d157258da62,XbGI15jLZjL6XPSoOmI2eRUGVHE=] */
