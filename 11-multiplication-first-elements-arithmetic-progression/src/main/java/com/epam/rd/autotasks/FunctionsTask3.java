package com.epam.rd.autotasks;

public class FunctionsTask3 {

    public static int multiArithmeticElements(int a1, int t, int n) {
        if (n > 0) {
            int[] array = new int[n];
            array[0] = a1;
            int multi = array[0];
            for (int i = 1; i < array.length; i++) {
                array[i] = array[i - 1] + t;
                multi *= array[i];
            }
            return multi;
        }
        throw new IllegalArgumentException();
    }
}
