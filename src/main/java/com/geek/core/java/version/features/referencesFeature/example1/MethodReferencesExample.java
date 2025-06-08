package com.geek.core.java.version.features.referencesFeature.example1;

/**
 * FunctionalInterface method can be mapped to our specified method by using :: (double colon) operator. This is called Method Reference.
 * Our specified method can be either static method or instance method.
 *
 * FunctionalInterface can refer lambda exp & FunctionalInterface can also refer Method Reference.
 * Hence, lambda exp can be replaced with method reference.
 *
 * Syntax:
 *      1. If specified method is static method: Classname::methodName
 *      2. If specified method is instance method: ObjRef::methodName
 *
 */
public class MethodReferencesExample {
    public static void main(String[] args) {

        // Using Lambda Expression
        Runnable r1 = () -> {
            for(int i = 0; i < 10; i++) {
                System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
            }
        };
        Thread thread1 = new Thread(r1);
        thread1.start();
        for(int i = 0; i < 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
        }

        // Using Method Reference - Static method
        Runnable r2 = MethodReferencesExample::m1;
        Thread thread2 = new Thread(r2);
        thread2.start();
        for(int i = 0; i < 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
        }

        // Using Method Reference - Instance method
        MethodReferencesExample referencesObj = new MethodReferencesExample();
        Runnable r3 = referencesObj::m2;
        Thread thread3 = new Thread(r3);
        thread3.start();
        for(int i = 0; i < 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void m1() {
        for(int i = 0; i < 10; i++) {
            System.out.println("[Static Method] Thread " + Thread.currentThread().getName() + " : " + i);
        }
    }

    public void m2() {
        for(int i = 0; i < 10; i++) {
            System.out.println("[Instance Method] Thread " + Thread.currentThread().getName() + " : " + i);
        }
    }
}
