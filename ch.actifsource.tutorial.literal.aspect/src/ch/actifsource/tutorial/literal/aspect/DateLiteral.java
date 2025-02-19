package ch.actifsource.tutorial.literal.aspect;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import javax.annotation.CheckForNull;


import ch.actifsource.core.INode;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.model.aspects.ILiteralAspect;
import ch.actifsource.core.scope.IResourceScope;

public class DateLiteral implements ILiteralAspect {

	@Override
	public boolean allowMultiline() {
		return false;
	}

	@Override
	public @CheckForNull Object getValue(IReadJobExecutor executor, IResourceScope arg1, INode value) {
		DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.LONG, Locale.ENGLISH);
		try {
			return dateInstance.parse(value.toString());
		} catch (ParseException e) {
			return null;
		}
	}

	@Override
	public Class<?> getValueType() {
		return Date.class;
	}

	@Override
	public @CheckForNull String isValid(IReadJobExecutor executor, IResourceScope scope, String value) {
		DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.LONG, Locale.ENGLISH);
		try {
			dateInstance.parse(value.toString());
			return null;
		} catch (ParseException e) {
			return e.getMessage();
		}
	}

}
