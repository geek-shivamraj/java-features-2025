package com.geek.core.java.version.features.functions.example1;

import java.util.function.Function;

/**
 * Function is a functional interface & hence it can refer lambda expression
 *
 *  Functions are exactly same as Predicates except the Functions can return any type of result
 *  but Function should(can) return only one value and that value can be any type as per our requirement.
 */
public class FunctionsExample {
    public static void main(String[] args) {

        System.out.println("Function: Find length of a given string");
        Function<String, Integer> function1 = str -> str.length();
        System.out.println("[Input: Shivam] length : " + function1.apply("shivam"));
    }
}
