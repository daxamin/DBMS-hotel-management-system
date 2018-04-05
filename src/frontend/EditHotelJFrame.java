/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.City;
import backend.Hotel;
import backend.State;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author khantil
 */
public class EditHotelJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddHotelJFrame
     */
    public EditHotelJFrame() {
        initComponents();
        populateStates();
        populateHotels();
    }
    
    private void populateHotels() {
        hotelsJComboBox.removeAllItems();
        //statesJComboBox.addItem("");
        //statesJComboBox.addItem("All States");

        try {
            ArrayList<Hotel> hotelsList = Hotel.getAllHotelsList();
            for (Hotel hotel : hotelsList) {
                hotelsJComboBox.addItem(hotel);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    private void populateStates() {
        statesJComboBox.removeAllItems();
        //statesJComboBox.addItem("");
        //statesJComboBox.addItem("All States");

        try {
            ArrayList<State> statesList = State.getAllStatesList();
            for (State state : statesList) {
                statesJComboBox.addItem(state);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void populateCities() {
        citiesJComboBox.removeAllItems();
        //statesJComboBox.addItem("");
        //statesJComboBox.addItem("All States");

        try {
            State selectedState = (State) statesJComboBox.getSelectedItem();
            ArrayList<City> citiesList = City.getAllCitiesInStateList(selectedState.getStateID());
            for (City city : citiesList) {
                citiesJComboBox.addItem(city);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void closeButtonActionPerformed(ActionEvent evt) {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        hotelNameTextField = new javax.swing.JTextField();
        zipCodeTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        hotelsJComboBox = new javax.swing.JComboBox<>();
        updateHotelButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        statesJComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        citiesJComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit / Update Hotel Details");

        jLabel2.setText("Enter Hotel Name:");

        jLabel3.setText("Enter Hotel Street Address:");

        jLabel4.setText("Select City:");

        jLabel5.setText("ZipCode:");

        jLabel6.setText("Phone Number:");

        addressTextField.setToolTipText("Enter Address");

        zipCodeTextField.setToolTipText("xxxxx");

        phoneNumberTextField.setToolTipText("xxx-xxx-xxxx");

        hotelsJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelsJComboBoxActionPerformed(evt);
            }
        });

        updateHotelButton.setText("Update Hotel");
        updateHotelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateHotelButtonMouseClicked(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        jLabel7.setText("Select State:");

        statesJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statesJComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setText("Enter Hotel Name:");

        citiesJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citiesJComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updateHotelButton)
                .addGap(63, 63, 63)
                .addComponent(closeButton)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(citiesJComboBox, 0, 301, Short.MAX_VALUE)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(hotelNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                                        .addComponent(addressTextField))
                                    .addComponent(statesJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(zipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(76, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hotelsJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(hotelsJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hotelNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(statesJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(citiesJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(zipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateHotelButton)
                    .addComponent(closeButton))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
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

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        // TODO add your handling code here:
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

    }//GEN-LAST:event_closeButtonMouseClicked

    private void updateHotelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateHotelButtonMouseClicked
        // TODO add your handling code here:
        Hotel selectedHotel = (Hotel) hotelsJComboBox.getSelectedItem();
        int hotelID = selectedHotel.getHotelID();
        
        String hotelName = hotelNameTextField.getText();
        String hotelStreetAddress = addressTextField.getText();
        City selectedCity = (City)citiesJComboBox.getSelectedItem();
        int cityID = (int) selectedCity.getCityID();
        int zipCode = Integer.parseInt(zipCodeTextField.getText());
        String phoneNumber = phoneNumberTextField.getText();
        
        
        boolean hotelUpdated = Hotel.updateHotelDetails(hotelID, hotelName, hotelStreetAddress, cityID, zipCode, phoneNumber);
        String showMessage = "";
        if(hotelUpdated){
            showMessage = "Your hotel details have been successfully updated!";
        }else{
            showMessage = "Oops! Some error occured while updating hotel details!";
        }
        
        JOptionPane.showMessageDialog(null,showMessage);
        
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        
    }//GEN-LAST:event_updateHotelButtonMouseClicked

    private void statesJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statesJComboBoxActionPerformed
        // TODO add your handling code here:
        System.out.println("\n SELECTED STATE: " + (State) statesJComboBox.getSelectedItem());
        populateCities();
        System.out.println("\n Populate");
    }//GEN-LAST:event_statesJComboBoxActionPerformed

    private void hotelsJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotelsJComboBoxActionPerformed
        // TODO add your handling code here:
        System.out.println("\n SELECTED HOTEL: " + (Hotel) hotelsJComboBox.getSelectedItem());
        Hotel selectedHotel = (Hotel) hotelsJComboBox.getSelectedItem();
        
        hotelNameTextField.setText(selectedHotel.getHotelName());
        addressTextField.setText(selectedHotel.getHotelStreetAddress());
        City selectedCity = City.getCity(selectedHotel.getCityID());
        State selectedState = State.getState(selectedCity.getStateID());
        System.out.println("\n GOT HOTEL STATE: "+selectedState.getStateName());
        System.out.println("\n GOT HOTEL CITY: "+selectedCity.getCityName());
        statesJComboBox.setSelectedItem(selectedState);
        populateCities();
        citiesJComboBox.setSelectedItem(selectedCity);
        zipCodeTextField.setText(Integer.toString(selectedHotel.getZipCode()));
        phoneNumberTextField.setText(selectedHotel.getPhoneNumber());
        
    }//GEN-LAST:event_hotelsJComboBoxActionPerformed

    private void citiesJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citiesJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_citiesJComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(EditHotelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditHotelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditHotelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditHotelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditHotelJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JComboBox<City> citiesJComboBox;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField hotelNameTextField;
    private javax.swing.JComboBox<Hotel> hotelsJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JComboBox<State> statesJComboBox;
    private javax.swing.JButton updateHotelButton;
    private javax.swing.JTextField zipCodeTextField;
    // End of variables declaration//GEN-END:variables
}
