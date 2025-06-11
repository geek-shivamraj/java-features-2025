package com.geek.core.java.version.features.streams.questionbank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream()).sorted().toList();
        System.out.println(mergedList);

    }
}
