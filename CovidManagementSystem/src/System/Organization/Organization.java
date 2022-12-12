/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Organization;


import System.Employee.EmployeeDirectory;
import System.Role.Role;
import System.UserAccount.UserAccountDirectory;
import System.WorkLine.WorkLine;
import java.util.ArrayList;

/**
 *
 * @author infin
 */
public abstract class Organization {

    private String name;
    private String type;
    private WorkLine workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        DeliveryManager("Delivery Manager"),
        Doctor("Doctor"),
        HospitalAdmin("Hospital Admin"),
        HospitalStaff("Hospital Staff"),
        TestingLabAdmin("Testing Lab Admin"),
        VaccinationCenterAdmin("Vaccination Center Admin"), 
        VaccinationCenterStaff("Vaccination Center Staff"), 
        VaccineManufacturerAdmin("Vaccine Manufacturer Admin"), 
        Patient("Patient"),
        //Person("Person"),
        SystemAdmin("System Admin");
        
        private final String value;
        
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
    }

    public Organization(String type, String name) {
        this.type = type;
        this.name = name;
        workQueue = new WorkLine();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkLine getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkLine workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
