package ch.actifsource.tutorial.service.complex.template;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4b42c4f1-d8b2-11ef-a770-7da0b40c5be1,imports]] */

/* End Protected Region   [[4b42c4f1-d8b2-11ef-a770-7da0b40c5be1,imports]] */

public class ServiceImpl {

  /* Begin Protected Region [[4b42c4f1-d8b2-11ef-a770-7da0b40c5be1]] */
  
  /* End Protected Region   [[4b42c4f1-d8b2-11ef-a770-7da0b40c5be1]] */


  public static interface IServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5cf3fddd-d8e1-11ef-a770-7da0b40c5be1")
    public java.lang.String className();

  }
  
  public static interface IServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("5cf3fddd-d8e1-11ef-a770-7da0b40c5be1")
    public java.lang.String className(final ch.actifsource.tutorial.service.complex.generic.javamodel.IService service);

  }
  
  public static class ServiceFunctionsImpl implements IServiceFunctionsImpl {

    public static final IServiceFunctionsImpl INSTANCE = new ServiceFunctionsImpl();

    private ServiceFunctionsImpl() {}

    @Override
    public java.lang.String className(final ch.actifsource.tutorial.service.complex.generic.javamodel.IService service) {
      /* Begin Protected Region [[5cf3fddd-d8e1-11ef-a770-7da0b40c5be1]] */
      try {
        java.lang.String resultStringLiteralValue1;
        resultStringLiteralValue1 = service.selectName();
        return "" + resultStringLiteralValue1 + "Impl";
      }
       catch (final java.lang.NullPointerException e) {
        return null;
      }
      
      /* End Protected Region   [[5cf3fddd-d8e1-11ef-a770-7da0b40c5be1]] */
    }

  }
  
  public static class ServiceFunctions {

    private ServiceFunctions() {}

    public static java.lang.String className(final ch.actifsource.tutorial.service.complex.generic.javamodel.IService service) {
      return DynamicResourceUtil.invoke(IServiceFunctionsImpl.class, ServiceFunctionsImpl.INSTANCE, service).className(service);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4b42c4f1-d8b2-11ef-a770-7da0b40c5be1,AGoE9Y8gxwFAzDGNjmoBXSDY8uo=] */
