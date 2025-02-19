package ch.actifsource.tutorial.javalistfunction.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Member extends DynamicResource implements IMember {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMember> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMember>() {
    
    @Override
    public IMember create() {
      return new Member();
    }
    
    @Override
    public IMember create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Member(resourceRepository, resource);
    }
  
  };

  public Member() {
    super(IMember.TYPE_ID);
  }
  
  public Member(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMember.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectFirstName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.Member_firstName);
  }
    
  public void setFirstName(java.lang.String firstName) {
     _setSingleAttribute(ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.Member_firstName, firstName);
  }

  @Override
  public java.lang.String selectLastName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.Member_lastName);
  }
    
  public void setLastName(java.lang.String lastName) {
     _setSingleAttribute(ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.Member_lastName, lastName);
  }

  // relations
  
  @Override
  public ch.actifsource.tutorial.javalistfunction.generic.javamodel.IDateOfBirth selectDateOfBirth() {
    return _getSingle(ch.actifsource.tutorial.javalistfunction.generic.javamodel.IDateOfBirth.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.Member_dateOfBirth);
  }

  public Member setDateOfBirth(ch.actifsource.tutorial.javalistfunction.generic.javamodel.IDateOfBirth dateOfBirth) {
    _setSingle(ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.Member_dateOfBirth, dateOfBirth);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Member setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.Member_firstName, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.Member_lastName, visitor);
    // relations
    _acceptSingle(ch.actifsource.tutorial.javalistfunction.generic.javamodel.IDateOfBirth.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.Member_dateOfBirth, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static ch.actifsource.tutorial.javalistfunction.generic.javamodel.IMember selectToMeDateOfBirth(ch.actifsource.tutorial.javalistfunction.generic.javamodel.IDateOfBirth object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.tutorial.javalistfunction.generic.javamodel.IMember.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.Member_dateOfBirth, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0f6ce2ef-dc85-11ef-989a-512b5711da93,2HMnf8O8ZZeYXhOe+RYE/q9zJdc=] */
