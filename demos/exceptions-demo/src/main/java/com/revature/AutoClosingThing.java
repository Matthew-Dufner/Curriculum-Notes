package com.revature;

public class AutoClosingThing implements AutoCloseable {
    private boolean open = false;


    public void open() {
        open = true;
    }

    @Override
    public void close() throws Exception {
        //We would use this to gracefully close out some resource, for instance shutting down a database
        //connection rather than just letting it go dark
        System.out.println("Auto-closing thing is closing...");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
}
