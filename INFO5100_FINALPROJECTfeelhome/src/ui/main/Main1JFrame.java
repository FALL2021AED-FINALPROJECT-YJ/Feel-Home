package ui.main;

import db.DbUtils;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import model.Booking;
import model.BusinessEvent;
import model.Customer;
import model.Enterprise;
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
import ui.CustomerRole.HotelServicePanel;
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
    private String userName;
    private String password;

    public Main1JFrame() {
        initComponents();
        this.systemAdmin = DbUtils.getInstance().retrieveSystem();
        logoutBtn.setEnabled(false);
        ControlPanel.setBackground(new java.awt.Color(244, 120, 140));
        WorkArea.setBackground(new java.awt.Color(255, 204, 204));
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
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

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
        this.userName = usernameField.getText();
        this.password = passwordField.getText();

        if (systemAdmin.validateUserNamePassword(userName, password)) {
            String type = systemAdmin.findUserType(userName);

            switch (type) {
                case "admin":
                    SystemAdministrationJPanel systemAdministration = new SystemAdministrationJPanel(systemAdmin, this::renderNetworkPanel, this::renderEnterprisePanel, this::renderManagerPanel, this::renderCustomerPanel);
                    jSplitPane.setRightComponent(systemAdministration);
                    break;

                case "Customer":
                    renderCustomer(userName);
                    break;

                case "Health Club":
                    renderHealthClubManager(userName);
                    break;

                case "Restaurant":
                    renderRestaurantManager(userName);
                    break;

                case "Hotel":
                    hotelManagerPanel();
                    break;

                case "Business Event":
                    eventManagerPanel();
                    break;

                default:
                    JOptionPane.showMessageDialog(this, "Type not supported.");
                    return;
            }
            usernameField.setText("");
            passwordField.setText("");
            loginBtn.setEnabled(false);
            logoutBtn.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        DbUtils.getInstance().storeSystem(systemAdmin);
        jSplitPane.setRightComponent(WorkArea);
        loginBtn.setEnabled(true);
        logoutBtn.setEnabled(false);
        usernameField.setText("");
        passwordField.setText("");
    }//GEN-LAST:event_logoutBtnActionPerformed

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
        BookRoomServicesJPanel bookroomPanel = new BookRoomServicesJPanel(systemAdmin, this::manageCustomerPanel, userName);
        jSplitPane.setRightComponent(bookroomPanel);
    }

    private void manageBooking() {
        ManageBooking manageBookingPanel = new ManageBooking(systemAdmin, this::manageCustomerPanel, this::addServices, this::viewService, userName);
        jSplitPane.setRightComponent(manageBookingPanel);
    }

    private void manageCustomerPanel() {
        jSplitPane.setRightComponent(new CustomerStartingJPanel(systemAdmin, this::renderBookRoomPanel, this::manageBooking));
    }

    private void addServices(Booking booking) {
        AddServicePanel service = new AddServicePanel(systemAdmin, this::bookEvent, this::placeOrder, this::healthPanel,
                this::hotelService, this::manageBooking, userName, booking);
        jSplitPane.setRightComponent(service);
    }

    private void bookEvent(Booking booking) {
        BookEventsJPanel event = new BookEventsJPanel(systemAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(event);
    }

    private void placeOrder(Booking booking) {           //customer order from restaurant
        RestuarantServicePanel order = new RestuarantServicePanel(systemAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(order);
    }

    private void healthPanel(Booking booking) {             // healthclub panel for customer
        HealthClubServicesJPanel healthClub = new HealthClubServicesJPanel(systemAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(healthClub);
    }

    private void hotelService(Booking booking) {    //laundary and transport service panel fpr customer
        HotelServicePanel hotelPanel = new HotelServicePanel(systemAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(hotelPanel);
    }

    private void viewService(Booking booking) {
        ViewServiceDetailsPanel viewService = new ViewServiceDetailsPanel(systemAdmin, this::manageBooking, userName, booking);
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
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<HealthClub> healthClubs = network.get(i).getEnterpriseDirectory().getListOfHealthClub();
            for (int j = 0; j < healthClubs.size(); j++) {
                List<Manager> manager = healthClubs.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return network.get(i);

                    }
                }
            }
        }
        return null;
    }

    private Enterprise findUserHealthClub() {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<HealthClub> health = network.get(i).getEnterpriseDirectory().getListOfHealthClub();
            for (int j = 0; j < health.size(); j++) {
                List<Manager> manager = health.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return health.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void viewTaskPanel() {   //view task for health club
        String type = systemAdmin.findUserType(userName);
        HealthClub healthClub = (HealthClub) findUserHealthClub();
        ViewTaskPanel viewTask = new ViewTaskPanel(systemAdmin, this::healthClubManagerPanel, userName, type, healthClub
        );
        jSplitPane.setRightComponent(viewTask);
    }

    private void createOrganization() {
        Network network = findUserNetworkForHealthClub();
        ManageOrganizationPanel org = new ManageOrganizationPanel(systemAdmin, this::healthClubManagerPanel, userName, network);
        jSplitPane.setRightComponent(org);
    }

    private void organizationAdminPanel() {   //create org admin for health club
        String type = systemAdmin.findUserType(userName);
        Network network = findUserNetworkForHealthClub();
        OrganizationAdminPanel orgAdmin = new OrganizationAdminPanel(systemAdmin, this::healthClubManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void healthClubManagerPanel() {   //go back to healthclub
        jSplitPane.setRightComponent(new HealthClubManagerPanel(systemAdmin, this::viewTaskPanel, this::createOrganization, this::organizationAdminPanel));
    }

    private void renderconfirmWorkRequest() {
        String type = systemAdmin.findUserType(userName);
        ConfirmWorkRequestsJPanel workRequest1 = new ConfirmWorkRequestsJPanel(systemAdmin, userName, type);
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
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Restaurant> restaurant = network.get(i).getEnterpriseDirectory().getListOfRestaurants();
            for (int j = 0; j < restaurant.size(); j++) {
                List<Manager> manager = restaurant.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return network.get(i);

                    }
                }
            }
        }
        return null;
    }

    private Enterprise findUserRestaurant() {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Restaurant> restaurant = network.get(i).getEnterpriseDirectory().getListOfRestaurants();
            for (int j = 0; j < restaurant.size(); j++) {
                List<Manager> manager = restaurant.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return restaurant.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask1() {
        String type = systemAdmin.findUserType(userName);
        Restaurant restaurant = (Restaurant) findUserRestaurant();
        ViewTaskPanelRestaurant resMan = new ViewTaskPanelRestaurant(systemAdmin, this::restaurantManagerPanel, userName, type, restaurant);
        jSplitPane.setRightComponent(resMan);
    }

    private void renderRestaurantOrg() {
        String type = systemAdmin.findUserType(userName);
        Network network = findUserNetworkForRestaurant();
        ManageOrganisationPanelForRestaurant org = new ManageOrganisationPanelForRestaurant(systemAdmin, this::restaurantManagerPanel, userName, type, network
        );
        jSplitPane.setRightComponent(org);
    }

    private void renderRestaurantAdmin() { //create organisation admin under restauarant
        String type = systemAdmin.findUserType(userName);
        Network network = findUserNetworkForRestaurant();
        ManageOrgAdminForRestauarant orgAdmin = new ManageOrgAdminForRestauarant(systemAdmin, this::restaurantManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void renderDeliverymanPanel() {
        String type = systemAdmin.findUserType(userName);
        ConfirmWorkrequestForDeliveryman deliveryPanel = new ConfirmWorkrequestForDeliveryman(systemAdmin, userName, type);
        jSplitPane.setRightComponent(deliveryPanel);
    }

    private void addOrderPanel() {
        String type = systemAdmin.findUserType(userName);
        Network network = findUserNetworkForRestaurant();
        AddOrderPanel order = new AddOrderPanel(systemAdmin, this::restaurantManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(order);
    }

    private void restaurantManagerPanel() {
        jSplitPane.setRightComponent(new RestaurantManagerPanel(systemAdmin, this::renderViewTask1, this::renderRestaurantOrg,
                this::renderRestaurantAdmin, this::addOrderPanel));
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
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Hotel> hotel = network.get(i).getEnterpriseDirectory().getListOfHotel();
            for (int j = 0; j < hotel.size(); j++) {
                List<Manager> manager = hotel.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        System.out.println("manager found is " + manager.get(k).getUsername() + " and city is " + network.get(i));
                        return network.get(i);
                    }
                }
            }
        }
        return null;
    }

    private Enterprise findManagerHotel() {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Hotel> hotel = network.get(i).getEnterpriseDirectory().getListOfHotel();
            for (int j = 0; j < hotel.size(); j++) {
                List<Manager> manager = hotel.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return hotel.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask2() {
        String type = systemAdmin.findUserType(userName);
        Hotel hotel = (Hotel) findManagerHotel();
        ViewTaskForHotel hotelPanel = new ViewTaskForHotel(systemAdmin, this::hotelManagerPanel, userName, type, hotel);
        jSplitPane.setRightComponent(hotelPanel);
    }

    private void renderHotelOrg() {
        String type = systemAdmin.findUserType(userName);
        Network network1 = findUserNetworkForHotel();
        ManageOrganisationForHotel org = new ManageOrganisationForHotel(systemAdmin, this::hotelManagerPanel, userName, type, network1);
        jSplitPane.setRightComponent(org);
    }

    private void renderHotelAdmin() {
        String type = systemAdmin.findUserType(userName);
        Network network1 = findUserNetworkForHotel();

        ManageOrganisationAdminForHotel orgAdmin = new ManageOrganisationAdminForHotel(systemAdmin, this::hotelManagerPanel, userName, type, network1);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void renderRoomPanel() {
        Network network = findUserNetworkForHotel();
        ManageRoomPanel room = new ManageRoomPanel(systemAdmin, this::hotelManagerPanel, network, userName);
        jSplitPane.setRightComponent(room);
    }

    private void hotelManagerPanel() {
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
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<BusinessEvent> event = network.get(i).getEnterpriseDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Manager> manager = event.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return network.get(i);

                    }
                }
            }
        }
        return null;
    }

    private Enterprise findUserEnterprise() {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<BusinessEvent> event = network.get(i).getEnterpriseDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Manager> manager = event.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return event.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask3() {     // view Business Event manager panel
        String type = systemAdmin.findUserType(userName);
        BusinessEvent event = (BusinessEvent) findUserEnterprise();
        ViewTaskPanelForEvent eventPanel = new ViewTaskPanelForEvent(systemAdmin, this::eventManagerPanel, userName, type, event);
        jSplitPane.setRightComponent(eventPanel);
    }

    private void renderEventOrg() {     // add an organisation for event
        String type = systemAdmin.findUserType(userName);
        Network network = findUserNetworkForEvents();
        ManageOrganisationForEvents org = new ManageOrganisationForEvents(systemAdmin, this::eventManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(org);
    }

    private void renderEventAdmin() { //create organisation admin under event
        String type = systemAdmin.findUserType(userName);
        Network network = findUserNetworkForEvents();
        ManageOrganisationAdminForEvent orgAdmin = new ManageOrganisationAdminForEvent(systemAdmin, this::eventManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void eventManagerPanel() {    //go back to event manager panel
        jSplitPane.setRightComponent(new EventManagerPanel(systemAdmin, this::renderViewTask3, this::renderEventOrg, this::renderEventAdmin));
    }
}
