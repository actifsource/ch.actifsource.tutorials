package ch.actifsource.tutorial.teamsupport.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IService extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ebe0bda3-f032-11ef-ba29-3d813588e04b");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.tutorial.teamsupport.generic.javamodel.ICall> selectCall();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ebe0bda3-f032-11ef-ba29-3d813588e04b,3Dd/W4ABNnTRIiJSX5aOaPlNpB0=] */
