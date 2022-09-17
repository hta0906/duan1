/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Class.Nhanvien;
import Class.TaiKhoan;
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
public class AccountDAO {

    private static AccountDAO instance;
    TaiKhoan account = new TaiKhoan();

    public AccountDAO() {
    }

    public static AccountDAO getInstance() {
        if (instance == null) {
            instance = new AccountDAO();
        }
        return instance;
    }

    public static void setInstance(AccountDAO instance) {
        AccountDAO.instance = instance;
    }

    public Boolean Login(String TenTK, String Matkhau) {
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM NHANVIEN WHERE TENTK=? AND MATKHAU =?");
            pstmt.setString(1, TenTK);
            pstmt.setString(2, Matkhau);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                account.setIDNV(rs.getInt(1));
                account.setTenTK(rs.getString(2));
                account.setMatKhau(rs.getString(3));
                account.setTenNhanVien(rs.getString(4));
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public TaiKhoan GetAccount() {
        return account;
    }

    public List<TaiKhoan> listAccount() {
        List<TaiKhoan> list = new ArrayList<TaiKhoan>();
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM NHANVIEN");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                TaiKhoan account = new TaiKhoan(rs.getInt(1), rs.getString(2), rs.getString(4), rs.getString(3));
                list.add(account);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
     public Boolean Add( String TenTK, String MatKhau,String TenNhanVien ){
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO NHANVIEN(TenTK, MatKhau,TenNhanVien) VALUES (?,?,?)");
            pstmt.setString(1, TenTK);
            pstmt.setString(2, MatKhau);
            
            pstmt.setString(3, TenNhanVien);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     public Boolean Update(int IDNV, String TenNhanVien, String MatKhau) {
        Connection con = JDBCUitil.ketnoi();
        try {
            PreparedStatement pstmt = con.prepareStatement("UPDATE NHANVIEN SET MatKhau=?,TenNhanVien=? WHERE IDNV=?");
            pstmt.setString(1, MatKhau);
            pstmt.setString(2, TenNhanVien);
            pstmt.setInt(3, IDNV);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     
//     public Boolean Delete(String MANHANVIEN) {
//        Connection con = JDBCUitil.ketnoi();
//        try {
//            PreparedStatement pstmt = con.prepareStatement("Delete from NHANVIEN where MANHANVIEN=?");
//            pstmt.setString(1, MANHANVIEN);
//            int i = pstmt.executeUpdate();
//            if (i > 0) {
//                return true;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return false;
//    }

}
