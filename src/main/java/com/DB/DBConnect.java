package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Utility class for establishing database connection.
 */
public class DBConnect {
    private static Connection conn;

    /**
     * Retrieves the database connection.
     * 
     * @return The Connection object representing the database connection.
     */
    public static Connection getConn() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamezplus", "root", "Nish@_-.41212");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
