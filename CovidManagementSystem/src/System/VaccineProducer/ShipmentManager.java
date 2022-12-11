/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.VaccineProducer;

import System.Person.Person;
/**
 *
 * @author ACER
 */

public class ShipmentManager extends Person{
    private int DeliveryManagerId;

    public ShipmentManager(int personID, String name, String street, String zipcode, int age, String Community, String phoneNo, String email) {
        super(personID, name, street, zipcode, age, Community, phoneNo, email);
    }
    
    public int getDeliveryManagerId() {
        return DeliveryManagerId;
    }

    public void setDeliveryManagerId(int DeliveryManagerId) {
        this.DeliveryManagerId = DeliveryManagerId;
    }
    
}
