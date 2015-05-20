/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import static Main.Author.malop;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
import Process.*;

/**
 *
 * @author tiendat
 */
public class Language extends javax.swing.JInternalFrame {
    public  static String sql ="SELECT * FROM quanlythuvien.ngonngu order by TenNgonNgu asc";
    public static String mann;
    
    public void ShowNN(){
        UpdateTable.LoadData(sql, TableNN);
        this.lbNN.setText(" Tổng số có "+this.TableNN.getRowCount()+" ngôn ngữ ");
        
    }
    public void ProcessNN(boolean  b){
        this.btAddNN.setEnabled(b);
        this.btDeleteNN.setEnabled(b);
        this.btEditNN.setEnabled(b);
        
    }

    /**
     * Creates new form Language
     */
    public Language() {
        initComponents();
        ShowNN();
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
        txtMaNN = new javax.swing.JTextField();
        txtTenNN = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableNN = new javax.swing.JTable();
        btAddNN = new javax.swing.JButton();
        btEditNN = new javax.swing.JButton();
        btDeleteNN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btSearchNN = new javax.swing.JButton();
        txtSearchNN = new javax.swing.JTextField();
        lbNN = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Quan ly phieu muon .png"))); // NOI18N
        jLabel1.setText("Mã Ngôn Ngữ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_ok.png"))); // NOI18N
        jLabel2.setText("Tên Ngôn Ngữ");

        TableNN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableNN.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TableNNAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        TableNN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableNNMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableNN);

        btAddNN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAddNN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/info.png"))); // NOI18N
        btAddNN.setText("Add");
        btAddNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddNNActionPerformed(evt);
            }
        });

        btEditNN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btEditNN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit_add.png"))); // NOI18N
        btEditNN.setText("Edit");
        btEditNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditNNActionPerformed(evt);
            }
        });

        btDeleteNN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btDeleteNN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/editdelete.png"))); // NOI18N
        btDeleteNN.setText("Delete");
        btDeleteNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteNNActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exit.gif"))); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dilai.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/kate.png"))); // NOI18N
        jButton3.setText("Nhập mới");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btSearchNN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSearchNN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search_48_1.png"))); // NOI18N
        btSearchNN.setText("Search");
        btSearchNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchNNActionPerformed(evt);
            }
        });

        lbNN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Letters32.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaNN, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(txtTenNN))
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btAddNN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addComponent(btEditNN, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(btDeleteNN, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(btSearchNN, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtSearchNN, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lbNN, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(500, 500, 500)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSearchNN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearchNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddNN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditNN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeleteNN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditNNActionPerformed
        // TODO add your handling code here:
        if(this.txtMaNN.getText().length()==0)
            JOptionPane.showMessageDialog(null,"ma tac gia khong duoc bo trong","thong bao",1);
        else 
            if(this.txtMaNN.getText().length()>10)
                JOptionPane.showMessageDialog(null,"ma tac gia khong duoc vuot qua 10 ki tu","thong bao",1);
        else
                if(this.txtTenNN.getText().length() ==0)
                    JOptionPane.showMessageDialog(null,"ten tac gia khong duoc bo trong","thong bao",1);
                else {
                    Language1.UpdateNN(malop,this.txtMaNN.getText().trim(), this.txtTenNN.getText());
                    ShowNN();
                    ProcessNN(false);
                };
        
    }//GEN-LAST:event_btEditNNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null,"bạn có chắc chắn muốn thoát chương trình hay không","thông báo ",2)==0)
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          ShowNN();
        ProcessNN(false);
        this.txtSearchNN.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TableNNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableNNMouseClicked
        // TODO add your handling code here:
         ProcessNN(true);
        this.btAddNN.setEnabled(false);
        try{
        int row = this.TableNN.getSelectedRow();
        String IDrow = (this.TableNN.getModel().getValueAt(row, 0).toString());
        String sql2="SELECT * FROM quanlythuvien.ngonngu where MaNgonNgu = '"+IDrow+"'";
        ResultSet rs = UpdateTable.ShowTextField(sql2);
        if(rs.next()){
            malop = rs.getString("MaNgonNgu");
            this.txtMaNN.setText(rs.getString("MaNgonNgu"));
            this.txtTenNN.setText((rs.getString("TenNgonNgu")));
            
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        
               
    }//GEN-LAST:event_TableNNMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         ProcessNN(false);
        this.btAddNN.setEnabled(true);
        this.txtMaNN.setText(null);
        this.txtTenNN.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btAddNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddNNActionPerformed
        // TODO add your handling code here:
         if(this.txtMaNN.getText().length()==0)
            JOptionPane.showMessageDialog(null,"ma lop khong duoc bo trong","thong bao",1);
        else 
            if(this.txtMaNN.getText().length()>10)
                JOptionPane.showMessageDialog(null,"ma tac gia khong duoc vuot qua 10 ki tu","thong bao",1);
        else
                if(this.txtTenNN.getText().length() ==0)
                    JOptionPane.showMessageDialog(null,"ten tac gia khong duoc bo trong","thong bao",1);
                else {
                    Language1.InsertNN(this.txtMaNN.getText().trim(),this.txtTenNN.getText());
                    ShowNN();
                    ProcessNN(false);
                }
    }//GEN-LAST:event_btAddNNActionPerformed

    private void btDeleteNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteNNActionPerformed
        // TODO add your handling code here:
        if(this.txtMaNN.getText().length()==0)
            JOptionPane.showMessageDialog(null,"ban can chon de xoa","thong bao",1);
        else
        {
            if(JOptionPane.showConfirmDialog(null,"ban co chac muon xoa ngon ngu  "+malop+"hay khong?","thong bao",2) ==0)
                Language1.DeleteNN(malop);
            ShowNN();
                    ProcessNN(false);
        }
    }//GEN-LAST:event_btDeleteNNActionPerformed

    private void btSearchNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchNNActionPerformed
        // TODO add your handling code here:
        if(this.txtSearchNN.getText().length()==0)
            JOptionPane.showMessageDialog(null,"bạn chưa nhập từ khóa cần tìm","thông báo",1);
        else
        {
            String sql1 = "SELECT * FROM quanlythuvien.ngonngu  where MaNgonNgu like '%" +this.txtSearchNN.getText()+"%' or TenNgonNgu like '%" +this.txtSearchNN.getText()+"%'";
            UpdateTable.LoadData(sql1, TableNN);
            this.lbNN.setText(" Có " +this.TableNN.getRowCount()+ " tên ngôn ngữ cần tìm ");
        }
       
    }//GEN-LAST:event_btSearchNNActionPerformed

    private void TableNNAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TableNNAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TableNNAncestorAdded

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableNN;
    private javax.swing.JButton btAddNN;
    private javax.swing.JButton btDeleteNN;
    private javax.swing.JButton btEditNN;
    private javax.swing.JButton btSearchNN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNN;
    private javax.swing.JTextField txtMaNN;
    private javax.swing.JTextField txtSearchNN;
    private javax.swing.JTextField txtTenNN;
    // End of variables declaration//GEN-END:variables
}
