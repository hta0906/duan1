/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Class.BAN;
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
public class tableDAO {
    private static tableDAO instance;

    public tableDAO() {
    }

    public static tableDAO getInstance() {
        if (instance == null) {
            instance = new tableDAO();
        }
        return instance;
    }

    public static void setInstance(tableDAO instance) {
        tableDAO.instance = instance;
    }
    
        public List<BAN> LoadListTables() {
        List<BAN> listTable = new ArrayList<BAN>();

        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Ban");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                BAN tables = new BAN(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4) == 0 ? "Còn trống" : "Đã đặt");
                listTable.add(tables);
            }
        } catch (SQLException ex) {
            Logger.getLogger(tableDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listTable;
    }
}
