package test;
import java.io.*;
import java.util.*;
public class Solution {
       static boolean test;
       static int breadth,height;

       static {
           Scanner sc = new Scanner(System.in);
            breadth = sc.nextInt();
            height = sc.nextInt();
           if(breadth>0 && height>0)
           {
               test = true;
           }
           else
           {
               System.out.println("java.lang.Exception: Breadth and height must be positive");
           }
       }
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            if(test){
                int area=breadth*height;
                System.out.print(area);
            }
        }
    }

