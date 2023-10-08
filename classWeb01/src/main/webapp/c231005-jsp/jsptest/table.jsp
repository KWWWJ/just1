<%@ page language="java" contentType="text/html; charset=UTF-8"
import="java.util.*"
    pageEncoding="UTF-8"%>
    
<%
	// List list = (ArrayLIst) request.getAttribute("list");
	String name1 = (String)request.getAttribute("name");
	Integer num1 = (Integer)request.getAttribute("num");
	String hobby1 = (String)request.getAttribute("hobby");
%>    

<!DOCTYPE html>
<html>
	<table>
		<tr>이름</tr>
		<tr>취미</tr>
		<tr>번호</tr>
		<%--
			for(int i=0; i< list.size(); i++){
		--%>
		<tr>
			<td><%=name1 %></td>
			<td><%=hobby1 %></td>
			<td><%=num1 %></td>
		</tr>
		
		
		<%--	
			}
		--%>
		
	</table>
</html>