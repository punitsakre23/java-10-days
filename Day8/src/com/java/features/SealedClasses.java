package com.java.features;

sealed class SealedClass permits SealedClasses{
    public void createClass() {
        System.out.println("Create class");
    }
}
public final class SealedClasses extends SealedClass {

}
