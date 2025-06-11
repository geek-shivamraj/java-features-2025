package com.geek.core.java.interview.questions.immutability.concept.way2.builderPattern;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 *  Way 2 - Immutable Class with Builder Pattern
 *
 *  - Use a Builder class to construct the immutable object.
 *  - Ensure all fields are final & private
 *  - Handle mutable fields with defensive copies. This approach ensures our class remains
 *      immutable while providing flexibility during object creation.
 */

@Getter
@ToString
public final class ImmutableBuilderClass {
    private final String name;
    private final int age;
    private final List<String> items;

    private ImmutableBuilderClass(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.items = new ArrayList<>(builder.items);    // Defensive Copy
    }

    public List<String> getItems() {
        return new ArrayList<>(items);          // Return a copy
    }

    // Static Nested builder class
    public static class Builder {
        private String name;
        private int age;
        private List<String> items;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setItems(List<String> items) {
            this.items = new ArrayList<>(items);    // Defensive copy
            return this;
        }

        public ImmutableBuilderClass build() {
            return new ImmutableBuilderClass(this);
        }
    }
}
