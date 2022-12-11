/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author infin
 */
public class VaccineDirectory {
  
    private ArrayList<Vaccine> vaccDir; 
    
    public VaccineDirectory(){
        vaccDir = new ArrayList<Vaccine>();
    }

    public ArrayList<Vaccine> getVaccDir() {
        return vaccDir;
    }

    public void setVaccDir(ArrayList<Vaccine> vaccDir) {
        this.vaccDir = vaccDir;
    }
    
    public Vaccine addVaccDir(int qty, int batchId, String status ,String Name) {
        Vaccine v = new Vaccine(qty,batchId,status,Name);
        vaccDir.add(v);
        return v;
    }
}
