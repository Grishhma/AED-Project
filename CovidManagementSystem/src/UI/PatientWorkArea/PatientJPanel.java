/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PatientWorkArea;

import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import static System.Enterprise.Enterprise.EnterpriseType.Hospital;
import System.Enterprise.Hospital;
import System.Organization.Organization;
import System.Patient.Patient;
import System.Person.Person;
import System.ExamineReport.ExamineResult;
import System.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author infi
 */
public class PatientJPanel extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Place city;
    public PatientJPanel(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbVaccStatus = new javax.swing.JLabel();
        lbTestResult = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtResult = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PATIENT PANEL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 132, 570, 70));

        lbVaccStatus.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbVaccStatus.setText(" Vaccination Status");
        add(lbVaccStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 157, 39));

        lbTestResult.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbTestResult.setText("Test Result");
        add(lbTestResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 157, -1));

        txtStatus.setEditable(false);
        txtStatus.setBackground(new java.awt.Color(255, 255, 255));
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 149, -1));

        txtResult.setEditable(false);
        txtResult.setBackground(new java.awt.Color(255, 255, 255));
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });
        add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 149, -1));

        btnCheck.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });
        add(btnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 110, 40));
        add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 361, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        try{
        for(Place c : system.getCityList()){
             
           for(Enterprise e : c.getEnterpriseDirectory().getEnterpriseList()){
               //Hospital hos = (Hospital)e;
               if(e.getClass().getName().equals("System.Enterprise.Hospital")){
                   Hospital hos = (Hospital)e;
                   //System.out.println(e);
                    for(Patient patient: hos.getPatientDirectory().getPatientDir()){
                        if(patient.getName().equals(userAccount.getEmployee().getName())){
                            txtStatus.setText(patient.getVaccinationStatus());
                            
                        }
                    }
               }
           }
        }}
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Please get your vaccination condition");
        }
        String status=" ";
        try{
        for(Person p : system.getPersonDirectory().getPersonList()){
            if(p.getName().equals(userAccount.getEmployee().getName())){
                ExamineResult report = p.getTestHistory().getTestReportList().get(p.getTestHistory().getTestReportList().size()-1);
                if(report.isResult()==true){
                    status = "Covid Positive";
                }
                else{
                    status = "Covid Negative";
                }
                txtResult.setText(status);
            }
        }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(this,"Please get tested first");
    }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbTestResult;
    private javax.swing.JLabel lbVaccStatus;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
