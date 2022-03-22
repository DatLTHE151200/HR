<%-- 
    Document   : UpdateNhanVien
    Created on : Mar 6, 2022, 8:52:40 PM
    Author     : Admin
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="DAL.*"%>
<%@page import="model.*"%>
<jsp:useBean id="dao" class="DAL.UserDAO" scope="request"></jsp:useBean> 
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="utf-8" />
            <meta http-equiv="X-UA-Compatible" content="IE=edge" />
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
            <meta name="description" content="" />
            <meta name="author" content="" />
            <title>Cập nhật thông tin nhân viên</title>
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
            <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
            <link href="css/styles.css" rel="stylesheet" />
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
        </head>

        <body class="sb-nav-fixed">
        <%
            UserDAO udao = new UserDAO();
            String id = (String) request.getAttribute("username");
            List<TrinhDoHocVan> hocvan = (List<TrinhDoHocVan>) udao.getListHocVan();
            List<ChuyenNganh> chuyennganh = (List<ChuyenNganh>) udao.getListChuyenNganh();
        %>
        <%@include file="header.jsp" %>
        <div id="layoutSidenav">
            <%@include file="menu.jsp" %>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Cập nhật thông tin nhân viên</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">Tổng quan</li>
                            <li class="breadcrumb-item active">Nhân viên</li>
                            <li class="breadcrumb-item active">Cập nhật thông tin nhân viên</li>
                        </ol>
                        <div class="card-body">
                            <p class="alert-danger">${mess}</p>
                            <form action="UpdateNhanVien" method="post">
                                <div class="form-floating mb-3">
                                    <input class="form-control" id="MaNhanVien" type="text" name="MaNhanVien" value="${dao.getUser(param.username).maNhanVien}" placeholder="Mã nhân viên" readonly=""/>
                                    <label for="MaNhanVien">Tài khoản /Mã nhân viên</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input class="form-control" id="Password" type="password" name="Password" value="${dao.getUser(param.username).matKhau}" placeholder="Mật khẩu" required="show"/>
                                    <label for="Password">Mật khẩu</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input class="form-control" id="HoTen" type="text" name="HoTen" value="${dao.getUser(param.username).hoTen}" placeholder="Họ tên" />
                                    <label for="HoTen">Họ tên</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input class="form-control" id="HoTen" type="number" name="NgayNghi" value="${dao.getUser(param.username).ngayNghi}" placeholder="Họ tên" />
                                    <label for="HoTen">Số ngày nghỉ</label>
                                </div>
                                <table border="0">
                                    <tbody>
                                        <tr>
                                            <td><h6>Ngày sinh&emsp;<h6/></td>
                                            <td>
                                                <input class="form-control" type="date" value="${dao.getUser(param.username).ngaySinh}" name="NgaySinh">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><h6>Giới tính&emsp;<h6/></td>
                                            <td>
                                                <input type="radio" id="Nam" name="GioiTinh" value="1" ${dao.getUser(param.username).gioiTinh==1?"checked":""}>
                                                <label for="Nam">Nam</label>&emsp;
                                                <input type="radio" id="Nu" name="GioiTinh" value="0" ${dao.getUser(param.username).gioiTinh!=1?"checked":""}>
                                                <label for="Nu">Nữ</label>&emsp;
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><h6>Chuyên ngành&emsp;<h6/></td>
                                            <td>
                                                <select class="form-control" id="ChuyenNganh" name="ChuyenNganh">
                                                    <%for (ChuyenNganh cn : chuyennganh) {
                                                    %>
                                                    <option class="dropdown-item" value="<%=cn.getMaChuyenNganh()%>"><%=cn.getTenChuyenNganh()%></option>
                                                    <%}%>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><h6>Trình độ học vấn&emsp;<h6/></td>
                                            <td>
                                                <select class="form-control" id="TrinhDoHocVan" name="TrinhDoHocVan">
                                                    <%for (TrinhDoHocVan hv : hocvan) {
                                                    %>
                                                    <option class="dropdown-item" value="<%=hv.getMaTrinhDoHocVan()%>"><%=hv.getTenTrinhDo()%></option>
                                                    <%}%>
                                                </select>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                                <div class="d-flex align-items-center justify-content-between mt-4 mb-0">
                                    <button class="btn btn-primary" type="submit" >Lưu thay đổi</button>
                                </div>
                            </form>
                        </div>
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

