
package UI.Hospital;

import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Enterprise.Hospital;
import System.Organization.Organization;
import System.Patient.Patient;
import System.UserAccount.UserAccount;
import System.WorkLine.Order;
import System.WorkLine.VaccinatePatient;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author riddhivora
 */
public class VaccineRequest extends javax.swing.JPanel {

    /**
     * Creates new form VaccineRequest
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Place city;
    public VaccineRequest(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
        populateComboBox();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbVaccinationCenters = new javax.swing.JComboBox<>();
        btnSendRequest = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setText("Select Test Center:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 121, 32));

        cmbVaccinationCenters.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbVaccinationCenters, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 170, 30));

        btnSendRequest.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnSendRequest.setText("Send Request");
        btnSendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestActionPerformed(evt);
            }
        });
        add(btnSendRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SENDING VACCINATION RESULTS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 1000, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestActionPerformed
     //   String vaccineName;
    //int qty;
    try{
    String message = "Please Vaccinate";
    String status = "Active";
    
    //vaccineName = txtVaccineName.getText();
    //qty = Integer.parseInt(txtQty.getText());
    ArrayList<Patient> pd = new ArrayList<>();
    Hospital hospital = (Hospital)enterprise;
    for(Patient p : hospital.getPatientDirectory().getPatientDir()){
        if(!p.getVaccinationStatus().equals("Completely Vaccinated")){
            pd.add(p);
        }
    }
    String VaccineCenterName = (String) cmbVaccinationCenters.getSelectedItem();
    for(Place city : system.getCityList()){
        for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseList()) {
            if((e.getName()).equals(VaccineCenterName)){
                UserAccount receiver = e.getUserAccountDirectory().getUserAccountList().get(0);
                VaccinatePatient vp = e.getWorkQueue().addWorkRequestList2(message, userAccount, receiver, status);
                vp.setNonVaccPatientList(pd);
                //System.out.println(e.getWorkQueue().getWorkRequestList().get(0));
            }
            
        }
        }
    JOptionPane.showMessageDialog(this,"Succesfully Request sent");
    }
catch(Exception e){
        JOptionPane.showMessageDialog(this,"Request cannot be sent");// TODO add your handling code here:
}
    }//GEN-LAST:event_btnSendRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendRequest;
    private javax.swing.JComboBox<String> cmbVaccinationCenters;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
private void populateComboBox() {
        cmbVaccinationCenters.removeAllItems();
        for(Place city : system.getCityList()){
        for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseList()) {
            //System.out.println(e.getClass().getName());
            if((e.getClass().getName()).equals("System.Enterprise.VacineCenter"))
            cmbVaccinationCenters.addItem(e.getName());
        } //To change body of generated methods, choose Tools | Templates.
    }
    }


}

