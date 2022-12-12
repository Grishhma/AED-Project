/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Enterprise;
import System.Organization.Organization;
import System.Organization.OrganizationDirectory;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author riddhivora
 */
public class Enterprise extends Organization {
    private EnterpriseType enterpriseType;
    private int enterpriseId;

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        TestingLab("TestingLab"),
        VaccinationCenter("VaccinationCenter"), 
        VaccineManufacturer("VaccineManufacturer");  
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(EnterpriseType type, String name){
        super(type.toString(), name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
    
}

