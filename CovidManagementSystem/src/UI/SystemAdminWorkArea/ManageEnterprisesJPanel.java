
package UI.SystemAdminWorkArea;

import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Enterprise.EnterpriseDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class ManageEnterprisesJPanel extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    EcoSystem system;
    EnterpriseDirectory enterprise;
    public ManageEnterprisesJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.system=system;
        this.enterprise=enterprise;
        populateTable();
        populateComboBox();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateEntireprize = new javax.swing.JButton();
        lblManageTesting = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprise = new javax.swing.JTable();
        lblIDD = new javax.swing.JLabel();
        lblCitty = new javax.swing.JLabel();
        lblEnterpriseTypee = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox();
        cmbEnterpriseType = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreateEntireprize.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCreateEntireprize.setText("Create");
        btnCreateEntireprize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEntireprizeActionPerformed(evt);
            }
        });
        add(btnCreateEntireprize, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, 100, 40));

        lblManageTesting.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        lblManageTesting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageTesting.setText("Maintain Enterprise");
        add(lblManageTesting, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 970, -1));
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 260, 212, 30));

        lblName.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, -1, 10));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, 212, 30));

        tblEnterprise.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "EnterpriseID", "City", "Type"
            }
        ));
        jScrollPane1.setViewportView(tblEnterprise);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 630, 183));

        lblIDD.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        lblIDD.setText("ID:");
        add(lblIDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, -1, -1));

        lblCitty.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        lblCitty.setText("City:");
        add(lblCitty, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 30, 20));

        lblEnterpriseTypee.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        lblEnterpriseTypee.setText("Enterprise Type:");
        add(lblEnterpriseTypee, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, -1, 20));

        cmbCity.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        cmbCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCityActionPerformed(evt);
            }
        });
        add(cmbCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 160, 210, -1));

        cmbEnterpriseType.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        cmbEnterpriseType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEnterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseTypeActionPerformed(evt);
            }
        });
        add(cmbEnterpriseType, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 210, 210, -1));

        btnBack.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 100, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEntireprizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEntireprizeActionPerformed
        Place city = (Place) cmbCity.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) cmbEnterpriseType.getSelectedItem();
        String name = txtName.getText();
        int id = Integer.parseInt(txtID.getText());
        if(!city.getEnterpriseDirectory().checkIfIDIsUnique(id)){
            JOptionPane.showMessageDialog(null, String.format("Enterprise ID %s already exists!", id),"Warning",JOptionPane.ERROR_MESSAGE);
        }
        else if (city == null || type == null || name == null ) {
            JOptionPane.showMessageDialog(null, "Invalid Input!"); 
            return;
        }
        else{
            Enterprise enterprise = city.getEnterpriseDirectory().createAndAddEnterprise(name , type, id);

        }


        populateTable();
        txtName.setText("");
        txtID.setText("");
    }//GEN-LAST:event_btnCreateEntireprizeActionPerformed

    private void cmbEnterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterpriseTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEnterpriseTypeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
               sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEntireprize;
    private javax.swing.JComboBox cmbCity;
    private javax.swing.JComboBox cmbEnterpriseType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCitty;
    private javax.swing.JLabel lblEnterpriseTypee;
    private javax.swing.JLabel lblIDD;
    private javax.swing.JLabel lblManageTesting;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();

        model.setRowCount(0);
        for (Place city : system.getCityList()) {
            for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[4];
                row[0] = enterprise;
                row[1] = enterprise.getEnterpriseId();
                row[2] = city.getName();
                row[3] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        cmbCity.removeAllItems();
        cmbEnterpriseType.removeAllItems();

        for (Place city : system.getCityList()) {
            cmbCity.addItem(city);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            cmbEnterpriseType.addItem(type);
        } 
    }
}
