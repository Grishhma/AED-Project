/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.WorkLine;

import System.Patient.Patient;
import System.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author infin
 */
public class VaccinatePatient extends WorkRequest{
    ArrayList <Patient> nonVaccPatientList=new ArrayList<>();
    //private String VaccineName;
    private UserAccount Staff=null;


    public ArrayList<Patient> getNonVaccPatientList() {
        return nonVaccPatientList;
    }

    
    public void setNonVaccPatientList(ArrayList<Patient> nonVaccPatientList) {
        this.nonVaccPatientList = nonVaccPatientList;
    }

    public UserAccount getStaff() {
        return Staff;
    }

    public void setStaff(UserAccount Staff) {
        this.Staff = Staff;
    }
    public VaccinatePatient(String message, UserAccount sender, UserAccount receiver, String status) {
        super(message, sender, receiver, status);
    }
}
