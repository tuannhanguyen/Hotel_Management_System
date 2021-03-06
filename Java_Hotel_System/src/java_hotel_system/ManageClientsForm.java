/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_hotel_system;

import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ManageClientsForm extends javax.swing.JFrame {

   Client client = new Client();
    public ManageClientsForm() {
        initComponents();
        
        // add a white border to the clear fields button 
        MatteBorder border = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.white);
        jButtonClear.setBorder(border);
        
        //show list clients
        client.fillClientJTable(jTable1);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonEdit = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButton_Refresh_jTable_Data = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Clients");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");

        jTextFieldID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First name:");

        jTextFieldPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email:");

        jTextFieldLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldFirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Phone", "Email"
            }
        )
        {public boolean isCellEditable(int row, int column){
            return false;
        }}
    );
    jTable1.setSelectionBackground(new java.awt.Color(51, 51, 255));
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jButtonEdit.setBackground(new java.awt.Color(255, 255, 51));
    jButtonEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonEdit.setText("Edit");
    jButtonEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEditActionPerformed(evt);
        }
    });

    jButtonRemove.setBackground(new java.awt.Color(255, 255, 51));
    jButtonRemove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonRemove.setText("Remove");
    jButtonRemove.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonRemoveActionPerformed(evt);
        }
    });

    jButtonClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonClear.setText("Clear Fields");
    jButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonClear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonClearActionPerformed(evt);
        }
    });

    jButtonAdd.setBackground(new java.awt.Color(255, 255, 51));
    jButtonAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonAdd.setText("Add");
    jButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonAddActionPerformed(evt);
        }
    });

    jButton_Refresh_jTable_Data.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButton_Refresh_jTable_Data.setText("Refresh");
    jButton_Refresh_jTable_Data.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_Refresh_jTable_DataActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(96, 96, 96))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(jButtonAdd)
                            .addGap(47, 47, 47)
                            .addComponent(jButtonEdit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addComponent(jLabel2))
                            .addGap(31, 31, 31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(38, 38, 38)))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(37, 37, 37))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jButton_Refresh_jTable_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(132, 132, 132))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(23, 23, 23)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(33, 33, 33)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGap(49, 49, 49)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEdit)
                        .addComponent(jButtonAdd)
                        .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addComponent(jButtonClear))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jButton_Refresh_jTable_Data)
            .addGap(0, 37, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // add new client
        
        //get data from the fields
        String fname = jTextFieldFirstName.getText();
        String lname = jTextFieldLastName.getText();
        String phone = jTextFieldPhone.getText();
        String email = jTextFieldEmail.getText();
        
        if(fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || email.trim().equals("") ){
            JOptionPane.showMessageDialog(rootPane, "Required Fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        } else{
             if(client.addClient(fname, lname, phone, email)){
                JOptionPane.showMessageDialog(rootPane, "New Client Added Successfully", "Add Client", JOptionPane.INFORMATION_MESSAGE);
                
            } else{
                JOptionPane.showMessageDialog(rootPane, "Client Not Added", "Add Client Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        // clear
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"ID", "First Name", "Last Name", "Phone", "Email"}));
        // refresh table
        client.fillClientJTable(jTable1);
       
        
        
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //display the selected row data in the jtextfields;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        //get the selected row index
        int rIndex = jTable1.getSelectedRow();
        
        //display data 
        jTextFieldID.setText(model.getValueAt(rIndex, 0).toString());
        jTextFieldFirstName.setText(model.getValueAt(rIndex, 1).toString());
        jTextFieldLastName.setText(model.getValueAt(rIndex, 2).toString());
        jTextFieldPhone.setText(model.getValueAt(rIndex, 3).toString());
        jTextFieldEmail.setText(model.getValueAt(rIndex, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // remove text from all jtextfields
        jTextFieldID.setText("");
        jTextFieldFirstName.setText("");
        jTextFieldLastName.setText("");
        jTextFieldEmail.setText("");
        jTextFieldPhone.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // edit the selected client 
        
        //get data from the fields
        
        int id = 0;
        String fname = jTextFieldFirstName.getText();
        String lname = jTextFieldLastName.getText();
        String phone = jTextFieldPhone.getText();
        String email = jTextFieldEmail.getText();
        
        if(fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || email.trim().equals("") ){
            JOptionPane.showMessageDialog(rootPane, "Required Fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        } else{
            
            try {
                id = Integer.valueOf(jTextFieldID.getText());
                
                 if(client.editClient(id, fname, lname, phone, email)){
                    JOptionPane.showMessageDialog(rootPane, "Client Data Updated Successfully", "Edit Client", JOptionPane.INFORMATION_MESSAGE);
                
                } else{
                    JOptionPane.showMessageDialog(rootPane, "Client Data Not Updated", "Edit Client Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage() + "- Enter the Client ID (number)", "Client ID Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        // clear
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"ID", "First Name", "Last Name", "Phone", "Email"}));
        // refresh table
        client.fillClientJTable(jTable1);
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButton_Refresh_jTable_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_jTable_DataActionPerformed
        // clear
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"ID", "First Name", "Last Name", "Phone", "Email"}));
        // refresh table
        client.fillClientJTable(jTable1);
    }//GEN-LAST:event_jButton_Refresh_jTable_DataActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        // delete the selected Client
        try {
                int id = Integer.valueOf(jTextFieldID.getText());
                
                 if(client.removeClient(id)){
                    JOptionPane.showMessageDialog(rootPane, "Client Deleted", "Remove Client", JOptionPane.INFORMATION_MESSAGE);
                
                } else{
                    JOptionPane.showMessageDialog(rootPane, "Client Not Deleted", "Remove Client Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage() + "- Enter the Client ID (number)", "Client ID Error", JOptionPane.ERROR_MESSAGE);
            }
        // clear
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"ID", "First Name", "Last Name", "Phone", "Email"}));
        // refresh table
        client.fillClientJTable(jTable1);
    }//GEN-LAST:event_jButtonRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(ManageClientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageClientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageClientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageClientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageClientsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButton_Refresh_jTable_Data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}
