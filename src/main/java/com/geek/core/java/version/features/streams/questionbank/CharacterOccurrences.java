package com.geek.core.java.version.features.streams.questionbank;

import java.util.Arrays;
import java.util.List;

public class CharacterOccurrences {
    public static void main(String[] args){
        List<String> inputList = Arrays.asList("apple", "banana", "orange");
        char target = 'a';

        long count = inputList.stream().flatMapToInt(CharSequence::chars).filter(c -> c == target).count();
        System.out.println("Character count: " + count);
    }
}
