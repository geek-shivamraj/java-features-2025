package com.geek.core.java.version.features.streams.questionbank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("apple", "banana", "orange", "apple", "banana", "orange", "banana", "orange", "grapes");

        Map<String, Long> output = inputList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(output);


        Map<String, Integer> frequency = new HashMap<>();
        inputList.stream().forEach(word -> {
            if(Objects.isNull(frequency.get(word))) {
                frequency.put(word, 1);
            } else {
                Integer count = frequency.get(word);
                frequency.put(word, ++count);
            }
        });
        System.out.println(frequency);
    }
}
