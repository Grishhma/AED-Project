
package UI.SystemAdminWorkArea;

import System.Place.Place;
import System.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author infi
 */
public class ManageCityJPanel extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public ManageCityJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;
        populateCityTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNewVaccinationPlace = new javax.swing.JLabel();
        lblPlaceName = new javax.swing.JLabel();
        txtPlaceName = new javax.swing.JTextField();
        btnCreatePlace = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNewVaccinationPlace.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        lblNewVaccinationPlace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewVaccinationPlace.setText("Maintain Place");
        add(lblNewVaccinationPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 580, -1));

        lblPlaceName.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblPlaceName.setText("Place Name:");
        add(lblPlaceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, -1, -1));
        add(txtPlaceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 220, -1));

        btnCreatePlace.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCreatePlace.setText("Create");
        btnCreatePlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePlaceActionPerformed(evt);
            }
        });
        add(btnCreatePlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 110, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Place"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 390, 210));

        btnBack.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePlaceActionPerformed
        // TODO add your handling code here:
        String name = txtPlaceName.getText();
        
        Place city = ecosystem.createCity();
        city.setName(name);
        
        populateCityTable();
        txtPlaceName.setText("");
    }//GEN-LAST:event_btnCreatePlaceActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreatePlace;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNewVaccinationPlace;
    private javax.swing.JLabel lblPlaceName;
    private javax.swing.JTextField txtPlaceName;
    // End of variables declaration//GEN-END:variables

    private void populateCityTable() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for(Place city: ecosystem.getCityList()){
            Object[] row = new Object[1];
            row[0] = city.getName();
            dtm.addRow(row);
        }
    }
}
