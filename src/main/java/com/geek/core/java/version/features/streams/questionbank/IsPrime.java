package com.geek.core.java.version.features.streams.questionbank;

import java.util.Arrays;
import java.util.List;

public class IsPrime {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 10, 11, 12);
        boolean containsPrime = numbers.stream().anyMatch(IsPrime::isPrime);
        System.out.println("List contains Prime number: " + containsPrime);
    }

    public static boolean isPrime(int number) {
        if(number <= 1)
            return false;

        for(int i = 2; i < Math.sqrt(number); i++) {
            if(number%i == 0)
                return false;
        }
        return true;
    }
}
