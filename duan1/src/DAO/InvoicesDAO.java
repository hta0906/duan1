/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.JDBCUitil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.QuanLyDatBanJf;

/**
 *
 * @author Admin
 */
public class InvoicesDAO {
    private static InvoicesDAO instance;
    
    public InvoicesDAO() {
    }
    
    public static InvoicesDAO getInstance() {
        if (instance == null) {
            instance = new InvoicesDAO();
        }
        return instance;
    }
    
  public int GetUncheckInvoiceByTableId(int id) {
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM HOADON WHERE IDBan = ? AND TRANGTHAI = ?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoicesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
  public Boolean Insert(int id, int IDNV) {
        Connection con = JDBCUitil.ketnoi();
        try {
            Statement stmt = con.createStatement();
            int i = stmt.executeUpdate("INSERT INTO HOADON(TenTK, IDBan, TrangThai) VALUES ('" + IDNV + "','" + id + "',0)");
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDatBanJf.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
  
   public int GetMaxIdInvoice() {
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT MAX(IDHD) FROM HoaDon");
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoicesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 1;
    }
   
   public void Update(int id, int totalPrice) {
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("update HOADON set TRANGTHAI=?,TONGTIEN=? where TenTK=?");
            pstmt.setInt(1, totalPrice);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
//                int i = pstmt.executeUpdate();
//                if (i > 0) {
//                }
        } catch (SQLException ex) {
            Logger.getLogger(InvoicesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
