package com.sarkar.concurrency.basics;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread is starting");

        Thread1 thread1 = new Thread1("thread1");
        //thread1.setDaemon(true);
        thread1.start();

        Thread thread = new Thread(new Thread2(), "thread2");
        thread.start();

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("inside " + Thread.currentThread().getName() + " " + i);
            }
        },"thread3");
        thread3.start();

        System.out.println("Main thread is executing");

    }
}
