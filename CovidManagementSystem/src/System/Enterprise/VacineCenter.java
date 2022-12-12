/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Enterprise;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author infin
 */
public class VacineCenter extends Enterprise {
     public VacineCenter (String name){
        super( Enterprise.EnterpriseType.VaccinationCenter, name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
