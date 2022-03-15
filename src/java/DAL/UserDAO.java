/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;

/**
 *
 * @author Admin
 */
public class UserDAO {

    public NhanVien getUser(String username) {
        String sql = "SELECT * FROM dbo.NhanViens WHERE MaNhanVien = ?";
        Connection conn = DBConnection.open();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            NhanVien user = new NhanVien();
            while (rs.next()) {
                user.setMaNhanVien(rs.getString("MaNhanVien"));
                user.setMatKhau(rs.getString("MatKhau"));
                user.setHoTen(rs.getString("HoTen"));
                user.setNgaySinh(rs.getDate("NgaySinh"));
                user.setQueQuan(rs.getString("QueQuan"));
                user.setHinhAnh(rs.getString("HinhAnh"));
                user.setGioiTinh(rs.getInt("GioiTinh"));
                user.setDanToc(rs.getString("DanToc"));
                user.setSdt_NhanVien(rs.getString("sdt_NhanVien"));
                user.setMaChucVuNV(rs.getString("MaChucVuNV"));
                user.setTrangThai(rs.getInt("TrangThai"));
                user.setMaPhongBan(rs.getString("MaPhongBan"));
                user.setMaHopDong(rs.getString("MaHopDong"));
                user.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                user.setMaTrinhDoHocVan(rs.getString("MaTrinhDoHocVan"));
                user.setCMND(rs.getString("CMND"));
                return user;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public List<NhanVien> getAllUser() {
        List<NhanVien> userList = new ArrayList<>();
        String sql = "SELECT * FROM dbo.NhanViens";
        Connection conn = DBConnection.open();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            NhanVien user = new NhanVien();
            while (rs.next()) {
                user.setMaNhanVien(rs.getString("MaNhanVien"));
                user.setMatKhau(rs.getString("MatKhau"));
                user.setHoTen(rs.getString("HoTen"));
                user.setNgaySinh(rs.getDate("NgaySinh"));
                user.setQueQuan(rs.getString("QueQuan"));
                user.setHinhAnh(rs.getString("HinhAnh"));
                user.setGioiTinh(rs.getInt("GioiTinh"));
                user.setDanToc(rs.getString("DanToc"));
                user.setSdt_NhanVien(rs.getString("sdt_NhanVien"));
                user.setMaChucVuNV(rs.getString("MaChucVuNV"));
                user.setTrangThai(rs.getInt("TrangThai"));
                user.setMaPhongBan(rs.getString("MaPhongBan"));
                user.setMaHopDong(rs.getString("MaHopDong"));
                user.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                user.setMaTrinhDoHocVan(rs.getString("MaTrinhDoHocVan"));
                user.setCMND(rs.getString("CMND"));
                userList.add(user);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return userList;
    }

    public void insertUser(NhanVien user) {
        int roleId = 0;
        String sql = "INSERT INTO dbo.NhanViens\n"
                + "(\n"
                + "    MaNhanVien,\n"
                + "    MatKhau,\n"
                + "    HoTen,\n"
                + "    NgaySinh,\n"
                + "    QueQuan,\n"
                + "    HinhAnh,\n"
                + "    GioiTinh,\n"
                + "    DanToc,\n"
                + "    sdt_NhanVien,\n"
                + "    MaChucVuNV,\n"
                + "    TrangThai,\n"
                + "    MaPhongBan,\n"
                + "    MaHopDong,\n"
                + "    MaChuyenNganh,\n"
                + "    MaTrinhDoHocVan,\n"
                + "    CMND\n"
                + ")\n"
                + "VALUES\n"
                + "(   ?,        -- MaNhanVien - varchar(30)\n"
                + "    ?,       -- MatKhau - nvarchar(100)\n"
                + "    ?,       -- HoTen - nvarchar(50)\n"
                + "    ?, -- NgaySinh - datetime\n"
                + "    ?,       -- QueQuan - nvarchar(100)\n"
                + "    ?,       -- HinhAnh - nvarchar(max)\n"
                + "    ?,         -- GioiTinh - int\n"
                + "    ?,       -- DanToc - nvarchar(10)\n"
                + "    ?,        -- sdt_NhanVien - varchar(11)\n"
                + "    ?,        -- MaChucVuNV - varchar(30)\n"
                + "    ?,      -- TrangThai - bit\n"
                + "    ?,        -- MaPhongBan - varchar(30)\n"
                + "    ?,        -- MaHopDong - varchar(30)\n"
                + "    ?,        -- MaChuyenNganh - varchar(30)\n"
                + "    ?,        -- MaTrinhDoHocVan - varchar(30)\n"
                + "    ?         -- CMND - varchar(50)\n"
                + "    )";
        Connection conn = DBConnection.open();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getMaNhanVien());
            ps.setString(2, user.getMatKhau());
            ps.setString(3, user.getHoTen());
            ps.setDate(4, (java.sql.Date) user.getNgaySinh());
            ps.setString(5, user.getQueQuan());
            ps.setString(6, "");
            ps.setInt(7, user.getGioiTinh());
            ps.setString(8, user.getDanToc());
            ps.setString(9, user.getSdt_NhanVien());
            ps.setString(10, user.getMaChucVuNV());
            ps.setInt(11, roleId);
            ps.setString(12, user.getMaPhongBan());
            ps.setString(13, user.getMaHopDong());
            ps.setString(14, user.getMaChuyenNganh());
            ps.setString(15, user.getMaTrinhDoHocVan());
            ps.setString(16, user.getCMND());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(NhanVien user) {
        int roleId = 0;
        String sql = "UPDATE dbo.NhanViens\n"
                + "SET\n"
                + "HoTen = '',\n"
                + "NgaySinh = '',\n"
                + "QueQuan = '',\n"
                + "HinhAnh = '',\n"
                + "GioiTinh = '',\n"
                + "DanToc = '',\n"
                + "sdt_NhanVien = '',\n"
                + "MaChucVuNV = '',\n"
                + "TrangThai = '',\n"
                + "MaPhongBan = '',\n"
                + "MaHopDong = '',\n"
                + "MaChuyenNganh = '',\n"
                + "MaTrinhDoHocVan = '',\n"
                + "CMND = ''\n"
                + "WHERE MaNhanVien = ''";
        Connection conn = DBConnection.open();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getMaNhanVien());
            ps.setString(2, user.getMatKhau());
            ps.setString(3, user.getHoTen());
            ps.setDate(4, (java.sql.Date) user.getNgaySinh());
            ps.setString(5, user.getQueQuan());
            ps.setString(6, "");
            ps.setInt(7, user.getGioiTinh());
            ps.setString(8, user.getDanToc());
            ps.setString(9, user.getSdt_NhanVien());
            ps.setString(10, user.getMaChucVuNV());
            ps.setInt(11, roleId);
            ps.setString(12, user.getMaPhongBan());
            ps.setString(13, user.getMaHopDong());
            ps.setString(14, user.getMaChuyenNganh());
            ps.setString(15, user.getMaTrinhDoHocVan());
            ps.setString(16, user.getCMND());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
