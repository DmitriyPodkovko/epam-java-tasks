package com.epam.rd.qa.topic10.task05;

import java.util.List;
import java.util.stream.Collectors;

public class Task {

    public static List<String> f(List<Integer> integerList) {
        return integerList.stream()
                .filter(item -> item % 2 == 1)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

    }

}
