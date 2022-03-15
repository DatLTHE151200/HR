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
public class Luong {
    private String MaNhanVien;
    private int LuongToiThieu;
    private double HeSoLuong;
    private double BHXH;
    private double BHYT;
    private double BHTN;
    private double PhuCap;
    private double ThueThuNhap;

    public Luong() {
    }

    public Luong(String MaNhanVien, int LuongToiThieu, double HeSoLuong, double BHXH, double BHYT, double BHTN, double PhuCap, double ThueThuNhap) {
        this.MaNhanVien = MaNhanVien;
        this.LuongToiThieu = LuongToiThieu;
        this.HeSoLuong = HeSoLuong;
        this.BHXH = BHXH;
        this.BHYT = BHYT;
        this.BHTN = BHTN;
        this.PhuCap = PhuCap;
        this.ThueThuNhap = ThueThuNhap;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public int getLuongToiThieu() {
        return LuongToiThieu;
    }

    public void setLuongToiThieu(int LuongToiThieu) {
        this.LuongToiThieu = LuongToiThieu;
    }

    public double getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(double HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
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
    
    
}
