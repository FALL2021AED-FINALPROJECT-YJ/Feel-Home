package ui.SystemAdministration;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BusinessEvent;
import model.EnterpriseDirectory;
import model.HealthClub;
import model.Hotel;
import model.Manager;
import model.Network;
import model.Restaurant;
import model.SystemAdmin;

public class ManageManagersJPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;

    public ManageManagersJPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        for (Network network : systemAdmin.getListOfNetwork()) {
            networkType.addItem(network.getName());
        }
        populateTable();
    }
    
     public boolean validateName() {
        if (nameField.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }
        public boolean PasswordName() {
        if (passwordField.getText().matches("[a-zA-Z]{3}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : password should contain only 3 inputs");
            return false;
        }
    }
  

 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        lblsysadmin = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        networkType = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        enterpriseType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        enterpriseName = new javax.swing.JComboBox<>();

        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblsysadmin.setText("MANAGE ENTERPRISE MANAGERS");

        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NETWORK NAME", "ENTERPRISE TYPE", "ENTERPRISE NAME", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        addButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        nameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ENTERPRISE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("NETWORK");

        networkType.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        networkType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a network" }));
        networkType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkTypeActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("UPDATE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("MANAGER NAME");

        usernameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("USERNAME");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("PASSWORD");

        passwordField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        enterpriseType.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        enterpriseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a enterprise", "Health Club", "Restaurant", "Hotel", "Business Event" }));
        enterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("ENTERPRISE NAME");

        enterpriseName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        enterpriseName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecte name of enterprise" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backButton)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(280, 280, 280)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(deleteBtn)
                                    .addGap(22, 22, 22))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(130, 130, 130)
                                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(73, 73, 73)
                                            .addComponent(jButton3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(34, 34, 34)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(enterpriseType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(nameField)
                                                .addComponent(usernameField)
                                                .addComponent(passwordField)
                                                .addComponent(networkType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(enterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(223, 223, 223)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(lblsysadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsysadmin)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(enterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7))
                    .addComponent(enterpriseName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String networkName = (String) model.getValueAt(selectedRowIndex, 0);
        String enterpriseType = (String) model.getValueAt(selectedRowIndex, 1);
        String enterpriseName = (String) model.getValueAt(selectedRowIndex, 2);
        String selectedUser = (String) model.getValueAt(selectedRowIndex, 4);
        Network network = systemAdmin.findNetwork(networkName);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        if (enterpriseType.equals("Business Event")) {
            for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
                for (Manager man : event.getListOfManager()) {
                    if (man.getName().equals(selectedUser)) {
                        event.deleteManager(man);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        } else if (enterpriseType.equals("Restaurant")) {
            for (Restaurant res : enterpriseDirec.getListOfRestaurants()) {
                for (Manager man : res.getListOfManager()) {
                    if (man.getName().equals(selectedUser)) {
                        res.deleteManager(man);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                               populateTable();
                    }
                }
            }
        } else if (enterpriseType.equals("Hotel")) {
            for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
                for (Manager man : hotel.getListOfManager()) {
                    if (man.getName().equals(selectedUser)) {
                        hotel.deleteManager(man);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                               populateTable();
                    }
                }
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed

    }//GEN-LAST:event_nameFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object row[] = new Object[10];
        String ManagerName = nameField.getText();
        String userName = usernameField.getText();
        String password = passwordField.getText();
        String networkName = networkType.getSelectedItem().toString();
        String enterpriseType1 = enterpriseType.getSelectedItem().toString();   //type of enterprises eg:healthclub
        String enterpriseName1 = enterpriseName.getSelectedItem().toString();
        if (systemAdmin.userExistsInSystem(userName) == false) {
            Network network = systemAdmin.findNetwork(networkName);  //finiding network
            EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
            if (enterpriseType1.equals("Health Club")) {
                HealthClub healthclubName1 = enterpriseDirec.findHealthClub(enterpriseName1);
                healthclubName1.addManager(ManagerName, userName, password);
                systemAdmin.addUser(userName, "Health Club");   //store users with enterpirse type  
                JOptionPane.showMessageDialog(this, " Manager added successfully");
                row[0] = networkName;
                row[1] = "Health Club";
                row[2] = enterpriseName1;
                row[3] = ManagerName;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
                return;
            } else if (enterpriseType1.equals("Business Event")) {
                BusinessEvent event1 = enterpriseDirec.findEvent(enterpriseName1);
                event1.addManager(ManagerName, userName, password);
                systemAdmin.addUser(userName, "Business Event");
                JOptionPane.showMessageDialog(this, " Manager added successfully");
                row[0] = networkName;
                row[1] = "BusinessEvent";
                row[2] = enterpriseName1;
                row[3] = ManagerName;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
                return;
            } else if (enterpriseType1.equals("Restaurant")) {
                Restaurant res1 = enterpriseDirec.findRestaurant(enterpriseName1);
                res1.addManager(userName, userName, password);
                System.out.println(res1.getListOfManager().size() + " manager in restaurant");
                systemAdmin.addUser(userName, "Restaurant");
                JOptionPane.showMessageDialog(this, " Manager added successfully");
                row[0] = networkName;
                row[1] = "Restaurant";
                row[2] = enterpriseName1;
                row[3] = ManagerName;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
                return;
            } else {
                Hotel hotel1 = enterpriseDirec.findHotel(enterpriseName1);
                hotel1.addManager(ManagerName, userName, password);
                systemAdmin.addUser(userName, "Hotel");
                System.out.println("Hotel added in city" + networkName);
                JOptionPane.showMessageDialog(this, " Manager added successfully");
                row[0] = networkName;
                row[1] = "Hotel";
                row[2] = enterpriseName1;
                row[3] = ManagerName;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, " This username already exists ");
        }
        nameField.setText("");
        usernameField.setText("");
        passwordField.setText("");

    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void networkTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkTypeActionPerformed

    }//GEN-LAST:event_networkTypeActionPerformed

    private void enterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeActionPerformed
        enterpriseName.removeAllItems();
        String networkName = networkType.getSelectedItem().toString();
        Network network = systemAdmin.findNetwork(networkName);
        EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();
        String enterpriseType1 = enterpriseType.getSelectedItem().toString();
        if (enterpriseType1.equals("Health Club")) {
            for (HealthClub club : enterpriseDirec.getListOfHealthClub()) {
                enterpriseName.addItem(club.getName());
            }
        } else if (enterpriseType1.equals("Business Event")) {
            for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {
                enterpriseName.addItem(event.getName());
            }
        } else if (enterpriseType1.equals("Restaurant")) {
            for (Restaurant res : enterpriseDirec.getListOfRestaurants()) {
                enterpriseName.addItem(res.getName());
            }
        } else if (enterpriseType1.equals("Hotel")) {
            for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
                enterpriseName.addItem(hotel.getName());
            }
        } else {
            return;
        }

    }//GEN-LAST:event_enterpriseTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> enterpriseName;
    private javax.swing.JComboBox<String> enterpriseType;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> networkType;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        for (Network network : systemAdmin.getListOfNetwork()) {        //populate network
            row[0] = network.getName();
            EnterpriseDirectory enterpriseDirec = network.getEnterpriseDirectory();  //populate enterpirse name
            for (BusinessEvent event : enterpriseDirec.getListOfEvents()) {   //poplulate events enterprise
                row[1] = "Business Event";
                row[2] = event.getName();
                for (Manager manager : event.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Business Event";
                    row[2] = event.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }
            for (Restaurant res : enterpriseDirec.getListOfRestaurants()) {   //poplulate restauarant enterprise
                row[1] = "Restaurant";
                row[2] = res.getName();
                for (Manager manager : res.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Restaurant";
                    row[2] = res.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }
            for (Hotel hotel : enterpriseDirec.getListOfHotel()) {   //poplulate hotel enterprise
                row[1] = "Hotel";
                row[2] = hotel.getName();
                for (Manager manager : hotel.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Hotel";
                    row[2] = hotel.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }
            for (HealthClub health : enterpriseDirec.getListOfHealthClub()) {   //poplulate hotel enterprise
                row[1] = "Health Club";
                row[2] = health.getName();
                for (Manager manager : health.getListOfManager()) {
                    row[0] = network.getName();
                    row[1] = "Health Club";
                    row[2] = health.getName();
                    row[3] = manager.getName();
                    row[4] = manager.getUsername();
                    row[5] = manager.getPassword();
                    model.addRow(row);
                }
            }

        }
    }

}
