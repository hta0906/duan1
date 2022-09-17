/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAODAO;

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
public class HoaDonDAO {
       private static HoaDonDAO instance;

    public HoaDonDAO() {
    }

    public static HoaDonDAO getInstance() {
        if (instance == null) {
            instance = new HoaDonDAO();
        }
        return instance;
    }
       public int GetUncheckInvoiceByTableId(String id) {
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM HOADON WHERE MABAN = ? AND TRANGTHAI = 0");
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
//                Invoices invoices = new Invoices(rs.getInt(1), rs.getInt(2), rs.getTimestamp(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
         public String GetMaxIdInvoice() {
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT MAX(ID) FROM `invoice`");
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return GetMaxIdInvoice();
    }
          public Boolean Insert(int id, int accountId) {
        Connection con = JDBCUitil.ketnoi();
        try {
            Statement stmt = con.createStatement();
            int i = stmt.executeUpdate("INSERT INTO `invoice`(`account_ID`, `tables_id`, `status`) VALUES ('" + accountId + "','" + id + "',0)");
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDatBanJf.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
