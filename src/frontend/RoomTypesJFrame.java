/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Room;
import static frontend.ViewRoomsJFrame.buildTableModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author patel
 */
public class RoomTypesJFrame extends javax.swing.JFrame {

    /**
     * Creates new form RoomTypesJFrame
     */
    public RoomTypesJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        addRoomTypes = new javax.swing.JButton();
        removeRoomTypes = new javax.swing.JButton();
        viewRoomTypes = new javax.swing.JButton();
        updateRoomTypes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Room Types");

        addRoomTypes.setText("Add");
        addRoomTypes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRoomTypesMouseClicked(evt);
            }
        });

        removeRoomTypes.setText("Remove");
        removeRoomTypes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeRoomTypesMouseClicked(evt);
            }
        });

        viewRoomTypes.setText("View");
        viewRoomTypes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewRoomTypesMouseClicked(evt);
            }
        });

        updateRoomTypes.setText("Update");
        updateRoomTypes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateRoomTypesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1)
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addRoomTypes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewRoomTypes, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeRoomTypes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateRoomTypes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRoomTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeRoomTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewRoomTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateRoomTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addRoomTypesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRoomTypesMouseClicked
        // TODO add your handling code here:
        AddRoomTypesJFrame addRoomTypesJFrame = new AddRoomTypesJFrame();
        addRoomTypesJFrame.setVisible(true);
        addRoomTypesJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        addRoomTypesJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_addRoomTypesMouseClicked

    private void removeRoomTypesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeRoomTypesMouseClicked
        // TODO add your handling code here:
        RemoveRoomTypesJFrame removeRoomTypesJFrame = new RemoveRoomTypesJFrame();
        removeRoomTypesJFrame.setVisible(true);
        removeRoomTypesJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        removeRoomTypesJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_removeRoomTypesMouseClicked

    private void viewRoomTypesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRoomTypesMouseClicked
        // TODO add your handling code here:
        ViewRoomTypesJFrame viewRoomTypesJFrame = new ViewRoomTypesJFrame();
        viewRoomTypesJFrame.setVisible(true);
        viewRoomTypesJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        viewRoomTypesJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_viewRoomTypesMouseClicked

    private void updateRoomTypesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateRoomTypesMouseClicked
        // TODO add your handling code here:
        UpdateRoomTypesJFrame updateRoomTypesJFrame = new UpdateRoomTypesJFrame();
        updateRoomTypesJFrame.setVisible(true);
        updateRoomTypesJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        updateRoomTypesJFrame.setLocation(screenWidth/4,screenHeight/4);
    }//GEN-LAST:event_updateRoomTypesMouseClicked

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
            java.util.logging.Logger.getLogger(RoomTypesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomTypesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomTypesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomTypesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomTypesJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRoomTypes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton removeRoomTypes;
    private javax.swing.JButton updateRoomTypes;
    private javax.swing.JButton viewRoomTypes;
    // End of variables declaration//GEN-END:variables
}
