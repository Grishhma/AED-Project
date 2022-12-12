/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Organization;

import System.Role.DoctorRole;
import System.Role.Role;
import System.Role.ExamineLabAdminRole;
import java.util.ArrayList;

/**
 *
 * @author riddhivora
 */
public class ExamineLabAdminOrganization extends Organization{
     public ExamineLabAdminOrganization(String name) {
        super(Organization.Type.TestingLabAdmin.getValue(), name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ExamineLabAdminRole());
        return roles;
    }
}
