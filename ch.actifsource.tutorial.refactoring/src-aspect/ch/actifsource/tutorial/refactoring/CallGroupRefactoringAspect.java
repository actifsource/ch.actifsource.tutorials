package ch.actifsource.tutorial.refactoring;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import ch.actifsource.core.Package;
import ch.actifsource.core.PackagedResource;
import ch.actifsource.core.Resource;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractRefactorerAspect;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.tutorial.refactoring.generic.GenericModel;
import ch.actifsource.ui.refactoring.util.RefactorUtil;

public class CallGroupRefactoringAspect extends AbstractRefactorerAspect {

	public CallGroupRefactoringAspect() {
		super("1.0.0", 
			  Date.from(LocalDate.of(2024, 1, 6).atStartOfDay(ZoneId.systemDefault()).toInstant()), 
			  "Call to Callgroup");
	}

	@Override
	public void refactor(IModifiable modifiable, List<Package> packages) {
		Iterable<PackagedResource> services = Select.instancesWithPackage(modifiable, GenericModel.Service);
		for(PackagedResource service : services) {
			final Package pkg = service.getPackage();
			if(!packages.contains(pkg))
				continue;
			Resource newGroup = Update.createAndInitializeResource(modifiable, pkg, 
					GenericModel.CallGroup, service.getResource(), GenericModel.Service_group, null, 
					"group", null);

			RefactorUtil.moveStatements(modifiable, GenericModel.CallGroup_call, service.getResource(), newGroup);
		}
	}

}
