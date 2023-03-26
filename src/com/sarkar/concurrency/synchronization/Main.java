package com.sarkar.concurrency.synchronization;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Service service = new Service();

        Thread thread1 = new Thread(service::increment, "thread1");
        Thread thread2 = new Thread(service::decrement, "thread2");

        thread1.start();
        thread2.start();

        Thread.sleep(100);

        System.out.println(service.count);


    }
}
