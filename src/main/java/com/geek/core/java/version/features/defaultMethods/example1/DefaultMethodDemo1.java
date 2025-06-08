package com.geek.core.java.version.features.defaultMethods.example1;

/**
 * 1. Interface default methods are by-default available to all implementation classes.
 * 2. Based on the requirement implementation class can use the default methods directly or can override.
 */
public class DefaultMethodDemo1 implements Interf {
    public static void main(String[] args) {
        DefaultMethodDemo1 defaultMethod = new DefaultMethodDemo1();
        defaultMethod.m1();
    }
}

interface Interf {
    default void m1() {
        System.out.println("Example 1: Default Method");
    }
}
