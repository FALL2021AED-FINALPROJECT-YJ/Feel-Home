package ui.HealthClubManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.EnterpriseDirectory;
import model.HealthClub;
import model.Network;
import model.PhysicianOrg;
import model.SystemAdmin;
import model.TherapistOrg;
import model.TrainerOrg;

public class OrganizationAdminPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;

    /**
     *
     * @param systemAdmin
     * @param callOnCreateMethod
     * @param user
     * @param type
     */
    public OrganizationAdminPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        for (Network city : systemAdmin.getListOfNetwork()) {
            networkType.addItem(city.getName());
        }
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        orgCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        orgName = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        networkType = new javax.swing.JComboBox<>();

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NETWORK", "ORGNANIZATION TYPE", "ORGANIZATION NAME", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("ORGANIZATION TYPE");

        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a organization", "Physician", "Trainer", "Therapist" }));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });

        jLabel2.setText("NAME");

        jLabel3.setText("USERNAME");

        jLabel4.setText("PASSWORD");

        addButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jButton2.setText("DELETE");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("ORGANIZATION NAME ");

        jLabel6.setText("NETWORK");

        networkType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a network" }));
        networkType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(orgName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(networkType, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(802, 802, 802)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backBtn)
                .addGap(92, 92, 92)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jButton2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(orgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128)
                .addComponent(addButton)
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[20];
        String orgType = orgCombo.getSelectedItem().toString();
        String orgName1 = orgName.getSelectedItem().toString();
        String name = nameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();
        Network network = systemAdmin.findNetwork(networkType.getSelectedItem().toString());
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        List<HealthClub> list = enterpriseDirec.getListOfHealthClub();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).findManager(user) != null) {    //if manager found 
                if (orgType.equals("Physician")) {
                    List<PhysicianOrg> org1 = list.get(i).getListOfPhysicianOrg();
                    for (int j = 0; j < org1.size(); j++) {
                        if (org1.get(j).getName().equals(orgName1)) {
                            org1.get(i).addPhysician(name, network.getName(), username, password);
                            row[0] = network.getName();
                            row[1] = orgType;
                            row[2] = orgName1;
                            row[3] = name;
                            row[4] = username;
                            row[5] = password;
                            model.addRow(row);
                            systemAdmin.addUser(username, "Physician");
                            JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                            return;
                        }
                    }
                } else if (orgType.equals("Trainer")) {
                    List<TrainerOrg> org2 = list.get(i).getListOfTrainerOrg();
                    for (int j = 0; j < org2.size(); j++) {
                        if (org2.get(i).getName().equals(orgName1)) {
                            org2.get(j).addTrainer(name, network.getName(), username, password);
                            row[0] = network.getName();
                            row[1] = orgType;
                            row[2] = orgName1;
                            row[3] = name;
                            row[4] = username;
                            row[5] = password;
                            model.addRow(row);
                              systemAdmin.addUser(username, "Trainer");
                            JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                            return;
                        }
                    }
                } else {
                    List<TherapistOrg> org3 = list.get(i).getListOfTherapistOrg();
                    for (int j = 0; j < org3.size(); j++) {
                        if (org3.get(j).getName().equals(orgName1)) {
                            org3.get(j).addTherapist(name, network.getName(), username, password);
                            row[0] = network.getName();
                            row[1] = orgType;
                            row[2] = orgName1;
                            row[3] = name;
                            row[4] = username;
                            row[5] = password;
                            model.addRow(row);
                               systemAdmin.addUser(username, "Therapist");
                            JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                            return;
                        }
                    }
                }
            }

        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboActionPerformed
        String orgType = orgCombo.getSelectedItem().toString();
        Network network = systemAdmin.findNetwork(networkType.getSelectedItem().toString());
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        List<HealthClub> list = enterpriseDirec.getListOfHealthClub();
        for (int i = 0; i < list.size(); i++) {
            list.get(i).findManager(user);
            if (orgType.equals("Physician")) {
                List<PhysicianOrg> org1 = list.get(i).getListOfPhysicianOrg();
                for (int j = 0; j < org1.size(); j++) {
                    orgName.addItem(org1.get(j).getName());
                    return;
                }
            } else if (orgType.equals("Trainer")) {
                List<TrainerOrg> org2 = list.get(i).getListOfTrainerOrg();
                for (int j = 0; j < org2.size(); j++) {
                    orgName.addItem(org2.get(j).getName());
                }
            } else {
                List<TherapistOrg> org3 = list.get(i).getListOfTherapistOrg();
                for (int j = 0; j < org3.size(); j++) {
                    orgName.addItem(org3.get(j).getName());
                }
            }
        }

    }//GEN-LAST:event_orgComboActionPerformed

    private void networkTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkTypeActionPerformed

    }//GEN-LAST:event_networkTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> networkType;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JComboBox<String> orgName;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
