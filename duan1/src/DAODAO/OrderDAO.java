/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAODAO;

import DTO.Order;
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
public class OrderDAO {
      private static OrderDAO ODr;

    public OrderDAO() {
    }

    public static OrderDAO getInstance() {
        if (ODr == null) {
            ODr = new OrderDAO();
        }
        return ODr;
    }

    public List<Order> ListOrder(int id) {
        List<Order> list = new ArrayList<Order>();
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Odrder WHERE MAHOADON = ?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Order orders = new Order(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
                list.add(orders);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
     public Boolean Insert(String monId, String hdId, int count) {
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("insert into Odrder(idOrder,MAMON,SoLuong,MAHOADON) values(?,?,?,?)");
            pstmt.setString(1, monId);
            pstmt.setInt(2, count);
            pstmt.setString(3, hdId);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
//            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
