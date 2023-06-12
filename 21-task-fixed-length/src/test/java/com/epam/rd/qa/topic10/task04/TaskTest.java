package com.epam.rd.qa.topic10.task04;

import java.util.*;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import spoon.*;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.filter.TypeFilter;

/**
 * @author D. Kolesnikov
 */
public class TaskTest {

	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", delimiter = ';')
	void test(int k, String inputLine, String expectedLine) {
		List<String> stringList = Arrays.stream(inputLine.split("~"))
			.collect(Collectors.toList());
		
		List<String> actual = Task.f(k, stringList);
		
		List<String> expected = expectedLine == null 
			? Collections.emptyList()
			: Arrays.stream(expectedLine.split("~"))
				.collect(Collectors.toList());
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	void testMain() {
		Task.main(null);
	}
	
	@Test
	void testCompliance() {
		String packagePath = Task.class.getPackage().getName().replace('.', '/');
		String taskFile = "src/main/java/" + packagePath + "/Task.java";

	    SpoonAPI spoon = new Launcher();
		spoon.addInputResource(taskFile); 
		spoon.buildModel();

		List<CtMethod<?>> methods = spoon.getModel().getElements(new TypeFilter<>(CtMethod.class));
		Assert.assertEquals("There are must be only two methods: 'main' and 'f'", 2, methods.size());
		
		methods.stream()
			.filter(m -> m.getSimpleName().equals("f"))
			.findAny()
			.ifPresentOrElse(
				m -> Assert.assertEquals("Method 'f' must contain only one (return) statement", 1, m.getBody().getStatements().size()),
				() -> Assert.fail("There is must be method with name 'f'"));
	}

}
