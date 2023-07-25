package org.example.callable;

import org.example.multithreading.MyThread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class Main implements Callable<Thread> {
    @Override
    public Thread call() throws Exception {
        Thread.sleep(1000);
        //return the thread name executing this callable task
        return Thread.currentThread();
    }

    public static void main(String args[]){
        //Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //create a list to hold the Future object associated with Callable
        List<Future<Thread>> list = new ArrayList<>();
        //Create MyCallable instance
        Callable<Thread> callable = new Main();
        MyThread myThread = null;
        for(int i=0; i< 10; i++){
            myThread =new MyThread("t" + i);
            //submit Callable tasks to be executed by thread pool
            Future<Thread> future = (Future<Thread>) executor.submit(myThread);
            //add Future to the list, we can get return value using Future
            list.add(future);
        }
        for(Future<Thread> fut : list){
                System.out.println(new Date());
        }
        //shut down the executor service now
        executor.shutdown();
        System.out.println("MyThreads has been started----------------------------------------------------------------");
    }
}
