package com.geek.core.java.interview.questions.singleton.concept.lazyIntantiation;

/**
 *
 * Way 4 - Double-checked locking
 *
 * To make a class Singleton in Java, we ensure only one instance exists & provide a global access point.
 *
 *  Optimized version of lazy initialization. It reduces the overhead of synchronization by checking the instance twice.
 *
 *  Pros:
 *      - Lazy Instantiation, thread-safe & avoid synchronization overhead
 *  Cons:
 *      - Slightly more complex to implement
 */

public class LazyDoubleCheckedLock {

    private static volatile LazyDoubleCheckedLock instance;

    private LazyDoubleCheckedLock(){}

    public static LazyDoubleCheckedLock getInstance() {
        if(instance == null) {
            synchronized (LazyDoubleCheckedLock.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckedLock();
                }
            }
        }
        return instance;
    }
}
