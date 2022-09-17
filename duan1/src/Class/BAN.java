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
public class BAN {
    public int  IDBAN ;
    public  String TenBan,
  GhiChu ,
  TrangThai ;

    public BAN() {
    }

    public BAN(int IDBAN, String TenBan, String GhiChu, String TrangThai) {
        this.IDBAN = IDBAN;
        this.TenBan = TenBan;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public int getIDBAN() {
        return IDBAN;
    }

    public void setIDBAN(int IDBAN) {
        this.IDBAN = IDBAN;
    }

    public String getTenBan() {
        return TenBan;
    }

    public void setTenBan(String TenBan) {
        this.TenBan = TenBan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    
    
}
