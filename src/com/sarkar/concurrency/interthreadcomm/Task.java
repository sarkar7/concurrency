package com.sarkar.concurrency.interthreadcomm;

public class Task implements Runnable {

    int total = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total += 100;
            }
            this.notify();
        }

    }
}
