package com.geek.core.java.version.features.streams.concepts.lists;

import java.util.Arrays;
import java.util.List;

/**
 * Arrays.asList
 *  1. mutable but with limitations i.e., we can modify element but we can't change the size i.e., (no add/remove operation)
 *  2. Does allow null values
 *  3. Not Thread safe as it's backed by an array, which can be modified in multiple thread without synchronization
 *  4. Suitable for larger, dynamic data sets where we need to modify elements but not the size of the list
 *      (Useful in case working with existing arrays)
 *  5. Returns a list backed by the original array. Changes to the array are reflected in the list
 *
 */
public class ArraysasListExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", null);
        list.set(1, "grapes");
        System.out.println("List: " + list);
        //list.add("orange");     // UnsupportedOperationException

        // 5. Returns a list backed by the original array. Changes to the array are reflected in the list
        String[] array = {"One", "two", "three"};
        System.out.println("Unmodified Array: " + Arrays.toString(array));
        List<String> listFromArray = Arrays.asList(array);
        array[0] = "Four";
        System.out.println("Modified Array: " + Arrays.toString(array));
        System.out.println("List from Array: " + listFromArray);
    }
}
