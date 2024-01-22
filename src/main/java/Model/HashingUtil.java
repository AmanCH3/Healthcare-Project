/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Dell
 */
public class HashingUtil {
    public static String hashPassword(String password) {
        try {
            // Hash the password using SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());

            // Convert the hash to a hexadecimal string
            StringBuilder hashedPasswordBuilder = new StringBuilder();
            for (byte b : hash) {
                hashedPasswordBuilder.append(String.format("%02x", b));
            }
            return hashedPasswordBuilder.toString(); // Return hashed password
        } catch (NoSuchAlgorithmException e) {
            // Handle the hashing exception more gracefully if needed
            e.printStackTrace(); // For debugging
            return null; // Return null if hashing fails
        }
    }
}

