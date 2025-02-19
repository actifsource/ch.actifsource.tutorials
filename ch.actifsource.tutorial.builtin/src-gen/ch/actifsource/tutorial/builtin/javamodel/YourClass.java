package ch.actifsource.tutorial.builtin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class YourClass extends DynamicResource implements IYourClass {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IYourClass> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IYourClass>() {
    
    @Override
    public IYourClass create() {
      return new YourClass();
    }
    
    @Override
    public IYourClass create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new YourClass(resourceRepository, resource);
    }
  
  };

  public YourClass() {
    super(IYourClass.TYPE_ID);
  }
  
  public YourClass(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IYourClass.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public YourClass setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b087cfb8-dcb0-11ef-afcd-ed61319adc16,x8M7Xx6TUJQb15nqjI/OcBCp1aI=] */
