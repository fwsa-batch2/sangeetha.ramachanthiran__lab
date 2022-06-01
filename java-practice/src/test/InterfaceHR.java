package test;
  import java.util.*;
    interface AdvancedArithmetic{
        int divisor_sum(int n);
    }
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                // System.out.printf("%d", i);
            }
        }
        return sum;
    }
    }
//Write your code here

    class InterfaceHR {
        public static void main(String[] args) {
            MyCalculator my_calculator = new MyCalculator();
            System.out.print("I implemented: ");
            ImplementedInterfaceNames(my_calculator);
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            System.out.println(my_calculator.divisor_sum(n) + "\n");
            sc.close();
        }

        /*
         *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
         */
        static void ImplementedInterfaceNames(Object o) {
            Class[] theInterfaces = o.getClass().getInterfaces();
            for (int i = 0; i < theInterfaces.length; i++) {
                String interfaceName = theInterfaces[i].getName();
                System.out.println(interfaceName);
            }
        }
    }

//import java.io.*;
//import java.util.*;

//public class InterfaceHR {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n; i++){
//            if(n/i == 0) {
//                System.out.printf("%d", i);
//            }
//        }
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//
//    }
//
//}


