package ui.SystemAdministration;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BusinessEvent;
import model.Enterprise;
import model.EnterpriseDirectory;
import model.Manager;
import model.Network;
import model.SystemAdmin;

public class ManageNetworkJPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;

    public ManageNetworkJPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod) {
        this.callOnCreateMethod = callOnCreateMethod;
        this.systemAdmin = systemAdmin;
        initComponents();
        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabel = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        lblsysadmin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jTabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NETWORK NAME"
            }
        ));
        jScrollPane1.setViewportView(jTabel);

        addButton.setBackground(new java.awt.Color(255, 255, 255));
        addButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setText("MANAGE NETWORKS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("NETWORK");

        nameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(lblsysadmin))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(264, 264, 264)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblsysadmin)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(333, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed
    public boolean validateName() {
        if (nameField.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input: name should contain only alphabets");
            return false;
        }
    }


    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String name = nameField.getText();
        if (validateName()) {
            systemAdmin.addNetwork(name);
            JOptionPane.showMessageDialog(this, "Network added successfully");
            nameField.setText("");
            populateTable();
        }
    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabel;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTabel.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        for (Network network : systemAdmin.getListOfNetwork()) {        //populate network
            row[0] = network.getName();
            model.addRow(row);
        }
    }
}
