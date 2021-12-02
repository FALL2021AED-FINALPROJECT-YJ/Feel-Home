
package ui.SystemAdministration;

import model.SystemAdmin;

public class SystemAdministrationJPanel extends javax.swing.JPanel {
  SystemAdmin systems;
  private Runnable callOnCreateMethod1;
  private Runnable callOnCreateMethod2;
  private Runnable callOnCreateMethod4;
    public SystemAdministrationJPanel(SystemAdmin systems, Runnable callOnCreateMethod1,Runnable callOnCreateMethod2,Runnable callOnCreateMethod4) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
       this.callOnCreateMethod2 = callOnCreateMethod2;
       this.callOnCreateMethod4 = callOnCreateMethod4;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnmanagenetworks = new javax.swing.JButton();
        enterpriseBtn = new javax.swing.JButton();
        btnmanagecustomers = new javax.swing.JButton();
        lblsysadmin = new javax.swing.JLabel();
        btnmanagemanagers = new javax.swing.JButton();

        btnmanagenetworks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmanagenetworks.setText("MANAGE NETWORKS");
        btnmanagenetworks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanagenetworksActionPerformed(evt);
            }
        });

        enterpriseBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseBtn.setText("MANAGE ENTERPRICES");
        enterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseBtnActionPerformed(evt);
            }
        });

        btnmanagecustomers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmanagecustomers.setText("MANAGE CUSTOMERS");
        btnmanagecustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanagecustomersActionPerformed(evt);
            }
        });

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setText("SYSTEM ADMINISTRATOR");

        btnmanagemanagers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmanagemanagers.setText("MANAGE MANAGERS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblsysadmin)
                        .addGap(272, 272, 272))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(enterpriseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmanagenetworks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmanagecustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmanagemanagers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(435, 435, 435))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lblsysadmin)
                .addGap(69, 69, 69)
                .addComponent(btnmanagenetworks)
                .addGap(58, 58, 58)
                .addComponent(enterpriseBtn)
                .addGap(66, 66, 66)
                .addComponent(btnmanagemanagers)
                .addGap(73, 73, 73)
                .addComponent(btnmanagecustomers)
                .addContainerGap(249, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseBtnActionPerformed
      callOnCreateMethod2.run();
      
    }//GEN-LAST:event_enterpriseBtnActionPerformed

    private void btnmanagenetworksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagenetworksActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnmanagenetworksActionPerformed

    private void btnmanagecustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagecustomersActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_btnmanagecustomersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmanagecustomers;
    private javax.swing.JButton btnmanagemanagers;
    private javax.swing.JButton btnmanagenetworks;
    private javax.swing.JButton enterpriseBtn;
    private javax.swing.JLabel lblsysadmin;
    // End of variables declaration//GEN-END:variables
}
