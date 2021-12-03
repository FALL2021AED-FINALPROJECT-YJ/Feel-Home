
package ui.RestaurantManagerRole;

import model.SystemAdmin;


public class RestaurantManagerJPanel extends javax.swing.JPanel {

      private SystemAdmin systemAdmin;
    private Runnable callOnCreateMethod1;
    private String user;
    private String type;
    public RestaurantManagerJPanel(SystemAdmin systemAdmin,Runnable callOnCreateMethod1,String user,String type) {
        initComponents();
        this.user = user;
        this.type = type;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.systemAdmin = systemAdmin;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1052, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
