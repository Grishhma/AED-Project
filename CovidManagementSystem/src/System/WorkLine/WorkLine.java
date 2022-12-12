/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.WorkLine;
import System.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author infin
 */
public class WorkLine {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkLine() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public Order addWorkRequestList(String message, UserAccount sender, UserAccount receiver, String status) {
        Order temp = new Order(message, sender, receiver, status);
        workRequestList.add(temp);
        return temp;
    }
    
    public VaccinatePatient addWorkRequestList2(String message, UserAccount sender, UserAccount receiver, String status){
        VaccinatePatient temp = new VaccinatePatient(message, sender, receiver, status);
        workRequestList.add(temp);
        return temp;
    }
    
     public ExaminePatient addWorkRequestList3(String message, UserAccount sender, UserAccount receiver, String status){
        ExaminePatient temp = new ExaminePatient(message, sender, receiver, status);
        workRequestList.add(temp);
        return temp;
    }
}
