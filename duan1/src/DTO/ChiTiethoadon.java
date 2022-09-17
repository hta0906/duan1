/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Admin
 */
public class ChiTiethoadon {
    public String MACHITIETHOADON ,
MAHOADON ,
MAMON ;
public  int SOLUONG ,GIA ;

    public ChiTiethoadon() {
    }

    public ChiTiethoadon(String MACHITIETHOADON, String MAHOADON, String MAMON, int SOLUONG, int GIA) {
        this.MACHITIETHOADON = MACHITIETHOADON;
        this.MAHOADON = MAHOADON;
        this.MAMON = MAMON;
        this.SOLUONG = SOLUONG;
        this.GIA = GIA;
    }

    public String getMACHITIETHOADON() {
        return MACHITIETHOADON;
    }

    public void setMACHITIETHOADON(String MACHITIETHOADON) {
        this.MACHITIETHOADON = MACHITIETHOADON;
    }

    public String getMAHOADON() {
        return MAHOADON;
    }

    public void setMAHOADON(String MAHOADON) {
        this.MAHOADON = MAHOADON;
    }

    public String getMAMON() {
        return MAMON;
    }

    public void setMAMON(String MAMON) {
        this.MAMON = MAMON;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public int getGIA() {
        return GIA;
    }

    public void setGIA(int GIA) {
        this.GIA = GIA;
    }


}
