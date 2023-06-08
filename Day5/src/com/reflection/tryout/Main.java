package com.reflection.tryout;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) throws Exception {

        Class c = Class.forName("com.reflection.tryout.Product");

        Product p = (Product) c.newInstance();

        Method m = c.getDeclaredMethod("calling");

        m.setAccessible(true);

        m.invoke(p);

        Method m1 = c.getDeclaredMethod("calling", int.class);

        m1.setAccessible(true);

        m1.invoke(p, 5);

//        Constructor[] construct = c.getConstructors();
//
//        for (Constructor cons :
//                construct) {
//            System.out.println(cons);
//        }
//
//        System.out.println();
//
//        Field [] field = c.getDeclaredFields();
//
//        for (Field f :
//                field) {
//            System.out.println(f);
//        }
//
//        System.out.println();
//
//        Method [] methods = c.getDeclaredMethods();
//
//        for (Method m :
//                methods) {
//            System.out.println(m);
//        }
//
//        int modifier = c.getModifiers();
//
//        System.out.println(modifier);
//
//        System.out.println();
//
//        System.out.println(c.getDeclaredConstructor());

    }

}
