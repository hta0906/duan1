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
public class Mon {
    public  int IDTC,Gia  ;
   public String TenNC ;
    Date NgayBD ,NgayKT;

    public Mon() {
    }

    public Mon(int IDTC, int Gia, String TenNC, Date NgayBD, Date NgayKT) {
        this.IDTC = IDTC;
        this.Gia = Gia;
        this.TenNC = TenNC;
        this.NgayBD = NgayBD;
        this.NgayKT = NgayKT;
    }

    public int getIDTC() {
        return IDTC;
    }

    public void setIDTC(int IDTC) {
        this.IDTC = IDTC;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public String getTenNC() {
        return TenNC;
    }

    public void setTenNC(String TenNC) {
        this.TenNC = TenNC;
    }

    public Date getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(Date NgayBD) {
        this.NgayBD = NgayBD;
    }

    public Date getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(Date NgayKT) {
        this.NgayKT = NgayKT;
    }
   
    
}
