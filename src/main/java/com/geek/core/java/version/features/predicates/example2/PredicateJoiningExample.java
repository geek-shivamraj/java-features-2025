package com.geek.core.java.version.features.predicates.example2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * and(), or(), negate()
 */
public class PredicateJoiningExample {
    public static void main(String[] args) {
        List<Integer> input = List.of(0, 5, 10, 15, 20, 25);
        Predicate<Integer> predicate1 = i -> i > 10;
        Predicate<Integer> predicate2 = i -> i % 2 == 0;
        System.out.println("Input list: " + input);
        System.out.println("Nos greater than 10 are : " + input.stream().filter(predicate1).toList());
        System.out.println("Nos less than 10 are : " + input.stream().filter(predicate1.negate()).toList());
        System.out.println("Even nos : " + input.stream().filter(predicate2).toList());
        System.out.println("Odd nos : " + input.stream().filter(predicate2.negate()).toList());
        System.out.println("Nos greater than 10 & Even are: " + input.stream().filter(predicate1.and(predicate2)).toList());
        System.out.println("Nos greater than 10 or Even are: " + input.stream().filter(predicate1.or(predicate2)).toList());
    }
}
