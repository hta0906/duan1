/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ThongBao {
    //thong bao cho ng dung
    public  static void alert(Component parent,String message){
        JOptionPane.showMessageDialog(parent, message,"Hệ Thống Quản Lý",JOptionPane.INFORMATION_MESSAGE);
}
        //hien thi thong bao va yeu cau xac nhan
     public static boolean confirm(Component parent, String message) {
        int result = JOptionPane.showConfirmDialog(parent, message, "Hệ thống quản lý ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
}
    //hien thi thong bao va yeu cau nhap du lieu
    public  static  String promt(Component parent,String message){
        return JOptionPane.showInputDialog(parent, message,"Hệ Thống Quản Lý",
                JOptionPane.INFORMATION_MESSAGE);
    } 
     
}
