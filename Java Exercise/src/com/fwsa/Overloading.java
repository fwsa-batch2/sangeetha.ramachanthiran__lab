package com.fwsa;

public class Overloading {
    // Method Overloading => name of the method is same but the parameters are different.
    static int add(int a, int b) {
        return a + b;
    }
    static float add(float c, float d) {
        return c / d;
    }

    public static void main(String[] args) {
        System.out.println("hello");
        int intResult = add(12,13);
        float floatResult = add(16, 14);
        System.out.println(intResult);
        System.out.println(floatResult);
    }

}
