
package UI.ExamineCenter;

import System.EcoSystem;
import System.Person.Person;
import System.ExamineReport.ExamineResult;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author infi
 */
public class ManageExamineResultsJPanel extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    EcoSystem system;
    public ManageExamineResultsJPanel(EcoSystem system, JPanel userProcessContainer) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        populateTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        personResultTable = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        lblManagePatient = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Result"
            }
        ));
        jScrollPane1.setViewportView(personResultTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 855, 183));

        btnSearch.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 100, -1));
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 220, -1));

        lblSearch.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        lblSearch.setText("Person Name:");
        add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 110, 30));

        lblManagePatient.setFont(new java.awt.Font("Arial Narrow", 3, 24)); // NOI18N
        lblManagePatient.setForeground(new java.awt.Color(51, 51, 51));
        lblManagePatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManagePatient.setText("MAINTAIN TEST RESULTS");
        add(lblManagePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 740, -1));

        btnBack.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String search = txtSearch.getText();
        
        DefaultTableModel dtm = (DefaultTableModel) personResultTable.getModel();
        dtm.setRowCount(0);
        Object[] row = new Object[4];
        for(Person person: system.getPersonDirectory().getPersonList()){
//            System.out.println(person);
            if(person.getName().equals(search)){
                ArrayList<ExamineResult> testReports = person.getTestHistory().getTestReportList();
            for(ExamineResult report: testReports){
                row[0] = person.getPersonID();
                row[1] = person.getName();
                row[2] = report.isResult();
                dtm.addRow(row);
            }
            
            
            }
            
           
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManagePatient;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable personResultTable;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) personResultTable.getModel();
        dtm.setRowCount(0);
        Object[] row = new Object[4];
        for(Person person: system.getPersonDirectory().getPersonList()){
//            System.out.println(person);
                ArrayList<ExamineResult> testReports = person.getTestHistory().getTestReportList();
            for(ExamineResult report: testReports){
                row[0] = person.getPersonID();
                row[1] = person.getName();
                row[2] = report.isResult();
                dtm.addRow(row);
            }
            
            
            
            
           
        }
    }

}
