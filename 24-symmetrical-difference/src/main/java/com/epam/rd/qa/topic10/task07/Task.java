package com.epam.rd.qa.topic10.task07;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task {

    public static List<Integer> f(int k, List<Integer> integerList) {
        return Stream.concat(
                integerList.stream().filter(i -> integerList.indexOf(i) > k && !(i % 2 == 0)),
                integerList.stream().filter(i -> integerList.indexOf(i) < k && i % 2 == 0)
        ).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int k = 5;
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(f(k, integerList));
    }

}
