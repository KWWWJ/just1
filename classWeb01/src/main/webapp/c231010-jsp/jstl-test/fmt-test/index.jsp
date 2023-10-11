<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.Date"
    pageEncoding="UTF-8"%>

<%-- fmt = formet, 언어 형식 --%>
<%-- JSTL => c, fmt, sql, x(XML), fn(function) --%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FMT테스트</title>
</head>
<body>
	<fmt:setLocale value="en_US" />
	
	<%-- 
	<fmt:setLocale value="ko_KR" />
	<fmt:setLocale value="ja_JP" />
	<fmt:setLocale value="zh_CN" />
	--%>
	
	<div id="Locale" data-locale="ko_KR" >
		<div id="name" data-name="test_ko.name"></div>
		<%-- 파일의 위치는 WEB-INF > classes > student.properties --%>
		<%-- 파일의 위치는 WEB-INF > classes > student_ko.properties --%>
		
		<fmt:bundle basename="student">
			<fmt:message key="student.name"/><br />
			<fmt:message key="student.className"/><br />
		</fmt:bundle>
		
		<fmt:setLocale value="ko_KR" />
		<fmt:setBundle basename="student" /> <%-- 얘는 아래있는 파일 전체를 바꿔준다. --%>
			<fmt:message key="student.name"/><br />
			<fmt:message key="student.className"/><br />
			<%-- ㅣ18n 이 나오면 그냥 포멧을 사용하고 있다고 보면된다--%>
			
		<fmt:formatNumber value="1000" type="number" var="won" />
		${won }<br />
		<fmt:formatNumber value="1000" type="currency" currencySymbol="\\" groupingUsed="true" />
		
		<br />
		<c:set var="now" value="<%=new Date() %>" />
		<%-- java.util.Date import하기 --%>
		
		${now }<br />
		<fmt:timeZone value="America/New York">
			<fmt:formatDate 
			value="${now }" 
			type="both" <%-- both, time 등 --%>
			dateStyle="full" 
			timeStyle="full" <%-- full, sort 등 --%>/>
			<br />
			<fmt:formatDate 
			value="${now }"
			pattern="YYYY / MM / dd - hh : mm : ss"
			/>
			<br />
		</fmt:timeZone>
		
	</div>
	
</body>
</html>