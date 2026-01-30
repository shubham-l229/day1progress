package com.edutech.progressive.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static void loadProperties(){
        
    }
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(null,null,null);
    }
}
