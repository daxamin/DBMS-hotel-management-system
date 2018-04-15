/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Bill;
import backend.City;
import backend.Connect;
import backend.PaymentMethod;
import backend.State;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Savepoint;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author khantil
 */
public class CreateBillingInfoJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CreateBillingInfoJFrame
     */
    int checkInID;
    CheckInJFrame ci ;
    Savepoint savepoint = null;
    boolean newBillCreated = false;
    public CreateBillingInfoJFrame(int checkInID, CheckInJFrame cFrame, Savepoint savepoint) {
        initComponents();
        this.checkInID = checkInID;
        this.savepoint = savepoint;
        this.ci = cFrame;
        checkInIDJLabel.setText(String.valueOf(checkInID));
        populatePaymentMethods();
        populateStates();
        
    }
    
    private void populatePaymentMethods() {
        paymentMethodJComboBox.removeAllItems();


        try {
            ArrayList<PaymentMethod> paymentMethodsList = PaymentMethod.getAllPaymentMethods();
            for (PaymentMethod paymentMethod : paymentMethodsList) {
                paymentMethodJComboBox.addItem(paymentMethod);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void populateStates() {
        stateJComboBox.removeAllItems();
        //statesJComboBox.addItem("");
        //statesJComboBox.addItem("All States");

        try {
            ArrayList<State> statesList = State.getAllStatesList();
            for (State state : statesList) {
                stateJComboBox.addItem(state);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void populateCities() {
        cityJComboBox.removeAllItems();

        try {
            State selectedState = (State) stateJComboBox.getSelectedItem();
            ArrayList<City> citiesList = City.getAllCitiesInStateList(selectedState.getStateID());
            for (City city : citiesList) {
                cityJComboBox.addItem(city);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        paymentMethodJComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        payerFirstNameJTextField = new javax.swing.JTextField();
        payerLastNameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cardNumberJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ssnJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        billingAddressJTextField = new javax.swing.JTextField();
        checkInIDJLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        stateJComboBox = new javax.swing.JComboBox<>();
        cityJComboBox = new javax.swing.JComboBox<>();
        zipCodeJTextField = new javax.swing.JTextField();
        enterBillDetailsButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Check-In ID:");

        jLabel2.setText("Select Payement Method:");

        jLabel3.setText("Payer's First Name:");

        jLabel4.setText("Payer's Last Name:");

        jLabel5.setText("Card Number:");

        jLabel6.setText("SSN:");

        jLabel7.setText("Payer's Billing Street Address:");

        checkInIDJLabel.setText("jLabel8");

        jLabel9.setText("State:");

        jLabel10.setText("City:");

        jLabel11.setText("Payer's Zip Code:");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel12.setText("Enter Billing Information");

        stateJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateJComboBoxActionPerformed(evt);
            }
        });

        enterBillDetailsButton.setText("Insert Bill Details");
        enterBillDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterBillDetailsButtonMouseClicked(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(billingAddressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cardNumberJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ssnJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(payerFirstNameJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(payerLastNameJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                            .addComponent(paymentMethodJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkInIDJLabel))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(stateJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cityJComboBox, 0, 325, Short.MAX_VALUE))
                            .addComponent(zipCodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enterBillDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(checkInIDJLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paymentMethodJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(payerFirstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(payerLastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cardNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ssnJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(billingAddressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addComponent(cityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterBillDetailsButton)
                    .addComponent(closeButton)))
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

    private void enterBillDetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterBillDetailsButtonMouseClicked
       PaymentMethod selectedPaymentMethod = (PaymentMethod) paymentMethodJComboBox.getSelectedItem();
       City selectedCity = (City) cityJComboBox.getSelectedItem();
       
        this.newBillCreated = Bill.enterBillInfo(this.checkInID, selectedPaymentMethod.getPaymentMethodID() , 
               payerFirstNameJTextField.getText(), payerLastNameJTextField.getText(), 
               cardNumberJTextField.getText(), ssnJTextField.getText() , billingAddressJTextField.getText(), 
               selectedCity.getCityID(), Integer.parseInt(zipCodeJTextField.getText()));
        
       
        
        String showMessage = "";
        if(newBillCreated){
            showMessage = "Your new bill has been successfully created!";
            newBillCreated = true;
        }else{
            showMessage = "Oops! Some error occured while inserting new bill!";
            newBillCreated = false;
        }
        doCommitOrRollback();
        
        
        JOptionPane.showMessageDialog(null,showMessage);
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        
    }//GEN-LAST:event_enterBillDetailsButtonMouseClicked
    public void doCommitOrRollback(){
        if(this.checkInID != -1 && newBillCreated == true){
            try{
                Connect.connection.commit();
                JOptionPane.showMessageDialog(null, "Both transactions executed correctly");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            try{
                Connect.connection.rollback(this.savepoint);
                JOptionPane.showMessageDialog(null, "One of the transactions did not execute");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        try{
            Connect.connection.setAutoCommit(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void stateJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateJComboBoxActionPerformed
        
        populateCities();
    }//GEN-LAST:event_stateJComboBoxActionPerformed

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        // TODO add your handling code here:
        doCommitOrRollback();
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        
    }//GEN-LAST:event_closeButtonMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CreateBillingInfoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CreateBillingInfoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CreateBillingInfoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CreateBillingInfoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CreateBillingInfoJFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField billingAddressJTextField;
    private javax.swing.JTextField cardNumberJTextField;
    private javax.swing.JLabel checkInIDJLabel;
    private javax.swing.JComboBox<City> cityJComboBox;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton enterBillDetailsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField payerFirstNameJTextField;
    private javax.swing.JTextField payerLastNameJTextField;
    private javax.swing.JComboBox<PaymentMethod> paymentMethodJComboBox;
    private javax.swing.JTextField ssnJTextField;
    private javax.swing.JComboBox<State> stateJComboBox;
    private javax.swing.JTextField zipCodeJTextField;
    // End of variables declaration//GEN-END:variables
}
