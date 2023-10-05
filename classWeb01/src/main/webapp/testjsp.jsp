<%@ page language="java" contentType="text/html; charset=EUC-KR"
  session="false"
    pageEncoding="UTF-8"%> <!-- 앞 뒤에 %가 들어간다 @는 뒤의 page를 하나의 태그로 인식한다 -->
    
<!-- 
	위와 같은 것들을 디렉티브 태그라고 한다.
 -->    
 
 <%--
 	JSP에서의 주석
 	
 	디렉티브 테그
 		- 페이지 디렉티브 태그
 		: 자바에서 사용하는 페이지를 설정하는 정보를 갖고있다
 		  language = JSP에서 사용하는 언어
 		  contentType = 페이지 출력 형식
 		  session = 세션 사용여부, true
 		  pageEncoding = 페이지에서 사용하는 언어 형식
 		  import = 다른 페키지에서 가져옴
 		  errorPage, isErrorPage
 		
 		- 인클루드 디렉트브 태그
 		: 다른 JSP파일의 내용을 가져온다.
 		
 		- 태그라이브 디렉티브 태그
 		: 다른 라이브러리를 가져온다.
  --%>
    
<%
	String str = "java code를 입력할 수 있는 공간";
%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP TEST</title>
</head>
<body>
	<h1>페이지에 출력 (C:\Users\oooon\eclipse-workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\classWeb01\org\apache\jsp)</h1>
</body>
</html>