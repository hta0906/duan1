/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Class.Khachhang;
import JDBC.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhachHangDAO {
    
    public List<Khachhang> selectBySQL(String sql,Object...args){
        List<Khachhang>list=new ArrayList<>();
        try {
            ResultSet rs=JDBCHelper.query(sql, args);
            while (rs.next()) {                
                Khachhang entity=new Khachhang();
                entity.setTENKHACHHANG(rs.getString("TENKHACHHANG"));
                entity.setEMAIL(rs.getString("EMAIL"));
                entity.setSDT(rs.getInt("SDT"));
                entity.setNGAYTHEM(rs.getDate("NGAYTHEM"));
                
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }
    
    public void insert(Khachhang entity){
       String sql="insert into KhachHang(TENKHACHHANG,EMAIL,SDT,NGAYTHEM)values(?,?,?,?)";
       JDBCHelper.update(sql, entity.getTENKHACHHANG(),entity.getEMAIL(),entity.getSDT(),entity.getNGAYTHEM());
       
    }
    public void update(Khachhang entity){
         String sql="update KhachHang EMAIL=?,SDT=?,NGAYTHEM=? where TENNHANVIEN=?";
       JDBCHelper.update(sql, entity.getEMAIL(),entity.getSDT(),entity.getNGAYTHEM(),entity.getTENKHACHHANG());
        
    }
    public void delete(String TENNHANVIEN){
        String sql="delete from KhachHang where TENNHANVIEN=?";
        JDBCHelper.update(sql, TENNHANVIEN);
    }
    
    public List<Khachhang> selectALL(){
        String sql="select*from KhachHang";
        return  selectBySQL(sql);
    }
    public Khachhang selectbyID(String Id){
        List<Khachhang>list=selectBySQL(Id, Id);
        if (list.isEmpty()) {
            return null;
            
        }
        return list.get(0);
    }
    
}
