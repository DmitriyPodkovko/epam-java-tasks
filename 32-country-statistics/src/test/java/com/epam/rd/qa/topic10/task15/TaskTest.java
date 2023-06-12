package com.epam.rd.qa.topic10.task15;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import org.assertj.core.api.Assertions;
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
	void test(String goodsLine, String storePriceLine, String expectedLine) {

		List<Goods> goodsList = Arrays.stream(goodsLine.trim().split("\\s+"))
			.map(String::trim)
			.map(s -> s.split("~"))
			.map(br -> new Goods(
					Integer.parseInt(br[0]),
					br[1],
					br[2]))
			.collect(Collectors.toList());

		List<StorePrice> storePriceList = Arrays.stream(storePriceLine.trim().split("\\s+"))
			.map(String::trim)
			.map(s -> s.split("~"))
			.map(br -> new StorePrice(
					Integer.parseInt(br[0]),
					br[1],
					new BigDecimal(br[2])))
			.collect(Collectors.toList());

		List<CountryStat> actual = Task.f(goodsList, storePriceList);

		List<CountryStat> expected = Arrays.stream(expectedLine.split("\\s+"))
				.map(String::trim)
				.map(s -> s.split("~"))
				.map(br -> new CountryStat(
						br[0],
						Integer.parseInt(br[1]),
						new BigDecimal(br[2])))
				.collect(Collectors.toList());

		for (int j = 0; j < expected.size(); j++) {
			Assertions.assertThat(actual.get(j))
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
