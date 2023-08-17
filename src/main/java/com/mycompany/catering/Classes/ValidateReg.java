/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catering.Classes;

import com.mycompany.catering.Databases.DatabaseManager;

/**
 *
 * @author A243934
 */
public class ValidateReg {
    
    public static boolean isValidFirstName(String fname) {
        return !fname.isEmpty() && !fname.matches(".*\\d.*");
    }

    public static boolean isValidLastName(String lname) {
        return !lname.isEmpty() && !lname.matches(".*\\d.*");
    }

    public static boolean isValidTelephone(String tphone) {
        return tphone.matches("\\d+") && !tphone.isEmpty();
    }

    public static boolean isValidEmail(String email) {
        return !email.isEmpty();
    }

    public static boolean isValidAddress(String address) {
        return !address.isEmpty();
    }


    public static boolean isValidPassword(String password) {
        return password.length() == 6 && password.matches(".*[A-Z].*") && password.matches(".*[^a-zA-Z0-9].*");
    }

    public static boolean doPasswordsMatch(String password1, String password2) {
        return password1.equals(password2);
    }
    

    DatabaseManager dbm = new DatabaseManager();
    
}
