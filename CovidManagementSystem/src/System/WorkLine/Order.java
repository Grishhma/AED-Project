/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.WorkLine;

import System.Place.Place;
import System.Organization.VaccineProducerOrganization;
import System.UserAccount.UserAccount;
import java.util.Random;

/**
 *
 * @author riddhivora
 */
public class Order extends WorkRequest{
    //private Place city;
    private int quantity;
    private String VaccineName;
    private int id=0;
    private UserAccount deliveryManager=null;
    //private VaccineProducerOrganization vaccineManufacturer;

    public UserAccount getDeliveryManager() {
        return deliveryManager;
    }

    public void setDeliveryManager(UserAccount deliveryManager) {
        this.deliveryManager = deliveryManager;
    }

    public String getVaccineName() {
        return VaccineName;
    }

    public void setVaccineName(String VaccineName) {
        this.VaccineName = VaccineName;
    }

    public Order(String message, UserAccount sender, UserAccount receiver, String status) {
        super(message, sender, receiver, status);
        this.id = gen();
        
    }
    public static int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return VaccineName;
    }
}
