/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Organization;

import System.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author infin
 */
public class OrganizationDirectory {

private ArrayList<Organization> organizationList;



    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }



    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

public Organization createOrganization(Type type, String name){
    Organization organization = null;
    if (type.getValue().equals(Type.Doctor.getValue())){
        organization = new DoctorOrganization(name);
        organizationList.add(organization);
       }
    else if (type.getValue().equals(Type.DeliveryManager.getValue())){
        organization = new ShipmentManagerOrganization(name);
        organizationList.add(organization);
       }
    else if (type.getValue().equals(Type.HospitalAdmin.getValue())){
        organization = new HospitalAdminOrganization(name);
        organizationList.add(organization);
        }
    else if (type.getValue().equals(Type.HospitalStaff.getValue())){
        organization = new HospitalEmployeeOrganization(name);
        organizationList.add(organization);
        }
    else if (type.getValue().equals(Type.Patient.getValue())){
        organization = new PatientOrganization(name);
        organizationList.add(organization);
        }
    else if (type.getValue().equals(Type.SystemAdmin.getValue())){
        organization = new SystemAdminOrganization(name);
        organizationList.add(organization);
        }
    else if (type.getValue().equals(Type.TestingLabAdmin.getValue())){
        organization = new ExamineLabAdminOrganization(name);
        organizationList.add(organization);
        }
    else if (type.getValue().equals(Type.VaccinationCenterAdmin.getValue())){
        organization = new VaccineCenterAdminOrganization(name);
        organizationList.add(organization);
        }
    else if (type.getValue().equals(Type.VaccinationCenterStaff.getValue())){
        organization = new VaccineCenterEmployeeOrganization(name);
        organizationList.add(organization);
        }
    else if (type.getValue().equals(Type.VaccineManufacturerAdmin.getValue())){
        organization = new VaccineProducerOrganization(name);
        organizationList.add(organization);
        }

    return organization;
    }

    public void removeOrganization(Organization org){
        organizationList.remove(org);
    }

    public Organization getOrganization(String name){
        for(Organization o : organizationList){
        if(o.getName().equalsIgnoreCase(name)){
            return o;
    }
        }
        return null;
    }
    }
