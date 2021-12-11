package ui.EventManagerRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Booking;
import model.BusinessEvent;
import model.CateringService;
import model.Customer;
import model.CustomerDirectory;
import model.DecorServices;
import model.Network;
import model.Organization;
import model.PhotographyService;
import model.SystemAdmin;
import model.service.BusinessEventService;
import model.service.Service;

public class ViewTaskPanelForEvent extends javax.swing.JPanel {

    private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private BusinessEvent businessEvent;

    public ViewTaskPanelForEvent(SystemAdmin systemAdmin, Runnable callOnCreateMethod, String user, String type, BusinessEvent businessEvent) {
        initComponents();
        this.systemAdmin = systemAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.businessEvent = businessEvent;
        populateComboBox();
        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cateringOrg = new javax.swing.JComboBox<>();
        decorOrg = new javax.swing.JComboBox<>();
        photographyOrg = new javax.swing.JComboBox<>();
        cateringField = new javax.swing.JTextField();
        decorField = new javax.swing.JTextField();
        photographyField = new javax.swing.JTextField();
        assignTaskBtn = new javax.swing.JButton();

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("VIEW ORDER DETAILS FOR EVENTS");

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKING ID", "NAME", "STATUS", "CATERING", "DECOR", "PHOTOGRAPHY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("DELETE");

        jLabel2.setText("SELECT A CATERING ORG");

        jLabel3.setText("SELECT A DECOR ORG");

        jLabel4.setText("SELECT A PHOTOGRAPHY ORG");

        assignTaskBtn.setText("ASSIGN TAND CONFIRM TASK");
        assignTaskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignTaskBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cateringOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cateringField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(decorOrg, 0, 196, Short.MAX_VALUE)
                                    .addComponent(decorField))))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(photographyField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(photographyOrg, javax.swing.GroupLayout.Alignment.LEADING, 0, 193, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(741, 741, 741)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(assignTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(backBtn)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(decorOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(photographyOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cateringOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cateringField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(photographyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(assignTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void assignTaskBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignTaskBtnActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Booking booking = (Booking) model.getValueAt(selectedRowIndex, 0);

        BusinessEventService eventService = null;
        for (Service service : booking.getServices()) {
            if (businessEvent.getName().equals(service.getEnterprise().getName())) {
                eventService = (BusinessEventService) service;
                break;
            }
        }

        if (eventService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find business event");
            return;
        }

        CateringService cateringService = (CateringService) cateringOrg.getSelectedItem();
        PhotographyService photographyService = (PhotographyService) photographyOrg.getSelectedItem();
        DecorServices decorService = (DecorServices) decorOrg.getSelectedItem();

        List<Organization> organizations = new ArrayList<>();
        for (BusinessEventService.BusinessEventServiceType type : eventService.getBusinessEventServiceTypes().keySet()) {
            switch (type) {
                case CATERING:
                    if (cateringService == null) {
                        JOptionPane.showMessageDialog(this, "Please select catering organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(cateringService);
                    }
                    break;
                case DECOR:
                    if (decorService == null) {
                        JOptionPane.showMessageDialog(this, "Please decor catering organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(decorService);
                    }
                    break;
                case PHOTOGRAPHY:
                    if (photographyService == null) {
                        JOptionPane.showMessageDialog(this, "Please select photography organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(photographyService);
                    }
                    break;
            }
        }

        for (Organization organization : organizations) {
            eventService.addOrganization(organization);
        }
        eventService.setStatus(Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all event services to the booking: " + booking.getId());
        return;
    }//GEN-LAST:event_assignTaskBtnActionPerformed

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        Object row[] = new Object[10];
        CustomerDirectory customerDirec = systemAdmin.getCustomerDirec(); //get all customers
        for (Customer customer : customerDirec.getListOfCustomer()) {
            for (Booking booking : customer.getBookingList()) {      //get booking details each customer
                for (Service service : booking.getServices()) {       //get services under booking

                    if (service.getEnterprise().getName().equals(businessEvent.getName())) {

                        BusinessEventService businessEventService = (BusinessEventService) service;

                        row[0] = booking;
                        row[1] = customer;
                        row[2] = businessEventService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";
                        row[5] = "NO";
                      
                        for (BusinessEventService.BusinessEventServiceType type : businessEventService.getBusinessEventServiceTypes().keySet()) {
                            switch (type) {
                                case CATERING:
                                    row[3] = "YES";
                                    break;
                                case DECOR:
                                    row[4] = "YES";
                                    break;
                                case PHOTOGRAPHY:
                                    row[5] = "YES";
                                    break;
                            }
                        }
                          model.addRow(row);
                    }
                }
            }
        }

    }

    private void populateComboBox() {
        cateringOrg.removeAllItems();
        decorOrg.removeAllItems();
        photographyOrg.removeAllItems();
        
        cateringOrg.addItem(null);
        decorOrg.addItem(null);
        photographyOrg.addItem(null);

        for (CateringService catering : businessEvent.getListOfCatering()) {
            if (catering != null) {
                cateringOrg.addItem(catering);
            }
        }
        for (DecorServices decor : businessEvent.getListOfDecors()) {
            if (decor != null) {
                decorOrg.addItem(decor);
            }
        }
        for (PhotographyService photography : businessEvent.getListOfPhotographyServices()) {
            if (photography != null) {
                photographyOrg.addItem(photography);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignTaskBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cateringField;
    private javax.swing.JComboBox<CateringService> cateringOrg;
    private javax.swing.JTextField decorField;
    private javax.swing.JComboBox<model.DecorServices> decorOrg;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField photographyField;
    private javax.swing.JComboBox<model.PhotographyService> photographyOrg;
    // End of variables declaration//GEN-END:variables
}
