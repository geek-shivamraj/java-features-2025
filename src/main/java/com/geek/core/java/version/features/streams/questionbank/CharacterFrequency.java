package com.geek.core.java.version.features.streams.questionbank;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("apple", "banana", "orange", "apple", "banana", "orange", "banana", "orange", "grapes");

        Map<Character, Long> characterFrequency = inputList.stream().flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(characterFrequency);
    }
}
