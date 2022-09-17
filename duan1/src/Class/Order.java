/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Admin
 */
public class Order {
    public  int IDMENU ,
  IDTC ,
  SoLuong ,
  IDHD ;

    public Order() {
    }

    public Order(int IDMENU, int IDTC, int SoLuong, int IDHD) {
        this.IDMENU = IDMENU;
        this.IDTC = IDTC;
        this.SoLuong = SoLuong;
        this.IDHD = IDHD;
    }

    public int getIDMENU() {
        return IDMENU;
    }

    public void setIDMENU(int IDMENU) {
        this.IDMENU = IDMENU;
    }

    public int getIDTC() {
        return IDTC;
    }

    public void setIDTC(int IDTC) {
        this.IDTC = IDTC;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getIDHD() {
        return IDHD;
    }

    public void setIDHD(int IDHD) {
        this.IDHD = IDHD;
    }
    
}
