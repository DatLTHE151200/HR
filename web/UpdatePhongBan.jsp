<%-- 
    Document   : UpdatePhongBan
    Created on : Mar 6, 2022, 9:48:45 AM
    Author     : Admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<jsp:useBean id="dao" class="DAL.UserDAO" scope="request"></jsp:useBean> 
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
        <title>Cập nhật phòng ban</title>
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
            List<PhongBan> phongban = (List<PhongBan>) udao.getListPhongBan();
        %>
        <%@include file="header.jsp" %>
        <div id="layoutSidenav">
            <%@include file="menu.jsp" %>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Cập nhật phòng ban</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">Tổng quan</li>
                            <li class="breadcrumb-item active">Phòng ban</li>
                            <li class="breadcrumb-item active">Cập nhật phòng ban</li>
                        </ol>
                        <div class="card-body">
                            <form action="UpdatePhongBan" method="post">
                                <div class="form-floating mb-3">
                                    <input class="form-control" id="MaPhongBan" type="text" name="MaPhongBan" value="${dao.getPhongBan(param.id).maPhongBan}" placeholder="Mã phòng ban" readonly=""/>
                                    <label for="MaPhongBan">Mã phòng ban</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input class="form-control" id="TenPhongBan" type="text" name="TenPhongBan" value="${dao.getPhongBan(param.id).tenPhongBan}"/>
                                    <label for="TenPhongBan">Tên phòng ban</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input class="form-control" id="ĐiaChi" type="text" name="DiaChi" value="${dao.getPhongBan(param.id).diaChi}" placeholder="" />
                                    <label for="ĐiaChi">Địa chỉ</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input class="form-control" id="sdt_PhongBan" type="text" name="sdt_PhongBan" value="${dao.getPhongBan(param.id).sdt_PhongBan}" placeholder="" />
                                    <label for="sdt_PhongBan">Số điện thoại</label>
                                </div>
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


