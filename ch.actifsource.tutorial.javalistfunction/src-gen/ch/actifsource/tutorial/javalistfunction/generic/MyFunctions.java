package ch.actifsource.tutorial.javalistfunction.generic;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[ec9de60f-dc9a-11ef-989a-512b5711da93,imports]] */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import ch.actifsource.tutorial.javalistfunction.generic.javamodel.IDateOfBirth;

/* End Protected Region   [[ec9de60f-dc9a-11ef-989a-512b5711da93,imports]] */

public class MyFunctions {

  /* Begin Protected Region [[ec9de60f-dc9a-11ef-989a-512b5711da93]] */
  
  /* End Protected Region   [[ec9de60f-dc9a-11ef-989a-512b5711da93]] */


  public static interface IMemberFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("64b17e3f-dc9b-11ef-989a-512b5711da93")
    public <T extends ch.actifsource.tutorial.javalistfunction.generic.javamodel.IMember> List<T> sortByDateOfBirth();

  }
  
  public static interface IMemberFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("64b17e3f-dc9b-11ef-989a-512b5711da93")
    public <T extends ch.actifsource.tutorial.javalistfunction.generic.javamodel.IMember> List<T> sortByDateOfBirth(final List<T> memberList);

  }
  
  public static class MemberFunctionsImpl implements IMemberFunctionsImpl {

    public static final IMemberFunctionsImpl INSTANCE = new MemberFunctionsImpl();

    private MemberFunctionsImpl() {}

    @Override
    public <T extends ch.actifsource.tutorial.javalistfunction.generic.javamodel.IMember> List<T> sortByDateOfBirth(final List<T> memberList) {
      /* Begin Protected Region [[64b17e3f-dc9b-11ef-989a-512b5711da93]] */
      ArrayList<T> memberListSorted = new ArrayList<>(memberList);
    
      Collections.sort(memberListSorted, new Comparator<T>() {

		@Override
		public int compare(T o1, T o2) {
			IDateOfBirth datofBirth1 = o1.selectDateOfBirth();
			IDateOfBirth datofBirth2 = o2.selectDateOfBirth();
			
			int monthComp = datofBirth1.selectMonth().compareTo(datofBirth2.selectMonth());
			if(monthComp!=0) {return monthComp;}
			
			int dayComp = datofBirth1.selectDay().compareTo(datofBirth2.selectDay());
			if(dayComp!=0) {return dayComp;}
			
			return 0;
		}
	  });
      return memberListSorted;  
      /* End Protected Region   [[64b17e3f-dc9b-11ef-989a-512b5711da93]] */
    }

  }
  
  public static class MemberFunctions {

    private MemberFunctions() {}

    public static <T extends ch.actifsource.tutorial.javalistfunction.generic.javamodel.IMember> List<T> sortByDateOfBirth(final List<T> memberList) {
      return DynamicResourceUtil.invoke(IMemberFunctionsImpl.class, MemberFunctionsImpl.INSTANCE, memberList).sortByDateOfBirth(memberList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,ec9de60f-dc9a-11ef-989a-512b5711da93,KMgFMaBIt05uK+QCl+6BVwM21P8=] */
