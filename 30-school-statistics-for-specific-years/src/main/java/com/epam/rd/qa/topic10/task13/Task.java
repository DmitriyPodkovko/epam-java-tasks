package com.epam.rd.qa.topic10.task13;

import java.util.List;

public class Task {

	public static List<YearSchoolStat> f(List<Entrant> nameList, List<Integer> yearsList) {
		return null;
	}

	public static void main(String[] args) {
		List<Entrant> nameList = null;
		List<Integer> yearsList = null;

		nameList.forEach(System.out::println);
		System.out.println("~~~");

		yearsList.forEach(System.out::println);
		System.out.println("~~~");

		f(nameList, yearsList).forEach(System.out::println);
	}

}
