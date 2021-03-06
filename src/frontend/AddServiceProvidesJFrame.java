/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Hotel;
import backend.RoomType;
import backend.ServiceProvides;
import backend.Services;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author patel
 */
public class AddServiceProvidesJFrame extends javax.swing.JFrame {

    /**
     * Creates new form addServiceProvides
     */
    
    Hotel selectedHotel;
    public AddServiceProvidesJFrame(Hotel selectedHotel) {
        this.selectedHotel = selectedHotel;
        initComponents();
        populateRoomTypes();
        populateServiceTypes();
    }
    
    private void populateRoomTypes() {
        roomTypeComboBox.removeAllItems();
        //statesJComboBox.addItem("");
        //statesJComboBox.addItem("All States");

        try {
            ArrayList<RoomType> roomTypesList = RoomType.getAllRoomTypesList();
            for (RoomType roomType : roomTypesList) {
                roomTypeComboBox.addItem(roomType);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    private void populateServiceTypes() {
        serviceComboBox.removeAllItems();
        //statesJComboBox.addItem("");
        //statesJComboBox.addItem("All States");

        try {
            ArrayList<Services> servicesList = Services.getAllServiceList();
            for (Services service : servicesList) {
                serviceComboBox.addItem(service);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roomTypeComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serviceComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        ratePerServiceTextField = new javax.swing.JTextField();
        addServiceProvideButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        roomTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Room Type:");

        jLabel2.setText("Service Type:");

        serviceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Rate:");

        addServiceProvideButton.setText("Add Service Provide");
        addServiceProvideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addServiceProvideButtonMouseClicked(evt);
            }
        });

        closeButton.setText("Close");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roomTypeComboBox, 0, 128, Short.MAX_VALUE)
                            .addComponent(serviceComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ratePerServiceTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(addServiceProvideButton)
                        .addGap(35, 35, 35)
                        .addComponent(closeButton)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(serviceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ratePerServiceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addServiceProvideButton)
                    .addComponent(closeButton))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addServiceProvideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addServiceProvideButtonMouseClicked
        // TODO add your handling code here:
        RoomType selectedRoomType = (RoomType)roomTypeComboBox.getSelectedItem();
        Services selectedService = (Services) serviceComboBox.getSelectedItem();
        int hotelID = selectedHotel.getHotelID();
        int roomTypeID = selectedRoomType.getRoomTypeID();
        int serviceID = selectedService.getServiceID();
        double ratePerService = Double.parseDouble(ratePerServiceTextField.getText());
        System.out.println("Hotel:" + hotelID);
        System.out.println("RoomType:" + roomTypeID);
        System.out.println("Service:" + serviceID);
        
        boolean warning = false;
        
        boolean newServiceProvide = ServiceProvides.createServiceProvides(roomTypeID, hotelID , serviceID, ratePerService);
        String showMessage = "";
        if(newServiceProvide){
            showMessage = "New Service Provide has been successfully created!";
        }else{
            showMessage = "Oops! Some error occured !";
        }
        
        JOptionPane.showMessageDialog(null,showMessage);
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }//GEN-LAST:event_addServiceProvideButtonMouseClicked

    private void roomTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomTypeComboBoxActionPerformed

    private void serviceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(AddServiceProvidesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddServiceProvidesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddServiceProvidesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddServiceProvidesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form *//*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddServiceProvidesJFrame().setVisible(true);
            }
        }); */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addServiceProvideButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField ratePerServiceTextField;
    private javax.swing.JComboBox roomTypeComboBox;
    private javax.swing.JComboBox serviceComboBox;
    // End of variables declaration//GEN-END:variables
}
