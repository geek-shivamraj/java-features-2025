package com.geek.core.java.version.features.streams.concepts.lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream.of
 *  1. It's a varagrs method that can create a stream from individual values or from an arrays of objects.
 *      However, when used with primitive arrays, Stream.of() treats the entire array as a single element,resulting in a stream
 *          rather than a specialized stream like IntStream.
 *  2. Stream.of() is useful when dealing with individual elements or object arrays.
 *  3. For Object arrays, both Arrays.stream() & Stream.of() work similarly but Stream.of() offers more flexibility
 *       by allowing the creation of a stream from individual elements without requiring an array.
 */
public class StreamOfExample {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        Stream<int[]> stream = Stream.of(input);
        System.out.println(stream);

        //stream.filter(p -> p%2 == 0); // p is int[] here

        List<Integer> listFromArray = Arrays.stream(input).filter(p -> p%2==0).boxed().toList();
        System.out.println(listFromArray);
    }
}
