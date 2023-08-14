/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catering.Databases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author A243934
 */
public class DatabaseManager {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/Catering";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Solutions@2024";

    public static boolean verifyLogin(String username, String password){
        try{
         Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         String query = "SELECT * FROM Client WHERE username = ? AND password = ?";
         PreparedStatement statement = connection.prepareStatement(query);
         statement.setString(1, username);
         statement.setString(2, password);

         ResultSet resultSet = statement.executeQuery();
         boolean isValid = resultSet.next();

         resultSet.close();
         statement.close();
         connection.close();

         return isValid;
        }catch (SQLException e){
          e.printStackTrace();
          return false;
        }
    }
}
