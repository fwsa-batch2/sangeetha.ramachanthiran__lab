package test;
import com.designpattern.SingletonExercise;

import java.util.*;

public class SingletonSolution {
    public String str;
    private SingletonSolution(){}
    public static String getSingleInstance(String str){
        System.out.println("Hello I am a singleton! Let me say " +str+ " to you");
       return str;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        SingletonSolution input_1 = new SingletonSolution();

        input_1.getSingleInstance(sc.nextLine());
    }
}
