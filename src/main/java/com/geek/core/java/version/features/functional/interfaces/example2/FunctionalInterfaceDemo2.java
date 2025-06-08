package com.geek.core.java.version.features.functional.interfaces.example2;

public class FunctionalInterfaceDemo2 {}

/**
 *  We can use @FunctionalInterface annotation to specify that the interface is functional interface.
 *
 *  In case we add more than one abstract method then compile raise an error message.
 *
 */

// @FunctionalInterface
interface Interface1 {
    void methodOne();
    void methodTwo();
}

