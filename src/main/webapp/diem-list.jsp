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
                        <a href="<%=request.getContextPath()%>" class="navbar-brand">QUẢN LÝ ĐIỂM</a>
                    </div>
                </nav>
            </header>
            <br>
            <div class="row">
                <div class="container">
                    <h3 class="text-center">Điểm các môn học</h3>
                    <hr>
                    <div class="text-left" style="">
                        <form action="<%=request.getContextPath()%>/show" >
                            <select name = "mamonhoc" class="form-select" aria-label="Default select example">
                                <option value="all" selected>Chọn một môn học để thống kê</option>
                                <c:forEach var="monhoc" items="${listMonHoc}">
                                    <option value="${monhoc.mamonhoc}">${monhoc.tenmonhoc}</option>
                                </c:forEach>
                            </select>
                            <br>
                            <input style="margin-top: 15px" type="submit" class="btn btn-success" name="list"value="Xem điểm">
                        </form>
                    </div>
                    <br>
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Mã môn học</th>
                                <th>Tên môn học</th>
                                <th>Mã sinh viên</th>
                                <th>Họ </th>
                                <th>Tên</th>
                                <th>Học kỳ</th>
                                <th>Điểm chuyên cần</th>
                                <th>Điểm giữa kỳ</th>
                                <th>Điểm cuối kỳ</th>
                                <th>Điểm trung bình</th>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="diem" items="${listDiem}">
                                <tr>
                                    <td>
                                        <c:out value="${diem.mamonhoc}" />
                                    </td>
                                    <td>
                                        <c:out value="${diem.tenmonhoc}" />
                                    </td>
                                    <td>
                                        <c:out value="${diem.masinhvien}" />
                                    </td>
                                    <td>
                                        <c:out value="${diem.hosinhvien}" />
                                    </td>
                                    <td>
                                        <c:out value="${diem.tensinhvien}" />
                                    </td>
                                    <td>
                                        <c:out value="${diem.tenhocky}" />
                                    </td>
                                    <td>
                                        <c:out value="${diem.diemcc}" />
                                    </td>
                                    <td>
                                        <c:out value="${diem.diemgiuaky}" />
                                    </td>
                                    <td>
                                        <c:out value="${diem.diemcuoiky}" />
                                    </td>
                                    <td>
                                        <c:out value="${diem.diemtrungbinh}" />
                                    </td>
                                    <td>
                                        <a name="edit"href="<%=request.getContextPath()%>/edit?madiemmonhoc=<c:out value='${diem.madiemmonhoc}' />">Chỉnh sửa</a>
                                    </td>
                                    <td>
                                        <a name="delete"href="<%=request.getContextPath()%>/delete?madiemmonhoc=<c:out value='${diem.madiemmonhoc}' />">Xóa</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="container text-left" style="">
                    <a href="<%=request.getContextPath()%>/new" class="btn btn-success"name="add">Nhập điểm mới</a>
                </div>
                <div class="container text-left" style="padding-top: 15px">
                    <a href="<%=request.getContextPath()%>/thongke" class="btn btn-success"name="print">Thống kê</a>
                </div>
            </div>
        </body>
</html>