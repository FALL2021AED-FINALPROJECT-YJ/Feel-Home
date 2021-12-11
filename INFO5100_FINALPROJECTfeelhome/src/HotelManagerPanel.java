package ui.HotelManagerRole;

import model.SystemAdmin;

public class HotelManagerPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;

    public HotelManagerPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblsysadmin = new javax.swing.JLabel();
        orgAdminBtn = new javax.swing.JButton();
        orgBtn = new javax.swing.JButton();
        viewTask = new javax.swing.JButton();
        manageRooms = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblsysadmin.setText("HOTEL MANAGER");

        orgAdminBtn.setBackground(new java.awt.Color(255, 255, 255));
        orgAdminBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orgAdminBtn.setText("MANAGE ORGANIZATION ADMIN");
        orgAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgAdminBtnActionPerformed(evt);
            }
        });

        orgBtn.setBackground(new java.awt.Color(255, 255, 255));
        orgBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orgBtn.setText("MANAGE ORGANIZATION ");
        orgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgBtnActionPerformed(evt);
            }
        });

        viewTask.setBackground(new java.awt.Color(255, 255, 255));
        viewTask.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        viewTask.setText("VIEW TASK");
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });

        manageRooms.setBackground(new java.awt.Color(255, 255, 255));
        manageRooms.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        manageRooms.setText("MANAGE ROOMS");
        manageRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRoomsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(lblsysadmin)
                .addContainerGap(372, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(orgAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(manageRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(364, 364, 364))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lblsysadmin)
                .addGap(102, 102, 102)
                .addComponent(viewTask)
                .addGap(43, 43, 43)
                .addComponent(orgBtn)
                .addGap(48, 48, 48)
                .addComponent(orgAdminBtn)
                .addGap(47, 47, 47)
                .addComponent(manageRooms)
                .addContainerGap(316, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orgAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgAdminBtnActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_orgAdminBtnActionPerformed

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_viewTaskActionPerformed

    private void orgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgBtnActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_orgBtnActionPerformed

    private void manageRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRoomsActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_manageRoomsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JButton manageRooms;
    private javax.swing.JButton orgAdminBtn;
    private javax.swing.JButton orgBtn;
    private javax.swing.JButton viewTask;
    // End of variables declaration//GEN-END:variables
}
