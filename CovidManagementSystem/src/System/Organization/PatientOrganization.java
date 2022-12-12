/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Organization;

import System.Role.DoctorRole;
import System.Role.PatientRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author infin
 */
public class PatientOrganization extends Organization{
     public PatientOrganization(String name) {
        super(Organization.Type.Patient.getValue(), name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PatientRole());
        return roles;
    }
}