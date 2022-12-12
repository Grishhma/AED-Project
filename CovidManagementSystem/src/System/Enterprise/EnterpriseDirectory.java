/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Enterprise;

import System.Person.Person;
import System.UserAccount.UserAccount;
import java.util.ArrayList;


/**
 *
 * @author riddhivora
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type, int id){
        Enterprise enterprise=null;
        if( null!=type)switch (type) {
                case Hospital:
                    enterprise=new Hospital(name);
                    enterpriseList.add(enterprise);
                    enterprise.setEnterpriseId(id);
                    break;
                case TestingLab:
                    enterprise=new ExamineLaboratory(name);
                    enterpriseList.add(enterprise);
                    enterprise.setEnterpriseId(id);
                    break;
                case VaccinationCenter:
                    enterprise=new VacineCenter(name);
                    enterpriseList.add(enterprise);
                    enterprise.setEnterpriseId(id);
                    break;
                case VaccineManufacturer:
                    enterprise=new VaccineProducer(name);
                    enterpriseList.add(enterprise);
                    enterprise.setEnterpriseId(id);
                    break;
                default:
                    break;
            }
            return enterprise;
    }
    public boolean checkIfEnterpriseNameIsUnique(String name){
        for (Enterprise e : enterpriseList){
            if (e.getOrganizationDirectory().getOrganization(name).equals(name))
                return false;
        }
        return true;
    }

    
        public boolean checkIfIDIsUnique(int ID){
        for (Enterprise  e : enterpriseList){
            if (e.getEnterpriseId()==ID)
                return false;
        }
        return true;
    }
    
}

