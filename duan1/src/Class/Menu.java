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
public class Menu {
    
     private String TenNuoc;
    private int SoLuong;
    private int Gia;
    private int TongTien;

    public Menu() {
    }

    public Menu(String TenNuoc, int SoLuong, int Gia, int TongTien) {
        this.TenNuoc = TenNuoc;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.TongTien = TongTien;
    }

    public String getTenNuoc() {
        return TenNuoc;
    }

    public void setTenNuoc(String TenNuoc) {
        this.TenNuoc = TenNuoc;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }
    
    
}
