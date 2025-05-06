package com.geek.core.java.fundamentals.datatypes;

public class DataTypeSizes {

    private static byte b;
    private static short s;
    private static int i;
    private static long l;
    private static float f;
    private static double d;
    private static char c;
    private static boolean bool;

    public static void main(String[] args) {

        System.out.println("*********************");

        // boolean data type: Size & Range are Not Applicable.
        System.out.println("boolean default value: " + bool + "\n");

        System.out.println("byte default value: " + b);
        System.out.println("byte size: " + Byte.BYTES + " byte");
        System.out.println("byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + "\n");

        System.out.println("short default value: " + s);
        System.out.println("short size: " + Short.BYTES + " bytes");
        System.out.println("short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE + "\n");

        System.out.println("int default value: " + i);
        System.out.println("int size: " + Integer.BYTES + " bytes");
        System.out.println("int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + "\n");

        System.out.println("long default value: " + l);
        System.out.println("long size: " + Long.BYTES + " bytes");
        System.out.println("long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE + "\n");

        System.out.println("float default value: " + f);
        System.out.println("float size: " + Float.BYTES + " bytes");
        System.out.println("float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE + "\n");

        System.out.println("double default value: " + d);
        System.out.println("double size: " + Double.BYTES + " bytes");
        System.out.println("double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE + "\n");

        System.out.println("char default value: " + c);
        System.out.println("char size: " + Character.BYTES + " bytes");
        System.out.println("char range: " + Character.MIN_VALUE + " to " + Character.MAX_VALUE + "\n");
    }
}
