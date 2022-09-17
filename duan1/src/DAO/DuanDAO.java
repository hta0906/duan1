/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author Admin
 */
public abstract class DuanDAO <EntityType,KeyType>{
     public  abstract  void insert(EntityType entity);
    public  abstract  void update(EntityType entity);
    public  abstract  void delete(KeyType id);
    
    public  abstract  List<EntityType> selectALL();
    public  abstract  EntityType selectByid(KeyType id);
    public  abstract  List<EntityType> selectBysql(String sql, Object...args);
}
