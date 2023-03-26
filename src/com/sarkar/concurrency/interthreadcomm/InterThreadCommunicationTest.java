package com.sarkar.concurrency.interthreadcomm;

public class InterThreadCommunicationTest {

    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread t0 = new Thread(task);
        t0.start();

        synchronized (task) {
            task.wait();
        }

        System.out.println("Total is " + task.total);

    }

}
