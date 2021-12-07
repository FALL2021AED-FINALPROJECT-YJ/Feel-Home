
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

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CUSTOMER PANEL ");

        roombookButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roombookButton.setText("BOOK ROOMS & SERVICES");
        roombookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roombookButtonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("BACK");

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
                .addGap(75, 75, 75)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(388, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(roombookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(314, 314, 314))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(roombookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(manageBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(456, Short.MAX_VALUE))
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
