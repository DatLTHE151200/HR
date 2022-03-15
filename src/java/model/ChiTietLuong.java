/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
/**
 *
 * @author Admin
 */
public class ChiTietLuong {
    private String MaChiTietBangLuong;
    private String MaNhanVien;
    private int LuongCoBan;
    private double BHXH;
    private double BHYT;
    private double BHTN;
    private double PhuCap;
    private double ThueThuNhap;
    private int TienThuong;
    private int TienPhat;
    private Date NgayNhanLuong;
    private String TongTienLuong;

    public ChiTietLuong() {
    }

    public ChiTietLuong(String MaChiTietBangLuong, String MaNhanVien, int LuongCoBan, double BHXH, double BHYT, double BHTN, double PhuCap, double ThueThuNhap, int TienThuong, int TienPhat, Date NgayNhanLuong, String TongTienLuong) {
        this.MaChiTietBangLuong = MaChiTietBangLuong;
        this.MaNhanVien = MaNhanVien;
        this.LuongCoBan = LuongCoBan;
        this.BHXH = BHXH;
        this.BHYT = BHYT;
        this.BHTN = BHTN;
        this.PhuCap = PhuCap;
        this.ThueThuNhap = ThueThuNhap;
        this.TienThuong = TienThuong;
        this.TienPhat = TienPhat;
        this.NgayNhanLuong = NgayNhanLuong;
        this.TongTienLuong = TongTienLuong;
    }

    public String getMaChiTietBangLuong() {
        return MaChiTietBangLuong;
    }

    public void setMaChiTietBangLuong(String MaChiTietBangLuong) {
        this.MaChiTietBangLuong = MaChiTietBangLuong;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public int getLuongCoBan() {
        return LuongCoBan;
    }

    public void setLuongCoBan(int LuongCoBan) {
        this.LuongCoBan = LuongCoBan;
    }

    public double getBHXH() {
        return BHXH;
    }

    public void setBHXH(double BHXH) {
        this.BHXH = BHXH;
    }

    public double getBHYT() {
        return BHYT;
    }

    public void setBHYT(double BHYT) {
        this.BHYT = BHYT;
    }

    public double getBHTN() {
        return BHTN;
    }

    public void setBHTN(double BHTN) {
        this.BHTN = BHTN;
    }

    public double getPhuCap() {
        return PhuCap;
    }

    public void setPhuCap(double PhuCap) {
        this.PhuCap = PhuCap;
    }

    public double getThueThuNhap() {
        return ThueThuNhap;
    }

    public void setThueThuNhap(double ThueThuNhap) {
        this.ThueThuNhap = ThueThuNhap;
    }

    public int getTienThuong() {
        return TienThuong;
    }

    public void setTienThuong(int TienThuong) {
        this.TienThuong = TienThuong;
    }

    public int getTienPhat() {
        return TienPhat;
    }

    public void setTienPhat(int TienPhat) {
        this.TienPhat = TienPhat;
    }

    public Date getNgayNhanLuong() {
        return NgayNhanLuong;
    }

    public void setNgayNhanLuong(Date NgayNhanLuong) {
        this.NgayNhanLuong = NgayNhanLuong;
    }

    public String getTongTienLuong() {
        return TongTienLuong;
    }

    public void setTongTienLuong(String TongTienLuong) {
        this.TongTienLuong = TongTienLuong;
    }
    
    
}
