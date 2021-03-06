/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.*;
import static frontend.EditRoomJFrame.hotel;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author patel
 */
public class AddRoomJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddRoomJFrame
     */
    static Hotel hotel;
    public AddRoomJFrame(Hotel hotel) {
        this.hotel = hotel;
        initComponents();
        populateRoomTypes();
    }
    
    public void populateRoomTypes(){
        try {
            ArrayList<RoomType> roomtypesList = RoomType.getAllRoomTypesList();
            for (RoomType roomtype : roomtypesList) {
                System.out.println(roomtype);
                roomTypes.addItem(roomtype);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        roomNo = new javax.swing.JTextField();
        roomRates = new javax.swing.JTextField();
        maxOccupancy = new javax.swing.JTextField();
        roomTypes = new javax.swing.JComboBox<>();
        addRoom = new javax.swing.JButton();
        availableJRadioButton = new javax.swing.JRadioButton();
        notAvailableRadioButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        closeJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add Room");

        jLabel2.setText("RoomNo");

        jLabel3.setText("Room Type ID");

        jLabel4.setText("Room Rates");

        jLabel5.setText("Maximum Allowed Occupancy");

        addRoom.setText("Add Room");
        addRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRoomMouseClicked(evt);
            }
        });

        buttonGroup1.add(availableJRadioButton);
        availableJRadioButton.setText("Available");
        availableJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableJRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(notAvailableRadioButton);
        notAvailableRadioButton.setText("Not Available");

        jLabel6.setText("Select Availability of Room");

        closeJButton.setText("Close");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roomTypes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(maxOccupancy)
                            .addComponent(roomRates)
                            .addComponent(roomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notAvailableRadioButton)
                    .addComponent(availableJRadioButton))
                .addGap(206, 206, 206))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addRoom)
                .addGap(52, 52, 52)
                .addComponent(closeJButton)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(roomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(roomTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(roomRates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(maxOccupancy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availableJRadioButton)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notAvailableRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRoom)
                    .addComponent(closeJButton))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRoomMouseClicked
        // TODO add your handling code here:
        RoomType roomType = (RoomType)roomTypes.getSelectedItem();
        int roomTypeID = roomType.getRoomTypeID();
        int hotelID = hotel.getHotelID();
        double roomRatesVal = Double.parseDouble(roomRates.getText());
        short maxOcc = Short.parseShort(maxOccupancy.getText());
        int roomNum = Integer.parseInt(roomNo.getText());
        boolean availability = true;
        if(availableJRadioButton.isSelected()){
            availability = true;
        }else{
            availability = false;
        }

        boolean roomCreated = Room.createRoom(roomNum, roomTypeID, hotelID, roomRatesVal, maxOcc,availability);
        String showMessage = "";
        if(roomCreated){
            showMessage = "Selected Room has been successfully created!";
        }else{
            showMessage = "Oops! Some error occured while created the room!";
        }

        JOptionPane.showMessageDialog(null,showMessage);

        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }//GEN-LAST:event_addRoomMouseClicked

    private void availableJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableJRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableJRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddRoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRoomJFrame(hotel).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRoom;
    private javax.swing.JRadioButton availableJRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton closeJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField maxOccupancy;
    private javax.swing.JRadioButton notAvailableRadioButton;
    private javax.swing.JTextField roomNo;
    private javax.swing.JTextField roomRates;
    private javax.swing.JComboBox<RoomType> roomTypes;
    // End of variables declaration//GEN-END:variables
}
