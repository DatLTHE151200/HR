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
public class ChucVuNhanVien {
    private String MaChucVu;
    private String TenChucVu;
    private double HSPC;

    public ChucVuNhanVien() {
    }

    public ChucVuNhanVien(String MaChucVu, String TenChucVu, double HSPC) {
        this.MaChucVu = MaChucVu;
        this.TenChucVu = TenChucVu;
        this.HSPC = HSPC;
    }

    public String getMaChucVu() {
        return MaChucVu;
    }

    public void setMaChucVu(String MaChucVu) {
        this.MaChucVu = MaChucVu;
    }

    public String getTenChucVu() {
        return TenChucVu;
    }

    public void setTenChucVu(String TenChucVu) {
        this.TenChucVu = TenChucVu;
    }

    public double getHSPC() {
        return HSPC;
    }

    public void setHSPC(double HSPC) {
        this.HSPC = HSPC;
    }
    
    
}
