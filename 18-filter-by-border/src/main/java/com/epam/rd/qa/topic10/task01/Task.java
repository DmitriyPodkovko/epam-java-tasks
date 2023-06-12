package com.epam.rd.qa.topic10.task01;

import java.util.*;
import java.util.stream.Collectors;

public class Task {

    public static List<String> f(char c, List<String> stringList) {
        return stringList.stream()
                .filter(str -> str.charAt(0) == c && str.charAt(str.length() - 1) == c && str.length() > 1)
                .collect(Collectors.toList());


    }

    public static void main(String[] args) {
        char c = 'a';
        List<String> stringList = Arrays.asList("Hello", "qwerty", "asda", "asdfa", "as", "a");
        System.out.println(f(c, stringList));
    }

}
