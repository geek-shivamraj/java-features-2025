package com.geek.core.java.version.features.streams.concepts.lists;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Arrays.stream()
 *  1. Arrays.stream() method is specifically designed to create a stream from an array
 *      & is optimized for both primitive & object arrays.
 *          e.g., Array like int[] -> Arrays.stream() returns an IntStream directly, which avoids the overhead of boxing.
 *  2. Arrays.stream() is useful when dealing with arrays, especially primitive arrays.
 *  3. For Object arrays, both Arrays.stream() & Stream.of() work similarly but Stream.of() offers more flexibility
 *      by allowing the creation of a stream from individual elements without requiring an array.
 *
 */
public class ArraysStreamExample {
    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4};
        IntStream intStream = Arrays.stream(input);
        System.out.println(intStream);

        int[] filteredInput = intStream.filter(p -> p%2 == 0).toArray();
        System.out.println(Arrays.toString(filteredInput));
    }
}
