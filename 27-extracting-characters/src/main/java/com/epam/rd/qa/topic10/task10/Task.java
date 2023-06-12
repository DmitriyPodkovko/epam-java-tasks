package com.epam.rd.qa.topic10.task10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task {

    public static List<Character> f(List<String> stringList) {
        return stringList.stream()
                .sorted(Comparator.comparing(str -> str.toString().length()).reversed())
                .map(str -> str.toUpperCase().charAt(str.length() - 1))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop");

        System.out.println(f(stringList));
    }

}
