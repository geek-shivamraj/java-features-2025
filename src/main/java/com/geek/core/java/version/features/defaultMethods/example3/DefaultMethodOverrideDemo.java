package com.geek.core.java.version.features.defaultMethods.example3;

public class DefaultMethodOverrideDemo implements Left, Right {
    public static void main(String[] args) {
        DefaultMethodOverrideDemo defaultMethod = new DefaultMethodOverrideDemo();
        defaultMethod.m1();
    }

    @Override
    public void m1() {
        Left.super.m1();
        Right.super.m1();
        System.out.println("Demo class Default Method");
    }
}

interface Left {
    default void m1() {
        System.out.println("Left Default Method");
    }
}

interface Right {
    default void m1() {
        System.out.println("Right Default Method");
    }
}
