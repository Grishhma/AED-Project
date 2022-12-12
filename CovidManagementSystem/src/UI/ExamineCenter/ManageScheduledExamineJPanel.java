package UI.ExamineCenter;

import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Person.Person;
import System.WorkLine.ExaminePatient;
import System.WorkLine.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author infi
 */
public class ManageScheduledExamineJPanel extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    EcoSystem system;
    Enterprise enterprise;

    public ManageScheduledExamineJPanel(JPanel userProcessContainer, EcoSystem system, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.enterprise = enterprise;
        populateScheduledTests();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        lblCreateTestReport = new javax.swing.JLabel();
        comboReport = new javax.swing.JComboBox<>();
        lblReport = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scheduledPatientTable = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 413, 90, 40));

        lblCreateTestReport.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        lblCreateTestReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateTestReport.setText("SCHEDULED YOUR TEST");
        add(lblCreateTestReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 400, -1));

        comboReport.setBackground(new java.awt.Color(214, 229, 244));
        comboReport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Detected", "Non-detected" }));
        add(comboReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 211, -1));

        lblReport.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblReport.setText("Report:");
        add(lblReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, 20));

        txtName.setBackground(new java.awt.Color(214, 229, 244));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 212, -1));

        lblID.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblID.setText("ID:");
        add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, -1, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, 90, 40));

        jScrollPane1.setBackground(new java.awt.Color(214, 229, 244));

        scheduledPatientTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(scheduledPatientTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 500, 183));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, -1, -1));

        txtID.setBackground(new java.awt.Color(214, 229, 244));
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 212, -1));

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String personID = txtID.getText();
        String personName = txtName.getText();
//        System.out.println(date);
        Boolean result = false;
        if (comboReport.getSelectedItem().toString().equals("Detected")) {
            result = true;
        } else {
            result = false;
        }

        for (Person person : system.getPersonDirectory().getPersonList()) {
            if (personName.equals(person.getName())) {
                person.getTestHistory().newTestReport(result);
                JOptionPane.showMessageDialog(this, "Report Created");
                                System.out.println( person.getTestHistory().getTestReportList().get(0));
            }
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ExamineLabAdminJPanel sysAdminwjp = (ExamineLabAdminJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = scheduledPatientTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) scheduledPatientTable.getModel();
            int patientID = (int) dtm.getValueAt(selectedRow, 0);
            String patientName = (String) dtm.getValueAt(selectedRow, 1);

            txtID.setText(String.valueOf(patientID));
            txtName.setText(patientName);

        }
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> comboReport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateTestReport;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblReport;
    private javax.swing.JTable scheduledPatientTable;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void populateScheduledTests() {
        DefaultTableModel dtm = (DefaultTableModel) scheduledPatientTable.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
            ExaminePatient tp = (ExaminePatient) wr;
            System.out.println(tp);

            Object[] row = new Object[2];
            row[0] = tp.getPatientID();
            row[1] = tp.getPatientName();
            dtm.addRow(row);

        }

    }
}
