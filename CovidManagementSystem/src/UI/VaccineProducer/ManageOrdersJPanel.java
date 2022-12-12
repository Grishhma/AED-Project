/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.VaccineProducer;

import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Enterprise.VaccineProducer;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import System.Vaccine.Vaccine;
import System.WorkLine.Order;
import System.WorkLine.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author infi
 */
public class ManageOrdersJPanel extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Place city;
    public ManageOrdersJPanel(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization, 
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        lblManageOrders = new javax.swing.JLabel();
        btnReadyToDeliver = new javax.swing.JButton();
        AssignBtn1 = new javax.swing.JButton();
        btnDenyOrder = new javax.swing.JButton();
        lblAvailableStock = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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
                "Vaccine", "Receiver", "Sender", "Status", "Quantity", "Message", "Order ID"
            }
        ));
        jScrollPane1.setViewportView(tblOrder);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 850, 183));

        lblManageOrders.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        lblManageOrders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageOrders.setText("MANAGING VACCINATION ORDERS");
        add(lblManageOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 1090, 70));

        btnReadyToDeliver.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnReadyToDeliver.setText("Ready to Deliver");
        btnReadyToDeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadyToDeliverActionPerformed(evt);
            }
        });
        add(btnReadyToDeliver, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, 160, 30));

        AssignBtn1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        AssignBtn1.setText("Assign to Delivery Man ");
        AssignBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignBtn1ActionPerformed(evt);
            }
        });
        add(AssignBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 160, 30));

        btnDenyOrder.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnDenyOrder.setText("Deny Order");
        btnDenyOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyOrderActionPerformed(evt);
            }
        });
        add(btnDenyOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, 160, 30));

        lblAvailableStock.setBackground(new java.awt.Color(255, 255, 51));
        lblAvailableStock.setForeground(new java.awt.Color(214, 229, 244));
        lblAvailableStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 147, 209)));
        add(lblAvailableStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 190, 20));

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton1.setText("Available Stock");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 130, 30));

        jButton2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 380, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnReadyToDeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadyToDeliverActionPerformed
        //System.out.println(enterprise.getWorkQueue().getWorkRequestList());
        int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        //System.out.println(tblOrder.getValueAt(selectedRow, 0));
        Order placeorder=null;
        int orderid  = (int)tblOrder.getValueAt(selectedRow, 6);
        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
                    Order order = (Order)wr;
                    if(order.getId()==orderid){
                        placeorder=order;
                    }
        }
            if(placeorder.getStatus().equals("Ready to Deliver")){
                JOptionPane.showMessageDialog(null,"Already Ready");
            } else if (placeorder.getStatus().equals("Active") || (placeorder.getStatus().equals("Order Denied"))){
            placeorder.setStatus("Ready to Deliver");
            }
            else{
                JOptionPane.showMessageDialog(this,"Already ready to deliver");
            }
            for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
                    Order order = (Order)wr;
                    if(order.getId()==placeorder.getId()){
                        order.setStatus("Ready to deliver");
                    }
            }    
            populateTable();
    }//GEN-LAST:event_btnReadyToDeliverActionPerformed

    private void AssignBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignBtn1ActionPerformed
       int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        //System.out.println(tblOrder.getValueAt(selectedRow, 0));
        Order placeorder=null;
        int orderid  = (int)tblOrder.getValueAt(selectedRow, 6);
        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
                    Order order = (Order)wr;
                    if(order.getId()==orderid){
                        placeorder=order;
                    }
        }
        AssignShipmentManagerJPanel assignDeliveryManagerJPanel = new AssignShipmentManagerJPanel(userProcessContainer, city, userAccount, organization, enterprise, system, placeorder);
       userProcessContainer.add("assignDeliveryManagerJPanel", assignDeliveryManagerJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_AssignBtn1ActionPerformed

    private void btnDenyOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyOrderActionPerformed
int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        //System.out.println(tblOrder.getValueAt(selectedRow, 0));
        Order placeorder=null;
        int orderid  = (int)tblOrder.getValueAt(selectedRow, 6);
        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
                    Order order = (Order)wr;
                    if(order.getId()==orderid){
                        placeorder=order;
                    }
        }
            if(placeorder.getStatus().equals("Ready to deliver")){
                JOptionPane.showMessageDialog(null,"Cannot Deny Order");
            } else if (placeorder.getStatus().equals("Active")){
            placeorder.setStatus("Order Denied");
            }
            else{
                JOptionPane.showMessageDialog(this,"Order already denied");
            }
            for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
                    Order order = (Order)wr;
                    if(order.getId()==placeorder.getId()){
                        order.setStatus("Order Denied");
                    }
            }    
            populateTable();
    }//GEN-LAST:event_btnDenyOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VaccineProducer e =(VaccineProducer)enterprise;
        int count = 0;
        for(Vaccine vaccine: e.getVaccineDirectory().getVaccDir()){
          count = count+vaccine.getQty();
        }
        lblAvailableStock.setText(String.valueOf(count));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VaccineProducerAdminJPanel manageOrderjp = (VaccineProducerAdminJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignBtn1;
    private javax.swing.JButton btnDenyOrder;
    private javax.swing.JButton btnReadyToDeliver;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailableStock;
    private javax.swing.JLabel lblManageOrders;
    private javax.swing.JTable tblOrder;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        dtm.setRowCount(0);

            
                for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
                    Order order = (Order)wr;
                    
                    Object[] row = new Object[7];
                    row[0] = order.getVaccineName();
                    row[1] = order.getReceiver();
                    row[2] = order.getSender();
                    row[3] = order.getStatus();
                    row[4] = order.getQuantity();
                    row[5] = order.getMessage();
                    row[6] = order.getId();

                    dtm.addRow(row);
                
                }//To change body of generated methods, choose Tools | Templates.
  
    }
}
