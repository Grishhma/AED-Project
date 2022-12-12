/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PersonWorkArea;

/**
 *
 * @author infi
 */
public class PersonJPanel extends javax.swing.JPanel {

    
    public PersonJPanel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlacewiseVaccinationStatus = new javax.swing.JButton();
        btnTotalPositiveCovidCases = new javax.swing.JButton();
        btnHospitalWiseBedsAvailable = new javax.swing.JButton();
        lbPatientPanel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPlacewiseVaccinationStatus.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnPlacewiseVaccinationStatus.setText("Citywise Vaccination Status");
        btnPlacewiseVaccinationStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlacewiseVaccinationStatusActionPerformed(evt);
            }
        });
        add(btnPlacewiseVaccinationStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 230, 30));

        btnTotalPositiveCovidCases.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnTotalPositiveCovidCases.setText("Total Positive Cases");
        btnTotalPositiveCovidCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalPositiveCovidCasesActionPerformed(evt);
            }
        });
        add(btnTotalPositiveCovidCases, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 231, 30));

        btnHospitalWiseBedsAvailable.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnHospitalWiseBedsAvailable.setText("Hospital Wise Beds Available");
        btnHospitalWiseBedsAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalWiseBedsAvailableActionPerformed(evt);
            }
        });
        add(btnHospitalWiseBedsAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 310, 230, 30));

        lbPatientPanel.setBackground(new java.awt.Color(255, 255, 255));
        lbPatientPanel.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        lbPatientPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPatientPanel.setText("PATIENT PANEL");
        add(lbPatientPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 550, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlacewiseVaccinationStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlacewiseVaccinationStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlacewiseVaccinationStatusActionPerformed

    private void btnTotalPositiveCovidCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalPositiveCovidCasesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTotalPositiveCovidCasesActionPerformed

    private void btnHospitalWiseBedsAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalWiseBedsAvailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHospitalWiseBedsAvailableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHospitalWiseBedsAvailable;
    private javax.swing.JButton btnPlacewiseVaccinationStatus;
    private javax.swing.JButton btnTotalPositiveCovidCases;
    private javax.swing.JLabel lbPatientPanel;
    // End of variables declaration//GEN-END:variables
}
