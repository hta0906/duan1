/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Class.HoaDon;
import JDBC.JDBCHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class HoaDonDAO extends DuanDAO<HoaDon, Integer> {

    final String SELECT_ALL_SQL = "SELECT *FROM HOADON";
    final String insert = " insert into HOADON (MAHOADON,MAGIAMGIA,MABAN,GIODEN,TRANGTHAI,TONGTIEN,MANHANVIEN) values(?,?,?,?,?,?,?)";
    final String update = "update HOADON set TRANGTHAI=?,TONGTIEN=? where MAHOADON=?";
    final String SELECT_SQL_BY_trangthai = "SELECT * FROM HOADON WHERE MABAN = ? AND TRANGTHAI = ?";
   final String SELECT_max_SQL = "SELECT MAX(MAHOADON) FROM HOADON";
    @Override
    public void insert(HoaDon entity) {
        JDBCHelper.update(insert, entity.getMAHOADON(), entity.getMAGIAMGIA(), entity.getMABAN(), entity.getGIODEN(), entity.getTRANGTHAI(), entity.getMANHANVIEN());
    }

    @Override
    public void update(HoaDon entity) {
       
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HoaDon> selectALL() {
        return selectBysql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDon selectByid(Integer id) {
        List<HoaDon> list = selectBysql(SELECT_SQL_BY_trangthai, id);
        if (list.isEmpty()) {
            return null;

        }
        return list.get(0);
    }

    @Override
    public List<HoaDon> selectBysql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                HoaDon entity = new HoaDon();
                entity.setMAHOADON(rs.getInt("MAHOADON"));
                entity.setMAGIAMGIA(rs.getString("MAGIAMGIA"));
                entity.setMABAN(rs.getString("MABAN"));
                entity.setGIODEN(rs.getDate("MAGIAMGIA"));
                entity.setTRANGTHAI(rs.getString("TRANGTHAI"));
                  entity.setTONGTIEN(rs.getInt("TONGTIEN"));
                entity.setMANHANVIEN(rs.getString("MANHANVIEN"));
                list.add(entity);

            }

        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;

    }

    private static HoaDonDAO VD;

    public HoaDonDAO() {
    }

    public static HoaDonDAO getVD() {
        if (VD == null) {
            VD = new HoaDonDAO();
        }
        return VD;
    }
    public boolean updateT(int id,int Tongtien){
        try {
            Connection conn=null;
            PreparedStatement ptm=conn.prepareStatement(update);
            ptm.setInt(1, Tongtien);
            ptm.setInt(2, id);
            ptm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public  int getMaxHD(){
        try {
            Connection conn=null;
            PreparedStatement ptm=conn.prepareStatement(SELECT_max_SQL);
            ResultSet rs=ptm.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
    
   public Boolean InsertT(int id, String IdNV) {
      
        try {
            Connection conn=null;
            Statement stmt = conn.createStatement();
            int i = stmt.executeUpdate("INSERT INTO HOADON(MANHANVIEN, MABAN, TRANGTHAI) VALUES ('" + IdNV + "','" + id + "',0)");
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return false;
    }
//    public int GetUncheckInvoiceByTableId(int id) {
//        Connection con=JDBCHelper.
//    }
   
   

}
