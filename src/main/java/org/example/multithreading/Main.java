package org.example.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
        Thread t2 = new Thread(new HeavyWorkRunnable(), "t2");
        Thread t3 = new MyThread("t3");
        Thread t4 = new MyThread("t4");
        executor.submit(t1);
        executor.submit(t3, t4);
        executor.shutdown();
        
        System.out.println("MyThreads has been started");
    }
}
