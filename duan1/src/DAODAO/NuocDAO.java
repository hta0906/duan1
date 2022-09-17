/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAODAO;


import DTO.Thucuong;
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
public class NuocDAO {
      private static NuocDAO instance;
    
    public NuocDAO() {
    }
    
    public static NuocDAO getInstance() {
        if (instance == null) {
            instance = new NuocDAO();
        }
        return instance;
    }
    
    public List<Thucuong> GetListDrink() {
        List<Thucuong> list = new ArrayList<Thucuong>();
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ThucUong");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Thucuong drinks = new Thucuong(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
                list.add(drinks);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NuocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
