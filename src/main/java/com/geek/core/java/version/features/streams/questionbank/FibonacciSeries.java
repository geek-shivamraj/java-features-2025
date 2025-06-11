package com.geek.core.java.version.features.streams.questionbank;

import java.util.List;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> fibonacciSeries = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(n).map(t -> t[0])
                .toList();
        System.out.println(fibonacciSeries);
    }
}
