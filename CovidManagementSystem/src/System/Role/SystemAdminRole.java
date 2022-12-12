/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Role;

import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Organization.Organization;
import static System.Role.Role.RoleType.SystemAdmin;

import System.UserAccount.UserAccount;
import UI.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import UI.VaccineProducer.ManageDeliveryManagerJPanel;

/**
 *
 * @author riddhivora
 */
public class SystemAdminRole extends Role{
    //private EcoSystem system;
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer,city, userAccount, organization, enterprise, system);
    } 
    
}
