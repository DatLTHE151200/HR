<%-- 
    Document   : table
    Created on : Jan 9, 2022, 12:01:15 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Tables - SB Admin</title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="css/styles.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed">
        <div class="card mb-4">
            <div class="card-header">
                <svg class="svg-inline--fa fa-table fa-w-16 me-1" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="table" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512" data-fa-i2svg=""><path fill="currentColor" d="M464 32H48C21.49 32 0 53.49 0 80v352c0 26.51 21.49 48 48 48h416c26.51 0 48-21.49 48-48V80c0-26.51-21.49-48-48-48zM224 416H64v-96h160v96zm0-160H64v-96h160v96zm224 160H288v-96h160v96zm0-160H288v-96h160v96z"></path></svg><!-- <i class="fas fa-table me-1"></i> Font Awesome fontawesome.com -->
                DataTable
            </div>
            <div class="card-body">
                <div class="dataTable-wrapper dataTable-loading no-footer sortable searchable fixed-columns">
                    <!--                                    <div class="dataTable-top">
                                                            <div class="dataTable-dropdown">
                                                                <label>
                                                                    <select class="dataTable-selector">
                                                                        <option value="5">5</option>
                                                                        <option value="10" selected="">10</option>
                                                                        <option value="15">15</option>
                                                                        <option value="20">20</option>
                                                                        <option value="25">25</option>
                                                                    </select>
                                                                    entries per page
                                                                </label>
                                                            </div>
                                                            <div class="dataTable-search">
                                                                <input class="dataTable-input" placeholder="Search..." type="text">
                                                            </div>
                                                        </div>-->
                    <div class="dataTable-container">
                        <table id="datatablesSimple" >
                            <thead>
                                <tr>
                                    <th data-sortable="" style="width: 19.0304%;" class="asc" onclick=""><a href="#" class="dataTable-sorter">Name</a></th>
                                    <th data-sortable="" style="width: 28.8854%;"><a href="#" class="dataTable-sorter">Position</a></th>
                                    <th data-sortable="" style="width: 15.6321%;"><a href="#" class="dataTable-sorter">Office</a></th>
                                    <th data-sortable="" style="width: 9.28863%;"><a href="#" class="dataTable-sorter">Age</a></th>
                                    <th data-sortable="" style="width: 15.179%;"><a href="#" class="dataTable-sorter">Start date</a></th>
                                    <th data-sortable="" style="width: 11.4409%;"><a href="#" class="dataTable-sorter">Salary</a></th>
                                    <th data-sortable="" style="width: 11.4409%;"><a href="#">Actions</a></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Tiger Nixon</td>
                                    <td>System Architect</td>
                                    <td>Edinburgh</td>
                                    <td>61</td>
                                    <td>2011/04/25</td>
                                    <td>$320,800</td>
                                    <td>
                                        <a class="btn" href="">
                                            <img src="img/edit_icon.png" height="20px" width="20px"/>
                                        </a>
                                        <a class="btn" href="">
                                            <img src="img/trash_icon.png" height="20px" width="20px"/>
                                        </a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <!--                                    <div class="dataTable-bottom">
                                                            <div class="dataTable-info">Showing 1 to 10 of 57 entries</div>
                                                            <nav class="dataTable-pagination">
                                                                <ul class="dataTable-pagination-list">
                                                                    <li class="active"><a href="#" data-page="1">1</a></li>
                                                                    <li class=""><a href="#" data-page="2">2</a></li>
                                                                    <li class=""><a href="#" data-page="3">3</a></li>
                                                                    <li class=""><a href="#" data-page="4">4</a></li>
                                                                    <li class=""><a href="#" data-page="5">5</a></li>
                                                                    <li class=""><a href="#" data-page="6">6</a></li>
                                                                    <li class="pager"><a href="#" data-page="2">›</a></li>
                                                                </ul>
                                                            </nav>
                                                        </div>-->
                </div>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
        <script src="js/datatable.js"></script>
    </body>
</html>

