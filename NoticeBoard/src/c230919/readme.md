# 클라이언트

- 스마트폰 -> 크롬, 엣지, 파폭 등의 브라우저

# 통신 순서

- 클라이언트 <-> Web Server <-> Application Server <-> DB Server

# Java에서의 통신 순서

- Client <-> Web Server(Tomcat) <-> WAS <-> DB Server
- WAS <-> Servlet(컨테이너, 도메인 주소(ip))

# JSP, Servlet

- JSP, Java server page / 자바 서버에서 나타내는 웹페이지

# HTTP 통신의 종류 / RESTFUL API

- GET : 단순 데이터 요청 응답
	-GET 형식으로 써온 것, 브라우저 
- POST : 우편, 데이터를 보낼떄 사용한다.
	-데이터를 사용자가 볼 수 없게 가려준다.
	-로그인
- PUT : 서버에 데이터를 놓다.
	-데이터가 가려진다.
- PATCH : 서버의 데이터를 수정한다.
	-데이터 가림.
	-PUT과의 차이점 PUT은 모든 데이터를 보낸다, PATCH는 일부 데이터만 보낸다. 
- DELETE : 서버의 데이터를 삭제한다.
	-GET과 같은 방식으로 대이터를 주고받는다.
- OPTION : GET, POST, PUT 등을 사용할 때 상대방의 데이터를 받아올 수 있는지 확인한다.
	-CORS, Cross Origin Resource Sharing 서로 다른 주소의 데이터를 주고 받는다.(규칙)

PDST : {"action" : "delete", "data" :
{"id = 0"}}

# URL, URI

- URL : 흔히 이야기 하는 인터넷 주소
	- Uniform Resource Location
- URI : 통합 자원 식별자
	- Uniform Resource Identifier

- 둘다 인터넷 주소

## URL

- https://www.google.co.kr/?hl=ko
- https:// << 프로토콜
- www.google.co.kr << 도매인
- / << 라우터 | 컨텍스트
- ?hl=ko << 데이터, 쿼리 등


- https://www.google.co.kr/search?q=1&sca_esv=566330112&hl=ko&sxsrf=AM9HkKnLyIvucSOTqbGo5lmBDSQpV5mJcA%3A1695086753599&source=hp&ei=ofgIZanJIYLX1e8PyP6fkA8&iflsig=AO6bgOgAAAAAZQkGsceU85jtH_hFChDIE2CNXHdAYXqR&ved=0ahUKEwjpnbyewrWBAxWCa_UHHUj_B_IQ4dUDCAs&uact=5&oq=1&gs_lp=Egdnd3Mtd2l6IgExMgcQIxiKBRgnMgsQABiABBixAxiDATILEAAYgAQYsQMYgwEyCxAAGIAEGLEDGIMBMgsQABiABBixAxiDATIIEAAYgAQYsQMyCxAAGIAEGLEDGIMBMgUQABiABDILEAAYgAQYsQMYgwEyERAuGIAEGLEDGIMBGMcBGNEDSPYFUNcEWNcEcAF4AJABAJgBbKABbKoBAzAuMbgBA8gBAPgBAagCCsICBxAjGOoCGCc&sclient=gws-wiz

# 데이터 전송 방법

- GET 형식에서는 URL에 포함되어 데이터를 보낸다. << 쿼리스트링
- POST 형식에서는 데이터가 URL에 포함 되지 않는다. <<body : {}<<Jason 형식을 많이 이용함.

# Encoding / Decoding

- Encoding : 데이터 포멧을 변경한다.
- Decoding : 인코딩을 되돌린다.

## 암호화

- 인코딩

## 복호화

- 디코딩
