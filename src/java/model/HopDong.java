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
public class HopDong {
    private String MaHopDong;
    private String LoaiHopDong;
    private Date NgayBatDau;
    private Date NgayKetThuc;
    private String GhiChu;

    public HopDong() {
    }

    public HopDong(String MaHopDong, String LoaiHopDong, Date NgayBatDau, Date NgayKetThuc, String GhiChu) {
        this.MaHopDong = MaHopDong;
        this.LoaiHopDong = LoaiHopDong;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.GhiChu = GhiChu;
    }

    public String getMaHopDong() {
        return MaHopDong;
    }

    public void setMaHopDong(String MaHopDong) {
        this.MaHopDong = MaHopDong;
    }

    public String getLoaiHopDong() {
        return LoaiHopDong;
    }

    public void setLoaiHopDong(String LoaiHopDong) {
        this.LoaiHopDong = LoaiHopDong;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
}
