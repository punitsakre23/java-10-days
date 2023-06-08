package com.java.annotations;

@FunctionalInterface
interface Demo {
    void run();
    
}

public class Annotations {

    public static void main(String[] args) {

        Demo d = () -> {
            System.out.println("Hello");
        };

    }

}
