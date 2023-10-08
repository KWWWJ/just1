<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="javax.servlet.RequestDispatcher"
    pageEncoding="UTF-8"%>

    
<%!
//!는 선언문	(class)
	String hobby = "웹소설읽기";
	public String getHobby(){
		return hobby;
	}
	public int count = 0;
	
%>
    
<%
//여기는 스크립트릿   (main)
	String name = "권원준";
    getHobby();
    String age = request.getParameter("age");
    Cookie cookie = new Cookie("test", "1234");
    response.addCookie(cookie);
    application.setAttribute("servletContext", "입니다.");
    session.setAttribute("session", "입니다.");
%>    

<%
	request.setAttribute("num", 3);
	request.setAttribute("name", "권원준");
	request.setAttribute("hobby", "독서");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트</title>
</head>
<body>
	<%@ include file="./table.jsp" %>
	<%=name+"입니다." %>
	<%=getHobby() + "를 주로 하는 편입니다." %>
	<%=Integer.parseInt(age) + 10%>
	<%=session.getAttribute("session") %>
	<%-- 표현식 --%>
	<%while(count<5){
		count++;
		%>
		
	<div><%=count%>번 돌았다.</div>	
		
	<%
	}
	%>	
	
	<%--
		RequestDispatcher dispatch = request.getRequestDispatcher("./table.jsp");
		dispatch.forward(request, response);
	--%>
	
	
</body>
</html>