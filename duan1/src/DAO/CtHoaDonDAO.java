/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Class.ChiTiethoadon;
import JDBC.JDBCHelper;
import JDBC.JDBCUitil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class CtHoaDonDAO {
    
      private static CtHoaDonDAO instance;

    public CtHoaDonDAO() {
    }
      
      public static CtHoaDonDAO getInstance() {
        if (instance == null) {
            instance = new CtHoaDonDAO();
        }
        return instance;
    } 
     public List<ChiTiethoadon> ListOrder(String MACHITIETHOADON) {
        List<ChiTiethoadon> list = new ArrayList<ChiTiethoadon>();
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM CHITIETHOADON WHERE MAHOADON = ?");
            pstmt.setString(1, MACHITIETHOADON);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ChiTiethoadon orders = new ChiTiethoadon(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4),rs.getInt(5));
                list.add(orders);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CtHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    } 
      public Boolean Insert(String MAMON, String MAHOADON, int  SOLUONG) {
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO CHITIETHOADON(MAMON, SOLUONG, MAHOADON) VALUES (?,?,?)");
            pstmt.setString(1, MAMON);
            pstmt.setInt(2, SOLUONG);
            pstmt.setString(3, MAHOADON);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThucUongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
