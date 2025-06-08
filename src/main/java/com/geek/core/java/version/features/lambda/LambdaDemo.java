package com.geek.core.java.version.features.lambda;

/**
 *  Lambda Expression is an anonymous function i.e., the function that doesn't have name, return type & access modifiers.
 * <p>
 *  Imp: Functional interfaces are required in order to call lambda expression like a method
 *
 */
public class LambdaDemo {

    // () -> { System.out.println("Hello"); }
    // () -> System.out.println("Hello");
    public void m1() {
        System.out.println("Hello");
    }

    // (a, b) -> System.out.println(a+b);
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    // (str) -> str;
    public String str(String str) {
        return str;
    }
}
