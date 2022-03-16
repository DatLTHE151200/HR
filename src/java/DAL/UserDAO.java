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
import java.util.logging.Level;
import java.util.logging.Logger;
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
            while (rs.next()) {
                NhanVien user = new NhanVien();
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
            while (rs.next()) {
                NhanVien user = new NhanVien();
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

    public void deleteUser(String id) {
        String sql = "DELETE FROM dbo.NhanViens WHERE MaNhanVien = ?";
        Connection conn = DBConnection.open();
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<ChucVuNhanVien> getListChucVu() {
        List<ChucVuNhanVien> list = new ArrayList<>();
        String sql = "SELECT* FROM dbo.ChucVuNhanViens";
        Connection conn = DBConnection.open();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChucVuNhanVien item = new ChucVuNhanVien();
                item.setMaChucVu(rs.getString("MaChucVuNV"));
                item.setTenChucVu(rs.getString("TenChucVu"));
                item.setHSPC(rs.getDouble("HSPC"));
                list.add(item);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return list;
    }

    public ChucVuNhanVien getChucVu(String id) {
        String sql = "SELECT* FROM dbo.ChucVuNhanViens WHERE MaChucVuNV = ?";
        Connection conn = DBConnection.open();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChucVuNhanVien item = new ChucVuNhanVien();
                item.setMaChucVu(rs.getString("MaChucVuNV"));
                item.setTenChucVu(rs.getString("TenChucVu"));
                item.setHSPC(rs.getDouble("HSPC"));
                return item;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    public List<PhongBan> getListPhongBan() {
        List<PhongBan> list = new ArrayList<>();
        String sql = "SELECT* FROM dbo.PhongBans";
        Connection conn = DBConnection.open();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhongBan item = new PhongBan();
                item.setMaPhongBan(rs.getString("MaPhongBan"));
                item.setTenPhongBan(rs.getString("TenPhongBan"));
                item.setDiaChi(rs.getString("DiaChi"));
                item.setSdt_PhongBan(rs.getString("sdt_PhongBan"));
                list.add(item);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return list;
    }

    public List<ChuyenNganh> getListChuyenNganh() {
        List<ChuyenNganh> list = new ArrayList<>();
        String sql = "SELECT* FROM dbo.ChuyenNganhs";
        Connection conn = DBConnection.open();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChuyenNganh item = new ChuyenNganh();
                item.setMaChuyenNganh(rs.getString("MaChuyenNganh"));
                item.setTenChuyenNganh(rs.getString("TenChuyenNganh"));
                list.add(item);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return list;
    }

    public TrinhDoHocVan getHocVan(String id) {
        String sql = "SELECT * FROM dbo.TrinhDoHocVans WHERE MaTrinhDoHocVan = ?";
        Connection conn = DBConnection.open();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TrinhDoHocVan item = new TrinhDoHocVan();
                item.setMaTrinhDoHocVan(rs.getString("MaTrinhDoHocVan"));
                item.setTenTrinhDo(rs.getString("TenChucVu"));
                item.setHeSoBac(rs.getDouble("HeSoBac"));
                return item;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    public List<TrinhDoHocVan> getListHocVan() {
        List<TrinhDoHocVan> list = new ArrayList<>();
        String sql = "SELECT* FROM dbo.TrinhDoHocVans";
        Connection conn = DBConnection.open();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TrinhDoHocVan item = new TrinhDoHocVan();
                item.setMaTrinhDoHocVan(rs.getString("MaTrinhDoHocVan"));
                item.setTenTrinhDo(rs.getString("TenTrinhDo"));
                item.setHeSoBac(rs.getDouble("HeSoBac"));
                list.add(item);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return list;
    }

    public void insertLuong(Luong luong) {
        String sql = "INSERT INTO dbo.Luongs\n"
                + "(\n"
                + "    MaNhanVien,\n"
                + "    LuongToiThieu,\n"
                + "    HeSoLuong,\n"
                + "    BHXH,\n"
                + "    BHYT,\n"
                + "    BHTN,\n"
                + "    PhuCap,\n"
                + "    ThueThuNhap\n"
                + ")\n"
                + "VALUES\n"
                + "(   ?,  -- MaNhanVien - varchar(30)\n"
                + "    ?,   -- LuongToiThieu - int\n"
                + "    ?, -- HeSoLuong - float\n"
                + "    ?, -- BHXH - float\n"
                + "    ?, -- BHYT - float\n"
                + "    ?, -- BHTN - float\n"
                + "    ?, -- PhuCap - float\n"
                + "    ?  -- ThueThuNhap - float\n"
                + "    )";
        Connection conn = DBConnection.open();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, luong.getMaNhanVien());
            ps.setInt(2, luong.getLuongToiThieu());
            ps.setDouble(3, luong.getHeSoLuong());
            ps.setDouble(4, luong.getBHXH());
            ps.setDouble(5, luong.getBHYT());
            ps.setDouble(6, luong.getBHTN());
            ps.setDouble(7, luong.getPhuCap());
            ps.setDouble(8, luong.getThueThuNhap());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateLuong(Luong luong) {
        String sql = "UPDATE dbo.Luongs\n"
                + "SET\n"
                + "LuongToiThieu = ?,\n"
                + "HeSoLuong = ?,\n"
                + "BHXH = ?,\n"
                + "BHYT = ?,\n"
                + "BHTN = ?,\n"
                + "PhuCap = ?,\n"
                + "ThueThuNhap = ?\n"
                + "WHERE MaNhanVien = ?";
        Connection conn = DBConnection.open();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(8, luong.getMaNhanVien());
            ps.setInt(1, luong.getLuongToiThieu());
            ps.setDouble(2, luong.getHeSoLuong());
            ps.setDouble(3, luong.getBHXH());
            ps.setDouble(4, luong.getBHYT());
            ps.setDouble(5, luong.getBHTN());
            ps.setDouble(6, luong.getPhuCap());
            ps.setDouble(7, luong.getThueThuNhap());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteLuong(String id) {
        String sql = "DELETE FROM dbo.NhanViens WHERE MaNhanVien = ?";
        Connection conn = DBConnection.open();
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateBangLuong(Luong luong, int luongmoi) {
        String sql = "INSERT INTO dbo.CapNhatLuongs\n"
                + "(\n"
                + "    MaNhanVien,\n"
                + "    LuongHienTai,\n"
                + "    LuongSauCapNhat,\n"
                + "    BHXH,\n"
                + "    BHYT,\n"
                + "    BHTN,\n"
                + "    PhuCap,\n"
                + "    ThueThuNhap,\n"
                + "    NgayCapNhat,\n"
                + "    HeSoLuong\n"
                + ")\n"
                + "VALUES\n"
                + "(   ?,        -- MaNhanVien - varchar(30)\n"
                + "    ?,         -- LuongHienTai - int\n"
                + "    ?,         -- LuongSauCapNhat - int\n"
                + "    ?,       -- BHXH - float\n"
                + "    ?,       -- BHYT - float\n"
                + "    ?,       -- BHTN - float\n"
                + "    ?,       -- PhuCap - float\n"
                + "    ?,       -- ThueThuNhap - float\n"
                + "    GETDATE(), -- NgayCapNhat - datetime\n"
                + "    ?        -- HeSoLuong - float\n"
                + "    )";
        Connection conn = DBConnection.open();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, luong.getMaNhanVien());
            ps.setInt(2, luong.getLuongToiThieu());
            ps.setDouble(3, luongmoi);
            ps.setDouble(4, luong.getBHXH());
            ps.setDouble(5, luong.getBHYT());
            ps.setDouble(6, luong.getBHTN());
            ps.setDouble(7, luong.getPhuCap());
            ps.setDouble(8, luong.getThueThuNhap());
            ps.setDouble(9, luong.getHeSoLuong());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<CapNhatLuong> getListBangLuong() {
        List<CapNhatLuong> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.CapNhatLuongs";
        Connection conn = DBConnection.open();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CapNhatLuong item = new CapNhatLuong();
                item.setMaNhanVien(rs.getString("MaNhanVien"));
                item.setLuongHienTai(rs.getInt("LuongHienTai"));
                item.setLuongSauCapNhat(rs.getInt("LuongSauCapNhat"));
                item.setBHXH(rs.getDouble("BHXH"));
                item.setBHYT(rs.getDouble("BHYT"));
                item.setBHTN(rs.getDouble("BHTN"));
                item.setPhuCap(rs.getDouble("PhuCap"));
                item.setThueThuNhap(rs.getDouble("ThueThuNhap"));
                item.setNgayCapNhat(rs.getDate("NgayCapNhat"));
                list.add(item);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }
    
    
}
