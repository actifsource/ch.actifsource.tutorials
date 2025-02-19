package ch.actifsource.tutorial.javalistfunction.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DateOfBirth extends DynamicResource implements IDateOfBirth {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDateOfBirth> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDateOfBirth>() {
    
    @Override
    public IDateOfBirth create() {
      return new DateOfBirth();
    }
    
    @Override
    public IDateOfBirth create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DateOfBirth(resourceRepository, resource);
    }
  
  };

  public DateOfBirth() {
    super(IDateOfBirth.TYPE_ID);
  }
  
  public DateOfBirth(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDateOfBirth.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectDay() {
    return _getSingleAttribute(java.lang.Integer.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.DateOfBirth_day);
  }
    
  public void setDay(java.lang.Integer day) {
     _setSingleAttribute(ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.DateOfBirth_day, day);
  }

  @Override
  public java.lang.Integer selectMonth() {
    return _getSingleAttribute(java.lang.Integer.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.DateOfBirth_month);
  }
    
  public void setMonth(java.lang.Integer month) {
     _setSingleAttribute(ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.DateOfBirth_month, month);
  }

  @Override
  public java.lang.Integer selectYear() {
    return _getSingleAttribute(java.lang.Integer.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.DateOfBirth_year);
  }
    
  public void setYear(java.lang.Integer year) {
     _setSingleAttribute(ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.DateOfBirth_year, year);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DateOfBirth setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.DateOfBirth_day, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.DateOfBirth_month, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, ch.actifsource.tutorial.javalistfunction.generic.GenericPackage.DateOfBirth_year, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,211c7997-dc85-11ef-989a-512b5711da93,VYiFjaM5U/n+xHzUaCBHUQpWZ7I=] */
