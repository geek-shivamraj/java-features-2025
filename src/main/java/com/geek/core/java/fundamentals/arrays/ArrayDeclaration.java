package com.geek.core.java.fundamentals.arrays;

public class ArrayDeclaration {
    public static void main(String[] args) {

        // Valid 1D array declaration
        int[] x1; int []x2; int x3[];

        // Valid 2D array declaration
        int[][] y1; int [][]y2; int y3[][];
        int[] y4[]; int[] []y5; int []y6[];

        int[] a1,b1;        // a1 -> 1, b1 -> 1
        int[] a2[], b2;     // a2 -> 2, b2 -> 1
        int[] []a3, b3;     // a3 -> 2, b3 -> 2
        int[] []a4, b4[];   // a4 -> 2, b4 -> 3
    }
}
