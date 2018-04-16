/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.CheckIn;
import backend.Hotel;
import backend.ServiceRecord;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Dax Amin
 */
public class RequestServiceJFrame extends javax.swing.JFrame {

    /**
     * Creates new form RequestServiceJFrame
     */
    
    public RequestServiceJFrame() {
        initComponents();
        populateHotels();
    }
    
    private void populateHotels() {
        hotelComboBox.removeAllItems();
        //statesJComboBox.addItem("");
        //statesJComboBox.addItem("All States");

        try {
            ArrayList<Hotel> hotelsList = Hotel.getAllHotelsList();
            for (Hotel hotel : hotelsList) {
                hotelComboBox.addItem(hotel);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void populateCheckIns(Hotel selectedHotel) {
        checkInComboBox.removeAllItems();
        //statesJComboBox.addItem("");
        //statesJComboBox.addItem("All States");

        try {
            
            System.out.print(selectedHotel.getHotelID());
            ArrayList<CheckIn> checkList = CheckIn.getActiveCheckIns(selectedHotel.getHotelID());
            for (CheckIn checkIn: checkList) {
                checkInComboBox.addItem(checkIn);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hotelComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        checkInComboBox = new javax.swing.JComboBox();
        createRequestButton = new javax.swing.JButton();
        updateRequestButton = new javax.swing.JButton();
        viewRequestButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Request Service");

        jLabel2.setText("Select Hotel:");

        hotelComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Select CheckIn:");

        createRequestButton.setText("Create");
        createRequestButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createRequestButtonMouseClicked(evt);
            }
        });

        updateRequestButton.setText("Update");
        updateRequestButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateRequestButtonMouseClicked(evt);
            }
        });

        viewRequestButton.setText("View");
        viewRequestButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewRequestButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(createRequestButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addComponent(updateRequestButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hotelComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkInComboBox, 0, 141, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(viewRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hotelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(checkInComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(createRequestButton)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateRequestButton)
                    .addComponent(viewRequestButton))
                .addGap(0, 56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hotelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotelComboBoxActionPerformed
        // TODO add your handling code here:
        Hotel selectedHotel = (Hotel) hotelComboBox.getSelectedItem();
        populateCheckIns(selectedHotel);
    }//GEN-LAST:event_hotelComboBoxActionPerformed

    private void createRequestButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createRequestButtonMouseClicked
        // TODO add your handling code here:
        CreateRequestServiceJFrame createRequestServiceJFrame = new CreateRequestServiceJFrame((Hotel) hotelComboBox.getSelectedItem(), (CheckIn) checkInComboBox.getSelectedItem());
        createRequestServiceJFrame.setVisible(true);
        createRequestServiceJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        createRequestServiceJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_createRequestButtonMouseClicked

    private void viewRequestButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRequestButtonMouseClicked
        // TODO add your handling code here:
        ViewServiceRequestJFrame viewServiceRequestJFrame = new ViewServiceRequestJFrame((Hotel) hotelComboBox.getSelectedItem(), (CheckIn) checkInComboBox.getSelectedItem());
        viewServiceRequestJFrame.setVisible(true);
        viewServiceRequestJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        viewServiceRequestJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_viewRequestButtonMouseClicked

    private void updateRequestButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateRequestButtonMouseClicked
        // TODO add your handling code here:
        UpdateServiceRequestJFrame updateServiceRequestJFrame = new UpdateServiceRequestJFrame((CheckIn) checkInComboBox.getSelectedItem());
        updateServiceRequestJFrame.setVisible(true);
        updateServiceRequestJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        updateServiceRequestJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_updateRequestButtonMouseClicked

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
            java.util.logging.Logger.getLogger(RequestServiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequestServiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequestServiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequestServiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequestServiceJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox checkInComboBox;
    private javax.swing.JButton createRequestButton;
    private javax.swing.JComboBox hotelComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton updateRequestButton;
    private javax.swing.JButton viewRequestButton;
    // End of variables declaration//GEN-END:variables
}
