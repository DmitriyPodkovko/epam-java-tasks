package com.epam.rd.autotasks;

class ConditionStatements {

    public static int task2(int n) {
        if (n >= 100 && n <= 999) {
            int a, b, c, tmp;
            a = n % 10;
            tmp = n / 10;
            b = tmp % 10;
            c = tmp / 10;
            if (a > b) { tmp = a; a = b; b = tmp; }
            if (a > c) { tmp = a; a = c; c = tmp; }
            if (b > c) { tmp = b; b = c; c = tmp; }
            return  c * 100 + b * 10 + a;
        }
        return 0;
    }
}
