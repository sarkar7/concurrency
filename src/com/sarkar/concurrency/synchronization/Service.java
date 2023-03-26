package com.sarkar.concurrency.synchronization;

public class Service {

    int count = 0;

    public void increment() {
        for (int i = 1; i <= 10000; i++) {
            count += i;
        }
    }

    public void decrement() {
        for (int i = 1; i <= 10000; i++) {
            count -= i;
        }
    }

}
