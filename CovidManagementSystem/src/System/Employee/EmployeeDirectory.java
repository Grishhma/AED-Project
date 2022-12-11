/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Employee;

import java.util.ArrayList;

/**
 *
 * @author infin
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setNameOfEmployee(name);
        employeeList.add(employee);
        return employee;
    }
    public void updateEmployee(Employee employee, String name){
        employee.setNameOfEmployee(name);
    }
}
