/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Class.Nhanvien;
import JDBC.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AdminI
 */
public class NhanvienDAO {
    public List<Nhanvien> selectBySql(String sql,Object...args){
        List<Nhanvien> list =new ArrayList<>();
        try {
            ResultSet rs=JDBC.JDBCHelper.query(sql, args);
            while (rs.next()) {
              Nhanvien model=new Nhanvien();
              model.setMANHANVIEN(rs.getString("MANHANVIEN"));
              model.setMATKHAU(rs.getString("MATKHAU"));
              model.setTENNHANVIEN(rs.getString("TENNHANVIEN"));
              model.setVAITRO(rs.getBoolean("VAITRO"));
                list.add(model);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return  list;
    }
    
    
    public  void insert (Nhanvien entity){
        String sql="insert into NhanVien(MANHANVIEN,MATKHAU,TENNHANVIEN,VAITRO)values(?,?,?,?)";
        JDBCHelper.update(sql, entity.getMANHANVIEN(),entity.getMATKHAU(),entity.getTENNHANVIEN(),entity.isVAITRO());
    }
    
     public  void update (Nhanvien entity){
        String sql="update NhanVien set MATKHAU=?,TENNHANVIEN=?,VAITRO=? where MANHANVIEN=?";
        JDBCHelper.update(sql, entity.getMATKHAU(),entity.getTENNHANVIEN(),entity.isVAITRO(),entity.getMANHANVIEN());
     }
     
     public void delete(String MANHANVIEN){
         String sql="delete from NhanVien where MANHANVIEN=?";
         JDBCHelper.update(sql, MANHANVIEN);
         
     }
     
     public List<Nhanvien> selectAll(){
         String sql="select*from NhanVien";
         return selectAll();
         
     }
     
     public Nhanvien selectByID(String Id){
         String sql="select*from NhanVien where MANHANVIEN=?";
         List<Nhanvien> list=selectBySql(sql,Id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
         
     }
     
     
      private static NhanvienDAO vD;
    Nhanvien nv = new Nhanvien();
    
      public static  NhanvienDAO getInstance() {
        if (vD == null) {
            vD = new NhanvienDAO();
        }
        return vD;
    }
      public  Nhanvien getNV(){
          return nv;
      }
      
}
