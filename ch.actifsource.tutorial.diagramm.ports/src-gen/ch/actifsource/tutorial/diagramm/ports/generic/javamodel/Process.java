package ch.actifsource.tutorial.diagramm.ports.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Process extends DynamicResource implements IProcess {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProcess> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProcess>() {
    
    @Override
    public IProcess create() {
      return new Process();
    }
    
    @Override
    public IProcess create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Process(resourceRepository, resource);
    }
  
  };

  public Process() {
    super(IProcess.TYPE_ID);
  }
  
  public Process(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProcess.TYPE_ID);
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
  public java.util.List<? extends ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_In> selectPort_In() {
    return _getList(ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_In.class, ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.Process_port_aE_In);
  }

  public Process setPort_In(java.util.List<? extends ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_In> port_In) {
    _setList(ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.Process_port_aE_In, port_In);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_Out> selectPort_Out() {
    return _getList(ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_Out.class, ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.Process_port_aE_Out);
  }

  public Process setPort_Out(java.util.List<? extends ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_Out> port_Out) {
    _setList(ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.Process_port_aE_Out, port_Out);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Process setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_In.class, ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.Process_port_aE_In, visitor);
    _acceptList(ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_Out.class, ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.Process_port_aE_Out, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IProcess selectToMePort_In(ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_In object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IProcess.class, ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.Process_port_aE_In, object.getResource());
  }
  
  public static ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IProcess selectToMePort_Out(ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IPort_Out object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IProcess.class, ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.Process_port_aE_Out, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d8c499cb-ee72-11ef-8f29-099ac721970d,0/snvXK0CwaY/arMfznOxnNkvYE=] */
