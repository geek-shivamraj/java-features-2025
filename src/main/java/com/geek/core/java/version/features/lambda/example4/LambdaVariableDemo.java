package com.geek.core.java.version.features.lambda.example4;

public class LambdaVariableDemo {
    int x = 777;

    public static void main(String[] args) {
        new LambdaVariableDemo().m2();
    }

    /**
     *  1. Within lambda expression, this keyword represents outer class object reference
     *  2. Inside lambda expression, we can't declare variables.
     *  3. Variables declared inside lambda expression are local variables only.
     *  4. We can access enclosing class variables & enclosing method variables directly.
     *  5. Local variables referenced from lambda expression are implicitly final & hence we can't perform re-assignment
     *      for those local variables otherwise we get compile time error
     */
    public void m2() {
        int y = 999;
        Interf interf = () -> {
            int x = 888;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(y);
            // y = 666;  // Not valid, compile time error
        };
        interf.m1();
    }
}

interface Interf {
    public void m1();
}
