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
public class Loaimon {
  public  String  MALOAIMON,tenloai ;

    public Loaimon() {
    }

    public Loaimon(String MALOAIMON, String tenloai) {
        this.MALOAIMON = MALOAIMON;
        this.tenloai = tenloai;
    }

    public String getMALOAIMON() {
        return MALOAIMON;
    }

    public void setMALOAIMON(String MALOAIMON) {
        this.MALOAIMON = MALOAIMON;
    }

    public String getTenloai() {
        return tenloai;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }
  
  
  
}
