package ch.actifsource.tutorial.refactoring.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IService extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b9dacbc9-dedc-11ef-be08-79ae28358acc");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.tutorial.refactoring.generic.javamodel.ICallGroup> selectGroup();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b9dacbc9-dedc-11ef-be08-79ae28358acc,ON28bkud/b72PS6pZhlELl99LV0=] */
