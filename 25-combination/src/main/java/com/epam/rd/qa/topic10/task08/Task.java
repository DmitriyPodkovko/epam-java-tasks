package com.epam.rd.qa.topic10.task08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task {

    public static List<Integer> f(int d, int k, List<Integer> integerList) {
//        one test uncorrected
//        return Stream.concat(
//                integerList.stream().filter(i -> (integerList.indexOf(i) > k) && i > d),
//                integerList.stream().filter(i -> !(integerList.indexOf(i) > k) && i > d)
//        ).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return integerList.stream()
                .skip(k - 1)
                .filter(i -> i > d)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int d = 3;
        int k = 4;
        List<Integer> integerList = Arrays.asList(-10, 3, -3, 4, 55, 6);

        System.out.println(f(d, k, integerList));
    }

}
