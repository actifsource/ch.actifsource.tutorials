package ch.actifsource.tutorial.service.simple.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICall extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ddb5313d-d4ab-11ef-92a4-332fe0960c0e");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.tutorial.service.simple.generic.javamodel.IParameter> selectParameter();
  
  public ch.actifsource.tutorial.service.simple.generic.javamodel.IType selectReturnType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ddb5313d-d4ab-11ef-92a4-332fe0960c0e,YluMfTCVW+J/DsyAPfNGtB51y54=] */
