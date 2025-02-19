package ch.actifsource.tutorial.diagramm.ports.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Port_Out extends DynamicResource implements IPort_Out {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPort_Out> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPort_Out>() {
    
    @Override
    public IPort_Out create() {
      return new Port_Out();
    }
    
    @Override
    public IPort_Out create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Port_Out(resourceRepository, resource);
    }
  
  };

  public Port_Out() {
    super(IPort_Out.TYPE_ID);
  }
  
  public Port_Out(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPort_Out.TYPE_ID);
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
  public ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_In selectPort_In() {
    return _getSingle(ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_In.class, ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.Port_aE_Out_port_aE_In);
  }

  public Port_Out setPort_In(ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_In port_In) {
    _setSingle(ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.Port_aE_Out_port_aE_In, port_In);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Port_Out setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_In.class, ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.Port_aE_Out_port_aE_In, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_Out selectToMePort_In(ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_In object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_Out.class, ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.Port_aE_Out_port_aE_In, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,df3f136d-ee72-11ef-8f29-099ac721970d,jbHwrEnQj0MoURCnaeHH4ldVTjY=] */
