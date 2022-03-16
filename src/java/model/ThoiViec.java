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
public class ThoiViec {
    private String MaNhanVien;
    private String LyDo;

    public ThoiViec() {
    }

    public ThoiViec(String MaNhanVien, String LyDo) {
        this.MaNhanVien = MaNhanVien;
        this.LyDo = LyDo;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getLyDo() {
        return LyDo;
    }

    public void setLyDo(String LyDo) {
        this.LyDo = LyDo;
    }
    
    
}
