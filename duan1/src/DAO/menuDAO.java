/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Class.Menu;
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
            PreparedStatement pstmt = con.prepareStatement(" SELECT ThucUong.TenNC, Menu.SoLuong, ThucUong.Gia, Menu.SoLuong*ThucUong.Gia AS tongTien FROM Menu, HoaDon, ThucUong WHERE Menu.IDHD = HoaDon.IDHD AND Menu.IDTC = ThucUong.IDTC AND HoaDon.TrangThai = 0 AND HoaDon.IDBAN = ?");
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
