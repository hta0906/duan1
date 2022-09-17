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
public class invoice {
    public  int IDHD  ,
 IDNV ,IDBAN, TrangThai, TongTien;
    Date GioDen ;

    public invoice() {
    }

    public invoice(int IDHD, int IDNV, int IDBAN, int TrangThai, int TongTien, Date GioDen) {
        this.IDHD = IDHD;
        this.IDNV = IDNV;
        this.IDBAN = IDBAN;
        this.TrangThai = TrangThai;
        this.TongTien = TongTien;
        this.GioDen = GioDen;
    }

    public int getIDHD() {
        return IDHD;
    }

    public void setIDHD(int IDHD) {
        this.IDHD = IDHD;
    }

    public int getIDNV() {
        return IDNV;
    }

    public void setIDNV(int IDNV) {
        this.IDNV = IDNV;
    }

    public int getIDBAN() {
        return IDBAN;
    }

    public void setIDBAN(int IDBAN) {
        this.IDBAN = IDBAN;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public Date getGioDen() {
        return GioDen;
    }

    public void setGioDen(Date GioDen) {
        this.GioDen = GioDen;
    }
    
    
   
    
}
