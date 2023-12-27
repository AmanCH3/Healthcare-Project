/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Database.SQLConnection;
import Model.SignUpModel;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Dell
 */
public class AuthDao extends SQLConnection {
    
          public boolean SignUp(SignUpModel user){
    try{
           PreparedStatement ps = null;
           Connection conn = openConnection();
           String sql = " insert into user_registration(name ,Email,password, DateOfBirth, phoneNo, address) values (?,?,?,?,?,?)";
           ps = conn.prepareStatement( sql);
           ps.setString(1,user.getName());
           ps.setString(2,user.getEmail());
           ps.setString(3,user.getPassword());
           ps.setString(4,user.getDateOfBirth());
           ps.setString(5,user.getPhone());
           ps.setString(6,user.getAddress());
           System.out.println(user.getName());
           System.out.println(user.getEmail());
           System.out.println(user.getPassword());
            System.out.println(user.getDateOfBirth());
             System.out.println(user.getPhone());
              System.out.println(user.getAddress());
            
           
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
}
