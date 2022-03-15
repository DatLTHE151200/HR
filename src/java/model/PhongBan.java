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
public class PhongBan {
    private String MaPhongBan;
    private String TenPhongBan;
    private String DiaChi;
    private String sdt_PhongBan;

    public PhongBan() {
    }

    public PhongBan(String MaPhongBan, String TenPhongBan, String DiaChi, String sdt_PhongBan) {
        this.MaPhongBan = MaPhongBan;
        this.TenPhongBan = TenPhongBan;
        this.DiaChi = DiaChi;
        this.sdt_PhongBan = sdt_PhongBan;
    }

    public String getMaPhongBan() {
        return MaPhongBan;
    }

    public void setMaPhongBan(String MaPhongBan) {
        this.MaPhongBan = MaPhongBan;
    }

    public String getTenPhongBan() {
        return TenPhongBan;
    }

    public void setTenPhongBan(String TenPhongBan) {
        this.TenPhongBan = TenPhongBan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt_PhongBan() {
        return sdt_PhongBan;
    }

    public void setSdt_PhongBan(String sdt_PhongBan) {
        this.sdt_PhongBan = sdt_PhongBan;
    }
    
    
}
