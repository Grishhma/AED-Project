/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Enterprise;

import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author riddhivora
 */
public class ExamineLaboratory extends Enterprise {
    public ExamineLaboratory (String name){
        super( Enterprise.EnterpriseType.TestingLab, name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
