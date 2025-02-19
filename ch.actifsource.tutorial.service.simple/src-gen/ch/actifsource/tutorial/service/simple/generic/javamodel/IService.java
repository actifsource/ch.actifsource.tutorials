package ch.actifsource.tutorial.service.simple.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IService extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("da311367-d4ab-11ef-92a4-332fe0960c0e");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.tutorial.service.simple.generic.javamodel.ICall> selectCall();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,da311367-d4ab-11ef-92a4-332fe0960c0e,fpxx8Gd9yZJMPtHJ/GThoaROI5Q=] */
