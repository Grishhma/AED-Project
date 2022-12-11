/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Organization;

import System.Role.Role;
import System.Role.VaccineCenterEmpRole;
import java.util.ArrayList;

/**
 *
 * @author infin
 */
public class VaccineCenterEmployeeOrganization extends Organization{
     public VaccineCenterEmployeeOrganization(String name) {
        super(Organization.Type.VaccinationCenterStaff.getValue(), name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VaccineCenterEmpRole());
        return roles;
    }
}
