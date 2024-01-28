/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hp
 */
public class MedicineModel {
    private int patientID ;
    private String medicine;
    private String dosage;
    private String duration;
    private String instruction;
    public MedicineModel(int patientID , String medicine , String dosage , String duration , String instruction){
        this.patientID = patientID;
        this.medicine = medicine ;
        this.dosage = dosage ;
        this.duration = duration ;
        this.instruction =instruction;
        
}
    
    public int getPatient(){
        return patientID ;
    }
    public String getMedicine(){
        return medicine ;
    }
    public String getDosage(){
        return dosage ;
    }
    public String getDuration(){
        return duration ;
    }
    public String getInstruction(){
        return instruction ;
    }
}