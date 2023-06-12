package com.epam.rd.autotasks;

class LoopStatements {
    public static int task2(int n) {
        if (n > 0) {
            int a, sum = 0;
            while (n > 0) {
                a = n % 2;
                sum = sum + a;
                n = n / 2;
            }
            return sum;
        } else throw new IllegalArgumentException();
    }
}
