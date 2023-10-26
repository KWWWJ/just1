# VPN
- Virtual Private Network
- 기기 -> VPN 서버 -> 다른 웹페이지 요청 -> VPN이 받고 -> 기기로.

#Proxy
- 다른 곳에서 우리에게 보내준 걸 다른 웹페이지, 내부적으로 다른 port로 요청을 보내 처리하는 것.
- "http://localhost" 원래는 서버를 열어 그곳에 접속하는 주소지만 네이버를 출력하게 만드는 것이 가능하다.
- 서블릿의 forward, 데코레이트 페턴.

#AWS
- 프로젝트가 많지 않으면 1대로도 돌릴 수 있디. 1대의 컴퓨터 내에서는 성능이 허락하는 만큼의 프로젝트를 배포할 수 있다.
- 다른 언어를 열기 위해서는 자바와 같이 다른 port를 지정해야 한다.(현재 Java:80(http))(Node.js:8081 / React:3000 / GoLang:8082)
- https는 443번으로 연결할 수 있다.
	- ex) 443/java => Java | 443/node.js => Node.js | 443/react => React | 443/go => GoLang
	- 이것은 apache에서 처리해 분류해주면 그쪽으로 연결한다. 이떄 사용하는게 proxy.
	- apache는 442, java는 80으로 되어있으면 Cross Origin Resource Sharing 오류가 발생한다.
	- 위의 문제를 해결하기위해 시용하는 것이 reverse proxy(.xml에서 최근에는 .conf로 설정한다.). 이 경우 443에서 보낸 요청을 80포트트로 넘겼다가 그것을 요청자에게까지 전달한다. 
