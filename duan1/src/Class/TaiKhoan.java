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
public class TaiKhoan {
    
    public int IDNV ;
public  String TenTK ,MatKhau ,TenNhanVien ;

    public TaiKhoan() {
    }

    public TaiKhoan(int IDNV, String TenTK, String MatKhau, String TenNhanVien) {
        this.IDNV = IDNV;
        this.TenTK = TenTK;
        this.MatKhau = MatKhau;
        this.TenNhanVien = TenNhanVien;
    }

    public int getIDNV() {
        return IDNV;
    }

    public void setIDNV(int IDNV) {
        this.IDNV = IDNV;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }


    
            
}
