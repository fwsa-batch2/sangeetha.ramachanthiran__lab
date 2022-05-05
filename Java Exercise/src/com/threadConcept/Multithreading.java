package com.threadConcept;

public class Multithreading implements Runnable{
    public void run() {
        System.out.println(Thread.interrupted());
//        Thread.yield();
        int num1 = 14;
        int num2 = 16;
        int output = num1 + num2;
        System.out.println("I am threading!!");
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        System.out.println(output);

    }
    public static void main(String[] args) {
        Multithreading thread = new Multithreading();
        Thread threadObj = new Thread(thread);
        threadObj.start();
        threadObj.interrupt();

//        System.out.println("Threading concept");
    }
}
