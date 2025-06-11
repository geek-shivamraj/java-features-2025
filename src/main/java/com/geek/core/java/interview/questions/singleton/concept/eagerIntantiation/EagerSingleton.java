package com.geek.core.java.interview.questions.singleton.concept.eagerIntantiation;

/**
 * Way 1: Eager Initialization
 *
 * To make a class Singleton in Java, we ensure only one instance exists & provide a global access point.
 *
 *  Eager/Early Instantiation:
 *      - This approach creates the instance at the time of class loading
 *
 *  Pros:
 *      - Simple & thread-safe without synchronization
 *  Cons:
 *      - Instance is created even if it's never used, potentially wasting resource
 */

public class EagerSingleton {

    // To be shared among all
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        // private constructor - To prevent from direct instantiation.
    }

    // Returns the single instance of the class using class name.
    public static synchronized EagerSingleton getInstance() {
        return instance;
    }
}
