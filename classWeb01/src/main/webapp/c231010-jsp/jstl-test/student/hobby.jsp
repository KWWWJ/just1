<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="hobby" class="c231010.HobbyBean" />
<jsp:setProperty name="hobby" property="*" />
<jsp:useBean id="hobbys" class="java.util.ArrayList" scope="page"/>
<jsp:useBean id="hobbysMap" class="java.util.HashMap" scope="page"/>

<%
	hobbys.add(new HobbyBean("권원준1"));
	hobbys.add(new HobbyBean("권원준2"));
	hobbys.add(new HobbyBean("권원준3"));
	hobbys.add(new HobbyBean("권원준4"));
	request.setAttribute("students", hobbys);
	
	request.setAttribute("error", false);//student2에서 임시로 사용한것.
	
	hobbysMap.put("students", hobbys);
	hobbysMap.put("students", hobbys);
	request.setAttribute("error", false);
	request.setAttribute("studentsMap", hobbysMap);
	session.setAttribute("studentsMap", hobbysMap);
	
%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>