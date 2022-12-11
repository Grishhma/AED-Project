/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Organization;

import System.Role.HosAdminRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author riddhivora
 */
  
public class HospitalAdminOrganization extends Organization {
    public HospitalAdminOrganization(String name) {
        super(Type.HospitalAdmin.getValue(), name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HosAdminRole());
        return roles;
    }
}
