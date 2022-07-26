package com.revature;

public class Singleton {
    private static Singleton singleton;
    private String message;

    private Singleton() {
        //Constructor is private, so it can never be called from outside.
    }

    public static Singleton getSingleton() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void setSingleton(Singleton singleton) {
        Singleton.singleton = singleton;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
