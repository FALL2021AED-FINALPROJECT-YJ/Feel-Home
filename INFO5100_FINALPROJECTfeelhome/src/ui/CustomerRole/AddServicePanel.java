package ui.CustomerRole;

import java.util.function.Consumer;
import model.Booking;
import model.SystemAdmin;

public class AddServicePanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Consumer<Booking> callOnEventBooking;    
    private Consumer<Booking> callOnOrderBooking;    
    private Consumer<Booking> callOnHealthClubBooking;
    private Runnable backButton4;
    private String username;
    private String hotelName;
    private Booking booking;

    public AddServicePanel(SystemAdmin systems, Consumer<Booking> callOnEventBooking,Consumer<Booking> callOnOrderBooking,
         Consumer<Booking> callOnHealthClubBooking,Runnable backButton, String username,Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnEventBooking = callOnEventBooking;
        this.callOnOrderBooking = callOnOrderBooking;
        this.callOnHealthClubBooking = callOnHealthClubBooking;
        this.backButton4 = backButton;
        this.username = username;
        this.booking = booking;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        eventBtn = new javax.swing.JButton();
        orderBtn = new javax.swing.JButton();
        healthClubBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("                ADD SERVICES ");

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        eventBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        eventBtn.setText("BUSINESS EVENTS ");
        eventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventBtnActionPerformed(evt);
            }
        });

        orderBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        orderBtn.setText("PLACE ORDER ");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        healthClubBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        healthClubBtn.setText("HEALTH CLUB ");
        healthClubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthClubBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(healthClubBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(389, 389, 389))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(307, 307, 307))))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(backButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(eventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(healthClubBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventBtnActionPerformed
    callOnEventBooking.accept(booking);
    }//GEN-LAST:event_eventBtnActionPerformed

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
       callOnOrderBooking.accept(booking);
    }//GEN-LAST:event_orderBtnActionPerformed

    private void healthClubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthClubBtnActionPerformed
       callOnHealthClubBooking.accept(booking);
    }//GEN-LAST:event_healthClubBtnActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        backButton4.run();
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton eventBtn;
    private javax.swing.JButton healthClubBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton orderBtn;
    // End of variables declaration//GEN-END:variables
}
