package com.epam.rd.autotasks;

class LoopStatements {
    public static int task1(int n) {
        if (n > 0) {
            int a, sum = 0;
            while (n > 0) {
                a = n % 10;
                if (a % 2 == 1) sum = sum + a;
                n = n / 10;
            }
            return sum;
        } else throw new IllegalArgumentException();
    }
}
