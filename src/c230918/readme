# 네트워크
- 연결망
- 로컬끼리 연결하는 연결망
	- 인터넷
  - 서버끼리의 연결
  
# 서버
- 외부에서 접근 가능한 컴퓨터
 
# 포트
- 외부에서 접근할 수 있도록 열어두는 문
	- 들어오는 요청이 무엇을 통해 들어오는가
	
## 대표적인 포트
- 22 : SSH* << 배포때 사용
- 80 : HTTP* << 웹 프로토콜
- 443 : HTTPS* << 인증된 웹 프로토콜
- 1521 : Oracle
- 3306 : mySQL

# 도메인
- 배포시 접근하기 쉽게 하기 위해
- 도매인 입력 >> ip주소로 이동
- 서울시 천호동 ...... : 경도 ?도 위도 ?도
- 최하위.하위.상위.최상위(com|org|net|kr)
	- co.kr의 경우 kr만 최상위(회사)
	- pe.kr도 있음(개인)

# HTTP
- HyperText Transfer protocol
- 브라우저에서 통하는 규직

## HHTTPS
- HTTP + Secure
- 인증된 HTTP통신
- SSL 인증방식을 사용한다
	-Let'sEncrypyto | certbot
	-AWS에서는 호스팅 영역리 있을시 자동인증 지원(유로)
	
# HTML
- HyperText MarkUp Language 
- 웹페이지에 출렷 담당. 구조만 있을 뿐 flow는 없다.

'''HTML
<html>
	<head>
		<title>	제목	</title>
	</head>
	<body>	
		<div>
			내용
		</div>
	</body>
</html>
'''

# CSS
- CasCading Style Sheets
- 웹페이지의 모양을 담당한다

# JavaScript
- 웹페이지의 로직을 담당
- Java와는 이름만 비슷함
- Java = Oracle / JavaScript = Mozila
- 원래는 Mocha -> JavaScript로 변경 = 접근성 높이려고

<html>
	<head>
		<title> 제목 </title>
		<script>
			JavaScript입력
		</script>
		<script src = "자바스크립트 파일의 주소"
		</script>
		<style>
		<link href = "CSS 파일 주소" rel = "stylesheet" /> // 내용이 없으니 닫으라는 의미
	</head>
	<body>
		<div>
			내용
		</div>
	</body>
</htmal>	

# Java에서의 web server open?
- Tomcat을 사용한다.

# Server
## Web Server
- Web을 주는 서버

## Application Server
- Data를 주는 서버

## DB Server

## Web Application Server
- WAS(java에서 사용하는 서버)

# Tomcat
- Apache를 기반으로 돌아가는 프로그램
- PHP로 되어있다.
- WAS 
- Windows : tomcat9\bin\tomcat9.exe
- Mac : tomcat9/bin 에서 startup.s실행(ㅌ)
- http://localhost:8888/

## Apache
- Web Server
- PHP를 사용해서 WAS처럼 사용할 수 있다.

# OSI 7계층 | TCP&IP 5계층
- 7층(5층) HTTP << 한 번 요청받고 한 번 응답하면 끝. 끝나면 연결을 끊는다. 
(Web Socket은 엄밀히 따져 HTTP통신이 없으면 의미도 없고 만들 수도 없다.)
- 6층(4층) socket << 데이터를 조건없이 주고 받을 수 있다.(카카오톡처럼 일방적으로 여러 메세지를 보내는 것, 혹은 온라인 게임이 이런 류)
- 5층(4층) TCP | UDP << 데이터를 정상적으로 받을 준비가 되었는지 체크. | 체크 없이 보낸다. 
- 4층 IP




# 잡설(JavaScript)
- JavaScript는 인터프리터 언어이며 세상에서 가장 빠른 프로그래밍 언어.
- OS상에서 사용하는 것이 아닌 브라우저에서 사용하는 것을 기본으로 하고 있기 때문.
- Node.js << OS에서 JavaScript를 실행할 수 있게 해준다.
- Node.js 기반으로 React 라이브러리를 사용할 수 있다.
- React 라이브러리는 View만을 위한 JavaScript 라이브러리.
- 이외에도 Vue.js, Angular.js라는 프레임워크가 있다.
	- Angular.js는 죽었다.
	- React VS Vue.js의 추세
- 프론트 엔드 기술이지만 Node.js를 통해 백엔드 개발도 가능하다.