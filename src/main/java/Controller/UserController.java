/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.AuthDao;
import DAO.UserDao;
import Model.LoginModel;
import View.UserProfilePanel;

/**
 *
 * @author Dell
 */
public class UserController {
     private AuthDao authDao;
     private LoginModel loginModel;

    public UserController(UserDao userDao, UserProfilePanel userProfilePanel){
        this.authDao = new AuthDao();
    }
    
    // user related method
    public void SignUpModel(String name, String email, String password, String dateOfBirth, String phone, String address){
        authDao.SignUp(name,email,password,dateOfBirth, phone, address);
    }
    public boolean LoginModel(String Email, String Password){
        return authDao.LoginUp(Email,Password);
}
  
    
}
