/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Organization;

import System.Role.DoctorRole;
import System.Role.Role;
import System.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author infin
 */
public class SystemAdminOrganization extends Organization{
     public SystemAdminOrganization(String name) {
        super(Organization.Type.SystemAdmin.getValue(), name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SystemAdminRole());
        return roles;
    }
}

