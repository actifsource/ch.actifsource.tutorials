package ch.actifsource.tutorial.statemachine.code.generic;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[bebb70c4-ee64-11ef-883f-ab05a42d3347,imports]] */

/* End Protected Region   [[bebb70c4-ee64-11ef-883f-ab05a42d3347,imports]] */

public class NameFunctions {

  /* Begin Protected Region [[bebb70c4-ee64-11ef-883f-ab05a42d3347]] */
  
  /* End Protected Region   [[bebb70c4-ee64-11ef-883f-ab05a42d3347]] */


  public static interface ITransitionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("22c507b4-ee65-11ef-883f-ab05a42d3347")
    public java.lang.String displayName();

  }
  
  public static interface ITransitionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TransitionFunctionsImpl implements ITransitionFunctionsImpl {

    public static final ITransitionFunctionsImpl INSTANCE = new TransitionFunctionsImpl();

    private TransitionFunctionsImpl() {}

  }
  
  public static class TransitionFunctions {

    private TransitionFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,bebb70c4-ee64-11ef-883f-ab05a42d3347,TNB0Xtb9io6ZxESJnYATSzNqeNM=] */
