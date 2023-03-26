package com.sarkar.concurrency.basics;

public class Thread1 extends Thread {

    public Thread1(String threadName) {
        super.setName(threadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            //System.out.println("inside " + Thread.currentThread() + " " + i);
            System.out.println("inside " + Thread.currentThread().getName() + " " + i);
        }
    }
}
