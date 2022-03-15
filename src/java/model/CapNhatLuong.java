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
public class CapNhatLuong {
    private int id;
    private String MaNhanVien;
    private int LuongHienTai;
    private int LuongSauCapNhat;
    private double BHXH;
    private double BHYT;
    private double BHTN;
    private double PhuCap;
    private double ThueThuNhap;
    private Date NgayCapNhat;
    private double HeSoLuong;

    public CapNhatLuong() {
    }

    public CapNhatLuong(int id, String MaNhanVien, int LuongHienTai, int LuongSauCapNhat, double BHXH, double BHYT, double BHTN, double PhuCap, double ThueThuNhap, Date NgayCapNhat, double HeSoLuong) {
        this.id = id;
        this.MaNhanVien = MaNhanVien;
        this.LuongHienTai = LuongHienTai;
        this.LuongSauCapNhat = LuongSauCapNhat;
        this.BHXH = BHXH;
        this.BHYT = BHYT;
        this.BHTN = BHTN;
        this.PhuCap = PhuCap;
        this.ThueThuNhap = ThueThuNhap;
        this.NgayCapNhat = NgayCapNhat;
        this.HeSoLuong = HeSoLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public int getLuongHienTai() {
        return LuongHienTai;
    }

    public void setLuongHienTai(int LuongHienTai) {
        this.LuongHienTai = LuongHienTai;
    }

    public int getLuongSauCapNhat() {
        return LuongSauCapNhat;
    }

    public void setLuongSauCapNhat(int LuongSauCapNhat) {
        this.LuongSauCapNhat = LuongSauCapNhat;
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

    public Date getNgayCapNhat() {
        return NgayCapNhat;
    }

    public void setNgayCapNhat(Date NgayCapNhat) {
        this.NgayCapNhat = NgayCapNhat;
    }

    public double getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(double HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }
    
    
}
