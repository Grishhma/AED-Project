
package UI.Hospital;

import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Enterprise.Hospital;
import System.Organization.Organization;
import System.Patient.Patient;
import System.UserAccount.UserAccount;
import System.WorkLine.ExaminePatient;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riddhivora
 */
public class ManagePatientsDischargeJPanel extends javax.swing.JPanel {

   
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Place city;

    public ManagePatientsDischargeJPanel(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization,
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.city = city;
        this.organization = organization;
        populateTestingCombo();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        lblManagePatient = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        lblSearch1 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        lblSearch2 = new javax.swing.JLabel();
        comboTestingCenters = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearch.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnSearch.setText("Populate Patients");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 160, 30));

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ));
        jScrollPane1.setViewportView(tblPatients);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 790, 183));

        lblManagePatient.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        lblManagePatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManagePatient.setText("PATIENT RECORD");
        add(lblManagePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1288, -1));

        btnView.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 110, 30));

        lblSearch1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblSearch1.setText("Patient Name:");
        add(lblSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, -1, -1));
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 220, -1));

        lblSearch2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblSearch2.setText("Testing Lab:");
        add(lblSearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, -1, -1));

        comboTestingCenters.setBackground(new java.awt.Color(214, 229, 244));
        comboTestingCenters.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboTestingCenters, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 220, -1));

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton1.setText("Schedule Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void populateTestingCombo() {
        comboTestingCenters.removeAllItems();
        for (Place ecity : system.getCityList()) {
            for (Enterprise e : ecity.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getEnterpriseType().toString().equals("TestingLab")) {
                    comboTestingCenters.addItem(e.getName());
                }
            }

        }

    }

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        populatePatientTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatients.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblPatients.getModel();
            String patient = (String) dtm.getValueAt(selectedRow, 0);
//            System.out.print(patient);
            txtPatientName.setText(patient);
        }
//    
    }//GEN-LAST:event_btnViewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatients.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Row");
        } else {

            DefaultTableModel dtm = (DefaultTableModel) tblPatients.getModel();
            String patientName = (String) dtm.getValueAt(selectedRow, 0);
            int patientID = (int) dtm.getValueAt(selectedRow, 1);
//            System.out.println(patientName);
//            System.out.println(patientID);
            String receiver = comboTestingCenters.getSelectedItem().toString();
            String status = "Null";
//            System.out.println(receiver);


            for (Place city : system.getCityList()) {
                for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseList()) {
                    if(e.getName().equals(receiver)){
                          System.out.println(e.getName());
                          UserAccount account = e.getUserAccountDirectory().getUserAccountList().get(0);
                          ExaminePatient testingPatient = e.getWorkQueue().addWorkRequestList3(patientName, userAccount, account, status);
                          testingPatient.setPatientID(patientID);
                          testingPatient.setPatientName(patientName);
                          JOptionPane.showMessageDialog(this, "Test Scheduled");
                         
                    }
                    

                }
            }
            

        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> comboTestingCenters;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManagePatient;
    private javax.swing.JLabel lblSearch1;
    private javax.swing.JLabel lblSearch2;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables

    private void populatePatientTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblPatients.getModel();
        dtm.setRowCount(0);
        Hospital hospitalEnterprise = (Hospital) enterprise;
        String doctorName = userAccount.getEmployee().getName();
//                 System.out.println(doctorName);

        for (Patient p : hospitalEnterprise.getPatientDirectory().getPatientDir()) {
            if (p.getDoctorName().equals(doctorName)) {
                Object[] row = new Object[2];
                row[0] = p.getName();
                row[1] = p.getPatientID();
                dtm.addRow(row);
            }

        }
    }
    //  }                
    //} 
}
