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

/**
 *
 * @author ACER
 */
public abstract class Role {
    
    public enum RoleType{
        DeliveryManagerRole("DeliveryManagerRole"),
        DoctorRole("DoctorRole"),
        HospitalAdminRole("HospitalAdminRole"),
        HospitalStaffRole("HospitalStaffRole"),
        PatientRole("PatientRole"),
        LabAdminRole("LabAdminRole"),
        PersonRole("PersonRole"),
        SystemAdmin("SystemAdmin"),
        VaccinationCenterAdminRole("VaccinationCenterAdminRole"),
        VaccinationCenterStaffRole("VaccinationCenterStaffRole"),
        VaccineManufacturerRole("VaccineManufacturerRole");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }
    
   public abstract JPanel createWorkArea(JPanel userProcessContainer,
            Place city,
            UserAccount account,  
            Organization organization,
            Enterprise enterprise,
            EcoSystem system);
   
       @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
