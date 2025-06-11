package com.geek.core.java.interview.questions.singleton.concept.lazyIntantiation;

/**
 *
 * Way 3 - Bill Pugh Singleton (Static Inner class)
 *
 * To make a class Singleton in Java, we ensure only one instance exists & provide a global access point.
 *
 *  This is the most efficient & widely used approach
 *
 *  Lazy Instantiation (Thread-safe without Synchronization)
 *      - The instance is created only when it's needed, without synchronization to ensure thread safety.
 *
 *  Pros:
 *      - Lazy Instantiation, thread-safe & avoid synchronization overhead
 *  Cons:
 *      - Slightly more complex to understand
 */

public class LazyStaticInnerClass {
    private LazyStaticInnerClass(){}

    private static class SingletonHelper {
        private static final LazyStaticInnerClass INSTANCE = new LazyStaticInnerClass();
    }

    public static LazyStaticInnerClass getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
