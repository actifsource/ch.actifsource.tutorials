package ch.actifsource.tutorial.javalistfunction.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IClub extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("04b24ec9-dc85-11ef-989a-512b5711da93");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.tutorial.javalistfunction.generic.javamodel.IMember> selectMember();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,04b24ec9-dc85-11ef-989a-512b5711da93,sryqNZjTYFOVImox9XjDChY0Wsc=] */
