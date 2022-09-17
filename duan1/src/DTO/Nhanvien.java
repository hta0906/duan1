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
public class Nhanvien {
 public  String MANHANVIEN,MATKHAU,TENNHANVIEN;

public  boolean VAITRO ;


public Nhanvien(){
    
}

    public Nhanvien(String MANHANVIEN, String MATKHAU, String TENNHANVIEN, boolean VAITRO) {
        this.MANHANVIEN = MANHANVIEN;
        this.MATKHAU = MATKHAU;
        this.TENNHANVIEN = TENNHANVIEN;
        this.VAITRO = VAITRO = false;
    }

    public String getMANHANVIEN() {
        return MANHANVIEN;
    }

    public void setMANHANVIEN(String MANHANVIEN) {
        this.MANHANVIEN = MANHANVIEN;
    }

    public String getMATKHAU() {
        return MATKHAU;
    }

    public void setMATKHAU(String MATKHAU) {
        this.MATKHAU = MATKHAU;
    }

    public String getTENNHANVIEN() {
        return TENNHANVIEN;
    }

    public void setTENNHANVIEN(String TENNHANVIEN) {
        this.TENNHANVIEN = TENNHANVIEN;
    }

    public boolean isVAITRO() {
        return VAITRO;
    }

    public void setVAITRO(boolean VAITRO) {
        this.VAITRO = VAITRO;
    }

    @Override
    public String toString() {
        return this.MANHANVIEN;
    }



    
}
