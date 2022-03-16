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
public class LuanChuyenNhanVien {
    private String MaNhanVien;
    private int id;
    private Date NgayChuyen;
    private String LyDoChuyen;
    private String PhongBanChuyen;
    private String PhongBanDen;

    public LuanChuyenNhanVien() {
    }

    public LuanChuyenNhanVien(String MaNhanVien, int id, Date NgayChuyen, String LyDoChuyen, String PhongBanChuyen, String PhongBanDen) {
        this.MaNhanVien = MaNhanVien;
        this.id = id;
        this.NgayChuyen = NgayChuyen;
        this.LyDoChuyen = LyDoChuyen;
        this.PhongBanChuyen = PhongBanChuyen;
        this.PhongBanDen = PhongBanDen;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgayChuyen() {
        return NgayChuyen;
    }

    public void setNgayChuyen(Date NgayChuyen) {
        this.NgayChuyen = NgayChuyen;
    }

    public String getLyDoChuyen() {
        return LyDoChuyen;
    }

    public void setLyDoChuyen(String LyDoChuyen) {
        this.LyDoChuyen = LyDoChuyen;
    }

    public String getPhongBanChuyen() {
        return PhongBanChuyen;
    }

    public void setPhongBanChuyen(String PhongBanChuyen) {
        this.PhongBanChuyen = PhongBanChuyen;
    }

    public String getPhongBanDen() {
        return PhongBanDen;
    }

    public void setPhongBanDen(String PhongBanDen) {
        this.PhongBanDen = PhongBanDen;
    }
    
    
}
