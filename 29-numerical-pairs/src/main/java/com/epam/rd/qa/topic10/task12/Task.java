package com.epam.rd.qa.topic10.task12;

import java.util.Arrays;
import java.util.List;

public class Task {

	public static List<NumberPair> f(List<Integer> integerList1, List<Integer> integerList2) {
		return null;
	}

	public static void main(String[] args) {
		List<Integer> integerList1 = Arrays.asList(0, 1, 2, 33, 44, 10);;
		List<Integer> integerList2 = Arrays.asList(20, 10, 11, 22, 30);;
		
		integerList1.forEach(System.out::println);

		System.out.println("~~~");
		integerList2.forEach(System.out::println);

		System.out.println("~~~");
		f(integerList1, integerList2).forEach(System.out::println);
	}

}
