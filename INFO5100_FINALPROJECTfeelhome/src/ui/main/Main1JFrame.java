package ui.main;

import java.util.List;
import model.Booking;
import model.BusinessEvent;
import model.Customer;
import model.HealthClub;
import model.Hotel;
import model.Manager;
import model.Network;
import model.Restaurant;
import model.SystemAdmin;
import ui.CustomerRole.AddServicePanel;
import ui.CustomerRole.BookEventsJPanel;
import ui.CustomerRole.BookRoomServicesJPanel;
import ui.CustomerRole.CustomerStartingJPanel;
import ui.CustomerRole.HealthClubServicesJPanel;
import ui.CustomerRole.ManageBooking;
import ui.CustomerRole.RestuarantServicePanel;
import ui.CustomerRole.ViewServiceDetailsPanel;
import ui.EventManagerRole.EventManagerPanel;
import ui.EventManagerRole.ManageOrganisationAdminForEvent;
import ui.EventManagerRole.ManageOrganisationForEvents;
import ui.EventManagerRole.ViewTaskPanelForEvent;
import ui.HealthClubManagerRole.ViewTaskPanel;
import ui.HealthClubManagerRole.HealthClubManagerPanel;
import ui.HealthClubManagerRole.ManageOrganisationPanelForRestaurant;
import ui.HealthClubManagerRole.OrganizationAdminPanel;
import ui.HealthClubManagerRole.ManageOrganizationPanel;
import ui.HotelManagerRole.HotelManagerPanel;
import ui.HotelManagerRole.ManageOrganisationAdminForHotel;
import ui.HotelManagerRole.ManageOrganisationForHotel;
import ui.HotelManagerRole.ManageRoomPanel;
import ui.HotelManagerRole.ViewTaskForHotel;
import ui.RestaurantManagerRole.AddOrderPanel;
import ui.RestaurantManagerRole.ManageOrgAdminForRestauarant;
import ui.RestaurantManagerRole.RestaurantManagerPanel;
import ui.RestaurantManagerRole.ViewTaskPanelRestaurant;
import ui.SystemAdministration.ManageCustomersJPanel;
import ui.SystemAdministration.ManageEnterpriseJPanel;
import ui.SystemAdministration.ManageManagersJPanel;
import ui.SystemAdministration.ManageNetworkJPanel;
import ui.SystemAdministration.SystemAdministrationJPanel;
import ui.confirm.ConfirmWorkRequestsJPanel;
import ui.confirm.ConfirmWorkrequestForDeliveryman;

public class Main1JFrame extends javax.swing.JFrame {

    private SystemAdmin systemAdmin;

    public Main1JFrame() {
        initComponents();
        this.systemAdmin = new SystemAdmin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        ControlPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        WorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlPanel.setBackground(new java.awt.Color(255, 102, 102));
        ControlPanel.setPreferredSize(new java.awt.Dimension(138, 813));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("PASSWORD");

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutBtn.setText("LOGOUT");

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameField)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ControlPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1))
                            .addGroup(ControlPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)))
                        .addContainerGap(14, Short.MAX_VALUE))))
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordField)
                .addContainerGap())
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginBtn)
                .addGap(18, 18, 18)
                .addComponent(logoutBtn)
                .addContainerGap(372, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(ControlPanel);

        WorkArea.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout WorkAreaLayout = new javax.swing.GroupLayout(WorkArea);
        WorkArea.setLayout(WorkAreaLayout);
        WorkAreaLayout.setHorizontalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
        );
        WorkAreaLayout.setVerticalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String username = usernameField.getText();
        String password = passwordField.getText();
        String type = systemAdmin.findUser(username);  //find type of user

