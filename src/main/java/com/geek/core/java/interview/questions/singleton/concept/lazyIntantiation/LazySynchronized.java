package com.geek.core.java.interview.questions.singleton.concept.lazyIntantiation;

/**
 * Way 2: Lazy initialization with synchronized
 *
 * To make a class Singleton in Java, we ensure only one instance exists & provide a global access point.
 *
 * Steps:
 *  1. Make the constructor private
 *  2. Create a private static instance of the class
 *  3. Provide a public static method to get the instance
 *
 *  Lazy Instantiation (Thread-safe with Synchronization)
 *      - The instance is created only when it's needed, with synchronization to ensure thread safety.
 *
 *  Pros:
 *      - Instance is created only when required.
 *  Cons:
 *      - Synchronization can reduce performance in multi-threaded environment.
 */

public class LazySynchronized {

    private static LazySynchronized instance;

    private LazySynchronized(){
        // private constructor
    }

    public static synchronized LazySynchronized getInstance() {
        if(instance == null)
            instance = new LazySynchronized();
        return instance;
    }
}
