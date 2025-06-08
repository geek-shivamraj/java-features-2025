package com.geek.core.java.version.features.defaultMethods.example2;

public class DefaultMethodOverrideExample implements Interf2 {
    public static void main(String[] args) {
        DefaultMethodOverrideExample defaultMethod = new DefaultMethodOverrideExample();
        defaultMethod.m1();
    }
}

interface Interf1 {
    default void m1() {
        System.out.println("Non-Overridden Default Method");
    }
}

interface Interf2 extends Interf1 {
    default void m1() {
        System.out.println("Overridden Default Method");
    }
}
