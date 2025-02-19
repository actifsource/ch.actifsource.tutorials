package ch.actifsource.tutorial.javalistfunction.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Club extends DynamicResource implements IClub {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IClub> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IClub>() {
    
    @Override
    public IClub create() {
      return new Club();
    }
    
    @Override
    public IClub create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Club(resourceRepository, resource);
    }
  
  };

  public Club() {
    super(IClub.TYPE_ID);
  }
  
  public Club(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IClub.TYPE_ID);
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
  public java.util.List<? extends ch.actifsource.tutorial.javalistfunction.generic.javamodel.IMember> selectMember() {
    return _getList(ch.actifsource.tutorial.javalistfunction.generic.javamodel.IMember.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.Club_member);
  }

  public Club setMember(java.util.List<? extends ch.actifsource.tutorial.javalistfunction.generic.javamodel.IMember> member) {
    _setList(ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.Club_member, member);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Club setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.tutorial.javalistfunction.generic.javamodel.IMember.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.Club_member, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.tutorial.javalistfunction.generic.javamodel.IClub selectToMeMember(ch.actifsource.tutorial.javalistfunction.generic.javamodel.IMember object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.javalistfunction.generic.javamodel.IClub.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.Club_member, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,04b24ec9-dc85-11ef-989a-512b5711da93,o3QT1+lH5bIXn4sgYvK57sfoyHY=] */
