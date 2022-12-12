/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Enterprise;

import System.Patient.PatientDirectory;
import System.Role.Role;
import System.Vaccine.VaccineDirectory;
import java.util.ArrayList;

/**
 *
 * @author riddhivora
 */
public class Hospital extends Enterprise {
    PatientDirectory patientDirectory=new PatientDirectory();

    public Hospital (String name){
        super( Enterprise.EnterpriseType.Hospital, name);
        patientDirectory = new PatientDirectory();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
