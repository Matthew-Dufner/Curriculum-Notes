package com.revature;

import java.util.Deque;

public class Consumer extends Thread{
    Deque<Integer> buffer;

    public Consumer(Deque<Integer> buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        //consume
        for(int i = 0; i < 20; i++) {
            synchronized(buffer) {
                try {
                    if(buffer.size() == 0) {
                        buffer.wait();
                    }

                    System.out.println(buffer.pop());
                    buffer.notify();
                    buffer.wait(500);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
