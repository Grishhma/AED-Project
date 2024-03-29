
package UI.SystemAdminWorkArea;

import System.EcoSystem;
import System.Person.Person;
import System.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class ManagePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainPersonJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public ManagePersonJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;

        populatePersonTable();
        btnUpdatee.setEnabled(false);
        btnDelete.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPhonee = new javax.swing.JTextField();
        lblStreett = new javax.swing.JLabel();
        lblPhonee = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        txtEmaill = new javax.swing.JTextField();
        lblApartment = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtComm = new javax.swing.JTextField();
        btnUpdatee = new javax.swing.JButton();
        lblComm = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        lblMaintainPerson = new javax.swing.JLabel();
        lblNamee = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbpersonTablee = new javax.swing.JTable();
        txtStreett = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtNamme = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtAage = new javax.swing.JTextField();
        lblAage = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPhonee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneeActionPerformed(evt);
            }
        });
        add(txtPhonee, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, 212, -1));

        lblStreett.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblStreett.setText("Street:");
        add(lblStreett, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, -1, -1));

        lblPhonee.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblPhonee.setText("Phone No:");
        add(lblPhonee, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, -1, -1));
        add(txtZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 212, -1));
        add(txtEmaill, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, 212, -1));

        lblApartment.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblApartment.setText("Zip Code:");
        add(lblApartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, -1, -1));

        lblEmail.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblEmail.setText("Email:");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, -1, -1));
        add(txtComm, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 650, 212, -1));

        btnUpdatee.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnUpdatee.setText("Update");
        btnUpdatee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateeActionPerformed(evt);
            }
        });
        add(btnUpdatee, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 710, -1, -1));

        lblComm.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblComm.setText("Community:");
        add(lblComm, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, -1, -1));

        btnView.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, -1, -1));

        btnCreate.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 710, -1, -1));

        lblMaintainPerson.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        lblMaintainPerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaintainPerson.setText("MANAGE PERSON");
        add(lblMaintainPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 62, 880, -1));

        lblNamee.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblNamee.setText("Name:");
        add(lblNamee, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, -1));

        tbpersonTablee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Street", "Zipcode", "Age", "Community", "Phone No", "Email"
            }
        ));
        jScrollPane1.setViewportView(tbpersonTablee);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 129, 980, 183));
        add(txtStreett, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 212, -1));

        btnDelete.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 340, -1, -1));
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 212, -1));
        add(txtNamme, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 212, -1));

        lblID.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblID.setText("ID:");
        add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));
        add(txtAage, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 212, -1));

        lblAage.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblAage.setText("Age:");
        add(lblAage, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, -1, -1));

        btnBack.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 770, -1, -1));

        btnCancel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 710, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        int ID = Integer.parseInt(txtID.getText());
        String name = txtNamme.getText();
        String street = txtStreett.getText();
        String zipcode = txtZip.getText();
        int age = Integer.parseInt(txtAage.getText());
        String community = txtComm.getText();
        String phoneNo = txtPhonee.getText();
        String email = txtEmaill.getText();

        if (txtID.getText().isEmpty() || txtAage.getText().isEmpty() || name.isEmpty() || street.isEmpty() || zipcode.isEmpty() || community.isEmpty() || phoneNo.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty Fields", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (phoneNo.length() != 10) {
            JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (validateEmail(email) == false) {
            JOptionPane.showMessageDialog(null, "Invalid Email", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if (zipcode.length() != 5) {
            JOptionPane.showMessageDialog(null, "Invalid Zipcode", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        else if(!ecosystem.getPersonDirectory().checkIfIDIsUnique(ID)){
            JOptionPane.showMessageDialog(null, String.format("Person ID %s already exists!", ID),"Warning",JOptionPane.ERROR_MESSAGE);
        }
        else if(!ecosystem.getPersonDirectory().checkIfNameIsUnique(name)){
            JOptionPane.showMessageDialog(null, String.format("Person name %s already exists!", name),"Warning",JOptionPane.ERROR_MESSAGE);
        }
        else if(!ecosystem.getPersonDirectory().checkIfEmailIsUnique(email)){
            JOptionPane.showMessageDialog(null, String.format("Person email %s already exists!", email),"Warning",JOptionPane.ERROR_MESSAGE);
        }
        else{
            ecosystem.getPersonDirectory().newPerson(ID, name, street, zipcode, age, community, phoneNo, email);
            populatePersonTable();
            JOptionPane.showMessageDialog(null, "Person Created");
        }
        
//        System.out.println(ecosystem.getPersonDirectory().getPersonList());

        txtID.setText("");
        txtNamme.setText("");
        txtStreett.setText("");
        txtZip.setText("");
        txtAage.setText("");
        txtPhonee.setText("");
        txtEmaill.setText("");
        txtComm.setText("");

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tbpersonTablee.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Row");
        } else {
            btnUpdatee.setEnabled(true);
            btnDelete.setEnabled(true);
            txtID.setEnabled(false);
            DefaultTableModel model = (DefaultTableModel) tbpersonTablee.getModel();
//            UserAccount selectedUser = (UserAccount) model.getValueAt(selectedRow, 0);
            Person selectedPerson = (Person) model.getValueAt(selectedRow, 0);
            txtID.setText(String.valueOf(selectedPerson.getPersonID()));
            txtNamme.setText(selectedPerson.getName());
            txtStreett.setText(selectedPerson.getStreet());
            txtZip.setText(selectedPerson.getZipcode());
            txtAage.setText(String.valueOf(selectedPerson.getAge()));
            txtPhonee.setText(String.valueOf(selectedPerson.getPhoneNo()));
            txtEmaill.setText(selectedPerson.getEmail());
            txtComm.setText(selectedPerson.getCommunity());

        }
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbpersonTablee.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Row");
        } else {
            btnDelete.setEnabled(false);
            btnUpdatee.setEnabled(false);
            
            DefaultTableModel model = (DefaultTableModel) tbpersonTablee.getModel();
            Person selectedPerson = (Person) model.getValueAt(selectedRow, 0);

            ecosystem.getPersonDirectory().deletePerson(selectedPerson);

            populatePersonTable();
            
            txtID.setText("");
            txtNamme.setText("");
            txtStreett.setText("");
            txtZip.setText("");
            txtAage.setText("");
            txtPhonee.setText("");
            txtEmaill.setText("");
            txtComm.setText("");
            txtID.setEnabled(true);
    }//GEN-LAST:event_btnDeleteActionPerformed
    }
    private void btnUpdateeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateeActionPerformed
        // TODO add your handling code here:
        txtID.setEnabled(false);
        int ID = Integer.parseInt(txtID.getText());
        String name = txtNamme.getText();
        String street = txtStreett.getText();
        String zipcode = txtZip.getText();
        int age = Integer.parseInt(txtAage.getText());
        String community = txtComm.getText();
        String phoneNo = txtPhonee.getText();
        String email = txtEmaill.getText();
        
        int selectedRow = tbpersonTablee.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a Row");
            txtID.setEnabled(true);
        }
        else{
            btnDelete.setEnabled(false);
            btnUpdatee.setEnabled(false);
            DefaultTableModel model = (DefaultTableModel) tbpersonTablee.getModel();
            Person person = (Person)model.getValueAt(selectedRow, 0);
            
            if (txtID.getText().isEmpty() || txtAage.getText().isEmpty() || name.isEmpty() || street.isEmpty() || zipcode.isEmpty() || community.isEmpty() || phoneNo.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty Fields", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (phoneNo.length() != 10) {
            JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (validateEmail(email) == false) {
            JOptionPane.showMessageDialog(null, "Invalid Email", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if (zipcode.length() != 5) {
            JOptionPane.showMessageDialog(null, "Invalid Zipcode", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
             
        
            else{
            ecosystem.getPersonDirectory().updatePerson(person, name, street, zipcode, age, community, phoneNo, email);
//            System.out.print(username);
            JOptionPane.showMessageDialog(this, " Person updated successfully");
            populatePersonTable();
            txtID.setText("");
            txtNamme.setText("");
            txtStreett.setText("");
            txtZip.setText("");
            txtAage.setText("");
            txtPhonee.setText("");
            txtEmaill.setText("");
            txtComm.setText("");
            txtID.setEnabled(true);
        }
            
        }
        
    }//GEN-LAST:event_btnUpdateeActionPerformed

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

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        txtID.setEnabled(true);
        btnUpdatee.setEnabled(false);
        btnDelete.setEnabled(false);
        txtID.setText("");
        txtNamme.setText("");
        txtStreett.setText("");
        txtZip.setText("");
        txtAage.setText("");
        txtPhonee.setText("");
        txtEmaill.setText("");
        txtComm.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtPhoneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneeActionPerformed


    private boolean validateEmail(String email) {
        Pattern p = Pattern.compile("^[a-zA-z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(email);
        return m.matches();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdatee;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAage;
    private javax.swing.JLabel lblApartment;
    private javax.swing.JLabel lblComm;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMaintainPerson;
    private javax.swing.JLabel lblNamee;
    private javax.swing.JLabel lblPhonee;
    private javax.swing.JLabel lblStreett;
    private javax.swing.JTable tbpersonTablee;
    private javax.swing.JTextField txtAage;
    private javax.swing.JTextField txtComm;
    private javax.swing.JTextField txtEmaill;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNamme;
    private javax.swing.JTextField txtPhonee;
    private javax.swing.JTextField txtStreett;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables

    private void populatePersonTable() {

        DefaultTableModel dtm = (DefaultTableModel) tbpersonTablee.getModel();
        dtm.setRowCount(0);

        for (Person person : ecosystem.getPersonDirectory().getPersonList()) {
//            System.out.println(person);
            Object[] row = new Object[8];
            row[0] = person;
            row[1] = person.getPersonID();
            row[2] = person.getStreet();
            row[3] = person.getZipcode();
            row[4] = person.getAge();
            row[5] = person.getCommunity();
            row[6] = person.getPhoneNo();
            row[7] = person.getEmail();

            dtm.addRow(row);

        }

    }
}
