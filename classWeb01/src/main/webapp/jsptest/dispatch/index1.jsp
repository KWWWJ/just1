<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index1</title>
</head>
<body>
	<%
		String name = (String) request.getAttribute("name");
	%>
	<%=name %>
	<h1>위에 나오나?</h1>
</body>
</html>