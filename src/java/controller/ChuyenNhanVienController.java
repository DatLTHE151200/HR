/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import DAL.*;
import model.*;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class ChuyenNhanVienController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession();
        NhanVien user = (NhanVien) session.getAttribute("user");
        session.setAttribute("user", user);
        
        UserDAO udao = new UserDAO();
        
        String MaNhanVien = request.getParameter("MaNhanVien");
        String ChucVu = request.getParameter("ChucVu");
        String PhongBanCu = request.getParameter("PhongBanCu");
        String PhongBanChuyenDen = request.getParameter("PhongBanChuyenDen");
        String LyDo = request.getParameter("LyDo");
        
        NhanVien nv = udao.getUser(MaNhanVien);
        nv.setMaChucVuNV(ChucVu);
        nv.setMaPhongBan(PhongBanChuyenDen);
        udao.updateUser(nv);
        
        LuanChuyenNhanVien CongTac = new LuanChuyenNhanVien();
        CongTac.setMaNhanVien(MaNhanVien);
        CongTac.setPhongBanChuyen(PhongBanCu);
        CongTac.setPhongBanDen(PhongBanChuyenDen);
        CongTac.setLyDoChuyen(LyDo);
        udao.updateQuaTrinhCongTac(CongTac);
        
        Luong luong = udao.getLuong(MaNhanVien);
        ChucVuNhanVien chucvu = udao.getChucVu(ChucVu);
        luong.setPhuCap(chucvu.getHSPC());
        udao.updateLuong(luong);
        
        response.sendRedirect("DanhSachNhanVien?id="+PhongBanCu);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
