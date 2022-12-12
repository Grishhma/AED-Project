/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdminWorkArea;

import System.Place.Place;
import System.EcoSystem;
import System.Employee.Employee;
import System.Enterprise.Enterprise;
import System.Role.HosAdminRole;
import System.Role.Role;
import System.Role.ExamineLabAdminRole;
import System.Role.VaccineCenterAdminRole;
import System.Role.VaccineProducerRole;
import System.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author infi
 */
public class ManageEnterpriseAdminsJPanel extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    EcoSystem ecosystem;

    public ManageEnterpriseAdminsJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;
        populateCityComboBox();
        populateEnterpriseAdminTable();
    }

    private void populateCityComboBox(){
        comboboxCity.removeAllItems();
        
        for (Place city : ecosystem.getCityList()){
            comboboxCity.addItem(city);
        }
    }
    private void populateEnterpriseCombo(Place city) {
        comboEnterprise.removeAllItems();
        for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
            comboEnterprise.addItem(enterprise.getName());
        }
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCreateEntirePriseAdmin = new javax.swing.JButton();
        txtUsernamee = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtPasswordd = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblManageVaccinationCenter = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseTable = new javax.swing.JTable();
        comboEnterprise = new javax.swing.JComboBox<>();
        lblEnterprisee = new javax.swing.JLabel();
        lblCityy = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        comboboxCity = new javax.swing.JComboBox();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreateEntirePriseAdmin.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCreateEntirePriseAdmin.setText("Create");
        btnCreateEntirePriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEntirePriseAdminActionPerformed(evt);
            }
        });
        add(btnCreateEntirePriseAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 110, 40));

        txtUsernamee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameeActionPerformed(evt);
            }
        });
        add(txtUsernamee, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 212, 30));

        lblUsername.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, -1, 20));
        add(txtPasswordd, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 212, 30));

        lblPassword.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblPassword.setText("Password:");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, 20));

        lblManageVaccinationCenter.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        lblManageVaccinationCenter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageVaccinationCenter.setText("MANAGE ENTERPRISE ADMINS");
        add(lblManageVaccinationCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 90, 1210, -1));

        enterpriseTable.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        enterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "City", "Enterprise", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(enterpriseTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 560, 230));

        comboEnterprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 212, 30));

        lblEnterprisee.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblEnterprisee.setText("Select Enterprise:");
        add(lblEnterprisee, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, 20));

        lblCityy.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblCityy.setText("Select City:");
        add(lblCityy, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, -1, 20));

        btnBack.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 100, 40));

        comboboxCity.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        comboboxCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxCityActionPerformed(evt);
            }
        });
        add(comboboxCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 212, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEntirePriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEntirePriseAdminActionPerformed
        // TODO add your handling code here:
//        Enterprise enterprise = (Enterprise) comboEnterprise.getSelectedItem();
//        String city = txtCityName.getText();
        for (Place cities : ecosystem.getCityList()) {
//            if (cities.getName().equals(city)) {
                for (Enterprise enterprise : cities.getEnterpriseDirectory().getEnterpriseList()) {
                    if (comboEnterprise.getSelectedItem().toString().equals(enterprise.getName())) {
                        String username = txtUsernamee.getText();
                        String password = txtPasswordd.getText();

                        if (enterprise.getUserAccountDirectory().authenticateUser(username, password) != null) {
                            JOptionPane.showMessageDialog(null, "Username Already exists");
                            return;
                        }

                        if (username.equals("") || password.equals("")) {
                            JOptionPane.showMessageDialog(null, "Username and password can not be empty");
                            return;
                        }


                        Employee employee = enterprise.getEmployeeDirectory().createEmployee(username);
                        
                        Role role;

                        if (enterprise.getClass().getName().toString() == "System.Enterprise.Hospital") {
                            role = new HosAdminRole();
                            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
                            //System.out.println(account);
                        } else if (enterprise.getClass().getName().toString() == "System.Enterprise.ExamineLaboratory") {
                            role = new ExamineLabAdminRole();
                            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
                        } else if (enterprise.getClass().getName().toString() == "System.Enterprise.VacineCenter") {
                            int count = 0;
                            for(UserAccount userAccount: enterprise.getUserAccountDirectory().getUserAccountList()){
                                if((userAccount.getRole().getClass().getName()).equals("System.Role.VaccineCenterEmpRole")){
                                    count = 1;
                                }
                            }
                            if(count==0){
                            role = new VaccineCenterAdminRole();
                            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
                            }
                            else{
                                JOptionPane.showMessageDialog(this,"Admin Already exist");
                            }
                        } else if (enterprise.getClass().getName().toString() == "System.Enterprise.VaccineProducer") {
                            int count = 0;
                            for(UserAccount userAccount: enterprise.getUserAccountDirectory().getUserAccountList()){
                                if((userAccount.getRole().getClass().getName()).equals("System.Role.VaccineProducerRole")){
                                    count = 1;
                                }
                            }
                            if(count==0){
                            role = new VaccineProducerRole();
                            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
                            }
                            else{
                                JOptionPane.showMessageDialog(this,"Admin Already exist");
                            }
                        }
                         
                        
                        populateEnterpriseAdminTable();

                    } 
                }
        }
        //populateEnterpriseAdminTable();
        txtUsernamee.setText("");
        txtPasswordd.setText("");
    }//GEN-LAST:event_btnCreateEntirePriseAdminActionPerformed

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

    private void txtUsernameeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameeActionPerformed

    private void comboboxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxCityActionPerformed
        Place city = (Place) comboboxCity.getSelectedItem();
        if (city != null){
            populateEnterpriseCombo(city);
        }
    }//GEN-LAST:event_comboboxCityActionPerformed

    private boolean validateUsername(String email) {
        Pattern p = Pattern.compile("^[a-zA-z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(email);
        return m.matches();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEntirePriseAdmin;
    private javax.swing.JComboBox<String> comboEnterprise;
    private javax.swing.JComboBox comboboxCity;
    private javax.swing.JTable enterpriseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCityy;
    private javax.swing.JLabel lblEnterprisee;
    private javax.swing.JLabel lblManageVaccinationCenter;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtPasswordd;
    private javax.swing.JTextField txtUsernamee;
    // End of variables declaration//GEN-END:variables

    private void populateEnterpriseAdminTable() {
        DefaultTableModel dtm = (DefaultTableModel) enterpriseTable.getModel();
        dtm.setRowCount(0);

        for (Place city : ecosystem.getCityList()) {
            for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[4];
                    row[0] = city.getName();
                    row[1] = enterprise.getName();
                    row[2] = userAccount.getUsername();
                    row[3] = userAccount.getPassword();

                    dtm.addRow(row);
                }
            }
        }
    }
}
