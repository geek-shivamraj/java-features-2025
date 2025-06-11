package com.geek.core.java.version.features.streams.questionbank;

import java.util.Arrays;
import java.util.List;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> distinctElementList = inputList.stream().distinct().toList();
        System.out.println(distinctElementList);
    }
}
