package ch.actifsource.tutorial.statemachine.code.generic;

import javax.annotation.CheckForNull;

import ch.actifsource.core.INode;
import ch.actifsource.core.Literal;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.model.aspects.impl.AbstractStatelessAspectImpl;
import ch.actifsource.core.model.aspects.impl.IGenericLiteralAspect;
import ch.actifsource.core.scope.IResourceScope;

public class MyNameProviderLiteralAspect extends AbstractStatelessAspectImpl implements IGenericLiteralAspect<IMyNameProvider> {

	@Override
	public boolean allowMultiline() {
		return false;
	}

	@Override
	public @CheckForNull String isValid(IReadJobExecutor executor, IResourceScope scope, String value) {
		return null;
	}

	@Override
	public Literal create(IMyNameProvider value) {
		return new Literal(value.toString());
	}

	@Override
	public @CheckForNull String getJavaConstructionExpression(IReadJobExecutor executor, IResourceScope scope, INode node) {
		return null;
	}

	@Override
	public @CheckForNull IMyNameProvider getValue(IReadJobExecutor executor, IResourceScope scope, INode node) {
		return null;
	}

	@Override
	public Class<IMyNameProvider> getValueType() {
		return IMyNameProvider.class;
	}

}
