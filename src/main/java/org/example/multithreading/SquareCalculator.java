package org.example.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareCalculator {
    private ExecutorService executor
        = Executors.newSingleThreadExecutor();

    public Future<Integer> calculate(Integer input) {
        return executor.submit(() -> {
            Thread.sleep(10000);
            return input * input;
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<Integer> future = new SquareCalculator().calculate(10);

        while(!future.isDone()) {
            System.out.println("Calculating...");
            Thread.sleep(300);
        }

        Integer result = future.get();
        System.out.println(String.format("done %d" , result));
        //The difference between get(long, TimeUnit) and get() is that the former will throw a
        // TimeoutException if the task doesn’t return before the specified timeout period.
    }
}
