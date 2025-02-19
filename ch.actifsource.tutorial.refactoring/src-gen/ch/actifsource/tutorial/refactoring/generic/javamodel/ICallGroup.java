package ch.actifsource.tutorial.refactoring.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICallGroup extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6b58ee37-df07-11ef-8ed1-6d608a3329cb");
  
  public java.lang.Boolean selectAsync();
  
  // relations
  
  public java.util.List<? extends ch.actifsource.tutorial.refactoring.generic.javamodel.ICall> selectCall();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6b58ee37-df07-11ef-8ed1-6d608a3329cb,yn7GYIjqY62RpUzHZEtsr0cygDw=] */
