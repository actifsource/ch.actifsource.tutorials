package ch.actifsource.tutorial.teamsupport.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICall extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ebe0bda5-f032-11ef-ba29-3d813588e04b");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.tutorial.teamsupport.generic.javamodel.IParameter> selectParameter();
  
  public ch.actifsource.tutorial.teamsupport.generic.javamodel.IType selectReturnType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ebe0bda5-f032-11ef-ba29-3d813588e04b,0OyuEjWQ+SGwkiOkxXjugAUvtlc=] */
