package com.geek.core.java.interview.questions.singleton.concept.enumSingleton;

/**
 * Enum Singleton:
 *
 * Using an enum is simplest & most robust way to implement a singleton in java.
 * It is inherently thread-safe & protects against Serialization/Deserialization issues.
 *
 * Pros:
 *      - Simplest, thread-safe & handles serialization automatically
 * Cons:
 *      - Limited Flexibility (e.g., can't extend other classes)
 *
 *  why enum ?
 *      - An enum type has no instance other than those defined by its enum constants.
 *      - Compile time error to attempt to explicit instantiate an enum type.
 *      - The final clone method in Enum ensures that enum constants can never be cloned
 *      - The special treatment by the serialization mechanism ensures that duplicate instances are never created as a result of deserialization.
 *      - Reflective instantiation of enum types is prohibited.
 *
 *   Together above points ensure that no instances of an enum type exist beyond those defined by the enum constants.
 *
 */
public enum Singleton {
    INSTANCE;

    public void someMethod() {
        // Your logic here
    }
}
