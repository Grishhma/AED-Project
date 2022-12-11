
package UI.VaccineCenter;

import System.Place.Place;
import System.EcoSystem;
import System.Employee.Employee;
import System.Employee.EmployeeDirectory;
import System.Enterprise.Enterprise;
import System.Organization.Organization;
import System.Person.Person;
import System.Person.PersonDirectory;
import System.Role.Role;
import System.Role.VaccineCenterAdminRole;
import System.Role.VaccineCenterEmpRole;
import System.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riddhivora
 */
public class ManageVaccineCenterEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageVacciantionCenterStaff
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Place city;
    EmployeeDirectory employeeDirectory;
    public ManageVaccineCenterEmployeeJPanel(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization, 
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblManageInventoryy = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(214, 229, 244));

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "UserName", "Staff ID", "Name", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblEmployee);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 988, 183));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 212, -1));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, -1, -1));

        btnCreate.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, 80, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setText("UserName");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, -1, -1));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, 212, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 212, -1));

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 650, 80, 30));

        lblManageInventoryy.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManageInventoryy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageInventoryy.setText("VACCINATION CENTER EMPLOYEE");
        add(lblManageInventoryy, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 620, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(txtName.getText());
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        if (enterprise.getUserAccountDirectory().authenticateUser(userName, password) != null) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                    return;
        }

        if (userName.equals("") || password.equals("")) {
               JOptionPane.showMessageDialog(null, "Empty Username and password are not allowed");
                    return;
        }
        else{
        Role role = new VaccineCenterEmpRole();
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        }            
       populateTable();

                        
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VaccineCenterAdminJPanel vaccinationCenterjp = (VaccineCenterAdminJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageInventoryy;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblEmployee.getModel();
        dtm.setRowCount(0);

            
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if("System.Role.VaccineCenterEmpRole".equals(userAccount.getRole().getClass().getName())){
                    System.out.println(userAccount.getRole());
                    Object[] row = new Object[4];
                    row[0] = userAccount;
                    row[1] = userAccount.getEmployee().getId();
                    row[2] = userAccount.getEmployee().getName();
                    row[3] = userAccount.getPassword();

                    dtm.addRow(row);
                }
                }//To change body of generated methods, choose Tools | Templates.
    }
}
