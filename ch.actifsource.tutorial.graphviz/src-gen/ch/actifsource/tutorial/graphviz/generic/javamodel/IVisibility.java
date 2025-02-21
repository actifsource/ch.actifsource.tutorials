package ch.actifsource.tutorial.graphviz.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IVisibility extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("39f816f8-ee7c-11ef-8f29-099ac721970d");
  
  public static interface IValueVoidVisitor {
    
    public void visitPublic();
    
    public void visitProtected();
    
    public void visitPrivate();
    
    public void visitPackage();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitPublic();
    
    public R visitProtected();
    
    public R visitPrivate();
    
    public R visitPackage();
    
  }
  
  // attributes
  
  public java.lang.String selectUmlSymbol();
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isPublic();
  
  public boolean isProtected();
  
  public boolean isPrivate();
  
  public boolean isPackage();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,39f816f8-ee7c-11ef-8f29-099ac721970d,p0IT+5DPuFZ7/F9GZPKB5gcN6k8=] */
