/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Database.SQLConnection;
import Model.LoginModel;
import Model.PatientData ;
import Model.PatientModel;
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
    public boolean AddPatient(PatientModel patient){
        try{
            String sql = " insert into Patients(Firstname ,Lastname ,Age,DateOfBirth,Gender, Contact, Email ,Address) values (?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement( sql);
  
           ps.setString(1,patient.getFname());
           ps.setString(2,patient.getLname());
           ps.setString(3, patient.getAge());
           ps.setString(4,patient.getDate());
           ps.setString(5,patient.getGender());
           ps.setString(6,patient.getContact());
           ps.setString(7,patient.getEmail());
           ps.setString(8,patient.getAddress());
          
         
            
           
//           // to check the insertion on the table
           int result = ps.executeUpdate();
            if(result == -1){
                return false;
            }else{
                return true;
            }
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        
        
    }
    public PatientData patient(PatientModel patient){
try{
PreparedStatement ps = null ;
Connection conn = openConnection();
String sql = "SELECt * FROM patients Where Firstname = ? ,Lastname = ?, dateofbirth = ? , gender = ? ,ContactNumer = ?,Email = ?, address = ? , age= ?";
ps = conn.prepareStatement(sql);
ps.setString(1,patient.getFname());
           ps.setString(2,patient.getLname());
           ps.setString(3,patient.getDate());
           ps.setString(4,patient.getGender());
           ps.setString(5,patient.getContact());
           ps.setString(6,patient.getEmail());
           ps.setString(7,patient.getAddress());
           ps.setString(8, patient.getAge());

ResultSet result = ps.executeQuery();
if (result != null && result.next() != false){
    //get data here
    String Firstname = result.getString("Firstname");
    String Lastname = result.getString("Lastname");
    String age = result.getString("age");
    String dateOfbirth = result.getString ("dateOfBirth");
    String gender = result.getString ("gender");
    String contact = result.getString ("contact");
    String Email = result.getString ("Email");
    String Address = result.getString ("Address");
    
    
    
    PatientData Patient =  new PatientData(Firstname , Lastname ,age, dateOfbirth, gender,contact,Email, Address);
    return Patient;
}
else{
   return null ;
}

 
}catch (Exception exception){
    return null ;
    
}
    
}
}
