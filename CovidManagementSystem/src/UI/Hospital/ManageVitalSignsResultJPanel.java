
package UI.Hospital;

import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Enterprise.Hospital;
import System.Organization.Organization;
import System.Patient.Patient;
import System.UserAccount.UserAccount;
import System.VitalSigns.VitalSigns;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riddhivora
 */
public class ManageVitalSignsResultJPanel extends javax.swing.JPanel {

   
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Place city;
    Patient p;
    public ManageVitalSignsResultJPanel(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization, 
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

        btnSearch = new javax.swing.JButton();
        txtPulse = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        txtTemperature = new javax.swing.JTextField();
        lblTemperature = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        lblManageManufacturer = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        lblPulse = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        lblBloodPressure1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearch.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 90, -1));
        add(txtPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 212, -1));
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 220, -1));
        add(txtBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 212, -1));
        add(txtTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 212, -1));

        lblTemperature.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblTemperature.setText("Temperature:");
        add(lblTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, -1, -1));

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Blood Pressure", "Temperature", "SP02 Level", "Date"
            }
        ));
        jScrollPane1.setViewportView(tblVitalSigns);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 820, 210));

        lblManageManufacturer.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManageManufacturer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageManufacturer.setText("MANAGING PATIENTS VITAL SIGNS");
        add(lblManageManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 670, 60));

        btnCreate.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 610, 90, -1));

        lblPulse.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPulse.setText("SP02");
        add(lblPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, -1, -1));

        lblBloodPressure.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblBloodPressure.setText("Patient Name:");
        add(lblBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        lblBloodPressure1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblBloodPressure1.setText("Blood Pressure:");
        add(lblBloodPressure1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, -1));

        btnBack.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 660, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try{
        int SPO2 = Integer.parseInt(txtPulse.getText());
        int BloodPressure = Integer.parseInt(txtBloodPressure.getText());
        double temperature = Double.parseDouble(txtTemperature.getText());
        VitalSigns vs;
        System.out.println(p.getVitalHistory());
        vs=p.getVitalHistory().addVitalDir(BloodPressure, temperature, SPO2);
        populateTable();
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(this,"Invalid Input");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       try{
        String patientName = txtSearch.getText();
        for(Place c : system.getCityList()){
             
           for(Enterprise e : c.getEnterpriseDirectory().getEnterpriseList()){
               //Hospital hos = (Hospital)e;
               if(e.getClass().getName().equals("System.Enterprise.Hospital")){
                   Hospital hos = (Hospital)e;
                   //System.out.println(e);
                    for(Patient patient: hos.getPatientDirectory().getPatientDir()){
                        if(patient.getName().equals(patientName)){
                            p=patient;
                        }
//                        else{
//                            JOptionPane.showMessageDialog(null, "Patient not found", "Warning", JOptionPane.WARNING_MESSAGE);
//                        }
                    }
               }
           }
        }
        JOptionPane.showMessageDialog(this, "Patient found you can proceed");
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this,"Patient not found");
       }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HosEmployeeJPanel sysAdminwjp = (HosEmployeeJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblBloodPressure1;
    private javax.swing.JLabel lblManageManufacturer;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblVitalSigns.getModel();
        dtm.setRowCount(0);
                
                    for (VitalSigns v : p.getVitalHistory().getVitalDir()) {
                    
                    Object[] row = new Object[5];
                    row[0] = p.getName();
                    row[1] = v.getBloodPressure();
                    row[2] = v.getTemperature();
                    row[3] = v.getTemperature();
                    row[4] = v.getDate();

                    dtm.addRow(row);
                } //To change body of generated methods, choose Tools | Templates.
    }
}
