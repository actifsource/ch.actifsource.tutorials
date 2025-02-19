package ch.actifsource.tutorial.service.complex.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IService extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("48972d55-d8b2-11ef-a770-7da0b40c5be1");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.tutorial.service.complex.generic.javamodel.ICall> selectCall();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,48972d55-d8b2-11ef-a770-7da0b40c5be1,fvY8GBpZXKdBYf8w8fFIlRXGMSk=] */
