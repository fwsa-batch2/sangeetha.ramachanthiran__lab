package com.threadConcept;
import java.util.*;
public class ClassThread extends Thread{
     public static void main(String[] args) {
         ClassThread obj = new ClassThread();
         obj.start();
         obj.start();
         obj.start();
//        for(int i=0; i<5; i++ ) {

//            obj.setName("sangee");
//            obj.setName("hasan");
//            System.out.println(Thread.currentThread().getName());
//        }
        System.out.println( Thread.currentThread().getName());
    }
    synchronized public void run() {
//         for (int i=1; i< 15; i++){
             System.out.println( Thread.currentThread().getName());
//         }
        System.out.println("I am a Class thread");
//        System.out.println();
    }
}
