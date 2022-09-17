/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAODAO;

import DTO.Nhanvien;
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
public class NhanVienDAO {
    private static  NhanVienDAO NV;
    Nhanvien NhanV=new Nhanvien();

    public NhanVienDAO() {
    }
    
       public static NhanVienDAO getInstance() {
        if (NV == null) {
            NV = new NhanVienDAO();
        }
        return NV;
    }

    public static void setInstance(NhanVienDAO instance) {
        NhanVienDAO.NV = instance;
    }
       public Nhanvien GetNhanVien() {
        return NhanV;
    }
          public List<Nhanvien> listAccount() {
        List<Nhanvien> list = new ArrayList<Nhanvien>();
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT *FROM NHANVIEN");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Nhanvien account = new Nhanvien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBoolean(4));
                list.add(account);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
