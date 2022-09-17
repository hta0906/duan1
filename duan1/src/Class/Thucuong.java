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
public class Thucuong {
    public  String MAMON ,TENMON ,MALOAIMON ,DVT;
 public int DONGIA ;

    public Thucuong() {
    }

    public Thucuong(String MAMON, String TENMON, String MALOAIMON, String DVT, int DONGIA) {
        this.MAMON = MAMON;
        this.TENMON = TENMON;
        this.MALOAIMON = MALOAIMON;
        this.DVT = DVT;
        this.DONGIA = DONGIA;
    }

    public String getMAMON() {
        return MAMON;
    }

    public void setMAMON(String MAMON) {
        this.MAMON = MAMON;
    }

    public String getTENMON() {
        return TENMON;
    }

    public void setTENMON(String TENMON) {
        this.TENMON = TENMON;
    }

    public String getMALOAIMON() {
        return MALOAIMON;
    }

    public void setMALOAIMON(String MALOAIMON) {
        this.MALOAIMON = MALOAIMON;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public int getDONGIA() {
        return DONGIA;
    }

    public void setDONGIA(int DONGIA) {
        this.DONGIA = DONGIA;
    }

    
}
