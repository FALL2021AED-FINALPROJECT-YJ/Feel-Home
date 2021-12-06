package ui.CustomerRole;

import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import model.Booking;
import model.Hotel;
import model.MenuItem;
import model.Network;
import model.Restaurant;
import model.SystemAdmin;
import model.service.RestaurantService;

public class PlaceOrder extends javax.swing.JPanel {

    private SystemAdmin systems;
    private Consumer<Booking> callOnCreateMethod1;
    private String username;
    private Booking booking;

    public PlaceOrder(SystemAdmin systems, Consumer<Booking> callOnCreateMethod1, String username, Booking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;

        String hotelName = booking.getHotel().getName();

        List<Network> network = systems.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Hotel> hotelList = network.get(i).getEnterpriseDirectory().getListOfHotel();
            for (int j = 0; j < hotelList.size(); j++) {
                if (hotelList.get(j).getName().equals(hotelName)) {
                    for (Restaurant res : network.get(i).getEnterpriseDirectory().getListOfRestaurants()) {
                        restaurantCombo.addItem(res);

                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuItem = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        placeOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        restaurantCombo = new javax.swing.JComboBox<>();

        menuItem.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText(" MENU ITEMS FOR RESTAURANT");

        placeOrder.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        placeOrder.setText("PLACE ORDER");
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("SELECT ITEM FROM LIST ");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("TOTAL PRICE ");

        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("SELECT A RESTAURANT NAME ");

        restaurantCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        restaurantCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(restaurantCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(backBtn)))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(placeOrder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(restaurantCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(menuItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(85, 85, 85)
                        .addComponent(placeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(201, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed

    }//GEN-LAST:event_priceFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void restaurantComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantComboActionPerformed
        String hotelName = booking.getHotel().getName();
        Restaurant restaurant = (Restaurant) restaurantCombo.getSelectedItem();
        for (MenuItem item : restaurant.getListOfItem()) {
            menuItem.addItem(item);
        }

//        List<Network> network = systems.getListOfNetwork();
//        for (int i = 0; i < network.size(); i++) {
//            List<Hotel> hotelList = network.get(i).getEnterpriseDirectory().getListOfHotel();   //find network of hotel
//            for (int j = 0; j < hotelList.size(); j++) {
//                if (hotelList.get(j).getName().equals(hotelName)) {
//                    for (Restaurant res : network.get(i).getEnterpriseDirectory().getListOfRestaurants()) //and populate all restaurants in that network
//                    {
//                        for (MenuItem item : res.getListOfItem()) {
//                            menuItem.addItem(item.getDetails());
//                        }
//
//                    }
//                }
//            }
//        }

    }//GEN-LAST:event_restaurantComboActionPerformed

    private void menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActionPerformed
        MenuItem item = (MenuItem) menuItem.getSelectedItem();
        priceField.setText(item.getPrice());

//        String hotelName = booking.getHotel().getName();
//        List<Network> network = systems.getListOfNetwork();
//        for (int i = 0; i < network.size(); i++) {
//            List<Hotel> hotelList = network.get(i).getEnterpriseDirectory().getListOfHotel();   //find network of hotel
//            for (int j = 0; j < hotelList.size(); j++) {
//                if (hotelList.get(j).getName().equals(hotelName)) {
//                    for (Restaurant res : network.get(i).getEnterpriseDirectory().getListOfRestaurants()) //and populate all restaurants in that hotel
//                    {
//                        for (MenuItem item1 : res.getListOfItem()) {
//                            if (item1.getDetails().equals(item)) {
//                                priceField.setText(item1.getPrice());
//                            }
//                        }
//
//                    }
//                }
//            }
//        }
    }//GEN-LAST:event_menuItemActionPerformed

    private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderActionPerformed
        menuItem.removeAllItems();
        Date date = new Date();
        String item = menuItem.getSelectedItem().toString();
        Restaurant restaurant = (Restaurant) restaurantCombo.getSelectedItem();
        int price = Integer.parseInt(priceField.getText());

        RestaurantService service = new RestaurantService(restaurant, date, item, price);
        booking.addService(service);
        JOptionPane.showMessageDialog(this, " Order placed successfully");
    }//GEN-LAST:event_placeOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<MenuItem> menuItem;
    private javax.swing.JButton placeOrder;
    private javax.swing.JTextField priceField;
    private javax.swing.JComboBox<Restaurant> restaurantCombo;
    // End of variables declaration//GEN-END:variables
}
