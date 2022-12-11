/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Organization;

import System.Role.DoctorRole;
import System.Role.Role;
import System.Role.VaccineCenterAdminRole;
import java.util.ArrayList;

/**
 *
 * @author infin
 */
public class VaccineCenterAdminOrganization extends Organization{
     public VaccineCenterAdminOrganization(String name) {
        super(Organization.Type.VaccinationCenterAdmin.getValue(), name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VaccineCenterAdminRole());
        return roles;
    }
}
