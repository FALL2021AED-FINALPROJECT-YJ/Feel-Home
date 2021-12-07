package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import model.Booking;
import model.PhotographyOrg;
import model.SystemAdmin;
import model.service.BusinessEventService;
import model.service.HealthClubService;

public class HealthClubServicesJPanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Consumer<Booking> callOnCreateMethod1;
    private String username;
    private Booking booking;

    public HealthClubServicesJPanel(SystemAdmin systems, Consumer<Booking> callOnCreateMethod1, String username, Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbookservices = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        yogaBtn = new javax.swing.JCheckBox();
        massageBtn = new javax.swing.JCheckBox();
        medicalServiceBtn = new javax.swing.JCheckBox();
        addServiceBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(204, 255, 255));

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblbookservices.setText("HEALTH CLUB SERVICES");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("SELECT BELOW SERVICES ");

        yogaBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yogaBtn.setText("YOGA");

        massageBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        massageBtn.setText("MASSAGE AND SPA");

        medicalServiceBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        medicalServiceBtn.setText("MEDICAL SERVICE ");
        medicalServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalServiceBtnActionPerformed(evt);
            }
        });

        addServiceBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addServiceBtn.setText("ADD SERVICE");
        addServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServiceBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("TOTAL PRICE ");

        priceField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("(MONDAY-SUNDAY) 7A.M - 9A.M");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("(MONDAY-SUNDAY) 4P.M-5:30P.M ");

        jLabel6.setText("(MONDAY - SUNDAY) 12P.M-4P.M ");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("SELECT A DATE ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(backBtn)
                .addContainerGap(936, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medicalServiceBtn)
                            .addComponent(jLabel1)
                            .addComponent(massageBtn)
                            .addComponent(yogaBtn)
                            .addComponent(jLabel7))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dateField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addComponent(lblbookservices)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(addServiceBtn)))
                .addGap(285, 285, 285))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblbookservices)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(63, 63, 63)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yogaBtn)
                    .addComponent(jLabel3))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(massageBtn)
                    .addComponent(jLabel5))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicalServiceBtn)
                    .addComponent(jLabel6))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(addServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void medicalServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalServiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicalServiceBtnActionPerformed

    private void addServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addServiceBtnActionPerformed
        Date date = dateField.getDate();
        Date checkin = booking.getCheckin();
        Date checkout = booking.getCheckout();
        if (date.compareTo(checkin) < 0 || date.compareTo(checkout) > 0) {
            JOptionPane.showMessageDialog(this, "Selected date should be witihin check-in date (" + checkin
                    + ") and checkout date (" + checkout + ")");
            return;
        }

        boolean yogaBtnSelected = yogaBtn.isSelected();
        boolean massageRadioBtnSelected = massageBtn.isSelected();
        boolean medicalRadioBtnSelected = medicalServiceBtn.isSelected();

        if (!yogaBtnSelected && !massageRadioBtnSelected && !medicalRadioBtnSelected) {
            JOptionPane.showMessageDialog(this, "Please select at least one service for Health Club.");
            return;
        }

        HealthClubService healthClubService = new HealthClubService(date);
        if (yogaBtnSelected) {
            healthClubService.addService(HealthClubService.HealthClubServiceType.TRAINER);
        }
        if (massageRadioBtnSelected) {
            healthClubService.addService(HealthClubService.HealthClubServiceType.THERAPIST);
        }
        if (medicalRadioBtnSelected) {
            healthClubService.addService(HealthClubService.HealthClubServiceType.PHYSICIAN);
        }

        booking.addService(healthClubService);
    }//GEN-LAST:event_addServiceBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addServiceBtn;
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JCheckBox massageBtn;
    private javax.swing.JCheckBox medicalServiceBtn;
    private javax.swing.JTextField priceField;
    private javax.swing.JCheckBox yogaBtn;
    // End of variables declaration//GEN-END:variables
}
