package com.package2;
import java.lang.Throwable;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {

        try{
            Scanner in = new Scanner(System.in);
            int num = 100/10;
            System.out.println(num);System.out.println(num);
            float a = in.nextInt()/0;
            System.out.println(a);
            int[] array = {1,2,3};
            System.out.println(array[10]);

        }
        catch (ArithmeticException e){
            System.out.println("Wrong");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException -- Wrong");
        }
    }
}






