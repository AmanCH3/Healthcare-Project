/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Database.SQLConnection;
import Model.LoginModel;
import Model.SignUpModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class AuthDao extends SQLConnection {
    PreparedStatement ps = null;
    Connection conn = openConnection();
    ResultSet result=null;
    
          public boolean SignUp(SignUpModel user){
    try{
//           PreparedStatement ps = null;
//           Connection conn = openConnection();
           String sql = " insert into user_registration(name ,Email,password, DateOfBirth, phoneNo, address) values (?,?,?,?,?,?)";
           ps = conn.prepareStatement( sql);
           ps.setString(1,user.getName());
           ps.setString(2,user.getEmail());
           ps.setString(3,user.getPassword());
           ps.setString(4,user.getDateOfBirth());
           ps.setString(5,user.getPhone());
           ps.setString(6,user.getAddress());
         
            
           
//           // to check the insertion on the table
           int result = ps.executeUpdate();
            if(result == -1){
                return false;
            }else{
                return true;
            }
}
           
     catch (Exception e){
        System.out.println(e);
        return false ;
       }
      }

    public boolean LoginUp(String Email, String Password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void SignUp(String name, String email, String password, String dateOfBirth, String phone, String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public boolean Login(LoginModel userLogin){
        String query = "Select * from user_registration where email=? and password = ?";
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, userLogin.getEmail());
            ps.setString(2, userLogin.getPassword());
            result=ps.executeQuery();
            if(result.next()){
                return true;
            }
            else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
        
        
    }
    
}
