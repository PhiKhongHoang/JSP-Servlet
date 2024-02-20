<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.lang.Math" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bài tập jsp</title>
</head>
<body>
	<%
		int a = 3;
		int b = 6;
		int sum = a + b;
		double canBanHai = Math.sqrt(sum);
	%>
	
	Ba cộng sáu = <b><%= sum %></b>
	<br>
	Căn bậc hai của <b><%= sum %></b> là: <%= canBanHai %>
	
</body>
</html>