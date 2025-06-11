package com.geek.core.java.interview.questions.singleton.example1;

public class SingletonUseCaseMain {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        System.out.println("Hashcode: " + instance1.hashCode() + ", Instance1: " + instance1);

        Singleton instance2 = Singleton.getInstance();
        System.out.println("Hashcode: " + instance1.hashCode() + ", Instance2: " + instance2);

        instance2.setInput("Hello I am an attribute of Singleton class. Now modified value");

        System.out.println("Hashcode: " + instance1.hashCode() + ", Instance1: " + instance1);
        System.out.println("Hashcode: " + instance1.hashCode() + ", Instance2: " + instance2);

        instance1.setInput("Hello I am an attribute of Singleton class. Now again modified value");

        System.out.println("Hashcode: " + instance1.hashCode() + ", Instance1: " + instance1);
        System.out.println("Hashcode: " + instance1.hashCode() + ", Instance2: " + instance2);
    }
}
