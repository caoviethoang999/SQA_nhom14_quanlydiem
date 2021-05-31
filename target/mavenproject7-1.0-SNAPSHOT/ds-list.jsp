<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>
        <head>
            <title>QUẢN LÝ ĐIỂM</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>
        <body>
            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href="#" class="navbar-brand">Thống kê sinh viên được thi/không được thi</a>
                    </div>
                    <ul class="navbar-nav">
                        <li><a style="color: black" href="<%=request.getContextPath()%>/show" class="nav-link">Điểm môn học</a></li>
                    </ul>
                </nav>
            </header>
            <br>
            <div class="row">
                <div class="container">
                    <h3 class="text-center">DANH SÁCH SINH VIÊN</h3>
                    <hr>
                    <div class="text-left" style="">
                        <form action="<%=request.getContextPath()%>/thongke" >
                            <select name = "mamonhoc" class="form-select" aria-label="Default select example">
                                <option value="null" selected>Chọn một môn học</option>
                                <c:forEach var="monhoc" items="${listMonHoc}">
                                    <option value="${monhoc.mamonhoc}">${monhoc.tenmonhoc}</option>
                                </c:forEach>
                            </select>
                            <br>
                            <input style="margin-top: 15px" type="submit" class="btn btn-success" value="Thống kê">
                        </form>
                    </div>
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Mã sinh viên</th>
                                <th>Họ sinh viên</th>
                                <th>Tên sinh viên</th>
                                <th>Học kỳ</th>
                                <th>Trạng thái</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="ds" items="${sinhvienduocthi}">
                                <tr>
                                    <td>
                                        <c:out value="${ds.masinhvien}" />
                                    </td>
                                    <td>
                                        <c:out value="${ds.hosinhvien}"/>
                                    </td>
                                    <td>
                                        <c:out value="${ds.tensinhvien}"/>
                                    </td>
                                    <td>
                                        <c:out value="${ds.tenhocky}"/>
                                    </td>
                                    <td>
                                        Được thi
                                    </td>
                                </tr>
                            </c:forEach>
                            <c:forEach var="ds" items="${sinhvienkhongduocthi}">
                                <tr>
                                    <td>
                                        <c:out value="${ds.masinhvien}" />
                                    </td>
                                    <td>
                                        <c:out value="${ds.hosinhvien}"/>
                                    </td>
                                    <td>
                                        <c:out value="${ds.tensinhvien}"/>
                                    </td>
                                    <td>
                                        <c:out value="${ds.tenhocky}"/>
                                    </td>
                                    <td>
                                        Không được thi
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </body>
</html>