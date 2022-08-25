package com.revature;

import java.util.Deque;

public class Producer extends Thread{
    Deque<Integer> buffer;
    int maxBufferSize = 10;

    public Producer(Deque<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        synchronized(buffer) {
            for(int i = 0; i < 20; i++) {


                try {
                    if (buffer.size() >= maxBufferSize) {
                        buffer.wait();
                    }

                    buffer.addLast((int) (Math.random() * 100));
                    buffer.notify();
                    buffer.wait(500);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
