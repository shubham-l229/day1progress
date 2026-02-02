package com.edutech.progressive.config;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {

   private static Properties properties = new Properties();
   private static void loadProperties(){
      try(InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")) {
         properties.load(input);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   public static Connection getConnection() throws SQLException{
      loadProperties();  
      String url = properties.getProperty("spring.datasource.url");
      String username =  properties.getProperty("spring.datasource.username");
      String password = properties.getProperty("spring.datasource.password");

      return DriverManager.getConnection(url, username, password);
   }
   
}



// CREATE TABLE customers(
//    customer_id INT AUTO_INCREMENT PRIMARY KEY,
//    name VARCHAR(255) NOT NULL,
//    email VARCHAR(255) NOT NULL,
//    username VARCHAR(255) NOT NULL,
//    password VARCHAR(255) NOT NULL,
//    role VARCHAR(255)
// );

// CREATE TABLE transactions (
//    transaction_id INT AUTO_INCREMENT PRIMARY KEY,
//    account_id INT NOT NULL,
//    amount DECIMAL(10,2) NOT NULL,
//    transaction_date TIMESTAMP NOT NULL,
//    transaction_type VARCHAR(255) NOT NULL
// );

// CREATE TABLE accounts (
//  account_id INT AUTO_INCREMENT PRIMARY KEY,
//  customer_id INT NOT NULL,
//  balance DECIMAL(10,2) NOT NULL
// );
