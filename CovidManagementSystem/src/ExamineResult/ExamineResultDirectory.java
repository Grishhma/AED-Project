/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamineResult;

import System.Person.Person;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author riddhivora
 */
public class ExamineResultDirectory {
    
   ArrayList<ExamineResult> testReportList=new ArrayList<ExamineResult>();

    public ArrayList<ExamineResult> getTestReportList() {
        return testReportList;
    }

    public void setTestReportList(ArrayList<ExamineResult> testReportList) {
        this.testReportList = testReportList;
    }
   
   public ExamineResult newTestReport(Boolean result){
       ExamineResult testReport = new ExamineResult(result);
       testReportList.add(testReport);
       return testReport;
   }
}
   
   
