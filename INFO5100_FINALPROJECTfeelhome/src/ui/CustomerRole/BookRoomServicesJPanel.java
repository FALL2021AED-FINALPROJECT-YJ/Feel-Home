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
import model.Room.RoomType;
import model.SystemAdmin;

public class BookRoomServicesJPanel extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Runnable callOnCreateMethod1;
    private String username;

    public BookRoomServicesJPanel(SystemAdmin systems, Runnable callOnCreateMethod1, String username) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        for (Network network : systems.getListOfNetwork()) {
            cityCombo.addItem(network.getName());
        }
        for (RoomType type : RoomType.values()) {
            roomtypeComboBox.addItem(type);
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
        lblbookservices = new javax.swing.JLabel();
        peopleField = new javax.swing.JTextField();
        roomField = new javax.swing.JTextField();
        checkin = new com.toedter.calendar.JDateChooser();
        hotelCombo = new javax.swing.JComboBox<>();
        checkout = new com.toedter.calendar.JDateChooser();
        cityCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        roomtypeComboBox = new javax.swing.JComboBox<>();
        priceBtn = new javax.swing.JButton();

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblbookservices.setText("BOOK ROOMS AND SERVICES");

        hotelCombo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hotelCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a hotel" }));

        cityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select city" }));
        cityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("ROOM TYPE ");

        roomtypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomtypeComboBoxActionPerformed(evt);
            }
        });

        priceBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        priceBtn.setText("CALCULATE PRICE");
        priceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(lblbookservices))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldate)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnnoofpeople)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblroom))
                                    .addComponent(lblhotel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcity, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(208, 208, 208)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(peopleField, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(roomtypeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 334, Short.MAX_VALUE)
                                                .addComponent(roomField, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(checkin, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hotelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(priceBtn)
                                .addGap(18, 18, 18)
                                .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(297, 297, 297))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(bookroomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(523, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(12, 12, 12)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hotelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblhotel))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peopleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnoofpeople))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomtypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblroom))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceBtn))
                .addGap(42, 42, 42)
                .addComponent(bookroomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookroomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookroomBtnActionPerformed
        System.out.println(username + " username ");
        Date checkinDate = checkin.getDate();
        Date checkoutdate = checkout.getDate();
        String city = cityCombo.getSelectedItem().toString();
        int roomCount = Integer.parseInt(roomField.getText());
        RoomType roomType = (RoomType) roomtypeComboBox.getSelectedItem();

        Network network = systems.findNetwork(city);

        Hotel hotel = network.getEnterpriseDirectory().findHotel(hotelCombo.getSelectedItem().toString());
        List<Room> availableRooms = hotel.availableRooms(checkinDate, checkoutdate, roomType);
        if (availableRooms.size() < roomCount) {
            JOptionPane.showMessageDialog(this, "Rooms not available for the specified date.");
            return;
        }

        List<Room> bookedRooms = hotel.bookRooms(checkinDate, checkoutdate, roomCount, roomType);
        Customer customer = systems.getCustomerDirec().findCustomerUsername(username);
        Booking booking = customer.addBooking(hotel);  //add bookings in customer class
        booking.getRoomlist().createRoom(roomType);     // add rooms in booking class 
        booking.setCheckin(checkinDate);
        booking.setCheckout(checkoutdate);
        booking.setStatus("Booked");
        booking.setPrice(roomType.getRate()); 

        JOptionPane.showMessageDialog(this, "Room booked successfully. The total cost for your booking is "
                + (roomCount * roomType.getRate()) + "$");
    }//GEN-LAST:event_bookroomBtnActionPerformed

    private void cityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityComboActionPerformed
        String city = cityCombo.getSelectedItem().toString();
        Network network = systems.findNetwork(city);
        hotelCombo.removeAllItems();
        if(network != null){
        for (Hotel hotel : network.getEnterpriseDirectory().getListOfHotel()) {  //populate all hotel in that city
            hotelCombo.addItem(hotel.getName());
        }
        }
    }//GEN-LAST:event_cityComboActionPerformed

    private void roomtypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomtypeComboBoxActionPerformed

    }//GEN-LAST:event_roomtypeComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void priceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceBtnActionPerformed
        final String roomNum = roomField.getText();
        if (roomNum != null && !roomNum.isEmpty()) {
            int roomCount = Integer.parseInt(roomNum);
            RoomType selectType = (RoomType) roomtypeComboBox.getSelectedItem();
            priceField.setText(selectType.getRate() * roomCount + "$");
        } else {
            JOptionPane.showMessageDialog(this, "Please provide number of rooms to calculate price.");
        }
    }//GEN-LAST:event_priceBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookroomBtn;
    private javax.swing.JLabel btnnoofpeople;
    private com.toedter.calendar.JDateChooser checkin;
    private com.toedter.calendar.JDateChooser checkout;
    private javax.swing.JComboBox<String> cityCombo;
    private javax.swing.JComboBox<String> hotelCombo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblhotel;
    private javax.swing.JLabel lblroom;
    private javax.swing.JTextField peopleField;
    private javax.swing.JButton priceBtn;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField roomField;
    private javax.swing.JComboBox<RoomType> roomtypeComboBox;
    // End of variables declaration//GEN-END:variables
}
