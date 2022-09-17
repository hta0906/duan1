/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import DTO.DatBan;
import DTO.Thucuong;
import DAODAO.BANDAO;
import DAODAO.HoaDonDAO;
import DAODAO.NhanVienDAO;
import DAODAO.NuocDAO;
import DAODAO.OrderDAO;
import DAODAO.menuDAO;
import DTO.Menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class banHang extends javax.swing.JFrame {
 int idTable = -1;
        DefaultComboBoxModel<Thucuong> comboBoxModel;
        DefaultTableModel tableModelTables;
        DefaultTableModel tableModelDrinks;
        int totalPrice = 0;
    /**
     * Creates new form banHang
     */
    public banHang() {
        initComponents();
      txtDisplay.setText("Xin chao: " + NhanVienDAO.getInstance().GetNhanVien().getTENNHANVIEN());
                tableModelTables = new DefaultTableModel();
                tableModelTables.addColumn("STT");
                tableModelTables.addColumn("Tên bàn");
                tableModelTables.addColumn("Trạng thái");
                tableModelTables.addColumn("Ghi chú");
                tblTables.setModel(tableModelTables);
                 tableModelDrinks = new DefaultTableModel();
                tableModelDrinks.addColumn("STT");
                tableModelDrinks.addColumn("Tên đồ uống");
                tableModelDrinks.addColumn("Giá");
                tableModelDrinks.addColumn("Số lượng");
                tableModelDrinks.addColumn("Thành tiền");
                tblOrder.setModel(tableModelDrinks);
                comboBoxModel = new DefaultComboBoxModel<>();
                
                cboDrinks.setModel(comboBoxModel);
                
                filltable();
                loadNC();
    }
private  void filltable(){
    tableModelTables.setRowCount(0);
    List<DatBan> list= BANDAO.getInstance().LoadListTables();
    for (int i = 0; i < list.size(); i++) {
        DatBan ban=list.get(i);
        Object[] dt={i+1,ban.getMABAN(),ban.getTRANGTHAI()};
        tableModelTables.addRow(dt);
        
    }
}
private void filltablenc(){
     tableModelDrinks.setRowCount(0);

                List<Menu> listMenu = menuDAO.getInstance().GetListMenuByTableId(idTable);
                for (int i = 0; i < listMenu.size(); i++) {
                        Menu menu = listMenu.get(i);
                        Object[] dt = {i + 1, menu.getTenNuoc(), menu.getGia(), menu.getSoLuong(), menu.getTongTien()};
                        totalPrice += menu.getTongTien();
                        tableModelDrinks.addRow(dt);
                }
                txtTotalPrice.setText(totalPrice + "");
}

private  void loadNC(){
    List<Thucuong> list= NuocDAO.getInstance().GetListDrink();
    for (Thucuong thucuong : list) {
        comboBoxModel.addElement(thucuong);
        
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnPay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTables = new javax.swing.JTable();
        txtDisplay = new javax.swing.JLabel();
        cboDrinks = new javax.swing.JComboBox();
        btnAdd = new javax.swing.JButton();
        spnAmount = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblOrder);

        btnPay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/floppy-disk (1).png"))); // NOI18N
        btnPay.setText("Thanh toán");
        btnPay.setEnabled(false);
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tổng tiền");

        txtTotalPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalPrice.setText("0");
        txtTotalPrice.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Quản lý bán hàng");

        btnHome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Go Back_50px.png"))); // NOI18N
        btnHome.setText("Quay lại");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        tblTables.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTables);

        txtDisplay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDisplay.setText("jLabel3");

        cboDrinks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDrinksActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/plus.png"))); // NOI18N
        btnAdd.setText("Thêm đồ uống");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        spnAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spnAmount.setValue(1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPay)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
       
 
           
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed

//        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void tblTablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablesMouseClicked
        // TODO add your handling code here:
        int row = tblTables.getSelectedRow();
            btnAdd.setEnabled(true);
            if ((tblTables.getValueAt(row, 1) + "").equals("còn")) {
                    btnPay.setEnabled(true);
            } else {
                    btnPay.setEnabled(false);
            }
            List<DatBan> listTable = BANDAO.getInstance().LoadListTables();
            idTable = listTable.get(row).getMABAN();
            filltablenc();
    }//GEN-LAST:event_tblTablesMouseClicked

    private void cboDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDrinksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDrinksActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int invoiceId = HoaDonDAO.getInstance().GetUncheckInvoiceByTableId(idTable);
            Thucuong drinks = (Thucuong) cboDrinks.getSelectedItem();
            if (invoiceId == -1) {
                    HoaDonDAO.getInstance().(idTable, NhanVienDAO.getInstance().GetNhanVien().getTENNHANVIEN());
                    OrderDAO.getInstance().Insert(drinks.getMAMON(), InvoicesDAO.getInstance().GetMaxIdInvoice(), Integer.parseInt(spnAmount.getValue().toString()));
            } else {
                    OrdersDAO.getInstance().Insert(drinks.getId(), invoiceId, Integer.parseInt(spnAmount.getValue().toString()));
            }
            Connection con = DBUtility.openConnection();
            PreparedStatement pstmt;
            try {
                    pstmt = con.prepareStatement("update tables set status=1 where ID=?");
                    pstmt.setInt(1, idTable);
                    pstmt.executeUpdate();
                    displayTables();
                    displayTableDrinks();
                    btnPay.setEnabled(true);
                    cboDrinks.setSelectedIndex(0);
            } catch (SQLException ex) {
                    Logger.getLogger(QuanLyThucDon.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(banHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(banHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(banHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(banHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new banHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPay;
    private javax.swing.JComboBox cboDrinks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spnAmount;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblTables;
    private javax.swing.JLabel txtDisplay;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
