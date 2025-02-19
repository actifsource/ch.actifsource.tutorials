package ch.actifsource.tutorial.service.complex.template;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[62d46c46-d964-11ef-a770-7da0b40c5be1,imports]] */

/* End Protected Region   [[62d46c46-d964-11ef-a770-7da0b40c5be1,imports]] */

public class CallImpl {

  /* Begin Protected Region [[62d46c46-d964-11ef-a770-7da0b40c5be1]] */
  
  /* End Protected Region   [[62d46c46-d964-11ef-a770-7da0b40c5be1]] */


  public static interface ICallFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9a1fb1e5-d964-11ef-a770-7da0b40c5be1")
    public java.lang.String callName();

  }
  
  public static interface ICallFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CallFunctionsImpl implements ICallFunctionsImpl {

    public static final ICallFunctionsImpl INSTANCE = new CallFunctionsImpl();

    private CallFunctionsImpl() {}

  }
  
  public static class CallFunctions {

    private CallFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,62d46c46-d964-11ef-a770-7da0b40c5be1,fmw1CYOUVmbyVdJho1g/v2seh7Y=] */
