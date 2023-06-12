package com.epam.rd.qa.topic10.task03;

import java.util.List;
import java.util.stream.Collectors;

public class Task {

    public static List<String> f(List<String> stringList) {
        return stringList.stream()
                .map(str -> str.charAt(0) + str.substring(str.length() - 1))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

    }

}
