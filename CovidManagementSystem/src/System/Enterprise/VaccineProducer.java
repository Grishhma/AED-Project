/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Enterprise;

import System.Role.Role;
import System.Vaccine.VaccineDirectory;
import java.util.ArrayList;

/**
 *
 * @author infin
 */
public class VaccineProducer extends Enterprise {
    VaccineDirectory vaccineDirectory=new VaccineDirectory();
     
    public VaccineProducer (String name){
        super( Enterprise.EnterpriseType.VaccineManufacturer, name);
        vaccineDirectory = new VaccineDirectory();
    }

    public VaccineDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDitrectory(VaccineDirectory vaccineDitrectory) {
        this.vaccineDirectory = vaccineDitrectory;
    }
     

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
