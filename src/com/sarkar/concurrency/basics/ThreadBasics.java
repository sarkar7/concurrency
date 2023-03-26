package com.sarkar.concurrency.basics;

public class ThreadBasics {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        Thread thread1 = new Thread(
                () -> System.out.println(Thread.currentThread().getName()),
                "thread1"
        );

        Thread thread2 = new Thread(
                () -> System.out.println(Thread.currentThread().getName()),
                "thread2"
        );

        thread1.start();
        thread2.start();

    }

}
