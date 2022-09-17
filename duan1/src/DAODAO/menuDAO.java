/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAODAO;

import DTO.Menu;
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
public class menuDAO {
     private static menuDAO instance;
    public menuDAO() {
    }
     public static menuDAO getInstance() {
        if (instance == null) {
            instance = new menuDAO();
        }
        return instance;
    }

    public static void setInstance(menuDAO instance) {
        menuDAO.instance = instance;
    }

    public List<Menu> GetListMenuByTableId(int id) {
        List<Menu> list = new ArrayList<Menu>();
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT ThucUong.TENMON, CHITIETHOADON.SOLUONG, ThucUong.DONGIA, CHITIETHOADON.SOLUONG*ThucUong.DONGIA AS tongTien FROM CHITIETHOADON, HOADON, ThucUong WHERE CHITIETHOADON.MAHOADON = HoaDon.MAHOADON AND CHITIETHOADON.MAMON = ThucUong.MAMON AND HoaDon.TrangThai = 0 AND HOADON.MABAN =?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Menu menu = new Menu(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
                list.add(menu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(menuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
