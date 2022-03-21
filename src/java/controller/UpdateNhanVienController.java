/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAL.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;

/**
 *
 * @author Admin
 */
public class UpdateNhanVienController extends HttpServlet {

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
        UserDAO udao = new UserDAO();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String MaNhanVien = request.getParameter("MaNhanVien");
        String password = request.getParameter("Password");
        String HoTen = request.getParameter("HoTen");
        String ngaysinh = request.getParameter("NgaySinh");
        Date NgaySinh = format.parse(ngaysinh);
        String gender = request.getParameter("GioiTinh");
        int GioiTinh = Integer.parseInt(gender);
        String ChuyenNganh = request.getParameter("ChuyenNganh");
        String TrinhDoHocVan = request.getParameter("TrinhDoHocVan");
        
        NhanVien nv = udao.getUser(MaNhanVien);
        
        nv.setMatKhau(password);
        nv.setHoTen(HoTen);
        nv.setNgaySinh(NgaySinh);
        nv.setGioiTinh(GioiTinh);
        nv.setMaChuyenNganh(ChuyenNganh);
        nv.setMaTrinhDoHocVan(TrinhDoHocVan);
        udao.updateUser(nv);
        
        Luong luong = udao.getLuong(MaNhanVien);
        TrinhDoHocVan hocvan = udao.getHocVan(TrinhDoHocVan);
        luong.setHeSoLuong(hocvan.getHeSoBac());
        udao.updateLuong(luong);
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
            Logger.getLogger(UpdateNhanVienController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(UpdateNhanVienController.class.getName()).log(Level.SEVERE, null, ex);
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
