package com.epam.rd.qa.topic10.task11;

import java.util.*;
import java.util.stream.Collectors;

public class Task {

	public static List<YearSchoolStat> f(List<Entrant> nameList) {
		Map<Integer, Long> counted = nameList.stream()
				.collect(Collectors.groupingBy(Entrant::getYearOfEntering, Collectors.counting()));
//		List<Integer> l = new ArrayList<Integer>(counted.keySet().stream().collect(Collectors.toList()));
//		List<Long> l2 = new ArrayList<Long>(counted.values().stream().collect(Collectors.toList()));
		List<YearSchoolStat> yss =  new ArrayList<>();
		for (int i = 0; i < counted.size(); i++) {
			yss.add(new YearSchoolStat(new ArrayList<>(counted.keySet()).get(i),
					new ArrayList<>(counted.values()).get(i)));
		}
		return yss;
	}


	public static void main(String[] args) {
		List<Entrant> nameList = Arrays.asList(
				new Entrant(1, 1993, "Ivanov"),
				new Entrant(2, 1992, "Petrov"),
				new Entrant(3, 1993, "Pupkin"),
				new Entrant(3, 2000, "Zobkin"),
				new Entrant(3, 2000, "Zabkin"));

		nameList.forEach(System.out::println);

		System.out.println("~~~");
		f(nameList).forEach(System.out::println);
	}

}
