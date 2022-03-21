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
public class NhanVienPhongBan {
    private String MaNhanVien;
    private String MaPhongBan;
    private String HoTen;
    private int GioiTinh;
    private String ChucVu;
    private String ChuyenNganh;
    private String HocVan;

    public NhanVienPhongBan() {
    }

    public NhanVienPhongBan(String MaNhanVien, String MaPhongBan, String HoTen, int GioiTinh, String ChucVu, String ChuyenNganh, String HocVan) {
        this.MaNhanVien = MaNhanVien;
        this.MaPhongBan = MaPhongBan;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.ChucVu = ChucVu;
        this.ChuyenNganh = ChuyenNganh;
        this.HocVan = HocVan;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getMaPhongBan() {
        return MaPhongBan;
    }

    public void setMaPhongBan(String MaPhongBan) {
        this.MaPhongBan = MaPhongBan;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getChuyenNganh() {
        return ChuyenNganh;
    }

    public void setChuyenNganh(String ChuyenNganh) {
        this.ChuyenNganh = ChuyenNganh;
    }

    public String getHocVan() {
        return HocVan;
    }

    public void setHocVan(String HocVan) {
        this.HocVan = HocVan;
    }
    
    
}
