/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamineResult;

import System.Person.Person;
import java.util.Date;
/**
 *
 * @author riddhivora
 */
public class ExamineResult {

    private boolean result;
   
    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
    
    public ExamineResult( Boolean result){
        this.result = result;
    }
    
}
