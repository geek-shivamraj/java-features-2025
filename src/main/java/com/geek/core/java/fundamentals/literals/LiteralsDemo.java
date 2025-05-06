package com.geek.core.java.fundamentals.literals;

public class LiteralsDemo {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Decimal literal: " + x);
        x = 010;    // Octal literals prefixed with 0
        System.out.println("Octal literal: " + x);
        x = 0X10;   // Hexadecimal literals prefixed with 0x or 0X
        x = 0xFace;
        System.out.println("Hexadecimal literal: " + x);

    }
}
