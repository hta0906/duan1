/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Ngay {
    static final SimpleDateFormat formater=new SimpleDateFormat("dd/MM/yyyy");
    
     //chuyen doi string sang date
    public static  Date toDate(String date,String... patten){
        try {
            if (patten.length > 0) {
                    
                    formater.applyPattern(patten[0]);
                    
                }
                if (date == null) {
                    return Ngay.now();
                }
                System.out.println(date);
                return formater.parse(date);
        } catch (ParseException e) {
            throw  new RuntimeException(e);
        }
    }
    
     public static  Date now(){
        return new Date();
    }
     
      //chuyen doi date sang string
       public static String toString(Date date, String... pattern) {
            if (pattern.length > 0) {
                formater.applyPattern(pattern[0]);
            }
            if (date == null) {
                date = Ngay.now();
            }
            return formater.format(date);
        }
       
       // bo sung ngay vao time
    public  static  Date addDate(int days){
       Date now = Ngay.now();
            now.setTime(now.getTime() + days * 24 * 60 * 60 * 1000);
            return now;
    }
}
