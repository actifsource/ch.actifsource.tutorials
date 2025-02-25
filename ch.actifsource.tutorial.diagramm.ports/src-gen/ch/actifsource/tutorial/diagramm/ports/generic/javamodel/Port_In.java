package ch.actifsource.tutorial.diagramm.ports.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Port_In extends DynamicResource implements IPort_In {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPort_In> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPort_In>() {
    
    @Override
    public IPort_In create() {
      return new Port_In();
    }
    
    @Override
    public IPort_In create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Port_In(resourceRepository, resource);
    }
  
  };

  public Port_In() {
    super(IPort_In.TYPE_ID);
  }
  
  public Port_In(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPort_In.TYPE_ID);
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

  public Port_In setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dbfba813-ee72-11ef-8f29-099ac721970d,mFgkNcMQTilwyvmuH/lPxS4nc7A=] */
