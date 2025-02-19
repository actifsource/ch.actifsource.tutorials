class PatientImpl.java {
  public int Create(String LastName, String FirstName) {
    boolean async = false;
    /* Begin Protected Region [[b9dacbd4-dedc-11ef-be08-79ae28358acc]] */
    System.out.println("Create(" + LastName + ", " + FirstName + ", " + async + ")");
    return -1;
    /* End Protected Region   [[b9dacbd4-dedc-11ef-be08-79ae28358acc]] */
  }
  
  public boolean Delete(int Id) {
    boolean async = false;
    /* Begin Protected Region [[b9dacbd6-dedc-11ef-be08-79ae28358acc]] */
    System.out.println("Delete(" + Id + ", " + async + ")");
    return true;
    /* End Protected Region   [[b9dacbd6-dedc-11ef-be08-79ae28358acc]] */
  }
  
}
/* Actifsource ID=[b9daf347-dedc-11ef-be08-79ae28358acc,b9dacbd1-dedc-11ef-be08-79ae28358acc,V48hSrhAoDS7rB05dP9Z2AG/vXg=] */
