package com.epam.rd.autotasks;

class LoopStatements {
    public static int task3(int n) {
        if (n >= 0) {
            int sum = 0, preF = 0, nextF = 1, sumF;
            for (int i = 1; i < n; i++) {
                sumF = preF + nextF;
                preF = nextF;
                nextF = sumF;
                sum += preF;
            }
            return sum;
        } else throw new IllegalArgumentException();
    }
}
