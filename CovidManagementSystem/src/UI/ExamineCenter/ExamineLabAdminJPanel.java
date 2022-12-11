
package UI.ExamineCenter;

import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author infi
 */
public class ExamineLabAdminJPanel extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Place city;
    public ExamineLabAdminJPanel(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization, 
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

        btnManageResult = new javax.swing.JButton();
        lblProducerAdmin = new javax.swing.JLabel();
        btnNewReportResult = new javax.swing.JButton();
        btnManageScheduledExamination = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageResult.setBackground(new java.awt.Color(153, 0, 153));
        btnManageResult.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        btnManageResult.setForeground(new java.awt.Color(255, 255, 255));
        btnManageResult.setText("Maintain Test Reports");
        btnManageResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageResultActionPerformed(evt);
            }
        });
        add(btnManageResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 230, 50));

        lblProducerAdmin.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        lblProducerAdmin.setForeground(new java.awt.Color(51, 51, 51));
        lblProducerAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProducerAdmin.setText("EXAMINE LAB ADMIN");
        add(lblProducerAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 720, 80));

        btnNewReportResult.setBackground(new java.awt.Color(153, 0, 153));
        btnNewReportResult.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        btnNewReportResult.setForeground(new java.awt.Color(255, 255, 255));
        btnNewReportResult.setText("New Report");
        btnNewReportResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewReportResultActionPerformed(evt);
            }
        });
        add(btnNewReportResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 230, 50));

        btnManageScheduledExamination.setBackground(new java.awt.Color(153, 0, 153));
        btnManageScheduledExamination.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        btnManageScheduledExamination.setForeground(new java.awt.Color(255, 255, 255));
        btnManageScheduledExamination.setText("Maintain Scheduled Tests");
        btnManageScheduledExamination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageScheduledExaminationActionPerformed(evt);
            }
        });
        add(btnManageScheduledExamination, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 250, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageResultActionPerformed
        // TODO add your handling code here:
        ManageExamineResultsJPanel manageTestReportsJPanel = new ManageExamineResultsJPanel(system, userProcessContainer);
        userProcessContainer.add("manageTestReportsJPanel", manageTestReportsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageResultActionPerformed

    private void btnNewReportResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewReportResultActionPerformed
        // TODO add your handling code here:
        NewResultsJPanel newReportJPanel = new NewResultsJPanel(system, userProcessContainer);
        userProcessContainer.add("newReportJPanel", newReportJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNewReportResultActionPerformed

    private void btnManageScheduledExaminationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageScheduledExaminationActionPerformed
        // TODO add your handling code here:
        ManageScheduledExamineJPanel manageScheduledTestReports = new ManageScheduledExamineJPanel(userProcessContainer, system, enterprise);
        userProcessContainer.add("manageScheduledTestReports", manageScheduledTestReports );
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageScheduledExaminationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageResult;
    private javax.swing.JButton btnManageScheduledExamination;
    private javax.swing.JButton btnNewReportResult;
    private javax.swing.JLabel lblProducerAdmin;
    // End of variables declaration//GEN-END:variables
}
