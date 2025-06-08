package com.geek.core.java.version.features.functional.interfaces.example3;

public class InheritanceFunctionInterface {}

@FunctionalInterface
interface Inter1 {
    void methodOne();
}

/**
 *  If an interface extends FunctionalInterface & child interface doesn't contain any abstract method then
 *  child interface is also FunctionalInterface.
 */
@FunctionalInterface
interface Inter2 extends Inter1 {}

/**
 *  In the child interface, we can define exactly same parent interface abstract method.
 */
@FunctionalInterface
interface Inter3 extends Inter1 {
    void methodOne();
}

/**
 *  In the child interface, we can't define any new abstract methods otherwise child interface won't be a Functional interface
 *  & if we're trying to use @FunctionalInterface annotation then compiler gives an error message.
 */
// @FunctionalInterface
interface Inter4 extends Inter1 {
    void methodTwo();
}