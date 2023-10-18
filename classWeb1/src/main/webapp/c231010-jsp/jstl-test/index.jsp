<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--webapp/c231010-jsp/jstl-test/index.jsp--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--               core                                      --%>
<%-- 이거 쓰려면 tomcat에서 다운로드 받아줘야한다. --%>


<jsp:useBean id="list" class="java.util.ArrayList" />
<%

	list.add("첫째");
	list.add("둘째");
	list.add("셋째");


%>

<c:set var="name" value="권원준"/>
<c:set var="name" value="권원준2"/>
<c:set var="className" value="${\"java\" }"/>
<c:remove var="name"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custom Tags</title>
</head>
<body>
	
	직접 커스텀하는 것보다는 jstl에 있는 이미 커스텀 되어있는 테그를 사용한다.<br />
	커스텀 태그 : JSP에서 자바를 더 쓰기 싫어 만든 것.<br />
	JSTL : JSP Standard Tag Library<br />
	${name }<br />
	${className }<br />
	조건문 /if, if else, else, switch, case, default... 하지만 모두 구현되어있지는 않다.<br />
	
	<c:if test="${3>1 }">
		크다<br />
	</c:if>
	
	<c:if test="${3<1 }">
		작다<br />
	</c:if>
	<hr />
	<c:choose>
		<c:when test="${3>1 }">크다<br /></c:when>
		<c:when test="${3<1 }">작다<br /></c:when>
	</c:choose>
	<hr />
	<c:choose>
		<c:when test="${3>45 }">작다<br /></c:when>
		<c:otherwise>해당하는 조건이 없음</c:otherwise>
	</c:choose>
	<hr />
	반복문 / for, while, forEach<br />
	for(int i=0; i<10; i++){}<br />
	<c:forEach var="i" begin="0" end="10" step="2" varStatus="loop" >
		${i } : ${loop.count }<br />
	</c:forEach>
	<c:forEach var="item" items="${list }" varStatus="loop">
		${loop.count }번. ${item }<br />
	</c:forEach>
	<c:out value="<div>테스트중</div>" escapeXml="false" />
	<c:out value="&lt" escapeXml="false" />
	<c:out value="&gt" escapeXml="false" />
	<hr />
	<c:url var="urlTest" value="../student">
		<c:param name="name" value="url테스트"/>
	</c:url>
	<a href="${urlTest }">url테스트로 보내기</a>
	<%-- <c:redirect url="../student">
		<c:param name="name" value="redirect테스트"></c:param>
	</c:redirect>--%>
	
	
</body>
</html>