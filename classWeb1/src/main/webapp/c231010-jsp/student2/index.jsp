<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="c231006.StudentBean"
    import="java.util.List"
    isELIgnored="false"%>
    
<%--webapp/c231010-jsp/student2/index.jsp--%>

<%--
	List students = (ArayLit) request.getAttribute("students");
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	${studentsMap.students[0].name }<br />
	${studentsMap.students[1].name }<br />
	${sessionScope.studentsMap.students[0].name }<br />
	page => request => session => application(Context, Servlet)
	<%=request.getContextPath() %>
	${pageContext.request.contextPath }<br />
	${requestScope.error }<br />
	<%-- pageScope ,requestScope, sessionScope --%>
	<% for(int i=0; i<2; i++){%>
		<%=i %>
	<%} %>
	
	
</body>
</html>