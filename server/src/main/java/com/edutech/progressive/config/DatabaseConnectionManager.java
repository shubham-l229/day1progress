package com.edutech.progressive.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;

public class DatabaseConnectionManager {

    private static final Properties properties = new Properties();

    static {
        loadProperties();
    }
    private static void loadProperties(){
        try(InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")) {
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // @Autowired

    // private static Environment env;
    // private static void loadProperties(){
    //     String url = env.getProperty("spring.datasource.url");
    //     String username = env.getProperty("spring.datasource.username");
    //     String password = env.getProperty("spring.datasource.password");

    //     properties.put("url", url);
    //     properties.put("username", username);
    //     properties.put("password", password);
    // }
    public static Connection getConnection() throws SQLException{
        // String url = (String) properties.get("url");
        // String username = (String) properties.get("username");
        // String password = (String) properties.get("password");
        return DriverManager.getConnection(properties.getProperty("db.url"),properties.getProperty("db.username"),properties.getProperty("db.password"));
        // return DriverManager.getConnection(null, null, null);
    }
}
