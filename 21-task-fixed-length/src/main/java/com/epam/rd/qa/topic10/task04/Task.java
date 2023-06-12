package com.epam.rd.qa.topic10.task04;

import java.util.List;
import java.util.stream.Collectors;

public class Task {

    public static List<String> f(int k, List<String> stringList) {
        return stringList.stream()
                .filter(str -> str.length() == k && str.length() > 1 && Character.isDigit(str.charAt(str.length() - 1)))
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

    }

}
