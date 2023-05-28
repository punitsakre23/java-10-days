package com.practice.java.code;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {

    Map<Integer, Integer> cache = new HashMap<>();

    public void printFibonacciSeries(int num) {
        if (num <= 1) {
            System.out.println(0);
            return;
        }

        int one = 0;
        int two = 1;

        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                System.out.print(one + " ");
            } else if (i == 2) {
                System.out.print(two + " ");
            }
            else {
                int temp = one + two;
                one = two;
                two = temp;
                System.out.print(temp + " ");
            }
        }
    }

    public int printFibonacciElementAtPositionUsingIteration(int position) {

        int one = 0;
        int two = 1;
        int temp = 0;

        for (int i = 1; i <= position; i++) {
            if (position == 1) {
                return one;
            } else if (position == 2) {
                return two;
            }
            else if (i > 2){
                temp = one + two;
                one = two;
                two = temp;
            }
        }

        return temp;

    }

    public int printFibonacciElementAtPositionUsingRecursion(int a, int b, int position) {

        if (position == 1) {
            return a;
        } else if (position == 2) {
            return b;
        }

        int temp = a + b;
        a = b;
        b = temp;

        return printFibonacciElementAtPositionUsingRecursion(a, b, position - 1);

    }

    public int getElementAtPosition(int position) {
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }

        return getElementAtPosition(position - 1) + getElementAtPosition(position - 2);
    }

    public int printFibonacciElementAtPositionUsingMemoization(int position) {

        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }

        if (cache.containsKey(position)) {
            return cache.get(position);
        }

        int result = printFibonacciElementAtPositionUsingMemoization(position - 1) + printFibonacciElementAtPositionUsingMemoization(position - 2);

        cache.put(position, result);

        return result;

    }
}
