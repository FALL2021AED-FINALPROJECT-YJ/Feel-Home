package ui.main;

import java.util.List;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlPanel.setBackground(new java.awt.Color(255, 153, 153));
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
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ControlPanelLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel1))
                            .addGroup(ControlPanelLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(logoutBtn)
                                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(loginBtn)
                .addGap(26, 26, 26)
                .addComponent(logoutBtn)
                .addContainerGap(338, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(ControlPanel);

        WorkArea.setBackground(new java.awt.Color(255, 204, 204));
        WorkArea.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 255, 255));
        jLabel3.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel3.setText("WELCOME TO FEEL-HOME SERVICES");
        WorkArea.add(jLabel3);
        jLabel3.setBounds(85, 62, 869, 64);

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel6.setText("ABOUT US");
        WorkArea.add(jLabel6);
        jLabel6.setBounds(470, 144, 98, 24);

        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel4.setText("we provide different types of services other than booking rooms ");
        WorkArea.add(jLabel4);
        jLabel4.setBounds(284, 195, 478, 24);

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel7.setText("customers can book for any kind of BUSINESS EVENTS");
        WorkArea.add(jLabel7);
        jLabel7.setBounds(305, 232, 422, 24);

        jLabel8.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel8.setText("customers can also join our HEALTH CLUB");
        WorkArea.add(jLabel8);
        jLabel8.setBounds(349, 274, 330, 24);

        jLabel9.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel9.setText("customers can have food and beverages fom our RESTAURANT");
        WorkArea.add(jLabel9);
        jLabel9.setBounds(284, 316, 480, 24);

        jLabel10.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel10.setText("customers can also add services like LAUNDRY, TRANSPORTATION");
        WorkArea.add(jLabel10);
        jLabel10.setBounds(255, 358, 530, 24);

        jLabel11.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel11.setText("we also provide MEDICAL ASSISTANCE in case of emergency");
        WorkArea.add(jLabel11);
        jLabel11.setBounds(300, 400, 472, 24);

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setText("CONTACT US");
        WorkArea.add(jLabel5);
        jLabel5.setBounds(477, 465, 125, 24);

        jLabel14.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel14.setText("+1 234-638-9566");
        WorkArea.add(jLabel14);
        jLabel14.setBounds(477, 507, 136, 24);

        jLabel13.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel13.setText("feelhome@hotmail.com");
        WorkArea.add(jLabel13);
        jLabel13.setBounds(459, 538, 171, 24);

        jLabel12.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel12.setText("HAVE A WONDERFULL TIME WITH US");
        WorkArea.add(jLabel12);
        jLabel12.setBounds(288, 688, 543, 48);

        jSplitPane.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE)
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
        AddServicePanel service = new AddServicePanel(systemAdmin, this::bookEvent, this::placeOrder, this::healthPanel, this::hotelService, this::manageBooking, user, booking);
        jSplitPane.setRightComponent(service);
    }

    private void bookEvent(Booking booking) {
        String user = usernameField.getText();
        BookEventsJPanel event = new BookEventsJPanel(systemAdmin, this::addServices, user, booking);
        jSplitPane.setRightComponent(event);
    }

    private void placeOrder(Booking booking) {           //customer order from restaurant
        String user = usernameField.getText();
        RestuarantServicePanel order = new RestuarantServicePanel(systemAdmin, this::addServices, user, booking);
        jSplitPane.setRightComponent(order);
    }

    private void healthPanel(Booking booking) {             // healthclub panel for customer
        String user = usernameField.getText();
        HealthClubServicesJPanel healthClub = new HealthClubServicesJPanel(systemAdmin, this::addServices, user, booking);
        jSplitPane.setRightComponent(healthClub);
    }

    private void hotelService(Booking booking) {    //laundary and transport service panel fpr customer
        String user = usernameField.getText();
        Hotel hotel = (Hotel) findUserHotel();
        HotelServicePanel hotelPanel = new HotelServicePanel(systemAdmin, this::addServices, user, booking, hotel);
        jSplitPane.setRightComponent(hotelPanel);
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

    private Enterprise findUserHealthClub() {
        String user = usernameField.getText();
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<HealthClub> health = network.get(i).getEnterpriseDirectory().getListOfHealthClub();
            for (int j = 0; j < health.size(); j++) {
                List<Manager> manager = health.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(user)) {
                        return health.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void viewTaskPanel() {   //view task for health club
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        HealthClub healthClub = (HealthClub) findUserHealthClub();  //find network and send it to enterprise 
        ViewTaskPanel viewTask = new ViewTaskPanel(systemAdmin, this::healthClubManagerPanel, user, type, healthClub
        );
        jSplitPane.setRightComponent(viewTask);
    }

    private void createOrganization() {    //create org for health club
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        Network network = findUserNetworkForHealthClub();
        ManageOrganizationPanel org = new ManageOrganizationPanel(systemAdmin, this::healthClubManagerPanel, user, type, network
        );
        jSplitPane.setRightComponent(org);
    }

    private void organizationAdminPanel() {   //create org admin for health club
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        Network network = findUserNetworkForHealthClub();
        OrganizationAdminPanel orgAdmin = new OrganizationAdminPanel(systemAdmin, this::healthClubManagerPanel, user, type, network);
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

    private Enterprise findUserRestaurant() {
        String user = usernameField.getText();
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Restaurant> restaurant = network.get(i).getEnterpriseDirectory().getListOfRestaurants();
            for (int j = 0; j < restaurant.size(); j++) {
                List<Manager> manager = restaurant.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(user)) {
                        return restaurant.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask1() {     // view task for restaurant manager
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        Restaurant restaurant = (Restaurant) findUserRestaurant();
        ViewTaskPanelRestaurant resMan = new ViewTaskPanelRestaurant(systemAdmin, this::restaurantManagerPanel, user, type, restaurant);
        jSplitPane.setRightComponent(resMan);
    }

    private void renderRestaurantOrg() {   //create organisation panel for restaurant
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        Network network = findUserNetworkForRestaurant();
        ManageOrganisationPanelForRestaurant org = new ManageOrganisationPanelForRestaurant(systemAdmin, this::restaurantManagerPanel, user, type,network
        );
        jSplitPane.setRightComponent(org);
    }

    private void renderRestaurantAdmin() { //create organisation admin under restauarant
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
         Network network = findUserNetworkForRestaurant();
        ManageOrgAdminForRestauarant orgAdmin = new ManageOrgAdminForRestauarant(systemAdmin, this::restaurantManagerPanel, user, type,network);
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
          Network network = findUserNetworkForRestaurant();
        AddOrderPanel order = new AddOrderPanel(systemAdmin, this::restaurantManagerPanel, user, type,network);
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
                        System.out.println("manager found is " +manager.get(k).getUsername()+ " and city is " +network.get(i));
                        return network.get(i);
                    }
                }
            }
        }
        return null;
    }

    private Enterprise findUserHotel() {
        String user = usernameField.getText();
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Hotel> hotel = network.get(i).getEnterpriseDirectory().getListOfHotel();
            for (int j = 0; j < hotel.size(); j++) {
                List<Manager> manager = hotel.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(user)) {
                        return hotel.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask2() {     // view hotel manager panel
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        Hotel hotel = (Hotel) findUserHotel();
        ViewTaskForHotel hotelPanel = new ViewTaskForHotel(systemAdmin, this::hotelManagerPanel, user, type, hotel);
        jSplitPane.setRightComponent(hotelPanel);
    }

    private void renderHotelOrg() {     // add an organisation for hotel
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        Network network1 = findUserNetworkForHotel();
       System.out.println("network found is " +network1.getName());
        ManageOrganisationForHotel org = new ManageOrganisationForHotel(systemAdmin, this::hotelManagerPanel, user, type, network1
        );
        jSplitPane.setRightComponent(org);
    }

    private void renderHotelAdmin() { //create organisation admin under  hotel
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        Network network1 = findUserNetworkForHotel();
        
        ManageOrganisationAdminForHotel orgAdmin = new ManageOrganisationAdminForHotel(systemAdmin, this::hotelManagerPanel, user, type, network1);
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

    private Enterprise findUserEnterprise() {
        String user = usernameField.getText();
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<BusinessEvent> event = network.get(i).getEnterpriseDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Manager> manager = event.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(user)) {
                        return event.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask3() {     // view Business Event manager panel
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        BusinessEvent event = (BusinessEvent) findUserEnterprise();
        ViewTaskPanelForEvent eventPanel = new ViewTaskPanelForEvent(systemAdmin, this::eventManagerPanel, user, type, event);
        jSplitPane.setRightComponent(eventPanel);
    }

    private void renderEventOrg() {     // add an organisation for event
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        Network network = findUserNetworkForEvents();
        ManageOrganisationForEvents org = new ManageOrganisationForEvents(systemAdmin, this::eventManagerPanel, user, type, network
        );
        jSplitPane.setRightComponent(org);
    }

    private void renderEventAdmin() { //create organisation admin under event
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        Network network = findUserNetworkForEvents();
        ManageOrganisationAdminForEvent orgAdmin = new ManageOrganisationAdminForEvent(systemAdmin, this::eventManagerPanel, user, type, network);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void eventManagerPanel() {    //go back to event manager panel
        jSplitPane.setRightComponent(new EventManagerPanel(systemAdmin, this::renderViewTask3, this::renderEventOrg, this::renderEventAdmin));
    }
}
