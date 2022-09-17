/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Khachhang {
  public  String  TENKHACHHANG ,EMAIL ;
public int SDT ;
    Date  NGAYTHEM ;

    public Khachhang() {
    }

    public Khachhang(String TENKHACHHANG, String EMAIL, int SDT, Date NGAYTHEM) {
        this.TENKHACHHANG = TENKHACHHANG;
        this.EMAIL = EMAIL;
        this.SDT = SDT;
        this.NGAYTHEM = NGAYTHEM;
    }

    public String getTENKHACHHANG() {
        return TENKHACHHANG;
    }

    public void setTENKHACHHANG(String TENKHACHHANG) {
        this.TENKHACHHANG = TENKHACHHANG;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public Date getNGAYTHEM() {
        return NGAYTHEM;
    }

    public void setNGAYTHEM(Date NGAYTHEM) {
        this.NGAYTHEM = NGAYTHEM;
    }
    
    
    
}
