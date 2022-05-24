package test;
import java.util.*;

public class Sol {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A =sc.next();
        String B =sc.next();
        System.out.println(A.length() + B.length());
        int compared = A.compareTo(B);
        if (compared > 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */
        String upperA = A.substring(0,1).toUpperCase();
//        System.out.println(upperA);
        String upperB = B.substring(0,1).toUpperCase();
//
//        for (int i=1; i< upperA.length(); i++) {
//            System.out.print(upperA.charAt(i));
//        }
//        System.out.print(upperB);
//        for (int i=1; i< upperB.length(); i++) {
//            System.out.print(upperB.charAt(i));
//        }
        System.out.println(upperA + A.substring(1,A.length()) + " " + upperB + B.substring(1,B.length()));
    }
}
