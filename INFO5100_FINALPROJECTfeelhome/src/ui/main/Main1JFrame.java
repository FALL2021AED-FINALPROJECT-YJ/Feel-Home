package ui.main;

import static java.time.Clock.system;
import java.util.List;
import javax.swing.JOptionPane;
import model.Customer;
import model.CustomerDirectory;
import model.HealthClub;
import model.Manager;
import model.Network;
import model.Restaurant;
import model.SystemAdmin;
import ui.CustomerRole.BookEventsJPanel;
import ui.CustomerRole.BookRoomServicesJPanel;
import ui.CustomerRole.CustomerStartingJPanel;
import ui.CustomerRole.StatusJPanel;
import ui.HealthClubManagerRole.ViewTaskPanel;
import ui.HealthClubManagerRole.HealthClubManagerPanel;
import ui.HealthClubManagerRole.ManageOrganisationPanelForRestaurant;
import ui.HealthClubManagerRole.OrganizationAdminPanel;
import ui.HealthClubManagerRole.ManageOrganizationPanel;
import ui.RestaurantManagerRole.RestaurantAssignJPanel;
import ui.RestaurantManagerRole.RestaurantManagerJPanel;
import ui.SystemAdministration.ManageCustomersJPanel;
import ui.SystemAdministration.ManageEnterpriseJPanel;
import ui.SystemAdministration.ManageManagersJPanel;
import ui.SystemAdministration.ManageNetworkJPanel;
import ui.SystemAdministration.SystemAdministrationJPanel;
import ui.confirm.ConfirmWorkRequestsJPanel;

public class Main1JFrame extends javax.swing.JFrame {

    private SystemAdmin systemAdmin;

    public Main1JFrame() {
        initComponents();
        this.systemAdmin = new SystemAdmin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutBtn)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>                        

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String username = usernameField.getText();
        String password = passwordField.getText();
        String type = systemAdmin.findUser(username);  //find type of user
        System.out.println("username entered is of type" + type);
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
        } else if (type.equals("Physician")) {
            renderconfirmWorkRequest(username);
            return;
        } else if (type.equals("Trainer")) {
            renderconfirmWorkRequest(username);
            return;
        } else if (type.equals("Therapist")) {
            renderconfirmWorkRequest(username);
            return;
        }


    }                                        
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

    private void renderBookRoomPanel() {
        String user = usernameField.getText();
        System.out.println(user);
        BookRoomServicesJPanel bookroomPanel = new BookRoomServicesJPanel(systemAdmin, this::renderEventPanel, user);
        jSplitPane.setRightComponent(bookroomPanel);
    }

    private void renderEventPanel() {
        String user = usernameField.getText();
        jSplitPane.setRightComponent(new StatusJPanel(systemAdmin, this::renderBookRoomPanel, user));
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

    // Variables declaration - do not modify                     
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration                   

    private void renderCustomer(String username) {
        Customer customer = systemAdmin.getCustomerDirec().findCustomerUsername(username);
        StatusJPanel statusPanel = new StatusJPanel(systemAdmin, this::renderBookRoomPanel, username);
        jSplitPane.setRightComponent(statusPanel);
    }

    private void renderHealthClubManager(String username) {
        List<Network> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<HealthClub> healthClubs = network.get(i).getEnterpriseDirectory().getListOfHealthClub();
            for (int j = 0; j < healthClubs.size(); j++) {
                List<Manager> manager = healthClubs.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUserName().equals(username)) {
                        HealthClubManagerPanel healthManagerPanel = new HealthClubManagerPanel(systemAdmin, this::viewTaskPanel, this::createOrganization,
                                this::organizationAdminPanel);
                        jSplitPane.setRightComponent(healthManagerPanel);

                    }
                }
            }
        }
    }

    private void viewTaskPanel() {
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        ViewTaskPanel viewTask = new ViewTaskPanel(systemAdmin, this::healthClubManagerPanel, user, type
        );
        jSplitPane.setRightComponent(viewTask);
    }

    private void createOrganization() {
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        ManageOrganizationPanel org = new ManageOrganizationPanel(systemAdmin, this::healthClubManagerPanel, user, type
        );
        jSplitPane.setRightComponent(org);
    }

    private void organizationAdminPanel() {
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        OrganizationAdminPanel orgAdmin = new OrganizationAdminPanel(systemAdmin, this::healthClubManagerPanel, user, type);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void healthClubManagerPanel() {
        jSplitPane.setRightComponent(new HealthClubManagerPanel(systemAdmin, this::viewTaskPanel, this::createOrganization, this::organizationAdminPanel));
    }

    private void renderconfirmWorkRequest(String username) {
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
                    if (manager.get(k).getUserName().equals(username)) {
                        RestaurantAssignJPanel restaurantAssign = new RestaurantAssignJPanel(systemAdmin, this::renderViewTask, this::renderRestaurantOrg, this::renderRestaurantAdmin);
                        jSplitPane.setRightComponent(restaurantAssign);
                    }
                }
            }
        }
    }

    private void renderViewTask() {
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
        RestaurantManagerJPanel resMan = new RestaurantManagerJPanel(systemAdmin, this::restaurantManagerPanel, user, type);
    }

    private void renderRestaurantOrg() {   //create organisation panel
        String user = usernameField.getText();
        String type = systemAdmin.findUser(user);
       ManageOrganisationPanelForRestaurant org = new ManageOrganisationPanelForRestaurant(systemAdmin, this::restaurantManagerPanel, user, type
        );
        jSplitPane.setRightComponent(org);
    }

    private void renderRestaurantAdmin() {

    }

    private void restaurantManagerPanel() {
        jSplitPane.setRightComponent(new RestaurantAssignJPanel(systemAdmin, this::renderViewTask, this::renderRestaurantOrg, this::renderRestaurantAdmin));
    }

}
