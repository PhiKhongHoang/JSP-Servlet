<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
	integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
	crossorigin="anonymous"></script>
	
	<style>
		.rq {
			color: red;
		}
	</style>
</head>
<body>
<%
	String e_SoLuong = request.getAttribute("e_SoLuong") + "";
	String e_SoDienThoai = request.getAttribute("e_SoDienThoai") + "";
	String e_Email = request.getAttribute("e_Email") + "";
	
	e_SoLuong = (e_SoLuong.equals("null")) ? "" : e_SoLuong;
	e_SoDienThoai = (e_SoDienThoai.equals("null")) ? "" : e_SoDienThoai;
	e_Email = (e_Email.equals("null")) ? "" : e_Email;
%>

	<div class="container mt-4">
		<form action="mua-hang">
			Số lượng cần mua:
			<input type="text" name="soLuong" class="form-control" requied> <span class="rq"><%=e_SoLuong %></span> <br>
			Số điện thoại:
			<input type="text" name="soDienThoai" class="form-control" requied> <span class="rq"><%=e_SoDienThoai %></span> <br>
			Email:
			<input type="email" name="email" class="form-control" requied> <span class="rq"><%=e_Email %></span> <br>
			<input type="submit" value="muaHang" class="form-control">
		</form>
	</div>
</body>
</html>