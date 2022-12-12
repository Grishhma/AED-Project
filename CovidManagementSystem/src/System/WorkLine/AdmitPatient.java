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
public class AdmitPatient extends WorkRequest {
    private String DoctorName;
    private String PatientName;
    int PatientID=1;
    private String AdmissionStatus;
    
    public AdmitPatient(String message, UserAccount sender, UserAccount receiver, String status) {
        super(message, sender, receiver, status);
        PatientID++;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public String getAdmissionStatus() {
        return AdmissionStatus;
    }

    public void setAdmissionStatus(String AdmissionStatus) {
        this.AdmissionStatus = AdmissionStatus;
    }
    
    
}
