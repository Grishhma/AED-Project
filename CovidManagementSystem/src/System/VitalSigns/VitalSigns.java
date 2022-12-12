/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.VitalSigns;

import java.util.Date;

/**
 *
 * @author ACER
 */

public class VitalSigns {
    private int BloodPressure;
    private double temperature;
    private int SPO2Level;
    private Date date;

    VitalSigns(int BloodPressure, double temperature, int SPO2Level) {
        this.BloodPressure=BloodPressure;
        this.SPO2Level=SPO2Level;
        this.temperature=temperature;
        this.date=new Date();//To change body of generated methods, choose Tools | Templates.
    }

    public int getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(int BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getSPO2Level() {
        return SPO2Level;
    }

    public void setSPO2Level(int SPO2Level) {
        this.SPO2Level = SPO2Level;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}

