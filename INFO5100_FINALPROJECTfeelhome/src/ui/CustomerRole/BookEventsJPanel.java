package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import model.Booking;
import model.BusinessEvent;
import model.CateringService.CateringType;
import model.DecorOrg.DecorType;
import model.PhotographyOrg.PhotographyType;
import model.SystemAdmin;
import model.service.BusinessEventService;

public class BookEventsJPanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Consumer<Booking> callOnCreateMethod1;
    private String username;
    private Booking booking;

    public BookEventsJPanel(SystemAdmin systems, Consumer<Booking> callOnCreateMethod1, String username, Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;

        for (BusinessEvent eventOrg : booking.getNetwork().getEnterpriseDirectory().getListOfEvents()) {
            orgComboBox.addItem(eventOrg);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        backBtn = new javax.swing.JButton();
        lblbookservices = new javax.swing.JLabel();
        photoRadioBtn = new javax.swing.JRadioButton();
        cateringRadioBtn = new javax.swing.JRadioButton();
        bookEventBtn = new javax.swing.JButton();
        decorCombo = new javax.swing.JComboBox<>();
        photgraphyCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cateringCombo = new javax.swing.JComboBox<>();
        decorRadioBtn = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        orgComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblbookservices.setText("BOOK EVENTS");

        photoRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        photoRadioBtn.setText("PHOTOGRAPHY");
        photoRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoRadioBtnActionPerformed(evt);
            }
        });

        cateringRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cateringRadioBtn.setText("CATERING");
        cateringRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cateringRadioBtnActionPerformed(evt);
            }
        });

        bookEventBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bookEventBtn.setText("BOOK EVENT");
        bookEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookEventBtnActionPerformed(evt);
            }
        });

        decorCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        photgraphyCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("TYPE OF PACKAGE ");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("TYPE OF PACKAGE");

        cateringCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cateringCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cateringComboActionPerformed(evt);
            }
        });

        decorRadioBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        decorRadioBtn.setText("DECOR SERVICE ");
        decorRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decorRadioBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("TYPE OF PACKAGE");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("DATE ");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("TOTAL PRICE ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("BUSINESS ORGANIZATION ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(photoRadioBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(decorRadioBtn)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cateringRadioBtn)
                                    .addComponent(jLabel5))
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(76, 76, 76)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(photgraphyCombo, 0, 445, Short.MAX_VALUE)
                            .addComponent(decorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cateringCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(bookEventBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(lblbookservices)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backBtn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblbookservices)
                        .addGap(57, 57, 57)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(photoRadioBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(photgraphyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(cateringRadioBtn)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cateringCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(decorRadioBtn)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45)
                        .addComponent(bookEventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(orgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void photoRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoRadioBtnActionPerformed
        if (photoRadioBtn.isSelected()) {
            for (PhotographyType photo : PhotographyType.values()) {
                photgraphyCombo.addItem(photo);
            }
        }
    }//GEN-LAST:event_photoRadioBtnActionPerformed

    private void bookEventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookEventBtnActionPerformed

        BusinessEvent businessEvent = (BusinessEvent) orgComboBox.getSelectedItem();

        if (businessEvent == null) {
            JOptionPane.showMessageDialog(this, "Please select a Business Event organization from the dropdown.");
            return;
        }

        Date date = dateField.getDate();
        Date checkin = booking.getCheckin();
        Date checkout = booking.getCheckout();
        if (date.compareTo(checkin) < 0 || date.compareTo(checkout) > 0) {
            JOptionPane.showMessageDialog(this, "Selected date should be witihin check-in date (" + checkin
                    + ") and checkout date (" + checkout + ")");
            return;
        }

        boolean photoRadioBtnSelected = photoRadioBtn.isSelected();
        boolean decorRadioBtnSelected = decorRadioBtn.isSelected();
        boolean cateringRadioBtnSelected = cateringRadioBtn.isSelected();

        if (!photoRadioBtnSelected && !decorRadioBtnSelected && !cateringRadioBtnSelected) {
            JOptionPane.showMessageDialog(this, "Please select at least one service for Business Event.");
            return;
        }

        BusinessEventService service = new BusinessEventService(businessEvent, date);
        if (photoRadioBtnSelected) {
            PhotographyType photography = (PhotographyType) photgraphyCombo.getSelectedItem();
            service.addService(BusinessEventService.BusinessEventServiceType.PHOTOGRAPHY, photography.getRate());
        }

        if (decorRadioBtnSelected) {
            DecorType decor = (DecorType) decorCombo.getSelectedItem();
            service.addService(BusinessEventService.BusinessEventServiceType.DECOR, decor.getRate());
        }

        if (cateringRadioBtnSelected) {
            CateringType catering = (CateringType) cateringCombo.getSelectedItem();
            service.addService(BusinessEventService.BusinessEventServiceType.CATERING, catering.getRate());
        }

        booking.addService(service);
        JOptionPane.showMessageDialog(this, "Business event service added successfully.");

        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_bookEventBtnActionPerformed

    private void cateringComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cateringComboActionPerformed

    }//GEN-LAST:event_cateringComboActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void cateringRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cateringRadioBtnActionPerformed
        if (cateringRadioBtn.isSelected()) {
            for (CateringType catering : CateringType.values()) {
                cateringCombo.addItem(catering);
            }

        }
    }//GEN-LAST:event_cateringRadioBtnActionPerformed

    private void decorRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decorRadioBtnActionPerformed
        if (decorRadioBtn.isSelected()) {
            for (DecorType decor : DecorType.values()) {
                decorCombo.addItem(decor);
            }
        }
    }//GEN-LAST:event_decorRadioBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookEventBtn;
    private javax.swing.JComboBox<CateringType> cateringCombo;
    private javax.swing.JRadioButton cateringRadioBtn;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JComboBox<DecorType> decorCombo;
    private javax.swing.JRadioButton decorRadioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JComboBox<BusinessEvent> orgComboBox;
    private javax.swing.JComboBox<PhotographyType> photgraphyCombo;
    private javax.swing.JRadioButton photoRadioBtn;
    private javax.swing.JTextField priceField;
    // End of variables declaration//GEN-END:variables
}
