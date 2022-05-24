package test;
import java.io.*;
import java.security.Permission;
import java.util.*;

import static java.lang.Integer.parseInt;

public class IntToString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int integer = scan.nextInt();
        String s = String.valueOf(integer);
        System.out.println(s.getClass().getSimpleName());
        System.out.println(s);
        if(integer <= -100 && integer <= 100){
            if ( integer == Integer.parseInt(s)){
                System.out.println("Good Job");
            }
            else {
                System.out.println("Wrong answer");
            }
        }
    }
}


