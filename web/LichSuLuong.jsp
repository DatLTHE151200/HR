<%-- 
    Document   : LichSuLuong
    Created on : Mar 6, 2022, 11:07:29 AM
    Author     : Admin
--%>

<%@page import="java.util.*"%>
<%@page import="DAL.*"%>
<%@page import="model.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:useBean id="dao" class="DAL.UserDAO" scope="request"></jsp:useBean>   
        <jsp:useBean id="l" class="model.CapNhatLuong" scope="request"></jsp:useBean>  
            <meta charset="utf-8" />
            <meta http-equiv="X-UA-Compatible" content="IE=edge" />
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
            <meta name="description" content="" />
            <meta name="author" content="" />
            <title>Lịch sử lương</title>
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
            <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
            <link href="css/styles.css" rel="stylesheet" />
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
        </head>
    <%
        List<CapNhatLuong> listL = (List<CapNhatLuong>) request.getAttribute("listL");
        NhanVien user = (NhanVien) request.getAttribute("user");
    %>
    <body class="sb-nav-fixed">
        <% UserDAO udao = new UserDAO();
        %> 
        <%@include file="header.jsp" %>
        <div id="layoutSidenav">
            <%@include file="menu.jsp" %>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Lịch sử lương</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">Tổng quan</li>
                            <li class="breadcrumb-item active">Lương</li>
                            <li class="breadcrumb-item active">Lịch sử lương</li>
                        </ol>
                        <div class="card mb-4">
                            <div class="card-header">
                                <svg class="svg-inline--fa fa-table fa-w-16 me-1" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="table" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M464 32H48C21.49 32 0 53.49 0 80v352c0 26.51 21.49 48 48 48h416c26.51 0 48-21.49 48-48V80c0-26.51-21.49-48-48-48zM224 416H64v-96h160v96zm0-160H64v-96h160v96zm224 160H288v-96h160v96zm0-160H288v-96h160v96z"></path></svg><!-- <i class="fas fa-table me-1"></i> Font Awesome fontawesome.com -->
                                <%=user.getHoTen()%>
                            </div>
                            <div class="card-body">
                                <div class="dataTable-wrapper dataTable-loading no-footer sortable searchable fixed-columns">
                                    <div class="dataTable-container">                                       
                                        <table id="datatablesSimple" >
                                            <thead>
                                                <tr>
                                                    <th data-sortable="" style="width: 19.0304%;"><a href="#" class="dataTable-sorter">Mã nhân viên</a></th>
                                                    <th data-sortable="" style="width: 28.8854%;"><a href="#" class="dataTable-sorter">Lương cũ</a></th>
                                                    <th data-sortable="" style="width: 15.6321%;"><a href="#" class="dataTable-sorter">Lương mới</a></th>
                                                    <th data-sortable="" style="width: 9.28863%;"><a href="#" class="dataTable-sorter">Bảo hiểm</a></th>
                                                    <th data-sortable="" style="width: 15.179%;"><a href="#" class="dataTable-sorter">Hệ số lương</a></th>
                                                    <th data-sortable="" style="width: 15.179%;"><a href="#" class="dataTable-sorter">Thuế(%)</a></th>
                                                    <th data-sortable="" style="width: 15.179%;"><a href="#" class="dataTable-sorter">Ngày cập nhật</a></th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach var="o" items="${dao.listBangLuong}">
                                                    <tr>
                                                        <td>
                                                            <c:out value="${dao.listBangLuong.maNhanVien}"></c:out>
                                                        </td>
                                                        <td>
                                                            ${o.luongHienTai}
                                                        </td>
                                                        <td>
                                                            ${o.luongSauCapNhat}
                                                        </td>
                                                        <td>

                                                        </td>
                                                        <td>
                                                            ${o.heSoLuong}
                                                        </td>
                                                        <td>
                                                            ${o.thueThuNhap}
                                                        </td>    
                                                        <td>
                                                            ${o.ngayCapNhat}
                                                        </td>
                                                    </tr>
                                                </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
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



