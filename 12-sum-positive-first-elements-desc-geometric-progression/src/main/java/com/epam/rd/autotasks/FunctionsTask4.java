package com.epam.rd.autotasks;

public class FunctionsTask4 {
    public static double sumGeometricElements(int a1, double t, int alim) {
        if (a1 * t > alim && t != 1 && a1 * t < a1 && a1 != 1) {
            double[] array = new double[1000];
            array[0] = a1;
            double sum = array[0];
            for (int i = 1; i < array.length; i++) {
                array[i] = (array[i - 1] * t);
                sum += array[i];
                if (array[i] * t <= alim || array[i] * t <= 0.00000001) {
                    sum = Math.round(sum);
                    break;
                }
            }
            return sum;
        }
        throw new IllegalArgumentException();
    }
}
