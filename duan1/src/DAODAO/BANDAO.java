/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAODAO;

import DTO.DatBan;
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
public class BANDAO {
     private static BANDAO instance;

    public BANDAO() {
    }

    public static BANDAO getInstance() {
        if (instance == null) {
            instance = new BANDAO();
        }
        return instance;
    }

    public static void setInstance(BANDAO instance) {
        BANDAO.instance = instance;
    }
     public List<DatBan> LoadListTables() {
        List<DatBan> listTable = new ArrayList<DatBan>();

        Connection con = JDBCUitil .ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM BAN");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                DatBan tables = new DatBan(rs.getInt(1),rs.getString(2) );
                listTable.add(tables);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BANDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listTable;
    }
    
}
