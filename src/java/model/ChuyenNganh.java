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
public class ChuyenNganh {
    private String MaChuyenNganh;
    private String TenChuyenNganh;

    public ChuyenNganh() {
    }

    public ChuyenNganh(String MaChuyenNganh, String TenChuyenNganh) {
        this.MaChuyenNganh = MaChuyenNganh;
        this.TenChuyenNganh = TenChuyenNganh;
    }

    public String getMaChuyenNganh() {
        return MaChuyenNganh;
    }

    public void setMaChuyenNganh(String MaChuyenNganh) {
        this.MaChuyenNganh = MaChuyenNganh;
    }

    public String getTenChuyenNganh() {
        return TenChuyenNganh;
    }

    public void setTenChuyenNganh(String TenChuyenNganh) {
        this.TenChuyenNganh = TenChuyenNganh;
    }
    
    
}
