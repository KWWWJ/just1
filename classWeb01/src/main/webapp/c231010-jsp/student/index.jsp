<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="c231006.StudentBean"
    pageEncoding="UTF-8"%>

<%--webapp/c231010-jsp/student/index.jsp--%>
<jsp:useBean id="student" class="c231006.StudentBean" />
<jsp:setProperty name="student" property="*" />
<jsp:useBean id="students" class="java.util.ArrayList" scope="page"/>
<jsp:useBean id="students2" class="java.util.ArrayList" scope="page"/>
<jsp:useBean id="studentsMap" class="java.util.HashMap" scope="page"/>
<jsp:useBean id="studentsMap2" class="java.util.HashMap" scope="page"/>

<%
	students.add(new StudentBean("권원준1"));
	students.add(new StudentBean("권원준2"));
	students2.add(new StudentBean("권원준3"));
	students2.add(new StudentBean("권원준4"));
	request.setAttribute("students", students);
	
	request.setAttribute("error", false);//student2에서 임시로 사용한것.
	
	studentsMap.put("students", students);
	studentsMap2.put("students", students2);
	request.setAttribute("error", false);
	request.setAttribute("studentsMap", studentsMap);
	session.setAttribute("studentsMap", studentsMap2);
	
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	${empty student }<br />
		<%-- 
	${empty students }<br />
	<%=request.getParameter("name") %><br />
	${param.name }<br />
	<%=student.getName() %><br />
	${student.name }<br />  --%>
	<jsp:forward page="../student2/index.jsp"></jsp:forward>
	${students[0].name }<br />

	
</body>
</html>