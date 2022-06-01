package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AvgOfArray {
    public static void main(String[] args) {
        System.out.println("How many values");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i=0; i<=len; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
    }
}
