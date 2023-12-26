# DAO, VO, DTO

## VO
- Value Object
- 값에 대한 객체
- 값은 변하지 않는다.(변수가 변화하지만 값 자체는 변하지 않는다.)
- getter만 있다.

## DAO
- Data Access Object
- 데이터 접속 객체, DB에 요청을 보내기 위핸 객체.

## DTO
- Data Transfer Object
- 계층(라우더)간에 데이터 전송을 보내기 위해 사용하는 객체.

## Connection pool
- 데이터를 미리 연결시켜두고 사용하고나면 다시 풀에다가 넣음으로써 메모리 할당에 대한 시간을 절약할 수 있다.
- 생성해둔 객체를 가져다가 쓰고 다 쓰면 반환한다.
