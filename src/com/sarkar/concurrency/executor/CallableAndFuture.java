package com.sarkar.concurrency.executor;

import java.util.Random;
import java.util.concurrent.*;

public class CallableAndFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // get the number of cores
        int coreCount = Runtime.getRuntime().availableProcessors();

        // create the pool
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

        // submit the task for execution
        // Future is nothing but a placeholder which will arrive in sometimes in future
        Future<Integer> future = service.submit(new Task());

        // perform some unrelated operation

        // let's say after 1 sec
        Integer result = future.get();

        System.out.println("Thread Name: " + Thread.currentThread().getName());

    }

    static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            Thread.sleep(3000);
            return new Random().nextInt();
        }
    }

    /*
    static class Task implements Runnable {
        public void run() {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            // return is not possible
        }
    }
    */

}
