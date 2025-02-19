package ch.actifsource.tutorial.refactoring.specific;

import ch.actifsource.core.Resource;

/*
 * Created by exporting from actifsource based on ch.actifsource.tutorial.refactoring/asrc
 */
public final class SpecificModel {

  public static final Resource Patient = new Resource("b9dacbd1-dedc-11ef-be08-79ae28358acc");
  public static final Resource Patient_group = new Resource("11c7bf13-df22-11ef-8ed1-6d608a3329cb");
  public static final Resource Patient_group_Create = new Resource("b9dacbd4-dedc-11ef-be08-79ae28358acc");
  public static final Resource Patient_group_Delete = new Resource("b9dacbd6-dedc-11ef-be08-79ae28358acc");
  public static final Resource Patient_group_Create_LastName = new Resource("b9dacbd2-dedc-11ef-be08-79ae28358acc");
  public static final Resource Patient_group_Create_FirstName = new Resource("b9dacbd3-dedc-11ef-be08-79ae28358acc");
  public static final Resource Patient_group_Delete_Id = new Resource("b9dacbd5-dedc-11ef-be08-79ae28358acc");

  private SpecificModel() {}

  public static final String getScopeName() {
    return "ch.actifsource.tutorial.refactoring";
  }
  
  public static final String getResourceFolderPath() {
    return "asrc";
  }
  
  public static final String getPackageName() {
    return "ch.actifsource.tutorial.refactoring.specific";
  }

}

/* Actifsource ID=[beac962a-f9d7-11de-b92c-3ddcb4864021,ch.actifsource.tutorial.refactoring.specific,aH2SBrBK3s1EaTYq7JhpESCCkg0=] */
