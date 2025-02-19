package ch.actifsource.tutorial.refactoring.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICall extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b9dacbcb-dedc-11ef-be08-79ae28358acc");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.tutorial.refactoring.generic.javamodel.IParameter> selectParameter();
  
  public ch.actifsource.tutorial.refactoring.generic.javamodel.IType selectReturnType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b9dacbcb-dedc-11ef-be08-79ae28358acc,5znB+UsUN0C00S1DPPID+ISFbX8=] */
