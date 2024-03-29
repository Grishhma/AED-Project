/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.VaccineProducer;

import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import System.WorkLine.Order;
import System.WorkLine.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class ShipmentManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShipmentManagerJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Place city;
    public ShipmentManagerJPanel(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.userAccount=userAccount;
        this.city=city;
        this.organization=organization;
        this.enterprise=enterprise;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnMarkAsDelivered = new javax.swing.JButton();
        lblManageAdmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Vaccine Name", "Receiver", "Sender", "Status", "Quantity", "Message", "Order ID"
            }
        ));
        jScrollPane1.setViewportView(tblOrder);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 945, 183));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 470, 100, 30));

        btnMarkAsDelivered.setText("Mark as Shiped");
        btnMarkAsDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkAsDeliveredActionPerformed(evt);
            }
        });
        add(btnMarkAsDelivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 470, -1, 30));

        lblManageAdmin.setFont(new java.awt.Font("Apple Braille", 3, 36)); // NOI18N
        lblManageAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageAdmin.setText("SHIPMENT PERSON");
        add(lblManageAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 590, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnMarkAsDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkAsDeliveredActionPerformed
        int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        int orderid = (int)tblOrder.getValueAt(selectedRow,6);
        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
                    Order order = (Order)wr;
                    if(order.getId()==orderid){
                        order.setStatus("Delivered");
                    }
        }
    }//GEN-LAST:event_btnMarkAsDeliveredActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMarkAsDelivered;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageAdmin;
    private javax.swing.JTable tblOrder;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        dtm.setRowCount(0);

            
                for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
                    Order order = (Order)wr;
                    if(order.getDeliveryManager()==userAccount){
                    Object[] row = new Object[7];
                    row[0] = order.getVaccineName();
                    row[1] = order.getReceiver();
                    row[2] = order.getSender();
                    row[3] = order.getStatus();
                    row[4] = order.getQuantity();
                    row[5] = order.getMessage();
                    row[6] = order.getId();

                    dtm.addRow(row);
                    }
                }
  
     
    }
}
