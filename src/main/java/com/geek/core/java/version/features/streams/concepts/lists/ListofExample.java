package com.geek.core.java.version.features.streams.concepts.lists;

import java.util.Arrays;
import java.util.List;

/**
 * List.of
 *  1. immutable i.e., we can't add/remove modify elements after creation.
 *  2. Doesn't allow null values
 *  3. Thread safe since no modification can occur
 *  4. Suitable for small, static data sets where immutability is desired. It provides better data integrity & thread safety.
 *  5. Creates an independent copy of the provided elements i.e., changes to the original array don't affect the list.
 *
 */

public class ListofExample {
    public static void main(String[] args) {

        List<String> list1 = List.of("apple", "banana");
        // list1.add("grapes");  // UnsupportedOperationException

        // 5. Creates an independent copy of the provided elements i.e., changes to the original array don't affect the list.
        String[] array = {"One", "two", "three"};
        System.out.println("Unmodified Array: " + Arrays.toString(array));
        List<String> listFromArray = List.of(array);
        array[0] = "Four";
        System.out.println("Modified Array: " + Arrays.toString(array));
        System.out.println("List from Array: " + listFromArray);

    }
}
