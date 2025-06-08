package com.geek.core.java.version.features.lambda.example1;

public class LambdaFunctionalDemo1 {
    public static void main(String[] args) {
        new Test().methodOne();

        // method definition using lambda expression
        Inter1 inter1 = () -> System.out.println("Lambda Expression: Method One Execution");
        // method call
        inter1.methodOne();
    }
}

@FunctionalInterface
interface Inter1 {
    void methodOne();
}

class Test {
    public void methodOne() {
        System.out.println("Without Lambda Expression: Method One Execution");
    }
}
