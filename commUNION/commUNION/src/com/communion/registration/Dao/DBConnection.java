package com.communion.registration.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Kigali13";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/communion";

    public static Connection getConnection(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection conn = null;


        try {
        conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
        System.out.println("connected");
    } catch (
    SQLException e) {
        e.printStackTrace();
        System.out.println("not connected");
    }
        return conn;


}
}
