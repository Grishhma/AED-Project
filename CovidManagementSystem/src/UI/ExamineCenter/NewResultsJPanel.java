
package UI.ExamineCenter;

import System.EcoSystem;
import System.Person.Person;
import System.ExamineReport.ExamineResult;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author infi
 */
public class NewResultsJPanel extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    EcoSystem system;
    public NewResultsJPanel(EcoSystem system, JPanel userProcessContainer) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        lblCreateTestReport = new javax.swing.JLabel();
        lblReport = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personResultTable = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        comboReport = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 620, -1, -1));

        lblCreateTestReport.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        lblCreateTestReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateTestReport.setText("NEW TEST RESULTS");
        add(lblCreateTestReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 740, -1));

        lblReport.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblReport.setText("Report:");
        add(lblReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, -1, -1));

        txtName.setBackground(new java.awt.Color(214, 229, 244));
        txtName.setEnabled(false);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 212, -1));

        lblID.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblID.setText("ID:");
        add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        personResultTable.setBackground(new java.awt.Color(214, 229, 244));
        personResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Age", "Address", "Zipcode", "Phone No", "Community"
            }
        ));
        jScrollPane1.setViewportView(personResultTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 890, 240));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, -1, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, -1));

        txtID.setBackground(new java.awt.Color(214, 229, 244));
        txtID.setEnabled(false);
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 212, -1));

        txtSearch.setBackground(new java.awt.Color(214, 229, 244));
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 220, -1));

        lblSearch.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblSearch.setText("Person Name:");
        add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        comboReport.setBackground(new java.awt.Color(214, 229, 244));
        comboReport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Detected", "Non-detected" }));
        add(comboReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 210, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 660, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String search = txtSearch.getText();
        
        DefaultTableModel dtm = (DefaultTableModel) personResultTable.getModel();
        dtm.setRowCount(0);
        Object[] row = new Object[7];
        boolean flag = false;
        for(Person person: system.getPersonDirectory().getPersonList()){
//            System.out.println(person);
            if((search).equals(person.getName())){
                row[0] = person;
                row[1] = person.getPersonID();
                row[2] = person.getAge();
                row[3] = person.getStreet();
                row[4] = person.getZipcode();
                row[5] = person.getPhoneNo();
                row[6] = person.getCommunity();
                dtm.addRow(row);
                flag = true;
                
                txtID.setText(String.valueOf(person.getPersonID()));
                txtName.setText(person.getName());
            
            
        }
        }
        if(!flag){
            JOptionPane.showMessageDialog(null, "Person  not present", "Warning", JOptionPane.WARNING_MESSAGE);
            txtID.setText("");
            txtName.setText("");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        //String personID = txtID.getText();
        //String personName = txtName.getText();
//        String date = txtDate.getText();
//        System.out.println(date);
        Boolean result = false;
        if(comboReport.getSelectedItem().toString().equals("Detected")){
            result = true;
        }
        else{
             result = false;
        }
        for(Person person: system.getPersonDirectory().getPersonList()){
            if(txtSearch.getText().equals(person.getName())){
                person.getTestHistory().newTestReport(result);
                JOptionPane.showMessageDialog(this, "Report Created");
                
//                System.out.println(date);
                
//                System.out.println( person.getTestHistory().getTestReportList().get(0));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboReport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateTestReport;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable personResultTable;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
