package com.revature;

public class SharedResource {
    Integer sum = 0;

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public void increment() {
        synchronized(this) {
            this.sum = getSum() + 1;
        }


    }
}
