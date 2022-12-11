/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Organization;


import System.Role.ShipmentManagerRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author infin
 */
public class ShipmentManagerOrganization extends Organization{
     public ShipmentManagerOrganization(String name) {
        super(Organization.Type.DeliveryManager.getValue(), name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ShipmentManagerRole());
        return roles;
    }
}
