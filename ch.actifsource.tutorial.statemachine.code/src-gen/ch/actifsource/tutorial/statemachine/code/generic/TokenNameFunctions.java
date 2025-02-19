package ch.actifsource.tutorial.statemachine.code.generic;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b6661818-ee6b-11ef-8f29-099ac721970d,imports]] */

/* End Protected Region   [[b6661818-ee6b-11ef-8f29-099ac721970d,imports]] */

public class TokenNameFunctions {

  /* Begin Protected Region [[b6661818-ee6b-11ef-8f29-099ac721970d]] */
  
  /* End Protected Region   [[b6661818-ee6b-11ef-8f29-099ac721970d]] */


  public static interface IMyNameProviderLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("16a7d0f5-ee6c-11ef-8f29-099ac721970d")
    public java.lang.String variableName(final ch.actifsource.core.javamodel.IResource resource);

  }
  
  public static interface IMyNameProviderLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MyNameProviderLiteralFunctionsImpl implements IMyNameProviderLiteralFunctionsImpl {

    public static final IMyNameProviderLiteralFunctionsImpl INSTANCE = new MyNameProviderLiteralFunctionsImpl();

    private MyNameProviderLiteralFunctionsImpl() {}

  }
  
  public static class MyNameProviderLiteralFunctions {

    private MyNameProviderLiteralFunctions() {}

  }

  public static interface IStatemachineFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("835774eb-ee6c-11ef-8f29-099ac721970d")
    public ch.actifsource.tutorial.statemachine.code.generic.IMyNameProvider generateNameProvider();

  }
  
  public static interface IStatemachineFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("835774eb-ee6c-11ef-8f29-099ac721970d")
    public ch.actifsource.tutorial.statemachine.code.generic.IMyNameProvider generateNameProvider(final ch.actifsource.tutorial.statemachine.code.generic.javamodel.IStatemachine statemachine);

  }
  
  public static class StatemachineFunctionsImpl implements IStatemachineFunctionsImpl {

    public static final IStatemachineFunctionsImpl INSTANCE = new StatemachineFunctionsImpl();

    private StatemachineFunctionsImpl() {}

    @Override
    public ch.actifsource.tutorial.statemachine.code.generic.IMyNameProvider generateNameProvider(final ch.actifsource.tutorial.statemachine.code.generic.javamodel.IStatemachine statemachine) {
      /* Begin Protected Region [[835774eb-ee6c-11ef-8f29-099ac721970d]] */
      return new IMyNameProvider() {}; 
      /* End Protected Region   [[835774eb-ee6c-11ef-8f29-099ac721970d]] */
    }

  }
  
  public static class StatemachineFunctions {

    private StatemachineFunctions() {}

    public static ch.actifsource.tutorial.statemachine.code.generic.IMyNameProvider generateNameProvider(final ch.actifsource.tutorial.statemachine.code.generic.javamodel.IStatemachine statemachine) {
      return DynamicResourceUtil.invoke(IStatemachineFunctionsImpl.class, StatemachineFunctionsImpl.INSTANCE, statemachine).generateNameProvider(statemachine);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b6661818-ee6b-11ef-8f29-099ac721970d,fe/5SKq+lrkLQmBcDjVL3xiKrRQ=] */
