<%@ page language="java" contentType="text/html; charset=UTF-8"
		errorPage="./exception.jsp"
    	pageEncoding="UTF-8"%>
    	
<jsp:useBean id="temp1" class="TestBeanJspServlet.Sample" scope="page"></jsp:useBean>
<jsp:useBean id="temp2" class="TestBeanJspServlet.Sample" scope="page"></jsp:useBean>
<jsp:useBean id="temp3" class="TestBeanJspServlet.Sample" scope="page"></jsp:useBean>
<jsp:setProperty name="temp1" property="name"/>
<jsp:setProperty name="temp2" property="use"/>
<jsp:setProperty name="temp3" property="test"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여기서 bean으로 변수를 받고 servlet으로 보내야한다.</title>
</head>
<body>

	<form method="post" action="/classWeb01/trancefer">
      param : <input type="text" name="param">
      <div><jsp:getProperty name="temp1" property="name"/></div>
	  <div><jsp:getProperty name="temp2" property="use"/></div>
	  <div><jsp:getProperty name="temp3" property="test"/></div>
      <input type="submit" value="전송">
    </form>
	
	
</body>
</html>