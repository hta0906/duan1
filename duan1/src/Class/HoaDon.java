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
public class HoaDon {
    public  int MAHOADON,TONGTIEN,TRANGTHAI;
   public String  MAGIAMGIA ,MABAN  ,MANHANVIEN ;
    Date GIODEN ;

    public HoaDon() {
        
        
    }

    public HoaDon(int MAHOADON, int TONGTIEN, String MAGIAMGIA, String MABAN, int TRANGTHAI, String MANHANVIEN, Date GIODEN) {
        this.MAHOADON = MAHOADON;
        this.TONGTIEN = TONGTIEN;
        this.MAGIAMGIA = MAGIAMGIA;
        this.MABAN = MABAN;
        this.TRANGTHAI = TRANGTHAI;
        this.MANHANVIEN = MANHANVIEN;
        this.GIODEN = GIODEN;
    }

    public int getMAHOADON() {
        return MAHOADON;
    }

    public void setMAHOADON(int MAHOADON) {
        this.MAHOADON = MAHOADON;
    }

    public int getTONGTIEN() {
        return TONGTIEN;
    }

    public void setTONGTIEN(int TONGTIEN) {
        this.TONGTIEN = TONGTIEN;
    }

    public String getMAGIAMGIA() {
        return MAGIAMGIA;
    }

    public void setMAGIAMGIA(String MAGIAMGIA) {
        this.MAGIAMGIA = MAGIAMGIA;
    }

    public String getMABAN() {
        return MABAN;
    }

    public void setMABAN(String MABAN) {
        this.MABAN = MABAN;
    }

    public int getTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setTRANGTHAI(int TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }

    public String getMANHANVIEN() {
        return MANHANVIEN;
    }

    public void setMANHANVIEN(String MANHANVIEN) {
        this.MANHANVIEN = MANHANVIEN;
    }

    public Date getGIODEN() {
        return GIODEN;
    }

    public void setGIODEN(Date GIODEN) {
        this.GIODEN = GIODEN;
    }
    
}

   