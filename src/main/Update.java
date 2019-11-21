/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author RTM
 */
public class Update extends javax.swing.JPanel {

    /**
     * Creates new form Update2
     */
    public Update() {
        initComponents();
        try {
    
            Connection con = DBConn.myConn();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT outlet_owner,outlet_name,location FROM loan_coooler where approved_by_asm =1 AND approved_by_rsm=1 AND approved_by_contlr=0");
        if(rs.next()) { 
        String customer = rs.getString("outlet_owner");
        CustomerName_jTextField.setText(customer);
        String outlet = rs.getString("outlet_name");
        OutletName_jTextField.setText(outlet);
        String location = rs.getString("location");
        Location_jTextField.setText(location);
        
        
    }
            rs.close();
            
        } catch (Exception ex) { 
            JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        outletName_jLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CoolerTag_jTextField = new javax.swing.JTextField();
        OutletTag_jTextField = new javax.swing.JTextField();
        Serial_jTextField = new javax.swing.JTextField();
        CoolerType_jTextField = new javax.swing.JTextField();
        OutletName_jLabel = new javax.swing.JLabel();
        Update_jButton = new javax.swing.JButton();
        Location_jTextField = new javax.swing.JTextField();
        OutletName_jTextField = new javax.swing.JTextField();
        CustomerName_jTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        OutletNumber_jTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CoolerAssetnumber_jTextField = new javax.swing.JTextField();
        Update_jComboBox = new javax.swing.JComboBox<>();

        jLabel1.setText("Customer Name");

        jLabel2.setText("Location");

        jLabel3.setText("Outlet Name");

        jLabel4.setText("Cooler Tag");

        jLabel5.setText("Outlet Tag");

        jLabel6.setText("Serial Number");

        jLabel7.setText("Cooler Type");

        CoolerTag_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoolerTag_jTextFieldActionPerformed(evt);
            }
        });

        OutletTag_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutletTag_jTextFieldActionPerformed(evt);
            }
        });

        Update_jButton.setText("Update");
        Update_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_jButtonActionPerformed(evt);
            }
        });

        Location_jTextField.setEditable(false);

        OutletName_jTextField.setEditable(false);

        CustomerName_jTextField.setEditable(false);

        jLabel9.setText("Outlet Number");

        jLabel10.setText("Cooler Asset Number");

        Update_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_jComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Update_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CoolerTag_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Serial_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CoolerType_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(OutletTag_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(711, 711, 711))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(OutletNumber_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Location_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(OutletName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(381, 381, 381)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(outletName_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                    .addComponent(OutletName_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(CustomerName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CoolerAssetnumber_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Update_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Update_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CustomerName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OutletName_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(OutletName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Location_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(outletName_jLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OutletNumber_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(OutletTag_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(CoolerTag_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Serial_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CoolerType_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CoolerAssetnumber_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(Update_jButton)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CoolerTag_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoolerTag_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoolerTag_jTextFieldActionPerformed

    private void OutletTag_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutletTag_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OutletTag_jTextFieldActionPerformed

    private void Update_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_jButtonActionPerformed
JDialog.setDefaultLookAndFeelDecorated(true);
		int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (response == JOptionPane.NO_OPTION) {
			System.out.println("No button clicked");
		} else if (response == JOptionPane.YES_OPTION) {
			try {
     String value1=OutletTag_jTextField.getText();
        String value2=OutletNumber_jTextField.getText();
        String value3=CoolerTag_jTextField.getText();
        String value4=CoolerType_jTextField.getText();
        String value5=CoolerAssetnumber_jTextField.getText();
String value6=Serial_jTextField.getText();
        String str= CustomerName_jTextField.getText();
            Connection con = DBConn.myConn();
            PreparedStatement stmt = con.prepareStatement("UPDATE loan_coooler SET outlet_tag=? ,outlet_number=? WHERE outlet_owner=?");
            stmt.setString(1, value1);
            stmt.setString(2, value2);
            stmt.setString(3, str);
            int rs = stmt.executeUpdate();
            
 PreparedStatement stmt2 = con.prepareStatement("UPDATE coolers SET cooler_tag=? ,cooler_type=?,cooler_serialno=?,cooler_asset_number=? WHERE cooler_type_id = (SELECT cooler_type_id FROM loan_coooler WHERE outlet_owner=? )");
            stmt2.setString(1, value3);
            stmt2.setString(2, value4);
stmt2.setString(3, value5);
stmt2.setString(4, value6);
stmt2.setString(5, str);
PreparedStatement stmt3 = con.prepareStatement("UPDATE loan_coooler SET approved_by_contlr=1  WHERE  outlet_owner=? ");
stmt3.setString(1, str);
   int rs3 = stmt3.executeUpdate();
            
            int rs2 = stmt2.executeUpdate();
            System.out.println(rs+" records affected"); 
            System.out.println(rs2+" records affected"); 
               System.out.println(rs3+" records affected");
             
            con.close();
          OutletTag_jTextField.setText("");
        OutletNumber_jTextField.setText("");
        CoolerTag_jTextField.setText("");
        CoolerType_jTextField.setText("");
      CoolerAssetnumber_jTextField.setText("");
Serial_jTextField.setText("");
    
     JOptionPane.showMessageDialog(null, "Records successful updated");
        } catch (Exception ex) { 
            JOptionPane.showMessageDialog(null, ex, ex.getMessage(), WIDTH, null);
        }
		} else if (response == JOptionPane.CLOSED_OPTION) {
			System.out.println("JOptionPane closed");
		}
        // TODO add your handling code here:
    }//GEN-LAST:event_Update_jButtonActionPerformed

    private void Update_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_jComboBoxActionPerformed
    try {
 
            Connection con = DBConn.myConn();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT outlet_owner FROM loan_coooler");
        while(rs.next()) { 
        String customer = rs.getString("outlet_owner");
       Update_jComboBox.addItem(customer);
        
        
    }
            rs.close();
            
        } catch (Exception ex) { 
            JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_Update_jComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CoolerAssetnumber_jTextField;
    private javax.swing.JTextField CoolerTag_jTextField;
    private javax.swing.JTextField CoolerType_jTextField;
    private javax.swing.JTextField CustomerName_jTextField;
    private javax.swing.JTextField Location_jTextField;
    private javax.swing.JLabel OutletName_jLabel;
    private javax.swing.JTextField OutletName_jTextField;
    private javax.swing.JTextField OutletNumber_jTextField;
    private javax.swing.JTextField OutletTag_jTextField;
    private javax.swing.JTextField Serial_jTextField;
    private javax.swing.JButton Update_jButton;
    private javax.swing.JComboBox<String> Update_jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel outletName_jLabel;
    // End of variables declaration//GEN-END:variables
}
