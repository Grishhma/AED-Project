
package UI.VaccineCenter;

import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import static System.Enterprise.Enterprise.EnterpriseType.VaccineManufacturer;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import System.WorkLine.Order;
import System.WorkLine.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class ViewVaccineStockJPanel extends javax.swing.JPanel {

   
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Place city;
    public ViewVaccineStockJPanel(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system){
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
        tblStock = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblManufacturereAdmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Vaccine Name", "Batch ID", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(tblStock);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 570, 158));

        btnRefresh.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 400, 90, 30));

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 90, 30));

        lblManufacturereAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManufacturereAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManufacturereAdmin.setText("STOCKS");
        add(lblManufacturereAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 980, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VaccineCenterAdminJPanel vaccinationCenterjp = (VaccineCenterAdminJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManufacturereAdmin;
    private javax.swing.JTable tblStock;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblStock.getModel();
        dtm.setRowCount(0);
         
       
         for(Place c : system.getCityList()){
             
           for(Enterprise e : c.getEnterpriseDirectory().getEnterpriseList()){
               
               if(e.getClass().getName().equals("System.Enterprise.VaccineProducer")){
                   //System.out.println(e);
                    for(UserAccount user:enterprise.getUserAccountDirectory().getUserAccountList()){
                        
                        for(WorkRequest wr:e.getWorkQueue().getWorkRequestList()){
                           Order order = (Order)wr;
                           //System.out.println(order.getSender()==user);
                           if(order.getSender()==user && order.getStatus().equals("Delivered")){
                               //System.out.println(order);
                               Object[] row = new Object[3];
                                row[0] = order;
                                row[1] = order.getId();
                                row[2] = order.getQuantity();
                            dtm.addRow(row);
                           }
                       }
                   }
               }
           }
       }
    }
}