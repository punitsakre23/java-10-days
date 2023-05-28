package com.practice.java.code;

public class FactorialRunner {

    public static void main(String[] args) {

        Factorial factorial = new Factorial();

        // int result = factorial.printFactorialUsingIteration(7);

        int result = factorial.printFactorialUsingRecursion(7);

        System.out.println(result);

    }

}
