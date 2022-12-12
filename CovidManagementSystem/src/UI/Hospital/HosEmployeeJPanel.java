
package UI.Hospital;

import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Acer
 */
public class HosEmployeeJPanel extends javax.swing.JPanel {

 
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Place city;
    public HosEmployeeJPanel(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization, 
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

        btnManageVitalSign = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageVitalSign.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnManageVitalSign.setText("Manage Vital Signs");
        btnManageVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVitalSignActionPerformed(evt);
            }
        });
        add(btnManageVitalSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 270, 70));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HELLO, EMPLOYEES");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 70, 630, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVitalSignActionPerformed
        // TODO add your handling code here:
        ManageVitalSignsResultJPanel manageVitalSignsJPanel = new ManageVitalSignsResultJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
        userProcessContainer.add("manageTestCenterJPanel", manageVitalSignsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageVitalSignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageVitalSign;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
