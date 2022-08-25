package com.revature;

import java.util.Deque;
import java.util.List;

public class SynchronizedTest extends Thread{
    SharedResource resource;
    public SynchronizedTest(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            //resource.setSum(resource.getSum() + 1);
            resource.increment();
        }
    }
}
