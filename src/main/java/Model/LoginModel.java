/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.AuthDao;

/**
 *
 * @author Dell
 */
public class LoginModel {
    private String Email;
    private String Password;

    public LoginModel(String Email, String Password) {
        this.Email = Email;
        this.Password = HashingUtil.hashPassword(Password);
    }

    public String getEmail() {
        return this.Email;
    }

    public String getPassword() {
        return this.Password;
    }
    
}
