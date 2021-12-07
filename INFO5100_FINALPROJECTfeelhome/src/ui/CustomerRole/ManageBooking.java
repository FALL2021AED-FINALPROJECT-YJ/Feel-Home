package ui.CustomerRole;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.swing.table.DefaultTableModel;
import model.Booking;
import model.Customer;
import model.CustomerDirectory;
import model.SystemAdmin;

public class ManageBooking extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod1;
    private Consumer<Booking> callOnAddServiceMethod;
    private Consumer<Booking> callOnViewServiceMethod;
    private String username;

    public ManageBooking(SystemAdmin systemAdmin, Runnable callOnCreateMethod1, Consumer<Booking> callOnCreateMethod2, Consumer<Booking> callOnViewServiceMethod, String username) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnAddServiceMethod = callOnCreateMethod2;
        this.callOnViewServiceMethod = callOnViewServiceMethod;
        this.username = username;

        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addServiceBtn = new javax.swing.JButton();
        viewOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("BOOKING DETAILS");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HOTEL NAME", "BOOKING ID", "PRICE", "STATUS", "CHECK_IN", "CHECK OUT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        addServiceBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        addServiceBtn.setText("ADD SERVICES");
        addServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServiceBtnActionPerformed(evt);
            }
        });

        viewOrder.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        viewOrder.setText("VIEW SERVICE DETAILS");
        viewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(backBtn)
                .addGap(0, 935, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(322, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void addServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addServiceBtnActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String bookingId = (String) model.getValueAt(selectedRowIndex, 1);

        System.out.println(bookingId + " is selected");

        CustomerDirectory customDirec = systemAdmin.getCustomerDirec();
        Customer customer = customDirec.findCustomerUsername(username);

        List<Booking> list = customer.getBookingList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(bookingId)) {
                callOnAddServiceMethod.accept(list.get(i));
                return;
            }
        }
    }//GEN-LAST:event_addServiceBtnActionPerformed

    private void viewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String bookingId = (String) model.getValueAt(selectedRowIndex, 1);

        System.out.println(bookingId + " is selected");

        CustomerDirectory customDirec = systemAdmin.getCustomerDirec();
        Customer customer = customDirec.findCustomerUsername(username);

        List<Booking> list = customer.getBookingList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(bookingId)) {
                callOnViewServiceMethod.accept(list.get(i));
                return;
            }
        }
    }//GEN-LAST:event_viewOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addServiceBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton viewOrder;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        CustomerDirectory customDirec = systemAdmin.getCustomerDirec();
        Customer customer = customDirec.findCustomerUsername(username);
        System.out.println("customer found is " + customer.getName() + " username is " + username);
        for (Booking bookingList : customer.getBookingList()) {
            row[0] = bookingList.getHotel().getName();
            row[1] = bookingList.getId();
            row[2] = bookingList.getCost();
            row[3] = bookingList.getStatus();
            row[4] = bookingList.getCheckin();
            row[5] = bookingList.getCheckout();
            model.addRow(row);
        }

    }
}
