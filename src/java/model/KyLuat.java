/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class KyLuat {
    private String MaNhanVien;
    private String LyDo;
    private Date ThangKyLuat;
    private int TienKyLuat;

    public KyLuat() {
    }

    public KyLuat(String MaNhanVien, String LyDo, Date ThangKyLuat, int TienKyLuat) {
        this.MaNhanVien = MaNhanVien;
        this.ThangKyLuat = ThangKyLuat;
        this.LyDo = LyDo;
        this.TienKyLuat = TienKyLuat;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public Date getThangKyLuat() {
        return ThangKyLuat;
    }

    public void setThangKyLuat(Date ThangKyLuat) {
        this.ThangKyLuat = ThangKyLuat;
    }

    public String getLyDo() {
        return LyDo;
    }

    public void setLyDo(String LyDo) {
        this.LyDo = LyDo;
    }

    public int getTienKyLuat() {
        return TienKyLuat;
    }

    public void setTienKyLuat(int TienKyLuat) {
        this.TienKyLuat = TienKyLuat;
    }
    
    
}
