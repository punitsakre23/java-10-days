package com.practice.java.code;

public class Factorial {

    public int printFactorialUsingIteration(int num) {

        if (num == 0 || num == 1) {
            return 1;
        }

        int factorial = 1;

        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public int printFactorialUsingRecursion(int num) {

        if (num == 1 || num == 0) {
            return 1;
        }

        int factorial = printFactorialUsingRecursion(num - 1) * num;

        return factorial;
    }
}
