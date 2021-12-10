package ui.HotelManagerRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Booking;
import model.CateringService;
import model.Customer;
import model.CustomerDirectory;
import model.DecorServices;
import model.HealthClub;
import model.Hotel;
import model.LaundaryOrg;
import model.Network;
import model.Organization;
import model.PhotographyService;
import model.PhysicianOrg;
import model.SystemAdmin;
import model.TherapistOrg;
import model.TrainerOrg;
import model.TransportationOrg;
import model.service.BusinessEventService;
import model.service.HealthClubService;
import model.service.HotelService;
import model.service.Service;

public class ViewTaskForHotel extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Hotel hotel;

    public ViewTaskForHotel(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, Hotel hotel) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.hotel = hotel;
        populateComboBox();
        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        laundaryOrg = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        transportationOrg = new javax.swing.JComboBox<>();
        assignTask = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "CUSTOMER NAME", "STATUS", "LAUNDARY", "TRANSPORTATION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setText("DELETE");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("SELECT A LAUNDARY ORG");

        laundaryOrg.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        laundaryOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laundaryOrgActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("SELECT A TRANSPORTATION ORG");

        assignTask.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        assignTask.setText("ASSIGN TASK");
        assignTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignTaskActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setText("VIEW ORDER DETAILS FOR HOTEL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laundaryOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transportationOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(719, 719, 719))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))))
            .addGroup(layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(assignTask, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backButton)
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laundaryOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transportationOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(assignTask, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void assignTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignTaskActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Booking booking = (Booking) model.getValueAt(selectedRowIndex, 0);

        HotelService hotelService = null;
        for (Service service : booking.getServices()) {
            if (hotel.getName().equals(service.getEnterprise().getName())) {
                hotelService = (HotelService) service;
                break;
            }
        }

        if (hotelService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find hotel");
            return;
        }

        LaundaryOrg laundary = (LaundaryOrg) laundaryOrg.getSelectedItem();
        TransportationOrg transportation = (TransportationOrg) transportationOrg.getSelectedItem();

        List<Organization> organizations = new ArrayList<>();
        for (HotelService.HotelServiceType type : hotelService.getHotelServices()) {
            switch (type) {
                case LAUNDARY:
                    if (laundary == null) {
                        JOptionPane.showMessageDialog(this, "Please select laundary organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(laundary);
                    }
                    break;
                case TRANSPORTATION:
                    if (transportation == null) {
                        JOptionPane.showMessageDialog(this, "Please select transportation organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(transportation);
                    }
                    break;
            }
        }

        for (Organization organization : organizations) {
            hotelService.addOrganization(organization);
        }
        hotelService.setStatus(Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all hotel services to the booking: " + booking.getId());
        return;


    }//GEN-LAST:event_assignTaskActionPerformed

    private void laundaryOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laundaryOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laundaryOrgActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        Object row[] = new Object[10];
        CustomerDirectory customerDirec = systemAdmin.getCustomerDirec(); //get all customers
        for (Customer customer : customerDirec.getListOfCustomer()) {
            for (Booking booking : customer.getBookingList()) {      //get booking details each customer
                for (Service service : booking.getServices()) {       //get services under booking
                    System.out.println("Enterprise : " + service.getEnterprise());
                    if (hotel.getName().equals(service.getEnterprise().getName())) {
                        HotelService hotelService = (HotelService) service;

                        row[0] = booking;
                        row[1] = customer;
                        row[2] = hotelService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";

                        for (HotelService.HotelServiceType type : hotelService.getHotelServices()) {
                            switch (type) {
                                case LAUNDARY:
                                    row[3] = "YES";
                                    break;
                                case TRANSPORTATION:
                                    row[4] = "YES";
                                    break;
                            }
                        }
                    }
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignTask;
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<LaundaryOrg> laundaryOrg;
    private javax.swing.JComboBox<TransportationOrg> transportationOrg;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        laundaryOrg.addItem(null);
        transportationOrg.addItem(null);

        for (LaundaryOrg laundary : hotel.getLaundaryOrg()) {
            if (laundary != null) {
                laundaryOrg.addItem(laundary);
            }
        }
        for (TransportationOrg transportation : hotel.getTransportationOrgList()) {
            if (transportation != null) {
                transportationOrg.addItem(transportation);
            }
        }
    }
}
