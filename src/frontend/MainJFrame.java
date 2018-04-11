/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Dax Amin
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hotels = new javax.swing.JButton();
        staffs = new javax.swing.JButton();
        customers = new javax.swing.JButton();
        rooms = new javax.swing.JButton();
        reportJButton = new javax.swing.JButton();
        service = new javax.swing.JButton();
        makeReservationButton = new javax.swing.JButton();
        roomTypes = new javax.swing.JButton();
        serviceProvides = new javax.swing.JButton();
        requestServiceButton = new javax.swing.JButton();
        checkOutButton = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hotels.setText("Hotels");
        hotels.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hotelsMouseClicked(evt);
            }
        });

        staffs.setText("Staffs");
        staffs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffsMouseClicked(evt);
            }
        });

        customers.setText("Customers");
        customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersMouseClicked(evt);
            }
        });

        rooms.setText("Rooms");
        rooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomsMouseClicked(evt);
            }
        });

        reportJButton.setText("Reports");
        reportJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportJButtonMouseClicked(evt);
            }
        });

        service.setText("Service");
        service.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviceMouseClicked(evt);
            }
        });

        makeReservationButton.setText("Make Reservation");
        makeReservationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                makeReservationButtonMouseClicked(evt);
            }
        });

        roomTypes.setText("Room Types");
        roomTypes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomTypesMouseClicked(evt);
            }
        });

        serviceProvides.setText("ServiceProvides");
        serviceProvides.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviceProvidesMouseClicked(evt);
            }
        });

        requestServiceButton.setText("Request Service");
        requestServiceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestServiceButtonMouseClicked(evt);
            }
        });

        checkOutButton.setText("Check-Out");
        checkOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkOutButtonMouseClicked(evt);
            }
        });

        jButton7.setText("jButton7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hotels)
                    .addComponent(staffs)
                    .addComponent(customers)
                    .addComponent(rooms))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportJButton)
                    .addComponent(roomTypes)
                    .addComponent(makeReservationButton)
                    .addComponent(service))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(serviceProvides, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(requestServiceButton)
                    .addComponent(jButton7)
                    .addComponent(checkOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hotels)
                    .addComponent(reportJButton)
                    .addComponent(serviceProvides))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffs)
                    .addComponent(service)
                    .addComponent(requestServiceButton))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customers)
                    .addComponent(makeReservationButton)
                    .addComponent(checkOutButton))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rooms)
                    .addComponent(roomTypes)
                    .addComponent(jButton7))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hotelsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotelsMouseClicked
        // TODO add your handling code here:
        HotelsJFrame HotelsJFrame = new HotelsJFrame();
        HotelsJFrame.setVisible(true);
        HotelsJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        HotelsJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_hotelsMouseClicked

    private void staffsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffsMouseClicked
        // TODO add your handling code here:
        StaffsJFrame StaffsJFrame = new StaffsJFrame();
        StaffsJFrame.setVisible(true);
        StaffsJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        StaffsJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_staffsMouseClicked

    private void customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseClicked
        // TODO add your handling code here:
        CustomersJFrame CustomersJFrame = new CustomersJFrame();
        CustomersJFrame.setVisible(true);
        CustomersJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        CustomersJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_customersMouseClicked

    private void roomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseClicked
        // TODO add your handling code here:
        RoomsJFrame RoomsJFrame = new RoomsJFrame();
        RoomsJFrame.setVisible(true);
        RoomsJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        RoomsJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_roomsMouseClicked

    private void reportJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportJButtonMouseClicked
        // TODO add your handling code here:
        ReportsJFrame reportsJFrame = new ReportsJFrame();
        reportsJFrame.setVisible(true);
        reportsJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        reportsJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_reportJButtonMouseClicked

    private void serviceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceMouseClicked
        // TODO add your handling code here:
        ServiceJFrame serviceJFrame = new ServiceJFrame();
        serviceJFrame.setVisible(true);
        serviceJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        serviceJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_serviceMouseClicked

    private void makeReservationButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_makeReservationButtonMouseClicked
        CreateReservationJFrame createReservationJFrame = new CreateReservationJFrame();
        createReservationJFrame.setVisible(true);
        createReservationJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        createReservationJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_makeReservationButtonMouseClicked

    private void roomTypesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomTypesMouseClicked
        // TODO add your handling code here:
        RoomTypesJFrame roomTypesJFrame = new RoomTypesJFrame();
        roomTypesJFrame.setVisible(true);
        roomTypesJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        roomTypesJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_roomTypesMouseClicked

    private void serviceProvidesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceProvidesMouseClicked
        // TODO add your handling code here:
        ServiceProvidesJFrame serviceProvidesJFrame = new ServiceProvidesJFrame();
        serviceProvidesJFrame.setVisible(true);
        serviceProvidesJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        serviceProvidesJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_serviceProvidesMouseClicked

    private void checkOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkOutButtonMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_checkOutButtonMouseClicked

    private void requestServiceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestServiceButtonMouseClicked
        // TODO add your handling code here:
        RequestServiceJFrame requestServiceJFrame = new RequestServiceJFrame();
        requestServiceJFrame.setVisible(true);
        requestServiceJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        requestServiceJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_requestServiceButtonMouseClicked

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkOutButton;
    private javax.swing.JButton customers;
    private javax.swing.JButton hotels;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton makeReservationButton;
    private javax.swing.JButton reportJButton;
    private javax.swing.JButton requestServiceButton;
    private javax.swing.JButton roomTypes;
    private javax.swing.JButton rooms;
    private javax.swing.JButton service;
    private javax.swing.JButton serviceProvides;
    private javax.swing.JButton staffs;
    // End of variables declaration//GEN-END:variables
}
