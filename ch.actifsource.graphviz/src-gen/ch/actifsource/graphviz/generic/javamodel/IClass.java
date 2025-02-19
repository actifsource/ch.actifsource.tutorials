package ch.actifsource.graphviz.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IClass extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("39f8170b-ee7c-11ef-8f29-099ac721970d");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.graphviz.generic.javamodel.IClass> selectExtends();
  
  public java.util.List<? extends ch.actifsource.graphviz.generic.javamodel.IMethod> selectMethod();
  
  public java.util.List<? extends ch.actifsource.graphviz.generic.javamodel.IAttribute> selectAttribute();
  
  public java.util.List<? extends ch.actifsource.graphviz.generic.javamodel.IAssociation> selectAssociation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,39f8170b-ee7c-11ef-8f29-099ac721970d,8ISmQWhEDosW5ZjbC1j1Ey2yAHQ=] */
