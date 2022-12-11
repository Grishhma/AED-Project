/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package System.Organization;


import System.Role.HosEmplooyeeRole;
import System.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author infin
 */
public class HospitalEmployeeOrganization extends Organization{
     public HospitalEmployeeOrganization(String name) {
        super(Organization.Type.HospitalStaff.getValue(), name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HosEmplooyeeRole());
        return roles;
    }
}
