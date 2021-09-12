package org.alfasoftware.astra.core.analysis.operations.methods;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Set;

import org.alfasoftware.astra.core.analysis.AbstractAnalysisTest;
import org.alfasoftware.astra.core.matchers.ExampleUsedClass;
import org.alfasoftware.astra.core.matchers.MethodMatcher;
import org.junit.Test;

public class TestFindMethodDeclarationsAnalysis extends AbstractAnalysisTest{

	@Test
	public void test() {
		 MethodMatcher correctOneArgMethodMatcher = MethodMatcher.builder()
			        .withFullyQualifiedDeclaringType(ExampleUsedClass.class.getName())
			        .withMethodName("methodWithArgs")
			        .withFullyQualifiedParameters(Arrays.asList("java.lang.Long"))
			        .build();
		 Set<MethodMatcher> s = Set.of(correctOneArgMethodMatcher);
		 FindMethodDeclarationsAnalysis analysis = new FindMethodDeclarationsAnalysis(s);
//		fail("Not yet implemented");
	}

}
