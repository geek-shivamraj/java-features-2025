package com.geek.core.java.version.features.staticMethods.example2;

/**
 * 1. As interface static methods by default not available to the implementation class, overriding concept is not applicable.
 * 2. Based on our requirement, we can define exactly same method in the implementation class, it's valid but not overriding.
 */
public class StaticMethodDemo2 implements Interf {
    public static void main(String[] args) {
        // Incorrect way of using
        /*
            m1();
            StaticMethodDemo2 staticMethod = new StaticMethodDemo2();
            staticMethod.m1();
            StaticMethodDemo2.m1();
        */

        // Correct way of using
        Interf.m1();

        StaticMethodDemo2.m1();
    }

    public static void m1() {
        System.out.println("StaticMethodDemo2 method - m1()");
    }
}

interface Interf {
    static void m1() {
        System.out.println("Interf Static method - m1()");
    }
}