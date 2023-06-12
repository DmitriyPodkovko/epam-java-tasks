package com.epam.rd.qa.topic10.task06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task {

    public static List<String> f(List<Integer> integerList, List<String> stringList) {
        return integerList.stream()
                .map(i -> stringList.stream()
                        .filter(s -> (s.matches("[0-9].*") && s.length() == i))
                        .findFirst()
                        .orElse("Not Found")
                )
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 4);
        List<String> stringList = Arrays.asList("1aa", "aaa", "1", "a");

        System.out.println(f(integerList, stringList));
    }

}
