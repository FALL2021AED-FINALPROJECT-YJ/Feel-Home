package ui.CustomerRole;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Booking;
import model.Customer;
import model.CustomerDirectory;
import model.Hotel;
import model.Network;
import model.Room;
import model.SystemAdmin;

public class BookRoomServicesJPanel extends javax.swing.JPanel {

    SystemAdmin systems;
    private Runnable callOnCreateMethod1;
    String username;

    public BookRoomServicesJPanel(SystemAdmin systems, Runnable callOnCreateMethod1, String username) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        for (Network network : systems.getListOfNetwork()) {
            cityCombo.addItem(network.getName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        lbldate = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        lblhotel = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        btnnoofpeople = new javax.swing.JLabel();
        lblroom = new javax.swing.JLabel();
        bookroomBtn = new javax.swing.JButton();
        btnviewdetails = new javax.swing.JButton();
        lblbookservices = new javax.swing.JLabel();
        peopleField = new javax.swing.JTextField();
        roomField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        checkin = new com.toedter.calendar.JDateChooser();
        hotelCombo = new javax.swing.JComboBox<>();
        serviceBtn = new javax.swing.JButton();
        checkout = new com.toedter.calendar.JDateChooser();
        priceBtn = new javax.swing.JButton();
        cityCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        roomtype = new javax.swing.JComboBox<>();

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("BACK");

        lbldate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldate.setText("CHECK-IN & CHECK-OUT");

        lblcity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcity.setText("CITY");

        lblhotel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblhotel.setText("HOTELS");

        btnnoofpeople.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnoofpeople.setText("NO OF PEOPLE");

        lblroom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblroom.setText("NO OF ROOMS");

        bookroomBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bookroomBtn.setText("BOOK ROOM");
        bookroomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookroomBtnActionPerformed(evt);
            }
        });

        btnviewdetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnviewdetails.setText("VIEW DETAILS");
        btnviewdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewdetailsActionPerformed(evt);
            }
        });

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblbookservices.setText("BOOK ROOMS AND SERVICES");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER NAME", "CHECK-IN", "CHECK-OUT", "NO OF ROOMS", "PRICE ", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        hotelCombo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hotelCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a hotel" }));

        serviceBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        serviceBtn.setText("ADD SERVICES");
        serviceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceBtnActionPerformed(evt);
            }
        });

        priceBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        priceBtn.setText("TOTAL PRICE");

        priceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceBtnActionPerformed(evt);
            }
        });

        cityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select city" }));
        cityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("ROOM TYPE ");

        jTextField1.setText("jTextField1");

        roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a room type", "Regular", "Delux", "Super Delux" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcity, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbldate)
                                    .addComponent(lblhotel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnnoofpeople)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblroom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkin, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(peopleField, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(checkin, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(roomtypeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(roomField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(hotelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(bookroomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(priceBtn)))
                .addContainerGap(523, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblbookservices)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbldate)
                            .addComponent(checkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcity))
                        .addGap(34, 34, 34)
                        .addComponent(lblhotel))
                    .addComponent(hotelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnoofpeople, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(peopleField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(roomtypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(41, 41, 41)
                        .addComponent(lblroom)
                        .addGap(53, 53, 53)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceBtn)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(bookroomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewdetailsActionPerformed

    }//GEN-LAST:event_btnviewdetailsActionPerformed

    private void bookroomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookroomBtnActionPerformed
        System.out.println(username + " username ");
        Date checkinDate = checkin.getDate();
        Date checkoutdate = checkout.getDate();
        String city = cityCombo.getSelectedItem().toString();
        int peopleCount = Integer.parseInt(peopleField.getText());
        int roomCount = Integer.parseInt(roomField.getText());
        int price = roomCount * 3;
        System.out.println("roomCount is " +roomCount+ " price is " +price);
        Network network = systems.findNetwork(city);   //find the network(city)
        Hotel hotel = network.getEnterpriseDirectory().findHotel(hotelCombo.getSelectedItem().toString());

        System.out.println("Before ::: " + hotel);
        
        List<Room> availableRooms = hotel.availableRooms(checkinDate, checkoutdate);
        if (availableRooms.size() < roomCount) {
            JOptionPane.showMessageDialog(this, "Rooms not available for the specified date.");
            return;
        }
        
        List<Room> bookedRooms = hotel.bookRooms(checkinDate, checkoutdate, roomCount);
        
        Customer customer = systems.getCustomerDirec().findCustomerUsername(username); //find customer    
        Booking booking = customer.addBooking(hotel);  //add booking in customer
        booking.setRooms(bookedRooms);
        booking.setCheckin(checkinDate);
        booking.setCheckout(checkoutdate);
        booking.setStatus("Booked");
        booking.setCost(roomType.getRate()); 

    }//GEN-LAST:event_bookroomBtnActionPerformed

    private void serviceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceBtnActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_serviceBtnActionPerformed

    private void priceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceBtnActionPerformed
        int peopleCount = Integer.parseInt(peopleField.getText());
        int roomCount = Integer.parseInt(roomField.getText());
        int price = roomCount * 3;
        priceField.setText(String.valueOf(price));  //calaculate price of room
    }//GEN-LAST:event_priceBtnActionPerformed

    private void cityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityComboActionPerformed
        String city = cityCombo.getSelectedItem().toString();
        Network network = systems.findNetwork(city);
        for (Hotel hotel : network.getEnterpriseDirectory().getListOfHotel()) {  //populate all hotel in that city
            hotelCombo.addItem(hotel.getName());
        }
    }//GEN-LAST:event_cityComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookroomBtn;
    private javax.swing.JLabel btnnoofpeople;
    private javax.swing.JButton btnviewdetails;
    private com.toedter.calendar.JDateChooser checkin;
    private com.toedter.calendar.JDateChooser checkout;
    private javax.swing.JComboBox<String> cityCombo;
    private javax.swing.JComboBox<String> hotelCombo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblhotel;
    private javax.swing.JLabel lblroom;
    private javax.swing.JTextField peopleField;
    private javax.swing.JButton priceBtn;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField roomField;
    private javax.swing.JComboBox<String> roomtype;
    private javax.swing.JButton serviceBtn;
    // End of variables declaration//GEN-END:variables
}
