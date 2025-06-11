package com.geek.core.java.version.features.streams.questionbank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("apple", "banana", "cherry");
        Optional<String> longestString = inputList.stream().max(Comparator.comparingInt(input -> input.length()));
        // longestString = inputList.stream().max(Comparator.comparingInt(String::length));
        // inputList.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length())).orElse(null);
        System.out.println(longestString.get());


    }
}
