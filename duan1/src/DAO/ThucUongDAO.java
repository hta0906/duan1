/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Class.Thucuong;
import JDBC.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Class.Menu;

/**
 *
 * @author Admin
 */
public class ThucUongDAO extends DuanDAO<Thucuong, String>{
    
//       private static ThucUongDAO instance;
//       
//       
//       public static ThucUongDAO getthucuong() {
//        if (instance == null) {
//            instance = new ThucUongDAO();      }
//        return instance;
//    }
       
      final String SELECT_ALL_SQL = "SELECT *FROM THUCUONG ";
      final String SELECT_BY_ID_SQL = "select*from THUCUONG where TENMON=?";
      final String SELECT_TongTien = "SELECT ThucUong.TENMON, CHITIETHOADON.SOLUONG, ThucUong.DONGIA, CHITIETHOADON.SOLUONG*ThucUong.DONGIA AS tongTien FROM CHITIETHOADON, HOADON, ThucUong WHERE CHITIETHOADON.MAHOADON = HoaDon.MAHOADON AND CHITIETHOADON.MAMON = ThucUong.MAMON AND HoaDon.TrangThai = 1 AND HOADON.MABAN =?";
      
    @Override
    public void insert(Thucuong entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Thucuong entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Thucuong> selectALL() {
        return selectBysql(SELECT_ALL_SQL);
    }
    @Override
    public Thucuong selectByid(String tenTU) {
        List<Thucuong>list=selectBysql(SELECT_BY_ID_SQL, tenTU);
        if (list.isEmpty()) {
            return null;   
        }
        return list.get(0); 
    }

    @Override
    public List<Thucuong> selectBysql(String sql, Object... args) {
        List<Thucuong> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                Thucuong entity = new Thucuong();
                entity.setMAMON(rs.getString("MAMON"));
                entity.setTENMON(rs.getString("TENMON"));
                entity.setMALOAIMON(rs.getString("MALOAIMON"));
                entity.setDONGIA(rs.getInt("DONGIA"));
                entity.setDVT(rs.getString("DVT"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
   
}

    
//     public List<Menu>getlistTable (int id) {
//     List<Menu> list = ;
////        try {
////            ResultSet rs = JDBCHelper.query(sql, args);
////            while (rs.next()) {
////                Menu entity = new Menu(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));     
////                list.add(entity);
////            }
////        } catch (Exception e) {
////            throw new RuntimeException();
////        }
////        return list;
////     }
    }
    
