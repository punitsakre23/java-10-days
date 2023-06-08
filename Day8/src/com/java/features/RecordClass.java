package com.java.features;

import java.util.Objects;

record Alien(int age, String name) {

}

 /*
class Alien {

    private int age;
    private String name;

    public Alien(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alien alien = (Alien) o;
        return age == alien.age && Objects.equals(name, alien.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

}
 */

public class RecordClass {

    public static void main(String[] args) {

        Alien obj1 = new Alien(24, "Baba");
        Alien obj2 = new Alien(24, "Baba");

        System.out.println(obj1.equals(obj2));

    }

}
