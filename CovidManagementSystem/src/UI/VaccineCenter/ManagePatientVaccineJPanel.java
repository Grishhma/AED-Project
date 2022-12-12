
package UI.VaccineCenter;

//import Business.Enterprise.Enterprise;
import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Organization.Organization;
import System.Patient.Patient;
import System.UserAccount.UserAccount;
import System.WorkLine.Order;
import System.WorkLine.VaccinatePatient;
import System.WorkLine.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riddhivora
 */
public class ManagePatientVaccineJPanel extends javax.swing.JPanel {

  
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Place city;
    //Enterprise enterprise;
    public ManagePatientVaccineJPanel(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
        //this.enterprise=enterprise;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageInventory = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVaccination = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        lblBatchh = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageInventory.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        lblManageInventory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageInventory.setText("PATIENT VACCINATION INFORMATION");
        add(lblManageInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 60));

        tblVaccination.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Staff ID"
            }
        ));
        jScrollPane1.setViewportView(tblVaccination);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 830, 220));

        btnAdd.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnAdd.setText("Create");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 110, 40));

        lblBatchh.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblBatchh.setText("Employee ID:");
        add(lblBatchh, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 170, 30));

        txtEmployeeID.setEditable(false);
        txtEmployeeID.setBackground(new java.awt.Color(255, 255, 255));
        add(txtEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 320, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       try{
        for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList())  {
            VaccinatePatient vp = (VaccinatePatient)wr;
            vp.setStaff(userAccount);
           for(Patient p: vp.getNonVaccPatientList()){
               if(p.getVaccinationStatus().equals("Not Fully Vaccinated")){
                   p.setVaccinationStatus("Completely Vaccinated");
               }
                   else{
                           p.setVaccinationStatus("Not Fully Vaccinated");
                           }
               }
           }
        txtEmployeeID.setText(String.valueOf(userAccount.getEmployee().getId()));
        
        populateTable();
        JOptionPane.showMessageDialog(this, "All patients vaccinated");
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this, "There is No Work request");
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBatchh;
    private javax.swing.JLabel lblManageInventory;
    private javax.swing.JTable tblVaccination;
    private javax.swing.JTextField txtEmployeeID;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblVaccination.getModel();
        dtm.setRowCount(0);

            
                for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList())  {
            VaccinatePatient vp = (VaccinatePatient)wr;
            vp.setStaff(userAccount);
           for(Patient p: vp.getNonVaccPatientList()){
                    
                    Object[] row = new Object[3];
                    row[0] = p.getPatientID();
                    row[1] = p.getName();
                    row[2] = vp.getStaff().getEmployee().getId();
                    
                    dtm.addRow(row);
                
                }//To change body of generated methods, choose Tools | Templates.
                }
    }
}
