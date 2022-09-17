/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import Class.Nhanvien;

/**
 *
 * @author Admin
 */
public class PhanQuyen {
    
    public static  Nhanvien user =null;
    
    public static  void clear(){//xoa thong tin khi dang xuat
        PhanQuyen.user=null;
    }
    //kiem tra xem da dang nhap chua
    public static  boolean isLogin(){
        return PhanQuyen.user !=null;
    }
    //thong bao
    
    public  static boolean isManager(){
        return PhanQuyen.isLogin() && user.isVAITRO();
    }
}
