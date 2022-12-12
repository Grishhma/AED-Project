
package UI.VaccineProducer;

import System.Place.Place;
import System.ShipmentPerson.ShipmentPerson;
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
 * @author infi
 */
public class AssignShipmentManagerJPanel extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Place city;
    Order order;
    public AssignShipmentManagerJPanel(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system, Order order) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.userAccount=userAccount;
        this.city=city;
        this.organization=organization;
        this.enterprise=enterprise;
        this.order=order;
        populateTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblShipmentManager = new javax.swing.JTable();
        btnAssignOrder = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblShipmentManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Shipment Manager Name", "ID"
            }
        ));
        jScrollPane1.setViewportView(tblShipmentManager);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 550, 160));

        btnAssignOrder.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnAssignOrder.setText("Assign Order");
        btnAssignOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignOrderActionPerformed(evt);
            }
        });
        add(btnAssignOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 110, 30));

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 90, 30));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ASSIGN SHIPMENT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 960, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignOrderActionPerformed
    try{
        int selectedRow = tblShipmentManager.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        
        UserAccount deliveryManager  = (UserAccount) tblShipmentManager.getValueAt(selectedRow, 0);
        
        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
                    Order order1 = (Order)wr;
                    if(order1.getId()==order.getId()){
                        order.setDeliveryManager(deliveryManager);
                    }
        }
        JOptionPane.showMessageDialog(this, "Order is Assigned");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this,"Order is NOT Assigned");
    }
    }//GEN-LAST:event_btnAssignOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageOrdersJPanel manageOrderjp = (ManageOrdersJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignOrder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblShipmentManager;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel)tblShipmentManager.getModel();
        
        model.setRowCount(0);
        
        for(UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()){
            if((userAccount.getRole().getClass().getName()).equals("System.Role.ShipmentManagerRole")){
               Object[] row = new Object[2];
               
                row[0] = userAccount;
                row[1] = userAccount.getEmployee().getId();
         
                
                model.addRow(row);
            }
        }//To change body of generated methods, choose Tools | Templates.
    }
}
