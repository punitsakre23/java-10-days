package com.practice.java.code;

public class FibonacciRunner {

    public static void main(String[] args) {

        int number = 10;

        FibonacciSeries fibonacci = new FibonacciSeries();

        fibonacci.printFibonacciSeries(number);
        System.out.println();

        int result = fibonacci.printFibonacciElementAtPositionUsingIteration(number);

        System.out.println(result);

        int element = fibonacci.printFibonacciElementAtPositionUsingRecursion(0, 1, number);

        System.out.println(element);

        int getElement = fibonacci.getElementAtPosition(number);

        System.out.println(getElement);

        int getElementAtPosition = fibonacci.printFibonacciElementAtPositionUsingMemoization(number);

        System.out.println(getElementAtPosition);

    }

}
