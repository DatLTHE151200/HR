<%-- 
    Document   : UpdateLuong
    Created on : Mar 6, 2022, 8:52:40 PM
    Author     : Admin
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="DAL.*"%>
<%@page import="model.*"%>
<jsp:useBean id="dao" class="DAL.UserDAO" scope="request"></jsp:useBean> 
<jsp:useBean id="l" class="model.Luong" scope="request"></jsp:useBean> 
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="utf-8" />
            <meta http-equiv="X-UA-Compatible" content="IE=edge" />
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
            <meta name="description" content="" />
            <meta name="author" content="" />
            <title>Cập nhật lương</title>
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
            List<TrinhDoHocVan > hocvan = (List<TrinhDoHocVan>) udao.getListHocVan();
            List<ChuyenNganh> chuyennganh = (List<ChuyenNganh>) udao.getListChuyenNganh();
        %>
        <%@include file="header.jsp" %>
        <div id="layoutSidenav">
            <%@include file="menu.jsp" %>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Cập nhật lương</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">Tổng quan</li>
                            <li class="breadcrumb-item active">Lương</li>
                            <li class="breadcrumb-item active">Cập nhật lương</li>
                        </ol>
                        <div class="card-body">
                            <p class="alert-danger">${mess}</p>
                            <form action="UpdateLuong" method="post">
                                <div class="form-floating mb-3">
                                    <input class="form-control" id="MaNhanVien" type="text" name="MaNhanVien" value="${dao.getLuong(param.id).maNhanVien}" placeholder="Mã nhân viên" readonly=""/>
                                    <label for="MaNhanVien">Tài khoản /Mã nhân viên</label>
                                </div>
                                    <table class="" border="0">
                                    <tbody>
                                        <tr>
                                            <td><h6>Lương hiện tại&emsp;<h6/></td>
                                            <td>
                                                <input class="form-control" type="number" name="LuongToiThieu" value="${dao.getLuong(param.id).luongToiThieu}" readonly="">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><h6>Cập nhật lương&emsp;<h6/></td>
                                            <td>
                                                <input class="form-control" type="number" value="${dao.getLuong(param.id).luongToiThieu}" name="LuongSauCapNhat">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><h6>Hệ số lương&emsp;<h6/></td>
                                            <td>
                                                <input class="form-control" type="number" value="${dao.getLuong(param.id).heSoLuong}" name="HeSoLuong" readonly="">
                                            </td>
                                        </tr>  
                                        <tr>
                                            <td><h6>Bảo hiểm xã hội&emsp;<h6/></td>
                                            <td>
                                                <input class="form-control" type="number" step="0.1" value="${dao.getLuong(param.id).BHXH}" name="BHXH">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><h6>Bảo hiểm y tế&emsp;<h6/></td>
                                            <td>
                                                <input class="form-control" type="number" step="0.1" value="${dao.getLuong(param.id).BHYT}" name="BHYT">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><h6>Bảo hiểm tự nguyện&emsp;<h6/></td>
                                            <td>
                                                <input class="form-control" type="number" step="0.1" value="${dao.getLuong(param.id).BHTN}" name="BHTN">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><h6>Thuế thu nhập(%)&emsp;<h6/></td>
                                            <td>
                                                <input class="form-control" type="number" value="${dao.getLuong(param.id).thueThuNhap}" name="ThueThuNhap">
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

