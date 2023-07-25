package org.example.threadsafety.volatileThreadSafety;

public class ThreadSafetyVolatile {

    public static void main(String[] args) throws InterruptedException {

        ProcessingThread pt = new ProcessingThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();
        Thread t3 = new Thread(pt, "t3");
        t3.start();
        //wait for threads to finish processing
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Processing count="+pt.getCount());
    }

}

class ProcessingThread implements Runnable{
    private int count = 0;

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0; i < 1000; i++){
            System.out.println(t.getName());
            processSomething(i);
        }
    }

    public int getCount() {
        return this.count;
    }

    private void processSomething(int i) {
        // processing some job
        try {
            this.count++;
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
