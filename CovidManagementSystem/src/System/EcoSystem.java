/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;

import System.Place.Place;
import System.Person.PersonDirectory;
import System.ShipmentPerson.ShipmentPersonDirectory;
import System.Role.Role;
import System.Role.SystemAdminRole;
import java.util.ArrayList;
import System.Organization.Organization;

/**
 *
 * @author riddhivora
 */
public class EcoSystem {
    
public class EcoSystem extends Organization{
    
    private static EcoSystem System;
    private ArrayList<Place> cityList;
    private PersonDirectory personDirectory;

    public EcoSystem(PersonDirectory personDirectory) {

        this.personDirectory = personDirectory;
    }
    
    public Place createCity(){
        Place city = new Place();
        cityList.add(city);
        
        return city;
    }
    
    public PersonDirectory getPersonDirectory(){
        if(personDirectory==null){
            personDirectory = new PersonDirectory();
        }
        return personDirectory;
    }
    
    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(System==null){
            System=new EcoSystem();
        }
        return System;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null,null);
        cityList = new ArrayList<Place>();
    }

    public ArrayList<Place> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<Place> cityList) {
        this.cityList = cityList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
       
       if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
           return false;
       }
       return true;
    }
}


