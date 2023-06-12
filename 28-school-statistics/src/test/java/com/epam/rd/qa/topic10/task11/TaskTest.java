package com.epam.rd.qa.topic10.task11;

import static org.assertj.core.api.Assertions.*;

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
	@CsvFileSource(resources = "data.csv", delimiter = '|')
	void test(String inputLine, String expectedLine) {
		List<Entrant> nameList = Arrays.stream(inputLine.split(","))
			.map(String::trim)
			.map(s -> s.split("~"))
			.map(br -> new Entrant(
				Integer.parseInt(br[0]),
				Integer.parseInt(br[1]),
				br[0]))
			.collect(Collectors.toList());

		List<YearSchoolStat> expected = Arrays.stream(expectedLine.trim().split(","))
			.map(s -> s.split("~"))
			.map(br -> new YearSchoolStat(
				Integer.parseInt(br[0].trim()),
				Integer.parseInt(br[1].trim())))
			.collect(Collectors.toList());
			
		List<YearSchoolStat> actual = Task.f(nameList);
		
		for (int j = 0; j < expected.size(); j++) {
			assertThat(actual.get(j))
				.usingRecursiveComparison()
				.isEqualTo(expected.get(j));
		}
	}
		
	@Test
	void testMain() {
		Task.main(null);
	}

	@Test
	void testCompliance() {
		String packagePath = Task.class.getPackage()
			.getName()
			.replace('.', '/');
		String taskFile = "src/main/java/" + packagePath + "/Task.java";

		SpoonAPI spoon = new Launcher();
		spoon.addInputResource(taskFile);
		spoon.buildModel();

		List<CtMethod<?>> methods = spoon.getModel()
			.getElements(new TypeFilter<>(CtMethod.class));
		Assert.assertEquals("There are must be only two methods: 'main' and 'f'", 2, methods.size());

		methods.stream()
			.filter(m -> m.getSimpleName()
				.equals("f"))
			.findAny()
			.ifPresentOrElse(m -> Assert.assertEquals("Method 'f' must contain only one (return) statement", 1,
					m.getBody()
						.getStatements()
						.size()),
					() -> Assert.fail("There is must be method with name 'f'"));
	}

}
