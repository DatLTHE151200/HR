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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class ThemNhanVien extends HttpServlet {

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
            throws ServletException, IOException, ParseException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        NhanVien user = (NhanVien) session.getAttribute("user");
        session.setAttribute("user", user);
        //request.getRequestDispatcher("ThemNhanVien.jsp").forward(request, response);
        UserDAO udao = new UserDAO();
        NhanVien nv = new NhanVien();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String MaNhanVien = request.getParameter("MaNhanVien");
        String password = request.getParameter("Password");
        String HoTen = request.getParameter("HoTen");
        String ngaysinh = request.getParameter("NgaySinh");
        Date NgaySinh = format.parse(ngaysinh);
        String gender = request.getParameter("GioiTinh");
        int GioiTinh = Integer.parseInt(gender);
        String ChucVu = request.getParameter("ChucVu");
        String PhongBan = request.getParameter("PhongBan");
        String ChuyenNganh = request.getParameter("ChuyenNganh");
        String TrinhDoHocVan = request.getParameter("TrinhDoHocVan");

        nv.setMaNhanVien(MaNhanVien);
        nv.setMatKhau(password);
        nv.setHoTen(HoTen);
        nv.setNgaySinh(NgaySinh);
        nv.setGioiTinh(GioiTinh);
        nv.setMaChucVuNV(ChucVu);
        nv.setMaPhongBan(PhongBan);
        nv.setMaChuyenNganh(ChuyenNganh);
        nv.setMaTrinhDoHocVan(TrinhDoHocVan);
        udao.insertUser(nv);

        double PhuCap = udao.getChucVu(ChucVu).getHSPC();
        double HeSoLuong = udao.getHocVan(TrinhDoHocVan).getHeSoBac();

        Luong luong = new Luong(MaNhanVien, 3000000, HeSoLuong, 8, 1.5, 1, PhuCap, 0);
        udao.insertLuong(luong);

        response.sendRedirect("NhanVien");
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ThemNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ThemNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
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
