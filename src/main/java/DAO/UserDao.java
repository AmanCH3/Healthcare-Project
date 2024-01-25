/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Database.SQLConnection;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Dell
 */
public class UserDao extends SQLConnection {
    PreparedStatement ps = null;
    Connection conn = openConnection();
    ResultSet result=null;
    public User getUserByEmail(String email) {  //testing##########################################################        
        try {
            // Execute SQL query to retrieve user details by email
            String query = "SELECT * FROM user_registration WHERE email=?";
            // Set email parameter in the prepared statement
            // Replace with your actual prepared statement code
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Assuming resultSet.next() moves to the first record
            if (resultSet.next()) {
                // Retrieve user details from resultSet
                String name = resultSet.getString("name");
                String userEmail = resultSet.getString("email");
                String password = resultSet.getString("password");
                String dateOfBirth =resultSet.getString("DateOfBirth");
                String phone = resultSet.getString("phoneNo");
                String address = resultSet.getString("address");
              
                

                // Create and return a User object
                return new User(name,userEmail,password,dateOfBirth,phone,address);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        } finally {
            // Close the resultSet, preparedStatement, and connection if necessary
        }

        return null; // Return null if user not found
    }
    public boolean updateUserPassword(String email, String newPassword) {
        try {
            // Execute SQL query to update user password by email
            String query = "UPDATE user_registration SET password=? WHERE email=?";
            // Set parameters in the prepared statement
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, email);

            // Execute the update query
            int rowsAffected = preparedStatement.executeUpdate();

            // Return true if the update was successful
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        } finally {
            // Close the preparedStatement and connection if necessary
        }

        // Return false if the update was not successful
        return false;
    }
    public boolean deleteAccount(String email) {
        try {
            // Execute SQL query to delete user by email
            String query = "DELETE FROM user_registration WHERE email=?";
            // Set email parameter in the prepared statement
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, email);

            // Execute the delete query
            int rowsAffected = preparedStatement.executeUpdate();

            // Return true if the delete was successful
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        } finally {
            // Close the preparedStatement and connection if necessary
        }

        // Return false if the delete was not successful
        return false;
    }
    public boolean insertFeedback(String name, String email, String feedbackText) {
        try {
            // Execute SQL query to insert feedback
            String query = "INSERT INTO feedback_table (name, email, feedback_text, date) VALUES (?, ?, ?, NOW())";
            // Set parameters in the prepared statement
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, feedbackText);

            // Execute the insert query
            int rowsAffected = preparedStatement.executeUpdate();

            // Return true if the insert was successful
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        } finally {
            // Close the preparedStatement and connection if necessary
        }

        // Return false if the insert was not successful
        return false;
    }

    
}
