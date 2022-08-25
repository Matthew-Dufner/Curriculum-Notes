package com.revature;

public class RunMe implements Runnable{

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for(int i = 0; i <= 10; i++) {
            System.out.println("Thread [" + threadName + "] current count: " + i);
        }
    }
}
