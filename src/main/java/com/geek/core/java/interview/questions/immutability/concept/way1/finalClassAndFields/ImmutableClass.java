package com.geek.core.java.interview.questions.immutability.concept.way1.finalClassAndFields;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 *  Way 1 - Immutable class using Traditional approach
 *
 *  By following below steps, we can ensure that our class is immutable & thread-safe<p>
 *  Step 1 - Define a class as final: This prevents other classes from extending it & altering its behavior. <p>
 *  Step 2 - Make all fields private & final: This ensures that field can't be directly accessed or modified after initialization. <p>
 *  Step 3 - Initialize fields via a constructor: Provides a constructor to set the values of the fields during object creation<p>
 *  Step 4 - Don't provide "setter" method: Avoid any methods that modify the fields. <p>
 *  Step 5 - Provides only "getter" method: Ensure the getter methods return the field values but don't allow modification. <p>
 *  Step 6 - Handle mutable fields carefully: If the class contains mutable fields (e.g., Date, List), return a deep copy or
 *              an immutable version of the field in the getter method. <p>
 *  Step 7 - Avoid exposing "this" reference during construction: Don't allow "this" reference to escape during object creation
 *              (e.g., by passing it to another method or thread) <p>
 *
 */

@Getter
@ToString
public final class ImmutableClass {
    private final String name;
    private final int age;
    private final List<String> items;

    public ImmutableClass(String name, int age, List<String> items) {
        this.name = name;
        this.age = age;
        this.items = new ArrayList<>(items);                     // Defensive copy
    }

    public List<String> getItems() {
        return new ArrayList<>(items);          // Return a copy
    }

}
