/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catering.Classes;

/**
 *
 * @author A243934
 */
public class Login {

    public static boolean isValidUsername(String username) {
        // Add your username validation logic here
        // For example, you can check if the username is not empty
        return !username.isEmpty();
    }

    public static boolean isValidPassword(String password) {
        // Add your password validation logic here
        // For example, you can check if the password is at least 6 characters long
        return password.length() >= 6;
        }
    
}
