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
public class NhanVien {
    private String MaNhanVien;
    private String MatKhau;
    private String HoTen;
    private Date NgaySinh;
    private String QueQuan;
    private String HinhAnh;
    private int GioiTinh;
    private String DanToc;
    private String sdt_NhanVien;
    private String MaChucVuNV;
    private int TrangThai;
    private String MaPhongBan;
    private String MaHopDong;
    private String MaChuyenNganh;
    private String MaTrinhDoHocVan;
    private String CMND;
    private int NgayNghi;

    public NhanVien() {
    }

    public NhanVien(String MaNhanVien, String MatKhau, String HoTen, Date NgaySinh, String QueQuan, String HinhAnh, int GioiTinh, String DanToc, String sdt_NhanVien, String MaChucVuNV, int TrangThai, String MaPhongBan, String MaHopDong, String MaChuyenNganh, String MaTrinhDoHocVan, String CMND, int NgayNghi) {
        this.MaNhanVien = MaNhanVien;
        this.MatKhau = MatKhau;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
        this.HinhAnh = HinhAnh;
        this.GioiTinh = GioiTinh;
        this.DanToc = DanToc;
        this.sdt_NhanVien = sdt_NhanVien;
        this.MaChucVuNV = MaChucVuNV;
        this.TrangThai = TrangThai;
        this.MaPhongBan = MaPhongBan;
        this.MaHopDong = MaHopDong;
        this.MaChuyenNganh = MaChuyenNganh;
        this.MaTrinhDoHocVan = MaTrinhDoHocVan;
        this.CMND = CMND;
        this.NgayNghi = NgayNghi;
    }

    

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    
    
        
    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDanToc() {
        return DanToc;
    }

    public void setDanToc(String DanToc) {
        this.DanToc = DanToc;
    }

    public String getSdt_NhanVien() {
        return sdt_NhanVien;
    }

    public void setSdt_NhanVien(String sdt_NhanVien) {
        this.sdt_NhanVien = sdt_NhanVien;
    }

    public String getMaChucVuNV() {
        return MaChucVuNV;
    }

    public void setMaChucVuNV(String MaChucVuNV) {
        this.MaChucVuNV = MaChucVuNV;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMaPhongBan() {
        return MaPhongBan;
    }

    public void setMaPhongBan(String MaPhongBan) {
        this.MaPhongBan = MaPhongBan;
    }

    public String getMaHopDong() {
        return MaHopDong;
    }

    public void setMaHopDong(String MaHopDong) {
        this.MaHopDong = MaHopDong;
    }

    public String getMaChuyenNganh() {
        return MaChuyenNganh;
    }

    public void setMaChuyenNganh(String MaChuyenNganh) {
        this.MaChuyenNganh = MaChuyenNganh;
    }

    public String getMaTrinhDoHocVan() {
        return MaTrinhDoHocVan;
    }

    public void setMaTrinhDoHocVan(String MaTrinhDoHocVan) {
        this.MaTrinhDoHocVan = MaTrinhDoHocVan;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public int getNgayNghi() {
        return NgayNghi;
    }

    public void setNgayNghi(int NgayNghi) {
        this.NgayNghi = NgayNghi;
    }
    
    
}
