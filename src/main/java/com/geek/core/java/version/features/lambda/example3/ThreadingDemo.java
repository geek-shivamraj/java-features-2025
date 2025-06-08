package com.geek.core.java.version.features.lambda.example3;

import lombok.SneakyThrows;

public class ThreadingDemo {
    @SneakyThrows
    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable();
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        for(int i = 0; i < 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
            //Thread.sleep(2000);
        }

        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                System.out.println("[With lambda Exp] - Thread " + Thread.currentThread().getName() + " : " + i);
            }
        });
        thread2.start();
        for(int i = 0; i < 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
            //Thread.sleep(2000);
        }
    }
}

class MyRunnable implements Runnable {

    @SneakyThrows
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("[Without lambda Exp] - Thread " + Thread.currentThread().getName() + " : " + i);
            //Thread.sleep(1000);
        }
    }
}
