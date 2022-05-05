package com.threadConcept;

public class RunnableThread implements Runnable{
    public void run() {
        System.out.println("I am Runnable Thread");
    }

    public static void main(String[] args) {
        Thread a = new Thread(new RunnableThread());
        a.start();
    }
}
