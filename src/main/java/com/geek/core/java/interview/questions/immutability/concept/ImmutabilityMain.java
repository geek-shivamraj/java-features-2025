package com.geek.core.java.interview.questions.immutability.concept;

import com.geek.core.java.interview.questions.immutability.concept.way1.finalClassAndFields.ImmutableClass;
import com.geek.core.java.interview.questions.immutability.concept.way2.builderPattern.ImmutableBuilderClass;
import com.geek.core.java.interview.questions.immutability.concept.way3.records.ImmutableRecord;

import java.util.ArrayList;
import java.util.List;

/**
 *  Once we create an object, we can't perform any changes in that object,<p>
 *    Case 1: If we're trying to perform any change or if there is a change in the content then with those changes a new object will be created.<p>
 *    Case 2: If there is no change in the content then existing object will be reused.<p>
 *  This behavior is called Immutability. <p>
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
 * Recommendation - Use record only if all fields are immutable types like String, int, or other records.<p>
 *
 */
public class ImmutabilityMain {
    public static void main(String[] args) {

        // Way 1
        System.out.println("\nImmutable class using Traditional Approach: ");
        List<String> items1 = new ArrayList<>(List.of("apple", "orange"));
        ImmutableClass immutableClass = new ImmutableClass("Fruits", 25, items1);
        System.out.println(immutableClass);

        items1.add("grapes");
        System.out.println(immutableClass);

        // Way 2
        System.out.println("\nImmutable class using Builder pattern: ");
        List<String> items2 = new ArrayList<>(List.of("apple", "orange"));
        ImmutableBuilderClass immutableBuilderClass = new ImmutableBuilderClass.Builder()
                                                            .setName("Fruits").setAge(25).setItems(items2).build();
        System.out.println(immutableBuilderClass);

        items2.add("grapes");
        System.out.println(immutableBuilderClass);

        // Way 3
        System.out.println("\nImmutable class using Record: ");
        List<String> items3 = new ArrayList<>(List.of("apple", "orange"));
        ImmutableRecord immutableRecord = new ImmutableRecord("Fruits", 25, items3);
        System.out.println(immutableRecord);

        items3.add("grapes");
        System.out.println(immutableRecord);
    }
}
