package com.geek.core.java.version.features.streams.questionbank;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("flower", "flow", "flight");

        String longestCommonPrefix = input.stream().reduce((s1, s2) -> {
            int length = Math.min(s1.length(), s2.length());
            int i = 0;
            while(i < length && s1.charAt(i) == s2.charAt(i)) {
                i++;
            }
            return s1.substring(0, i);
        }).orElse("");
        System.out.println(longestCommonPrefix);
    }
}
