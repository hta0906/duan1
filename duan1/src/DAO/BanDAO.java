/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Class.DatBan;
import JDBC.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BanDAO extends DuanDAO<DatBan, Integer> {

    final String SELECT_ALL_SQL = "SELECT *FROM BAN";
    final String update = "UPDATE BAN set TRANGTHAI=? WHERE MABAN=?";

    @Override
    public void insert(DatBan entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(DatBan entity) {
       JDBCHelper.update(update, entity.getMABAN(),entity.getTRANGTHAI());
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DatBan> selectALL() {
return selectBysql(SELECT_ALL_SQL);
    }

    @Override
    public DatBan selectByid(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DatBan> selectBysql(String sql, Object... args) {
        List<DatBan> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                DatBan entity = new DatBan();
                entity.setMABAN(rs.getInt("MABAN"));
                entity.setTRANGTHAI(rs.getString("TRANGTHAI"));
                list.add(entity);

            }

        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;

    }

//      private static BanDAO instance;
//    public BanDAO(){
//        
//    }
//    public  static BanDAO getBan(){
//        if (instance==null) {
//            instance=new BanDAO();
//            
//        }
//        return instance;
//    }
//    
//    public static  void setBan(BanDAO insBanDAO){
//        BanDAO.instance=insBanDAO;
//    }
//    
//    public  List<DatBan> selectBysql(String sql, Object... args){
//        List<DatBan> listBan=new ArrayList<>();
//        try {
//              ResultSet rs = JDBCHelper.query(sql, args);
//              while (rs.next()) {
//                  DatBan entity=new DatBan();
//                  entity.setMABAN(rs.getString("MABAN"));
//                  entity.setTRANGTHAI(rs.getString("TRANGTHAI"));
//                  listBan.add(entity);
//                
//            }
//        } catch (Exception e) {
//            throw new RuntimeException();
//        }
//        return listBan;
//        
//    }
//    public List<DatBan> selectAll(){
//        String sql="select*from BAN";
//        return selectBysql(sql);
//    }
}
