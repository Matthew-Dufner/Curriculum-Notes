package com.revature;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Connecting...");
        Connection connection = ConnectionManager.getConnection();
        System.out.println("Done!");
    }
}
