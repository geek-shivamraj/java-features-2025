package com.geek.core.java.version.features.streams.questionbank;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonDuplicateIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 4, 7, 9);
        Map<Integer, Long> frequencyMap = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        numbers.stream().filter(number -> frequencyMap.get(number) == 1).forEach(System.out::println);
    }
}
