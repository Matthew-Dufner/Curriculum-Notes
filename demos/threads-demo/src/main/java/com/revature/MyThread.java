package com.revature;

public class MyThread extends Thread{
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for(int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            System.out.println("Thread [" + threadName + "] current letter: " + c);
        }
    }
}
