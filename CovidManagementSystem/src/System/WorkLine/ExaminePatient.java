/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.WorkLine;

import System.UserAccount.UserAccount;

/**
 *
 * @author riddhivora
 */
public class ExaminePatient extends WorkRequest {
    
    private int patientID;
    private String patientName;

   
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
    public ExaminePatient(String message, UserAccount sender, UserAccount receiver, String status) {
        super(message, sender, receiver, status);
        
    }

    
    
    
}
