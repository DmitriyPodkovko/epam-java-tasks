package com.epam.rd.qa.topic10.task09;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task {

    public static List<String> f(List<String> stringList) {
        return stringList.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(0), Collectors.summingInt(String::length)))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Object::toString)
                .map(str -> str.charAt(str.length() - 1) + "-" + str.charAt(0))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "AB", "ABC", "B", "BC", "D");

        System.out.println(f(stringList));
    }

}
