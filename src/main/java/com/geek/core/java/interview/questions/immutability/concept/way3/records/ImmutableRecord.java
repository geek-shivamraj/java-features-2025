package com.geek.core.java.interview.questions.immutability.concept.way3.records;

import java.util.ArrayList;
import java.util.List;

/**
 *  Way 3 - Immutable class using Record<p>
 *
 *  - In Java, the record feature (in Java 16), provides a concise way to create immutable classes.<p>
 *  - Java records help reduce the boilerplate code by generating the constructors and getters at compile time.<p>
 *  - Records are inherently immutable because their fields are final & can't be modified after the object is created.<p>
 *
 *  They can also help create immutable classes with very few lines of code.<p>
 *
 *  Notes: But Records only offer shallow immutability.<p>
 *
 *  Recommendation - Use record only if all fields are immutable types like String, int, or other records.<p>
 *
 *  Key Features of Records for Immutability<p>
 *      1. Final Fields: All fields in a record are final and cannot be reassigned.<p>
 *      2. No Setters: Records do not allow setter methods, ensuring immutability.<p>
 *      3. Compact Syntax: Records reduce boilerplate code while maintaining immutability.<p>
 *
 */

public record ImmutableRecord(String name, int age, List<String> items) {

    public ImmutableRecord(String name, int age, List<String> items) {
        this.name = name;
        this.age = age;
        this.items = new ArrayList<>(items);
    }

    public List<String> getItems(List<String> items) {
        return new ArrayList<>(items);
    }

    @Override
    public String toString() {
        return "ImmutableRecord{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", items=" + items +
                '}';
    }
}
