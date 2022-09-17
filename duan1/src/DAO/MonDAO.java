/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Class.Mon;
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
public class MonDAO {
    private static MonDAO instance;
    
    public MonDAO() {
    }
    
    public static MonDAO getInstance() {
        if (instance == null) {
            instance = new MonDAO();
        }
        return instance;
    }
    
    public List<Mon> GetListDrink() {
        List<Mon> list = new ArrayList<Mon>();
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ThucUong");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Mon drinks = new Mon(rs.getInt(1), rs.getInt(3), rs.getString(2), rs.getDate(4), rs.getDate(5));
                list.add(drinks);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
