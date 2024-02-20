<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Object obj_thongBao = request.getAttribute("thongBao");
	String thongBao = "";
	if(obj_thongBao != null) {
		thongBao = obj_thongBao.toString();
	}
	%>
	
	<h1>Đăng nhập thất bạn. Vui lòng kiểm tra "Tên đăng nhập" và "Mật khẩu".</h1>
	
	<%=thongBao %>
</body>
</html>