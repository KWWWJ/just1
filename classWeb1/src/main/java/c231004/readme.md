# Servlet Context
- Tomcat
  - web server
  - Container
- classWeb 컨텍스트가 생성되어있고  해당 컨텍스트에 접근하는 방법으로 Servlet Context를 사용한다.
  - Container > Context > Content
    
# Router
- URL 상에서 도메인 주소 || IP 주소 뒤에 붙는 경로
- 물리적인 공유기


# else
- servlet과 tomcat은 따로 접근하고 있다.
- 클라이언트 >> tomcat >> WAS(지금 사용하는 기준으로는 classWeb01이 되겠다.) >> servlet or DB 이런식으로 흐른다.
- container를 홈페이지로 생각한다면 context는 그 홈페이지의 세부 페이지이고 그 내부에 content라는 내용이 들어간다.

## Context
- 얘는 주소창에서는 메인 페이지 이름(지금은 classWeb01) 뒤에 붙는 세부 페이지. 
- 하나의 객체로 존재하면서 자신과 연결될 수 있는 주소를 가진다.

## DAO
- Data Access Object

## VO
- 

## 공공데이터 API
- 요청을 보낸다 -> 어떻게? > 인터넷 상의 주소를 입력, HTTP 통신방법으로 요청을 보낸다.
- GET으로 요청하면 key와 value로 주소에 쿼리스트링 형식으로 붙여보낸다.
- POST로 요청하면 key와 value로 body에 JSON형식으로 보내준다.
- 응답은 보통 JSON으로 준다.