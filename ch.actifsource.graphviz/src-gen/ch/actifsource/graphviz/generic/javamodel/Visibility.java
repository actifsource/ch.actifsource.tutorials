package ch.actifsource.graphviz.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Visibility extends DynamicResource implements IVisibility {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVisibility> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVisibility>() {
    
    @Override
    public IVisibility create() {
      return new Visibility();
    }
    
    @Override
    public IVisibility create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Visibility(resourceRepository, resource);
    }
  
  };

  public Visibility() {
    super(IVisibility.TYPE_ID);
  }
  
  public Visibility(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVisibility.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectUmlSymbol() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.graphviz.generic.GenericPackage.Visibility_umlSymbol);
  }
    
  public void setUmlSymbol(java.lang.String umlSymbol) {
     _setSingleAttribute(ch.actifsource.graphviz.generic.GenericPackage.Visibility_umlSymbol, umlSymbol);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Visibility setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.graphviz.generic.GenericPackage.Visibility_umlSymbol, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isPublic()) return visitor.visitPublic();
    if (isProtected()) return visitor.visitProtected();
    if (isPrivate()) return visitor.visitPrivate();
    if (isPackage()) return visitor.visitPackage();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isPublic()) {
      visitor.visitPublic();
      return;
    }
    if (isProtected()) {
      visitor.visitProtected();
      return;
    }
    if (isPrivate()) {
      visitor.visitPrivate();
      return;
    }
    if (isPackage()) {
      visitor.visitPackage();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isPublic() {
    return getResource().equals(ch.actifsource.graphviz.generic.GenericPackage.Visibility_public);
  }
  
  @Override
  public boolean isProtected() {
    return getResource().equals(ch.actifsource.graphviz.generic.GenericPackage.Visibility_protected);
  }
  
  @Override
  public boolean isPrivate() {
    return getResource().equals(ch.actifsource.graphviz.generic.GenericPackage.Visibility_private);
  }
  
  @Override
  public boolean isPackage() {
    return getResource().equals(ch.actifsource.graphviz.generic.GenericPackage.Visibility_package);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,39f816f8-ee7c-11ef-8f29-099ac721970d,vjamcHxsZMzrtbulwVH2fqnYIBE=] */
