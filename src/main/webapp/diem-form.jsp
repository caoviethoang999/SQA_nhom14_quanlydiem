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
                        <a href="<%=request.getContextPath()%>" class="navbar-brand"> QUẢN LÝ ĐIỂM </a>
                    </div>

           
                </nav>
            </header>
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                        <c:if test="${diem != null}">
                            <form action="update" method="post">
                        </c:if>
                        <c:if test="${diem == null}">
                            <form action="insert" method="post">
                        </c:if>
                        <caption>
                            <h2>
                                <c:if test="${diem != null}">
                                    Cập nhập điểm
                                </c:if>
                                <c:if test="${diem == null}">
                                    Thêm bảng điểm
                                </c:if>
                            </h2>
                        </caption>
                        <c:if test="${diem != null}">
                            <input type="hidden" name="madiemmonhoc" value="<c:out value='${diem.madiemmonhoc}' />" />
                        </c:if>
                        <fieldset class="form-group">
                            <label>Mã điểm môn học</label> <input type="text" value="<c:out value='${diem.madiemmonhoc}' />" class="form-control" name="madiemmonhoc">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>Mã môn học</label> <input type="text" value="<c:out value='${diem.mamonhoc}' />" class="form-control" name="mamonhoc">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>Mã sinh viên</label> <input type="text" value="<c:out value='${diem.masinhvien}' />" class="form-control" name="masinhvien">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>Mã học kỳ</label> <input type="text" value="<c:out value='${diem.mahocky}' />" class="form-control" name="mahocky">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>Điểm chuyên cần</label> <input type="double" value="<c:out value='${diem.diemcc}' />" class="form-control" name="diemcc">
                        </fieldset>
                        <fieldset class="form-group">
                            <label>Điểm giữa kỳ</label> <input type="double" value="<c:out value='${diem.diemgiuaky}' />" class="form-control" name="diemgiuaky">
                        </fieldset>
                        <button type="submit"class="btn btn-success"name="commit">Save</button>
                        </form>
                    </div>
                </div>
            </div>
        </body>
</html>