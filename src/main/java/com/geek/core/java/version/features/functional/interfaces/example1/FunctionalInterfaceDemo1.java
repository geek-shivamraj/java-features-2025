package com.geek.core.java.version.features.functional.interfaces.example1;

/**
 *  Functional interface is an interface with only single abstract method (SAM)
 *  e.g., Runnable, Comparable, Callable
 *
 *  We can have any number of default & static methods.
 *
 *  We can use @FunctionalInterface annotation to specify that the interface is functional interface.
 *
 *  In case we add more than one abstract method then compile raise an error message.
 *
 */
public class FunctionalInterfaceDemo1 {

    public static void main(String[] args) {
        new Test().m1();

        FunctionalInterface1 interface1 = () -> System.out.println("[Using Lambda Expression]: Method One Execution");
        interface1.m1();
    }
}

@FunctionalInterface
interface FunctionalInterface1 {
    void m1();
}

class Test {
    public void m1() {
        System.out.println("[Not Using Lambda Expression]: Method One Execution");
    }
}
