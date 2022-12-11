/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Employee;

/**
 *
 * @author infin
 */
public class Employee {
    
    private String NameOfEmployee;
    private int IDOfEmployee;
    private static int count = 1;

    public Employee() {
        IDOfEmployee = count;
        count++;
    }

    public int getIDOfEmployee() {
        return IDOfEmployee;
    }

    public void setNameOfEmployee(String NameOfEmployee) {
        this.NameOfEmployee = NameOfEmployee;
    }

    
    public String getNameOfEmployee() {
        return NameOfEmployee;
    }

    @Override
    public String toString() {
        return NameOfEmployee;
    }
    
    
}
