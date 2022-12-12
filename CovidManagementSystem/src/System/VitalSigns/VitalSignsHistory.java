/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.VitalSigns;

import System.Vaccine.Vaccine;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ACER
 */

public class VitalSignsHistory {
    private ArrayList<VitalSigns> vitalDir; 
    
    public VitalSignsHistory(){
        vitalDir = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalDir() {
        return vitalDir;
    }

    public void setVitalDir(ArrayList<VitalSigns> vitalDir) {
        this.vitalDir = vitalDir;
    }

    public VitalSigns addVitalDir(int BloodPressure, double temperature, int SPO2Level) {
        VitalSigns v = new VitalSigns(BloodPressure, temperature, SPO2Level);
        vitalDir.add(v);
        return v;
    }
}

