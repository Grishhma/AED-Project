/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Role;

import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.VaccineCenter.VaccineCenterAdminJPanel;
import UI.VaccineProducer.ManageDeliveryManagerJPanel;

/**
 *
 * @author ACER
 */
public class VaccineCenterAdminRole extends Role {
    private EcoSystem system;
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        return new VaccineCenterAdminJPanel(userProcessContainer,city, userAccount, organization, enterprise, system);
    } 
}
