
package main;

import java.awt.Color;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gastone Alex
 */
public class Home extends javax.swing.JFrame {

    public Home() {
       
        initComponents();
        //setBackground(new Color(0,0,0,0));


}
     public String searchtext(){
             String str = Search_jTextField.getText(); 
             return str;
         }
    

    Home(CustomerSearch aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        logo_Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Search_jTextField = new javax.swing.JTextField();
        Search_jButton = new javax.swing.JButton();
        Logo_jLabel = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        Button_jPanel = new javax.swing.JPanel();
        All_orders_jButton = new javax.swing.JButton();
        Pending_orders_jButton = new javax.swing.JButton();
        Approved_orders_jButton = new javax.swing.JButton();
        Update_info_jButton = new javax.swing.JButton();
        Contracts_jButton = new javax.swing.JButton();
        Reports_jButton = new javax.swing.JButton();
        Declinedl_orders_jButton = new javax.swing.JButton();
        Data_jPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cooler Delivery and Collection");
        setExtendedState(6);
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, logo_Label, org.jdesktop.beansbinding.ELProperty.create("${icon}"), logo_Label, org.jdesktop.beansbinding.BeanProperty.create("icon"));
        bindingGroup.addBinding(binding);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("COCA-COLA KWANZA LIMITED");

        jLabel2.setFont(new java.awt.Font("Wide Latin", 2, 12)); // NOI18N
        jLabel2.setText("COOLER DELIVERY AND COLLECTION");

        Search_jTextField.setToolTipText("SEARCH BY NAME");
        Search_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_jTextFieldActionPerformed(evt);
            }
        });

        Search_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/search.png"))); // NOI18N
        Search_jButton.setText("Search");
        Search_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_jButtonActionPerformed(evt);
            }
        });

        Logo_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/logo.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo_Label)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Search_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Search_jButton))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Search_jButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Search_jTextField)))))
                .addContainerGap())
        );

        Button_jPanel.setBackground(new java.awt.Color(0, 0, 0));

        All_orders_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/order.png"))); // NOI18N
        All_orders_jButton.setText("ORDERS");
        All_orders_jButton.setBorderPainted(false);
        All_orders_jButton.setOpaque(false);
        All_orders_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                All_orders_jButtonActionPerformed(evt);
            }
        });

        Pending_orders_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/Pending.png"))); // NOI18N
        Pending_orders_jButton.setText("PENDING");
        Pending_orders_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pending_orders_jButtonActionPerformed(evt);
            }
        });

        Approved_orders_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/Approved.png"))); // NOI18N
        Approved_orders_jButton.setText("APPROVED");
        Approved_orders_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Approved_orders_jButtonActionPerformed(evt);
            }
        });

        Update_info_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/update icon.png"))); // NOI18N
        Update_info_jButton.setText("UPDATE");
        Update_info_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_info_jButtonActionPerformed(evt);
            }
        });

        Contracts_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/contract.png"))); // NOI18N
        Contracts_jButton.setText("CONTRACTS");
        Contracts_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contracts_jButtonActionPerformed(evt);
            }
        });

        Reports_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/reports.png"))); // NOI18N
        Reports_jButton.setText("REPORTS");
        Reports_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reports_jButtonActionPerformed(evt);
            }
        });

        Declinedl_orders_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/declined.gif"))); // NOI18N
        Declinedl_orders_jButton.setText("DECLINED");
        Declinedl_orders_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Declinedl_orders_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Button_jPanelLayout = new javax.swing.GroupLayout(Button_jPanel);
        Button_jPanel.setLayout(Button_jPanelLayout);
        Button_jPanelLayout.setHorizontalGroup(
            Button_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Button_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(All_orders_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pending_orders_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Approved_orders_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Contracts_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Reports_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Update_info_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Declinedl_orders_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Button_jPanelLayout.setVerticalGroup(
            Button_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(All_orders_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Declinedl_orders_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Pending_orders_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Approved_orders_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Update_info_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Contracts_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Reports_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(Button_jPanel);

        Data_jPanel.setLayout(null);
        jSplitPane1.setRightComponent(Data_jPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Search_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_jTextFieldActionPerformed

    private void All_orders_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_All_orders_jButtonActionPerformed
     Orders order = new Orders();
        Data_jPanel.setBackground(Color.red);
       jSplitPane1.setRightComponent( order);   // TODO add your handling code here:
    }//GEN-LAST:event_All_orders_jButtonActionPerformed

    private void Approved_orders_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Approved_orders_jButtonActionPerformed
Approved approved = new Approved();
        Data_jPanel.setBackground(Color.red);
       jSplitPane1.setRightComponent( approved);        // TODO add your handling code here:
    }//GEN-LAST:event_Approved_orders_jButtonActionPerformed

    private void Update_info_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_info_jButtonActionPerformed

Update update = new Update();
        Data_jPanel.setBackground(Color.red);
       jSplitPane1.setRightComponent( update);        // TODO add your handling code here:
    }//GEN-LAST:event_Update_info_jButtonActionPerformed

    private void Contracts_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contracts_jButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Contracts_jButtonActionPerformed

    private void Reports_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reports_jButtonActionPerformed
Reports myreport = new Reports();
        Data_jPanel.setBackground(Color.red);
       jSplitPane1.setRightComponent( myreport);
               // TODO add your handling code here:
    }//GEN-LAST:event_Reports_jButtonActionPerformed

    private void Search_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_jButtonActionPerformed
CustomerSearch search = new CustomerSearch();
        Data_jPanel.setBackground(Color.red);
       jSplitPane1.setRightComponent( search);       // TODO add your handling code here:
    }//GEN-LAST:event_Search_jButtonActionPerformed

    private void Pending_orders_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pending_orders_jButtonActionPerformed
        Pending pending = new Pending();
        Data_jPanel.setBackground(Color.red);
        jSplitPane1.setRightComponent( pending);

        // Code of sub-components - not shown here

        // Layout setup code - not shown here
        // TODO add your handling code here:
    }//GEN-LAST:event_Pending_orders_jButtonActionPerformed

    private void Declinedl_orders_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Declinedl_orders_jButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Declinedl_orders_jButtonActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
new Home();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton All_orders_jButton;
    private javax.swing.JButton Approved_orders_jButton;
    private javax.swing.JPanel Button_jPanel;
    private javax.swing.JButton Contracts_jButton;
    private javax.swing.JPanel Data_jPanel;
    private javax.swing.JButton Declinedl_orders_jButton;
    private javax.swing.JLabel Logo_jLabel;
    private javax.swing.JButton Pending_orders_jButton;
    private javax.swing.JButton Reports_jButton;
    private javax.swing.JButton Search_jButton;
    public javax.swing.JTextField Search_jTextField;
    private javax.swing.JButton Update_info_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel logo_Label;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