//        if (type == null) {
//            JOptionPane.showMessageDialog(this, " Username doesnot exist");
//            return;
//        }
        if (username.equals("admin")) {
            SystemAdministrationJPanel systemAdministration = new SystemAdministrationJPanel(systemAdmin, this::renderNetworkPanel, this::renderEnterprisePanel, this::renderManagerPanel, this::renderCustomerPanel);
            jSplitPane.setRightComponent(systemAdministration);
            return;
        } else if (type.equals("Customer")) {    //if its a customer
            renderCustomer(username);
            return;
        } else if (type.equals("Health Club")) {     //if its a healthclub manager
            renderHealthClubManager(username);
            return;
        } else if (type.equals("Restaurant")) {
            renderRestaurantManager(username);
            return;
        } //        } else if (type.equals("Physician")) {
        //            renderconfirmWorkRequest();
        //            return;
        //        } else if (type.equals("Trainer")) {
        //            renderconfirmWorkRequest();
        //            return;
        //        } else if (type.equals("Therapist")) {
        //            renderconfirmWorkRequest();
        //            return;
        //        } else if (type.equals("Deliveryman")) {
        //            renderDeliverymanPanel();
        //            return;
        //        } 
        else if (type.equals("Hotel")) {
            hotelManagerPanel();
            return;
        } else if (type.equals("Business Event")) {
            eventManagerPanel();
            return;
        } else if (type.equals("Laundary")) {

            return;
        }
    }//GEN-LAST:event_loginBtnActionPerformed
    private void enableLogin() {

    }

    private void renderNetworkPanel() {
        ManageNetworkJPanel network1 = new ManageNetworkJPanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(network1);
    }

    private void renderEnterprisePanel() {
        ManageEnterpriseJPanel enterprise = new ManageEnterpriseJPanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(enterprise);
    }

    private void renderCustomerPanel() {
        ManageCustomersJPanel customer = new ManageCustomersJPanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(customer);
    }

    private void renderManagerPanel() {
        ManageManagersJPanel manager = new ManageManagersJPanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(manager);
    }

    private void renderSystemAdminPanel() {
        jSplitPane.setRightComponent(new SystemAdministrationJPanel(systemAdmin, this::renderNetworkPanel, this::renderEnterprisePanel, this::renderManagerPanel, this::renderCustomerPanel));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main1JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main1JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main1JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main1JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main1JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void renderCustomer(String username) {
        Customer customer = systemAdmin.getCustomerDirec().findCustomerUsername(username);
        CustomerStartingJPanel customerPanel = new CustomerStartingJPanel(systemAdmin, this::renderBookRoomPanel, this::manageBooking);
        jSplitPane.setRightComponent(customerPanel);
    }

    private void renderBookRoomPanel() {
        String user = usernameField.getText();
        BookRoomServicesJPanel bookroomPanel = new BookRoomServicesJPanel(systemAdmin, this::manageCustomerPanel, user);
        jSplitPane.setRightComponent(bookroomPanel);
    }

    private void manageBooking() {
        String user = usernameField.getText();
        ManageBooking manageBookingPanel = new ManageBooking(systemAdmin, this::manageCustomerPanel, this::addServices, this::viewService, user);
        jSplitPane.setRightComponent(manageBookingPanel);
    }

    private void manageCustomerPanel() {
        String user = usernameField.getText();
        jSplitPane.setRightComponent(new CustomerStartingJPanel(systemAdmin, this::renderBookRoomPanel, this::manageBooking));
    }

    private void addServices(Booking booking) {
        String user = usernameField.getText();
        AddServicePanel service = new AddServicePanel(systemAdmin, this::bookEvent, this::placeOrder, this::healthPanel, this::manageBooking, user, booking);
        jSplitPane.setRightComponent(service);
    }

    private void bookEvent(Booking booking) {
        String user = usernameField.getText();
        BookEventsJPanel event = new BookEventsJPanel(systemAdmin, this::addServices, user, booking);
        jSplitPane.setRightComponent(event);
    }

    private void placeOrder(Booking booking) {
        String user = usernameField.getText();
        RestuarantServicePanel order = new RestuarantServicePanel(systemAdmin, this::addServices, user, booking);
        jSplitPane.setRightComponent(order);
    }

    private void healthPanel(Booking booking) {
        String user = usernameField.getText();
        HealthClubServicesJPanel healthClub = new HealthClubServicesJPanel(systemAdmin, this::addServices, user, booking);
        jSplitPane.setRightComponent(healthClub);
    }

    private void viewService(Booking booking) {
        String user = usernameField.getText();
        ViewServiceDetailsPanel viewService = new ViewServiceDetailsPanel(systemAdmin, this::manageBooking, user, booking);
        jSplitPane.setRightComponent(viewService);
    }

    private void renderHealthClubManager(String username) {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<HealthClub> healthClubs = network.get(i).getEnterpriseDirectory().getListOfHealthClub();
            for (int j = 0; j < healthClubs.size(); j++) {
                List<Manager> manager = healthClubs.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(username)) {
                        HealthClubManagerPanel healthManagerPanel = new HealthClubManagerPanel(systemAdmin, this::viewTaskPanel, this::createOrganization,
                                this::organizationAdminPanel);
                        jSplitPane.setRightComponent(healthManagerPanel);

                    }
                }
            }
        }
    }

    private Network findUserNetworkForHealthClub() {
        String user = usernameField.getText();
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<HealthClub> healthClubs = network.get(i).getEnterpriseDirectory().getListOfHealthClub();
            for (int j = 0; j < healthClubs.size(); j++) {
                List<Manager> manager = healthClubs.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(user)) {
                        return network.get(i);

                    }
                }
            }
        }
        return null;
    }

    private void viewTaskPanel() {   //view task for health club
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        Network network = findUserNetworkForHealthClub();   //find network and send it to enterprise 
        ViewTaskPanel viewTask = new ViewTaskPanel(systemAdmin, this::healthClubManagerPanel, user, type, network
        );
        jSplitPane.setRightComponent(viewTask);
    }

    private void createOrganization() {    //create org for health club
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        ManageOrganizationPanel org = new ManageOrganizationPanel(systemAdmin, this::healthClubManagerPanel, user, type
        );
        jSplitPane.setRightComponent(org);
    }

    private void organizationAdminPanel() {   //create org admin for health club
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        OrganizationAdminPanel orgAdmin = new OrganizationAdminPanel(systemAdmin, this::healthClubManagerPanel, user, type);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void healthClubManagerPanel() {   //go back to healthclub
        jSplitPane.setRightComponent(new HealthClubManagerPanel(systemAdmin, this::viewTaskPanel, this::createOrganization, this::organizationAdminPanel));
    }

    private void renderconfirmWorkRequest() {
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        ConfirmWorkRequestsJPanel workRequest1 = new ConfirmWorkRequestsJPanel(systemAdmin, this::enableLogin, user, type);
        jSplitPane.setRightComponent(workRequest1);

    }

    private void renderRestaurantManager(String username) {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Restaurant> restaurants = network.get(i).getEnterpriseDirectory().getListOfRestaurants();
            for (int j = 0; j < restaurants.size(); j++) {
                List<Manager> manager = restaurants.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(username)) {
                        RestaurantManagerPanel restaurantAssign = new RestaurantManagerPanel(systemAdmin, this::renderViewTask1, this::renderRestaurantOrg, this::renderRestaurantAdmin, this::addOrderPanel);
                        jSplitPane.setRightComponent(restaurantAssign);
                    }
                }
            }
        }
    }

    private Network findUserNetworkForRestaurant() {
        String user = usernameField.getText();
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Restaurant> restaurant = network.get(i).getEnterpriseDirectory().getListOfRestaurants();
            for (int j = 0; j < restaurant.size(); j++) {
                List<Manager> manager = restaurant.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(user)) {
                        return network.get(i);

                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask1() {     // view task for restaurant manager
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        Network network = findUserNetworkForRestaurant();
        ViewTaskPanelRestaurant resMan = new ViewTaskPanelRestaurant(systemAdmin, this::restaurantManagerPanel, user, type, network);
        jSplitPane.setRightComponent(resMan);
    }

    private void renderRestaurantOrg() {   //create organisation panel for restaurant
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        System.out.println("user enterd for org is " + user);
        ManageOrganisationPanelForRestaurant org = new ManageOrganisationPanelForRestaurant(systemAdmin, this::restaurantManagerPanel, user, type
        );
        jSplitPane.setRightComponent(org);
    }

    private void renderRestaurantAdmin() { //create organisation admin under restauarant
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        ManageOrgAdminForRestauarant orgAdmin = new ManageOrgAdminForRestauarant(systemAdmin, this::restaurantManagerPanel, user, type);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void renderDeliverymanPanel() {
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        ConfirmWorkrequestForDeliveryman deliveryPanel = new ConfirmWorkrequestForDeliveryman(systemAdmin, this::enableLogin, user, type);
        jSplitPane.setRightComponent(deliveryPanel);
    }

    private void addOrderPanel() {
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        AddOrderPanel order = new AddOrderPanel(systemAdmin, this::restaurantManagerPanel, user, type);
        jSplitPane.setRightComponent(order);
    }

    private void restaurantManagerPanel() {    //go back to restauarnt manager panel
        jSplitPane.setRightComponent(new RestaurantManagerPanel(systemAdmin, this::renderViewTask1, this::renderRestaurantOrg, this::renderRestaurantAdmin, this::addOrderPanel));
    }

    private void renderHotelManager(String username) {   //hotel panel
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Hotel> hotel = network.get(i).getEnterpriseDirectory().getListOfHotel();
            for (int j = 0; j < hotel.size(); j++) {
                List<Manager> manager = hotel.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(username)) {
                        HotelManagerPanel hotelPanel = new HotelManagerPanel(systemAdmin, this::renderViewTask2, this::renderHotelOrg,
                                this::renderHotelAdmin, this::renderRoomPanel);
                        jSplitPane.setRightComponent(hotelPanel);

                    }
                }
            }
        }
    }

    private Network findUserNetworkForHotel() {
        String user = usernameField.getText();
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Hotel> hotel = network.get(i).getEnterpriseDirectory().getListOfHotel();
            for (int j = 0; j < hotel.size(); j++) {
                List<Manager> manager = hotel.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(user)) {
                        return network.get(i);
                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask2() {     // view hotel manager panel
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        Network network = findUserNetworkForHotel();
        ViewTaskForHotel hotelPanel = new ViewTaskForHotel(systemAdmin, this::hotelManagerPanel, user, type, network);
        jSplitPane.setRightComponent(hotelPanel);
    }

    private void renderHotelOrg() {     // add an organisation for hotel
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        ManageOrganisationForHotel org = new ManageOrganisationForHotel(systemAdmin, this::hotelManagerPanel, user, type
        );
        jSplitPane.setRightComponent(org);
    }

    private void renderHotelAdmin() { //create organisation admin under  hotel
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        ManageOrganisationAdminForHotel orgAdmin = new ManageOrganisationAdminForHotel(systemAdmin, this::hotelManagerPanel, user, type);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void renderRoomPanel() {
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        Network network = findUserNetworkForHotel();
        ManageRoomPanel room = new ManageRoomPanel(systemAdmin, this::hotelManagerPanel, network, user);
        jSplitPane.setRightComponent(room);
    }

    private void hotelManagerPanel() {    //go back to Hotel manager panel
        jSplitPane.setRightComponent(new HotelManagerPanel(systemAdmin, this::renderViewTask2, this::renderHotelOrg, this::renderHotelAdmin, this::renderRoomPanel));
    }

    private void renderEventManager(String username) {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<BusinessEvent> event = network.get(i).getEnterpriseDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Manager> manager = event.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(username)) {
                        EventManagerPanel eventPanel = new EventManagerPanel(systemAdmin, this::renderViewTask3, this::renderEventOrg,
                                this::renderEventAdmin);
                        jSplitPane.setRightComponent(eventPanel);

                    }
                }
            }
        }
    }

    private Network findUserNetworkForEvents() {
        String user = usernameField.getText();
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<BusinessEvent> event = network.get(i).getEnterpriseDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Manager> manager = event.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(user)) {
                        return network.get(i);

                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask3() {     // view Business Event manager panel
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        Network network = findUserNetworkForEvents();
        ViewTaskPanelForEvent eventPanel = new ViewTaskPanelForEvent(systemAdmin, this::eventManagerPanel, user, type, network);
    }

    private void renderEventOrg() {     // add an organisation for event
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        ManageOrganisationForEvents org = new ManageOrganisationForEvents(systemAdmin, this::eventManagerPanel, user, type
        );
        jSplitPane.setRightComponent(org);
    }

    private void renderEventAdmin() { //create organisation admin under event
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        ManageOrganisationAdminForEvent orgAdmin = new ManageOrganisationAdminForEvent(systemAdmin, this::eventManagerPanel, user, type);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void eventManagerPanel() {    //go back to event manager panel
        jSplitPane.setRightComponent(new EventManagerPanel(systemAdmin, this::renderViewTask3, this::renderEventOrg, this::renderEventAdmin));
    }
}
