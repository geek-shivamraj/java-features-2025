package com.geek.core.java.version.features.predicates.example1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample1 {
    public static void main(String[] args) {

        System.out.println("Predicate: Integer greater than 10");
        Predicate<Integer> predicate1 = i -> i > 10;
        System.out.println("Input 11: " + predicate1.test(11));
        System.out.println("Input 5: " + predicate1.test(5));

        System.out.println("Predicate: String length greater than 3");
        Predicate<String> predicate2 = s -> s.length() > 3;
        System.out.println("String shivam: " + predicate2.test("shivam"));
        System.out.println("String ab: " + predicate2.test("ab"));

        System.out.println("Predicate: Collection is empty");
        Predicate<Collection> predicate3 = collection -> collection.isEmpty();
        List<Integer> input1 = List.of(1, 2);
        System.out.println("Input " + input1 + " : " + predicate3.test(input1));
        List<Integer> input2 = Collections.emptyList();
        System.out.println("Input " + input2 + " : " + predicate3.test(input2));
    }
}
