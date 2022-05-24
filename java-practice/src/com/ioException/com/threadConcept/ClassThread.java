package com.threadConcept;

public class ClassThread extends Thread{
    public void run() {
        System.out.println("I am a Class thread");
    }
    public static void main(String[] args) {
        ClassThread obj = new ClassThread();
        obj.start();
    }
}
