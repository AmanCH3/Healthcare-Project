/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hp
 */
public class PatientModel {
    private String Firstname;
    private String Lastname;
    private String age ;
    private String dateOfBirth;
    private String gender;
    private String Contact;
    private String Email;
    private String Address;
     public PatientModel(String Firstname, String Lastname, String age, String dateOfBirth,
             String gender, String Contact, String Email, String Address){
         this.Firstname = Firstname;
         this.Lastname = Lastname;
         this.age = age;
         this.dateOfBirth = dateOfBirth;
         this.gender = gender;
         this.Contact = Contact;
         this.Email = Email ;
         this.Address = Address;
        
    }
     public String getFname(){
         return Firstname ;
    
}
     public String getLname(){
         return Lastname ;
     }
   
     public String getAge(){
         return age ;
     }
     public String getDate(){
         return dateOfBirth ;
     }
     public String getEmail(){
         return Email ;
     }
    
     public String getAddress(){
         return Address ;
     }
     public String getGender(){
         return gender ;
     }
     public String getContact(){
         return Contact ;
     }
   
}
