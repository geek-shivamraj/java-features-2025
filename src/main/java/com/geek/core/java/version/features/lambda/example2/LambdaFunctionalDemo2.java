package com.geek.core.java.version.features.lambda.example2;

public class LambdaFunctionalDemo2 {
    public static void main(String[] args) {
        Interf1 interf1 = (a,b) -> System.out.println("Sum: " + (a + b));
        interf1.sum(10, 20);

        Interf2 interf2 = (a, b) -> a + b;
        int sum = interf2.sum(20, 30);
        System.out.println("Sum with return type: " + sum);
    }
}

@FunctionalInterface
interface Interf1 {
    // method declaration
    void sum(int a, int b);
}

@FunctionalInterface
interface Interf2 {
    // method declaration
    int sum(int a, int b);
}
