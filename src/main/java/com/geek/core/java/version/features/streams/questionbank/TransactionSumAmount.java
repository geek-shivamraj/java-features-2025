package com.geek.core.java.version.features.streams.questionbank;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *  Find the sum of transaction amounts for each day
 */
public class TransactionSumAmount {
    public static void main(String[] args) {
        List<Transaction> transactionList = List.of(new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200), new Transaction("2022-01-02", 300),
        new Transaction("2022-01-02", 400), new Transaction("2022-01-03", 500));
        //int sum = transactionList.stream().mapToInt(Transaction::amount).sum();
        //System.out.println(sum);

        Map<String, Integer> output = transactionList.stream()
                .collect(Collectors.groupingBy(Transaction::date, Collectors.summingInt(Transaction::amount)));
        System.out.println(output);
    }
}

record Transaction(String date, Integer amount){}
