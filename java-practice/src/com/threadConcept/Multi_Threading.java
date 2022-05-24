package com.threadConcept;

    public class Multi_Threading implements Runnable {
        private int thread1;

        public static void main(String[] args) throws InterruptedException {
            System.out.println("Multi Threading");
            for(int i = 1 ; i < 5 ; i++) {
                Multi_Threading obj = new Multi_Threading();
                Thread thread = new Thread(obj);
                thread.start();
                thread.join();
            }
        }
        @Override
         synchronized public void run() {
            try {
                for(int i = 1; i < 6; i++){
//                if(Thread.currentThread().getId() == 17) {
//                    System.out.println(Thread.currentThread().getId());
//                      Thread.yield();
                    System.out.println(i + " from " +Thread.currentThread().getName());
//                    thread(i);
                }
            }catch (Exception err){
                err.printStackTrace();
            }
        }
//        synchronized static void thread(int i) throws Exception{
//            System.out.println(i + " from "+Thread.currentThread().getName());
////      System.out.println("Name "+ Thread.currentThread().getId());
////            Thread.sleep(600);
//        }
    }

