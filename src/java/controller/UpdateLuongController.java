/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAL.*;
import model.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class UpdateLuongController extends HttpServlet {

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
        
        UserDAO udao = new UserDAO();
        
        String MaNhanVien = request.getParameter("MaNhanVien");
        int LuongToiThieu = Integer.parseInt(request.getParameter("LuongToiThieu")) ;
        int LuongSauCapNhat = Integer.parseInt(request.getParameter("LuongSauCapNhat"));
        Double HeSoLuong = Double.parseDouble(request.getParameter("HeSoLuong"));
        Double BHXH = Double.parseDouble(request.getParameter("BHXH"));
        Double BHYT = Double.parseDouble(request.getParameter("BHYT"));
        Double BHTN = Double.parseDouble(request.getParameter("BHTN"));
        Double ThueThuNhap = Double.parseDouble(request.getParameter("ThueThuNhap"));
        
        Luong luong = udao.getLuong(MaNhanVien);
        udao.updateBangLuong(luong, LuongSauCapNhat);
        luong.setLuongToiThieu(LuongSauCapNhat);
        luong.setHeSoLuong(HeSoLuong);
        luong.setBHXH(BHXH);
        luong.setBHYT(BHYT);
        luong.setBHTN(BHTN);
        luong.setThueThuNhap(ThueThuNhap);
        udao.updateLuong(luong);
        
        response.sendRedirect("Luong");
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
