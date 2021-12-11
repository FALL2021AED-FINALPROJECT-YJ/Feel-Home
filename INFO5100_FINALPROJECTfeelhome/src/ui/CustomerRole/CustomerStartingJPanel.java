
package ui.CustomerRole;

import model.SystemAdmin;


public class CustomerStartingJPanel extends javax.swing.JPanel {
 private SystemAdmin systemAdmin;
 private Runnable callOnCreateMethod1;
 private Runnable callOnCreateMethod2;
 private String user;
 
    public CustomerStartingJPanel(SystemAdmin systemAdmin,Runnable callOnCreateMethod1,Runnable callOnCreateMethod2) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        roombookButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        manageBooking = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CUSTOMER PANEL ");

        roombookButton.setBackground(new java.awt.Color(255, 255, 255));
        roombookButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roombookButton.setText("BOOK ROOMS & SERVICES");
        roombookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roombookButtonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("BACK");

        manageBooking.setBackground(new java.awt.Color(255, 255, 255));
        manageBooking.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageBooking.setText("MANAGE BOOKING");
        manageBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton2)
                .addContainerGap(905, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roombookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(337, 337, 337))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(roombookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(manageBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(413, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBookingActionPerformed
         callOnCreateMethod2.run();
    }//GEN-LAST:event_manageBookingActionPerformed

    private void roombookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roombookButtonActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_roombookButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageBooking;
    private javax.swing.JButton roombookButton;
    // End of variables declaration//GEN-END:variables
}
