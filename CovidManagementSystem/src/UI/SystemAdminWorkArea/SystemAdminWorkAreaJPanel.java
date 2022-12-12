
package UI.SystemAdminWorkArea;

import System.Place.Place;
import System.EcoSystem;
import System.Enterprise.Enterprise;

import System.Organization.Organization;
import System.Person.Person;
import System.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Acer
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Place city;
    Organization organization;
    Enterprise enterprise;

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, Place city, UserAccount userAccount, Organization organization,
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.city = city;
        this.organization = organization;
        populateTree();

    }
        
    
    public void populateTree(){
        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
        ArrayList<Place> networkList=system.getCityList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;

        Place city;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;

        int i = 0;
        for(Place n : system.getCityList()){
            networkNode = new DefaultMutableTreeNode(n.getName());
            networks.insert(networkNode, i);
            i++;
            int j = 0;
            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                enterpriseNode = new DefaultMutableTreeNode(e.getName());
                networkNode.insert(enterpriseNode, j);
                j++;
                int k = 0;
                for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                    organizationNode = new DefaultMutableTreeNode(o.getName());
                    enterpriseNode.insert(organizationNode, k);
                    k++;
                }
            }
        }
        model.reload();
    }
 
    @SuppressWarnings("unchecked")
    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManagePlace = new javax.swing.JButton();
        btnManageEnterprizes = new javax.swing.JButton();
        btnCovidd = new javax.swing.JButton();
        btnManageEnterpriseAdminn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        btnManagePerson1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManagePlace.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnManagePlace.setText("Manage City");
        btnManagePlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePlaceActionPerformed(evt);
            }
        });
        add(btnManagePlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 190, 30));

        btnManageEnterprizes.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnManageEnterprizes.setText("Maintain Enterprises");
        btnManageEnterprizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterprizesActionPerformed(evt);
            }
        });
        add(btnManageEnterprizes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 190, 30));

        btnCovidd.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCovidd.setText("Covid Cases Chart");
        btnCovidd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoviddActionPerformed(evt);
            }
        });
        add(btnCovidd, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 190, 30));

        btnManageEnterpriseAdminn.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnManageEnterpriseAdminn.setText("Manage Enterprise Admins");
        btnManageEnterpriseAdminn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdminnActionPerformed(evt);
            }
        });
        add(btnManageEnterpriseAdminn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, -1, 30));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" SYSTEM ADMIN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 900, -1));

        jTree.setForeground(new java.awt.Color(0, 0, 0));
        jTree.setMinimumSize(new java.awt.Dimension(0, 860));
        jScrollPane1.setViewportView(jTree);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 860));

        btnManagePerson1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnManagePerson1.setText("Manage Person");
        btnManagePerson1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePerson1ActionPerformed(evt);
            }
        });
        add(btnManagePerson1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 190, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void createChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        ArrayList<Person> personList = system.getPersonDirectory().getPersonList();

        int positive = 0;
        int negative = 0;

        for (Person p : personList) {

            if (p.getTestHistory().getTestReportList().size() != 0) {
                if (p.getTestHistory().getTestReportList().get(0).isResult() == true) {
                    ++positive;
                }
                if (p.getTestHistory().getTestReportList().get(0).isResult() == false) {
                    ++negative;
                }

            }
        }
        if (negative == 0 && positive == 0) {
            JOptionPane.showMessageDialog(this, "No Data Found", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            dataset.setValue("Positive", positive);
            dataset.setValue("Negative", negative);

            JFreeChart chart = ChartFactory.createPieChart3D(
                    "Covid Cases in City", // chart title
                    dataset, // data
                    true, // include legend
                    true,
                    false);
            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(270);
            plot.setForegroundAlpha(0.60f);
            plot.setInteriorGap(0.02);
            int width = 640;
            
            int height = 480;
            


            ChartFrame chartFrame = new ChartFrame("Chart", chart);
            chartFrame.setVisible(true);
            chartFrame.setSize(500, 500);
        }
    }

    private void btnCoviddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoviddActionPerformed
        createChart();

    }//GEN-LAST:event_btnCoviddActionPerformed

    private void btnManageEnterprizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterprizesActionPerformed
        ManageEnterprisesJPanel manageTestCenterJPanel = new ManageEnterprisesJPanel(userProcessContainer, system);
        userProcessContainer.add("manageTestCenterJPanel", manageTestCenterJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterprizesActionPerformed

    private void btnManagePlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePlaceActionPerformed
        ManageCityJPanel manageHospitalJPanel = new ManageCityJPanel(userProcessContainer, system);
        userProcessContainer.add("manageHospitalJPanel", manageHospitalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePlaceActionPerformed

    private void btnManageEnterpriseAdminnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdminnActionPerformed
        ManageEnterpriseAdminsJPanel manageVaccinationCenterJPanel = new ManageEnterpriseAdminsJPanel(userProcessContainer, system);
        userProcessContainer.add("manageVaccinationCenterJPanel", manageVaccinationCenterJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseAdminnActionPerformed

    private void btnManagePerson1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePerson1ActionPerformed
        // TODO add your handling code here:
        ManagePersonJPanel managePersonJPanel = new ManagePersonJPanel(userProcessContainer, system);
        userProcessContainer.add("managePersonJPanel", managePersonJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        

    }//GEN-LAST:event_btnManagePerson1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCovidd;
    private javax.swing.JButton btnManageEnterpriseAdminn;
    private javax.swing.JButton btnManageEnterprizes;
    private javax.swing.JButton btnManagePerson1;
    private javax.swing.JButton btnManagePlace;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree;
    // End of variables declaration//GEN-END:variables
}
