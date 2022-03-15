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
public class KhenThuong {
    private String MaNhanVien;
    private Date ThangThuong;
    private String LyDo;
    private int TienThuong;

    public KhenThuong() {
    }

    public KhenThuong(String MaNhanVien, Date ThangThuong, String LyDo, int TienThuong) {
        this.MaNhanVien = MaNhanVien;
        this.ThangThuong = ThangThuong;
        this.LyDo = LyDo;
        this.TienThuong = TienThuong;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public Date getThangThuong() {
        return ThangThuong;
    }

    public void setThangThuong(Date ThangThuong) {
        this.ThangThuong = ThangThuong;
    }

    public String getLyDo() {
        return LyDo;
    }

    public void setLyDo(String LyDo) {
        this.LyDo = LyDo;
    }

    public int getTienThuong() {
        return TienThuong;
    }

    public void setTienThuong(int TienThuong) {
        this.TienThuong = TienThuong;
    }
    
    
}
