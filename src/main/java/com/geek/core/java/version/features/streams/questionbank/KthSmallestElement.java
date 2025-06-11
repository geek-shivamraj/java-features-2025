package com.geek.core.java.version.features.streams.questionbank;

import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] inputs = {4, 2, 7, 1, 5, 3, 6};
        int k = 1;
        int output = Arrays.stream(inputs).sorted().skip(k - 1).findFirst().orElse(-1);
        System.out.println(output);
    }
}
