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

    public AddServicePanel(SystemAdmin systems, Consumer<Booking> callOnEventBooking,
            Runnable backButton, String username,Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnEventBooking = callOnEventBooking;
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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("ADD SERVICES ");

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");

        eventBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        eventBtn.setText("BUSINESS EVENTS ");
        eventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventBtnActionPerformed(evt);
            }
        });

        orderBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        orderBtn.setText("PLACE ORDER ");

        healthClubBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        healthClubBtn.setText("HEALTH CLUB ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eventBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(orderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(healthClubBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(eventBtn)
                .addGap(58, 58, 58)
                .addComponent(orderBtn)
                .addGap(62, 62, 62)
                .addComponent(healthClubBtn)
                .addContainerGap(382, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventBtnActionPerformed
    callOnEventBooking.accept(booking);
    }//GEN-LAST:event_eventBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton eventBtn;
    private javax.swing.JButton healthClubBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton orderBtn;
    // End of variables declaration//GEN-END:variables
}
