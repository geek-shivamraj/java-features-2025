package com.geek.core.java.version.features.staticMethods.example1;

/**
 * 1. As interface static methods by default not available to the implementation class, overriding concept is not applicable.
 * 2. Based on our requirement, we can define exactly same method in the implementation class, it's valid but not overriding.
 */
public class StaticMethodDemo1 {
    public static void main(String[] args) {
        Interf.sum(10, 20);
    }
}

interface Interf {
    static void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}
