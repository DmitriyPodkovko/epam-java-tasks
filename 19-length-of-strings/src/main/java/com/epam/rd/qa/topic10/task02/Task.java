package com.epam.rd.qa.topic10.task02;

import java.util.List;
import java.util.stream.Collectors;

public class Task {
	
	public static List<Integer> f(List<String> stringList) {
		return stringList.stream()
				.map(String::length)
				.sorted()
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		
	}

}
