package com.sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // Update USER and PASS with your MySQL credentials
    private static final String URL = "jdbc:mysql://localhost:3306/student_management";
    private static final String USER = "root";       // your MySQL username
    private static final String PASS = "root"; // your MySQL password

    // Method to get database connection
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Main method to test connection
    public static void main(String[] args) {
        Connection con = getConnection();
        if (con != null) {
            System.out.println("Connection successful!");
        } else {
            System.out.println("Connection failed!");
        }
    }
}
