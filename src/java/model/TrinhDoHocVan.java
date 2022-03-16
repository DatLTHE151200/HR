/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class TrinhDoHocVan {
    private String MaTrinhDoHocVan;
    private String TenTrinhDo;
    private double HeSoBac;

    public TrinhDoHocVan() {
    }

    public TrinhDoHocVan(String MaTrinhDoHocVan, String TenTrinhDo, double HeSoBac) {
        this.MaTrinhDoHocVan = MaTrinhDoHocVan;
        this.TenTrinhDo = TenTrinhDo;
        this.HeSoBac = HeSoBac;
    }

    public String getMaTrinhDoHocVan() {
        return MaTrinhDoHocVan;
    }

    public void setMaTrinhDoHocVan(String MaTrinhDoHocVan) {
        this.MaTrinhDoHocVan = MaTrinhDoHocVan;
    }

    public String getTenTrinhDo() {
        return TenTrinhDo;
    }

    public void setTenTrinhDo(String TenTrinhDo) {
        this.TenTrinhDo = TenTrinhDo;
    }

    public double getHeSoBac() {
        return HeSoBac;
    }

    public void setHeSoBac(double HeSoBac) {
        this.HeSoBac = HeSoBac;
    }
    
    
}
