/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdministration;

import model.SystemAdmin;

/**
 *
 * @author jaahn
 */
public class SystemAdministrationJPanel extends javax.swing.JPanel {

   SystemAdmin systems;
  private Runnable callOnCreateMethod;

    public SystemAdministrationJPanel(SystemAdmin systems, Runnable callOnCreateMethod) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod = callOnCreateMethod;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnmanagenetworks = new javax.swing.JButton();
        btnmanageenterprise = new javax.swing.JButton();
        btnmanagecustomers = new javax.swing.JButton();
        lblsysadmin = new javax.swing.JLabel();
        btnmanagemanagers = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));

        btnmanagenetworks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmanagenetworks.setText("MANAGE NETWORKS");

        btnmanageenterprise.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmanageenterprise.setText("MANAGE ENTERPRICES");
        btnmanageenterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageenterpriseActionPerformed(evt);
            }
        });

        btnmanagecustomers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmanagecustomers.setText("MANAGE CUSTOMERS");

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setText("SYSTEM ADMINISTRATOR");

        btnmanagemanagers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmanagemanagers.setText("MANAGE MANAGERS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(478, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsysadmin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnmanageenterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmanagenetworks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmanagecustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmanagemanagers, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(163, 163, 163)))
                .addGap(377, 377, 377))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(lblsysadmin)
                .addGap(69, 69, 69)
                .addComponent(btnmanagenetworks)
                .addGap(58, 58, 58)
                .addComponent(btnmanageenterprise)
                .addGap(66, 66, 66)
                .addComponent(btnmanagemanagers)
                .addGap(73, 73, 73)
                .addComponent(btnmanagecustomers)
                .addContainerGap(225, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void btnmanageenterpriseActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
         callOnCreateMethod.run();
    }                                                   


    // Variables declaration - do not modify                     
    private javax.swing.JButton btnmanagecustomers;
    private javax.swing.JButton btnmanageenterprise;
    private javax.swing.JButton btnmanagemanagers;
    private javax.swing.JButton btnmanagenetworks;
    private javax.swing.JLabel lblsysadmin;
    // End of variables declaration                   
}
