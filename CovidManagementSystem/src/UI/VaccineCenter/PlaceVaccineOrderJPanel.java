
package UI.VaccineCenter;

import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import System.WorkLine.Order;
import System.WorkLine.WorkLine;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author riddhivora
 */
public class PlaceVaccineOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlaceVaccineOrder
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Place city;
    public PlaceVaccineOrderJPanel(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization, 
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVaccineName = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        cmbVaccineManufacturer = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblManufacturereAdmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Vaccine Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Producer Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Quantity:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, -1, -1));

        txtVaccineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVaccineNameActionPerformed(evt);
            }
        });
        add(txtVaccineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 129, -1));
        add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 129, -1));

        cmbVaccineManufacturer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sereum Institute", "Bharat BioTech", "Pfizer" }));
        add(cmbVaccineManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 90, 30));

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 90, 30));

        lblManufacturereAdmin.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        lblManufacturereAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManufacturereAdmin.setText("PLACE YOUR VACCINATION ORDER");
        add(lblManufacturereAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1050, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void txtVaccineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVaccineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVaccineNameActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
    String vaccineName;
    int qty;
    String message = "Order is placed successfully";
    String status = "Active";
    try{
    vaccineName = txtVaccineName.getText();
    qty = Integer.parseInt(txtQty.getText());
    String VaccineManufacturerName = (String) cmbVaccineManufacturer.getSelectedItem();
    for(Place city : system.getCityList()){
        for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseList()) {
            if((e.getName()).equals(VaccineManufacturerName)){
                UserAccount receiver = e.getUserAccountDirectory().getUserAccountList().get(0);
                Order order = e.getWorkQueue().addWorkRequestList(message, userAccount, receiver, status);
                order.setQuantity(qty);
                order.setVaccineName(vaccineName);
                //System.out.println(e.getWorkQueue().getWorkRequestList().get(0));
            }
            
        }
        }
        JOptionPane.showMessageDialog(this,"Order is placed successfully");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this,"order cannot be placed");
    }
    
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VaccineCenterAdminJPanel vaccinationCenterjp = (VaccineCenterAdminJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbVaccineManufacturer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblManufacturereAdmin;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtVaccineName;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        cmbVaccineManufacturer.removeAllItems();
        for(Place city : system.getCityList()){
        for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseList()) {
            System.out.println(e.getClass().getName());
            if((e.getClass().getName()).equals("System.Enterprise.VaccineProducer"))
            cmbVaccineManufacturer.addItem(e.getName());
        } //To change body of generated methods, choose Tools | Templates.
    }
    }
}
