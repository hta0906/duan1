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
public class DatBan {
    public int  MABAN ;
 public  String   TRANGTHAI ;

    public DatBan() {
    }

    public DatBan(int  MABAN, String TRANGTHAI) {
        this.MABAN = MABAN;
        this.TRANGTHAI = TRANGTHAI;
    }

    public int getMABAN() {
        return MABAN;
    }

    public void setMABAN(int MABAN) {
        this.MABAN = MABAN;
    }

    public String getTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setTRANGTHAI(String TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }
 
 
}
