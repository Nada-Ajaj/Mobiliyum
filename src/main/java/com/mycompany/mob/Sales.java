/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mob;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.*;
import oracle.jdbc.pool.*;
import oracle.sql.*;

/**
 *
 * @author NADA
 */
public class Sales extends javax.swing.JFrame {
     Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    DefaultTableModel model=new DefaultTableModel();

    /**
     * Creates new form Selling
     */
    public Sales() {
        initComponents();
        setLocationRelativeTo(null);
        Object cul[]={"CID","PID","Discount","Total_price"};
        model.setColumnIdentifiers(cul);
        jTable1.setModel(model);
        
     
        
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextdisc = new javax.swing.JTextField();
        jTextprice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextCID = new javax.swing.JTextField();
        jTextPID = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextsearch = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 36)); // NOI18N
        jLabel1.setText("Sales");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(438, 438, 438)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(434, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 80));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 100, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 580, 110, -1));

        jTable1.setBackground(new java.awt.Color(153, 153, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer_id", "Product_id", "Discount", "Total_price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 990, 240));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\NADA\\Documents\\NetBeansProjects\\mob\\src\\main\\java\\com\\mycompany\\mob\\image\\icons8-account.gif")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 210, 200));

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 255));
        jButton3.setText("Add new sale");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Customer_id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Product_id");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        jTextdisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdiscActionPerformed(evt);
            }
        });
        jPanel1.add(jTextdisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 90, -1));
        jPanel1.add(jTextprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Discount");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Total_price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, 30));
        jPanel1.add(jTextCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 90, -1));
        jPanel1.add(jTextPID, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 110, -1));

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 255));
        jButton5.setText("Show");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 110, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 255));
        jButton4.setText("Search");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "customer_id", "product_id", "discount", "total_price" }));
        jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\NADA\\Documents\\NetBeansProjects\\mob\\src\\main\\java\\com\\mycompany\\mob\\image\\search.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(17, 17, 17)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
     public void updatetable(){
     
                  try{
             String sql="Select CID,PID,Discount,Total_price from Sales";
             DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
             String url="jdbc:oracle:thin:@localhost:1522:orcl";
             con=DriverManager.getConnection(url,"mob","mob");
             pst=con.prepareStatement(sql);
             rs=pst.executeQuery();
             Object[] columnData=new Object[4];
             
             while(rs.next()){
               columnData[0]=rs.getInt("CID");
               columnData[1]=rs.getInt("PID");
               columnData[2]=rs.getFloat("Discount");
               columnData[3]=rs.getFloat("Total_price");
               model.addRow(columnData);
             }
             
         }
        catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
        
     } 
     
 }
    private void jTextdiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdiscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdiscActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        addSales s=new addSales();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel imodel=(DefaultTableModel) jTable1.getModel();
         if(jTable1.getSelectedRow()==-1){
            if(jTable1.getRowCount()==0){
                 JOptionPane.showMessageDialog(null, "No data to deleted",
                         "Delete Sales",JOptionPane.OK_OPTION);
            }
            else{
                JOptionPane.showMessageDialog(null, "Select a row to delete ",
                        "Delete Sales",JOptionPane.OK_OPTION);
            }
        }
         else{
             try{
                 
             DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
             String url="jdbc:oracle:thin:@localhost:1522:orcl";
             con=DriverManager.getConnection(url,"mob","mob");
             int i=jTable1.getSelectedRow();
             int s=Integer.parseInt(jTable1.getValueAt(i, 0).toString());
             int n=Integer.parseInt(jTable1.getValueAt(i, 1).toString());
             String sql="Delete from Sales where CID='"+s+"'";
             pst=con.prepareStatement(sql);
             rs=pst.executeQuery();
             
             /*while(rs.next()){
                 if(String.valueOf(rs.getInt("ID")).equals(model.getValueAt(i, 0))){
                     rs.deleteRow();
                 }
             }*/
             imodel.removeRow(jTable1.getSelectedRow());
             pst.executeUpdate();
            rs.close();
            pst.close();
             }
             catch(Exception e){
                 JOptionPane.showMessageDialog(null,e);
             }
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        updatetable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mod=(DefaultTableModel) jTable1.getModel();
         mod.setRowCount(0);
        int s=jComboBox1.getSelectedIndex();
      
        if(s==0){
       
        try{
            int i=Integer.parseInt(jTextsearch.getText());
            String sql="Select CID,PID,Discount,Total_price from Sales where cid='"+i+"'";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
             String url="jdbc:oracle:thin:@localhost:1522:orcl";
             con=DriverManager.getConnection(url,"mob","mob");
             pst=con.prepareStatement(sql);
             rs=pst.executeQuery();
             Object[] columnData=new Object[4];
             
             while(rs.next()){
               columnData[0]=rs.getInt("CID");
               columnData[1]=rs.getInt("PID");
               columnData[2]=rs.getFloat("Discount");
               columnData[3]=rs.getFloat("Total_price");
               mod.addRow(columnData);
             }
             jTextsearch.setText("");
             pst.close();
             rs.close();
        }
      catch(HeadlessException|SQLException e){
         JOptionPane.showMessageDialog(null, e);
     }
        }    
        else if(s==1){
       
        try{
            int i=Integer.parseInt(jTextsearch.getText());
            String sql="Select CID,PID,Discount,Total_price from Sales where pid='"+i+"'";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
             String url="jdbc:oracle:thin:@localhost:1522:orcl";
             con=DriverManager.getConnection(url,"mob","mob");
             pst=con.prepareStatement(sql);
             rs=pst.executeQuery();
             Object[] columnData=new Object[4];
             
             while(rs.next()){
               columnData[0]=rs.getInt("CID");
               columnData[1]=rs.getInt("PID");
               columnData[2]=rs.getFloat("Discount");
               columnData[3]=rs.getFloat("Total_price");
               mod.addRow(columnData);
             }
             jTextsearch.setText("");
             pst.close();
             rs.close();
        }
      catch(HeadlessException|SQLException e){
         JOptionPane.showMessageDialog(null, e);
     }
        }    
        else if(s==2){
       
        try{
            Float i=Float.parseFloat(jTextsearch.getText());
            String sql="Select CID,PID,Discount,Total_price from Sales where discount='"+i+"'";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
             String url="jdbc:oracle:thin:@localhost:1522:orcl";
             con=DriverManager.getConnection(url,"mob","mob");
             pst=con.prepareStatement(sql);
             rs=pst.executeQuery();
             Object[] columnData=new Object[4];
             
             while(rs.next()){
               columnData[0]=rs.getInt("CID");
               columnData[1]=rs.getInt("PID");
               columnData[2]=rs.getFloat("Discount");
               columnData[3]=rs.getFloat("Total_price");
               mod.addRow(columnData);
             }
             jTextsearch.setText("");
             pst.close();
             rs.close();
        }
      catch(HeadlessException|SQLException e){
         JOptionPane.showMessageDialog(null, e);
     }
        }    
        else {
       
        try{
            Float i=Float.parseFloat(jTextsearch.getText());
            String sql="Select CID,PID,Discount,Total_price from Sales where tottal_price='"+i+"'";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
             String url="jdbc:oracle:thin:@localhost:1522:orcl";
             con=DriverManager.getConnection(url,"mob","mob");
             pst=con.prepareStatement(sql);
             rs=pst.executeQuery();
             Object[] columnData=new Object[4];
             
             while(rs.next()){
               columnData[0]=rs.getInt("CID");
               columnData[1]=rs.getInt("PID");
               columnData[2]=rs.getFloat("Discount");
               columnData[3]=rs.getFloat("Total_price");
               mod.addRow(columnData);
             }
             jTextsearch.setText("");
             pst.close();
             rs.close();
        }
      catch(HeadlessException|SQLException e){
         JOptionPane.showMessageDialog(null, e);
     }
        }    
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCID;
    private javax.swing.JTextField jTextPID;
    private javax.swing.JTextField jTextdisc;
    private javax.swing.JTextField jTextprice;
    private javax.swing.JTextField jTextsearch;
    // End of variables declaration//GEN-END:variables
}