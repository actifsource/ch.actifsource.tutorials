package ch.actifsource.tutorial.diagramm.ports.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class System extends DynamicResource implements ISystem {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem>() {
    
    @Override
    public ISystem create() {
      return new System();
    }
    
    @Override
    public ISystem create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new System(resourceRepository, resource);
    }
  
  };

  public System() {
    super(ISystem.TYPE_ID);
  }
  
  public System(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystem.TYPE_ID);
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
  public java.util.List<? extends ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IProcess> selectProcess() {
    return _getList(ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IProcess.class, ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.System_process);
  }

  public System setProcess(java.util.List<? extends ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IProcess> process) {
    _setList(ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.System_process, process);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public System setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IProcess.class, ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.System_process, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.tutorial.diagramm.ports.generic.javamodel.ISystem selectToMeProcess(ch.actifsource.tutorial.diagramm.ports.generic.javamodel.IProcess object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.diagramm.ports.generic.javamodel.ISystem.class, ch.actifsource.tutorial.diagramm.ports.generic.GenericPackage.System_process, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d5f6ac95-ee72-11ef-8f29-099ac721970d,MDWOi5X/gt7p272/aJ6b3QPqTqg=] */
