<%-- 
    Document   : NhanVien
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
            <meta charset="utf-8" />
            <meta http-equiv="X-UA-Compatible" content="IE=edge" />
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
            <meta name="description" content="" />
            <meta name="author" content="" />
            <title>Nhân viên</title>
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
            <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
            <link href="css/styles.css" rel="stylesheet" />
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
        </head>
    <%
        List<NhanVien> listNV = (List<NhanVien>) request.getAttribute("listNV");
        UserDAO udao = new UserDAO();
        List<TrinhDoHocVan> listHV = udao.getListHocVan();
    %>
    <body class="sb-nav-fixed">
        <%! UserDAO udao = new UserDAO();
                         %>
        <%@include file="header.jsp" %>
        <div id="layoutSidenav">
            <%@include file="menu.jsp" %>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Nhân viên</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active">Tổng quan</li>
                            <li class="breadcrumb-item active">Nhân viên</li>
                        </ol>

                        <div class="card mb-4">
                            <div class="card-header">
                                <svg class="svg-inline--fa fa-table fa-w-16 me-1" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="table" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M464 32H48C21.49 32 0 53.49 0 80v352c0 26.51 21.49 48 48 48h416c26.51 0 48-21.49 48-48V80c0-26.51-21.49-48-48-48zM224 416H64v-96h160v96zm0-160H64v-96h160v96zm224 160H288v-96h160v96zm0-160H288v-96h160v96z"></path></svg><!-- <i class="fas fa-table me-1"></i> Font Awesome fontawesome.com -->
                                Nhân viên
                            </div>
                            <div class="card-body">
                                <div class="dataTable-wrapper dataTable-loading no-footer sortable searchable fixed-columns">
                                    <div class="dataTable-container">
                                        <div>
                                            <a class="btn btn-primary" type="submit" href="ThemNhanVien.jsp">Thêm nhân viên</a>
                                        </div>
                                        <table id="datatablesSimple" >
                                            <thead>
                                                <tr>
                                                    <th data-sortable="" style="width: 19.0304%;"><a href="#" class="dataTable-sorter">Mã nhân viên</a></th>
                                                    <th data-sortable="" style="width: 28.8854%;"><a href="#" class="dataTable-sorter">Họ tên</a></th>
                                                    <th data-sortable="" style="width: 15.6321%;"><a href="#" class="dataTable-sorter">Học vấn</a></th>
                                                    <th data-sortable="" style="width: 9.28863%;"><a href="#" class="dataTable-sorter">Giới tính</a></th>
                                                    <th data-sortable="" style="width: 15.179%;"><a href="#" class="dataTable-sorter">Ngày sinh</a></th>
                                                    <th data-sortable="" style="width: 15.6321%;"><a href="#" class="dataTable-sorter">Ngày nghỉ</a></th>
                                                    <th data-sortable="" style="width: 11.4409%;"><a href="#">Số lượng: <%=listNV.size()%></a></th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%for (NhanVien nhanvien : listNV) {
//                                                    String hv = udao.getHocVan(nhanvien.getMaTrinhDoHocVan()).getTenTrinhDo();
                                                %>
                                                <tr>
                                                    <td>
                                                        <%=nhanvien.getMaNhanVien()%>
                                                    </td>
                                                    <td>
                                                        <%=nhanvien.getHoTen()%>
                                                    </td>
                                                    <td>
                                                        <%=nhanvien.getMaTrinhDoHocVan()%>
                                                    </td>
                                                    <td>
                                                        <%=nhanvien.getGioiTinh() == 1 ? "Nam" : "Nữ"%>
                                                    </td>
                                                    <td>
                                                        <%=nhanvien.getNgaySinh()%>
                                                    </td>
                                                    <td>
                                                        <%=nhanvien.getNgayNghi()%>
                                                    </td>
                                                    <%if (nhanvien.getTrangThai() != 1) {%>
                                                    <td>
                                                        <a class="btn btn-primary" href="QuaTrinhCongTac?id=<%=nhanvien.getMaNhanVien()%>" type="submit">Quá trình công tác</a>
                                                        <a class="btn" href="UpdateNhanVien.jsp?username=<%=nhanvien.getMaNhanVien()%>">
                                                            <img src="img/edit_icon.png" height="20px" width="20px"/>
                                                        </a>
                                                        <a href="DeleteNhanVien?id=<%=nhanvien.getMaNhanVien()%>">
                                                            <button type="button" class="btn" style="border: 0; background-color: transparent" onclick="confirm('Bạn có chắc chắn đuổi việc nhân viên này?')">
                                                                <img src="img/trash_icon.png" height="20px" width="20px"/>
                                                            </button>
                                                        </a>
                                                    </td>
                                                    <%}%>
                                                </tr>
                                                <%}%>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
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



