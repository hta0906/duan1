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
public class Khuyenmai {

    public String MAGIAMGIA, TENGIAMGIA, GHICHU;
    public int GIAMGIA;
    Date BATDAU;
    Date KETTHUC;

    public Khuyenmai() {
    }

    public Khuyenmai(String MAGIAMGIA, String TENGIAMGIA, String GHICHU, int GIAMGIA, Date BATDAU, Date KETTHUC) {
        this.MAGIAMGIA = MAGIAMGIA;
        this.TENGIAMGIA = TENGIAMGIA;
        this.GHICHU = GHICHU;
        this.GIAMGIA = GIAMGIA;
        this.BATDAU = BATDAU;
        this.KETTHUC = KETTHUC;
    }

    public String getMAGIAMGIA() {
        return MAGIAMGIA;
    }

    public void setMAGIAMGIA(String MAGIAMGIA) {
        this.MAGIAMGIA = MAGIAMGIA;
    }

    public String getTENGIAMGIA() {
        return TENGIAMGIA;
    }

    public void setTENGIAMGIA(String TENGIAMGIA) {
        this.TENGIAMGIA = TENGIAMGIA;
    }

    public String getGHICHU() {
        return GHICHU;
    }

    public void setGHICHU(String GHICHU) {
        this.GHICHU = GHICHU;
    }

    public int getGIAMGIA() {
        return GIAMGIA;
    }

    public void setGIAMGIA(int GIAMGIA) {
        this.GIAMGIA = GIAMGIA;
    }

    public Date getBATDAU() {
        return BATDAU;
    }

    public void setBATDAU(Date BATDAU) {
        this.BATDAU = BATDAU;
    }

    public Date getKETTHUC() {
        return KETTHUC;
    }

    public void setKETTHUC(Date KETTHUC) {
        this.KETTHUC = KETTHUC;
    }

    @Override
    public String toString() {
        return this.MAGIAMGIA;
    }

}
