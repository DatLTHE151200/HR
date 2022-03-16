<%-- 
    Document   : ThemNhanVien
    Created on : Mar 6, 2022, 9:48:45 AM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <%@page import="java.util.*"%>
        <%@page import="DAL.*"%>
        <%@page import="model.*"%>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Thêm nhân viên</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="css/styles.css" rel="stylesheet" />
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
    </head>

    <body class="sb-nav-fixed">
        <%!
            UserDAO udao = new UserDAO();
            List<ChucVuNhanVien> chucvu = (List<ChucVuNhanVien>) udao.getListChucVu();
            List<PhongBan> phongban = (List<PhongBan>) udao.getListPhongBan();
            List<ChuyenNganh> chuyennganh = (List<ChuyenNganh>) udao.getListChuyenNganh();
            List<TrinhDoHocVan> hocvan = (List<TrinhDoHocVan>) udao.getListHocVan();
        %>
        <%@include file="header.jsp" %>
        <div id="layoutSidenav">
            <%@include file="menu.jsp" %>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Thêm nhân viên</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">Tổng quan</li>
                            <li class="breadcrumb-item active">Nhân viên</li>
                            <li class="breadcrumb-item active">Thêm nhân viên</li>
                        </ol>
                        <div class="card-body">
                            <p class="alert-danger">${mess}</p>
                            <form action="" method="post">
                                <div class="form-floating mb-3">
                                    <input class="form-control" type="text" name="MaNhanVien" placeholder="Mã nhân viên" />
                                    <label for="inputEmail">Mã nhân viên</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input class="form-control" type="password" name="Password" placeholder="Mật khẩu" required=""/>
                                    <label for="inputEmail">Mật khẩu</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input class="form-control" type="text" name="HoTen" placeholder="Họ tên" />
                                    <label for="inputEmail">Họ tên</label>
                                </div>
                                <table border="0">
                                    <tbody>
                                        <tr>
                                            <td><h6>Ngày sinh&emsp;<h6/></td>
                                            <td>
                                                <input class="form-control" type="date" name="NgaySinh">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><h6>Giới tính&emsp;<h6/></td>
                                            <td>
                                                <input type="radio" id="Nam" name="GioiTinh" value="1">
                                                <label for="Nam">Nam</label>&emsp;
                                                <input type="radio" id="Nu" name="GioiTinh" value="0">
                                                <label for="Nu">Nữ</label>&emsp;
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><h6>Chức vụ&emsp;<h6/></td>
                                            <td>
                                                <select class="form-control" id="ChucVu" name="ChucVu">
                                                    <%for (ChucVuNhanVien cv : chucvu){
                                                    %>
                                                    <option class="dropdown-item" value="<%=cv.getMaChucVu()%>"><%=cv.getTenChucVu()%></option>
                                                    <%}%>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><h6>Phòng ban&emsp;<h6/></td>
                                            <td>
                                                <select class="form-control" id="PhongBan" name="PhongBan">
                                                    <%for (PhongBan pb : phongban){
                                                    %>
                                                    <option class="dropdown-item" value="<%=pb.getMaPhongBan()%>"><%=pb.getTenPhongBan()%></option>
                                                    <%}%>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><h6>Chuyên ngành&emsp;<h6/></td>
                                            <td>
                                                <select class="form-control" id="ChuyenNganh" name="ChuyenNganh">
                                                    <%for (ChuyenNganh cn : chuyennganh){
                                                    %>
                                                    <option class="dropdown-item" value="<%=cn.getMaChuyenNganh() %>"><%=cn.getTenChuyenNganh() %></option>
                                                    <%}%>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><h6>Trình độ học vấn&emsp;<h6/></td>
                                            <td>
                                                <select class="form-control" id="TrinhDoHocVan" name="TrinhDoHocVan">
                                                    <%for (TrinhDoHocVan hv : hocvan){
                                                    %>
                                                    <option class="dropdown-item" value="<%=hv.getMaTrinhDoHocVan() %>"><%=hv.getTenTrinhDo() %></option>
                                                    <%}%>
                                                </select>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </form>
                        </div>
                        <div class="d-flex align-items-center justify-content-between mt-4 mb-0">
                            <input class="btn btn-primary" type="submit" value="Thêm nhân viên">
                        </div>
                        </form>
                    </div>
                </main>
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted"></div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
        <script src="assets/demo/chart-area-demo.js"></script>
        <script src="assets/demo/chart-bar-demo.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
        <script src="js/datatable.js"></script>
    </body>
</html>


