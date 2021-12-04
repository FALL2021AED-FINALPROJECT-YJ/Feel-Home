package ui.HealthClubManagerRole;

import model.SystemAdmin;

public class HealthClubManagerPanel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private Runnable callOnCreateMethod5;
    private Runnable callOnCreateMethod4;

    public HealthClubManagerPanel(SystemAdmin systemAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3) {
        initComponents();
        this.callOnCreateMethod = callOnCreateMethod1;
        this.callOnCreateMethod5 = callOnCreateMethod2;
        this.callOnCreateMethod4 = callOnCreateMethod3;

    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        viewTask = new javax.swing.JButton();
        orgBtn = new javax.swing.JButton();
        orgAdminBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("HEALTH CLUB MANAGER PANEL ");

        viewTask.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewTask.setText("VIEW TASK");
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });

        orgBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orgBtn.setText("MANAGE ORGANIZATION");
        orgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgBtnActionPerformed(evt);
            }
        });

        orgAdminBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orgAdminBtn.setText("MANAGE ORGANISATION ADMIN");
        orgAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgAdminBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orgAdminBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(orgBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                        .addComponent(viewTask, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(141, 141, 141)
                .addComponent(viewTask)
                .addGap(54, 54, 54)
                .addComponent(orgBtn)
                .addGap(61, 61, 61)
                .addComponent(orgAdminBtn)
                .addContainerGap(345, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskActionPerformed
                 callOnCreateMethod.run();
    }//GEN-LAST:event_viewTaskActionPerformed

    private void orgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgBtnActionPerformed
         callOnCreateMethod5.run();
    }//GEN-LAST:event_orgBtnActionPerformed

    private void orgAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgAdminBtnActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_orgAdminBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton orgAdminBtn;
    private javax.swing.JButton orgBtn;
    private javax.swing.JButton viewTask;
    // End of variables declaration//GEN-END:variables
}
