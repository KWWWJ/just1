<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- action tag = 자바 코드를 줄이기 위해 사용(프론트엔드 기준 더 편리한 개발이 가능하다.)--%>
    
<jsp:useBean id="temp" class="c231006.StudentBean" scope="page"></jsp:useBean> 
<jsp:setProperty name="temp" property="name" value="권원준 : setProperty"/>
<%--<jsp:setProperty name="temp" property="name" value='<%=request.getParameter("name")%>'/>
<jsp:setProperty name="temp" property="name" param="name"/>
<jsp:setProperty name="temp" property="num" param="num"/>  --%>

<jsp:setProperty name="temp" property="*"/>

<%-- 파라미터(주소창)에 입력한 값을 가져온다. --%>

<%
    //StudentBean temp = new StudentBean(); //쓰려면 위에서 import로 가져와야함
    //temp.setName("권원준 : temp에 대입"); //위에 StudentBean클래스가 주석이 아니거나, useBean만 있을떄.
    //temp.setName(request.getParameter("name"));
%>
    

   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../errorPage1.jsp"/>
	<%-- 자바 파일이 따로만들어진다. --%>
	<jsp:include page="../table.jsp">
		<jsp:param value="권원준" name="name"/>
	</jsp:include>
	<%--
	<jsp:forward page="../table.jsp">
		<jsp:param value="KWJ" name="name"/>
	</jsp:forward>
	 --%>
	 <div><%=temp.getName() %></div>
	 <div><h4>아래는 getProperty를 사용한 경우</h4></div>
	 <div><jsp:getProperty name="temp" property="name"/></div>
	 <div><jsp:getProperty name="temp" property="number"/></div>
	 <div><jsp:getProperty name="temp" property="test"/></div>
	
</body>
</html>