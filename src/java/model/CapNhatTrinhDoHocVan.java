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
public class CapNhatTrinhDoHocVan {
    private String MaCapNhat;
    private String MaNhanVien;
    private Date NgayCapNhat;
    private String MaTrinhDoTruoc;
    private String MaTrinhDoCapNhat;

    public CapNhatTrinhDoHocVan() {
    }

    public CapNhatTrinhDoHocVan(String MaCapNhat, String MaNhanVien, Date NgayCapNhat, String MaTrinhDoTruoc, String MaTrinhDoCapNhat) {
        this.MaCapNhat = MaCapNhat;
        this.MaNhanVien = MaNhanVien;
        this.NgayCapNhat = NgayCapNhat;
        this.MaTrinhDoTruoc = MaTrinhDoTruoc;
        this.MaTrinhDoCapNhat = MaTrinhDoCapNhat;
    }

    public String getMaCapNhat() {
        return MaCapNhat;
    }

    public void setMaCapNhat(String MaCapNhat) {
        this.MaCapNhat = MaCapNhat;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public Date getNgayCapNhat() {
        return NgayCapNhat;
    }

    public void setNgayCapNhat(Date NgayCapNhat) {
        this.NgayCapNhat = NgayCapNhat;
    }

    public String getMaTrinhDoTruoc() {
        return MaTrinhDoTruoc;
    }

    public void setMaTrinhDoTruoc(String MaTrinhDoTruoc) {
        this.MaTrinhDoTruoc = MaTrinhDoTruoc;
    }

    public String getMaTrinhDoCapNhat() {
        return MaTrinhDoCapNhat;
    }

    public void setMaTrinhDoCapNhat(String MaTrinhDoCapNhat) {
        this.MaTrinhDoCapNhat = MaTrinhDoCapNhat;
    }
    
    
}
