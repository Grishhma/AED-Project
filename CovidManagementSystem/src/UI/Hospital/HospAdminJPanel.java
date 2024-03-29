
package UI.Hospital;

import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import static System.Enterprise.Enterprise.EnterpriseType.Hospital;
import System.Enterprise.Hospital;
import System.Organization.Organization;
import System.Patient.Patient;
import System.Patient.PatientDirectory;
import System.UserAccount.UserAccount;
import System.WorkLine.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Acer
 */
public class HospAdminJPanel extends javax.swing.JPanel {

  
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Place city;
    public HospAdminJPanel(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization, 
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

        btnManageDoctor = new javax.swing.JButton();
        btnManagePatient = new javax.swing.JButton();
        btnManageStaff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSendVC = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageDoctor.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnManageDoctor.setText("Manage Doctor");
        btnManageDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDoctorActionPerformed(evt);
            }
        });
        add(btnManageDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 230, 40));

        btnManagePatient.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnManagePatient.setText("Manage Patient");
        btnManagePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientActionPerformed(evt);
            }
        });
        add(btnManagePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 230, 40));

        btnManageStaff.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnManageStaff.setText("Manage Staff");
        btnManageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStaffActionPerformed(evt);
            }
        });
        add(btnManageStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 230, 40));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME, HOSPITAL ADMIN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 1210, 70));

        btnSendVC.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnSendVC.setText("Send Non-Vaccinated People");
        btnSendVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendVCActionPerformed(evt);
            }
        });
        add(btnSendVC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, 230, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDoctorActionPerformed
        // TODO add your handling code here:
        ManageDoctorJPanel manageDoctorJPanel = new ManageDoctorJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
        userProcessContainer.add("manageDoctorJPanel", manageDoctorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDoctorActionPerformed

    private void btnManagePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientActionPerformed
        // TODO add your handling code here:
        ManagePatientJPanel managePatientJPanel = new ManagePatientJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
        userProcessContainer.add("managePatientJPanel", managePatientJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePatientActionPerformed

    private void btnManageStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStaffActionPerformed
        // TODO add your handling code here:
        ManageHosEmployeePanel manageStaffJPanel = new ManageHosEmployeePanel(userProcessContainer, city, userAccount, organization, enterprise, system);
        userProcessContainer.add("manageStaffJPanel", manageStaffJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageStaffActionPerformed

    private void btnSendVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendVCActionPerformed
        VaccineRequest pr = new VaccineRequest(userProcessContainer, city, userAccount, organization, enterprise, system);
        userProcessContainer.add("pr", pr);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSendVCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageDoctor;
    private javax.swing.JButton btnManagePatient;
    private javax.swing.JButton btnManageStaff;
    private javax.swing.JButton btnSendVC;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
