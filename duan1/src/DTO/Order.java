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
public class Order {
    public  int IDMENU ;
            public String MAMON;
   public  int SoLuong ;
    public String MAHOADON;

    public Order() {
    }

    public Order(int IDMENU, String MAMON, int SoLuong, String MAHOADON) {
        this.IDMENU = IDMENU;
        this.MAMON = MAMON;
        this.SoLuong = SoLuong;
        this.MAHOADON = MAHOADON;
    }

    public int getIDMENU() {
        return IDMENU;
    }

    public void setIDMENU(int IDMENU) {
        this.IDMENU = IDMENU;
    }

    public String getMAMON() {
        return MAMON;
    }

    public void setMAMON(String MAMON) {
        this.MAMON = MAMON;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getMAHOADON() {
        return MAHOADON;
    }

    public void setMAHOADON(String MAHOADON) {
        this.MAHOADON = MAHOADON;
    }

   
}