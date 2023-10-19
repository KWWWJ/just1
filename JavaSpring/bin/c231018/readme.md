# Exception
- DuplicateKeyException
  - 중복 돨 수 없는 컬럼에 중복된 값을 insert했을 떄
  
- 언테크 예외(컴파일 단계에서는 체크해주지 않는 에러)

- DataAccessException
  - SQL에서 어떤 오류가 나더라도 받아올 수 있도록 호환성을 맞춰둔다.
  
# 예외 처리 방법
- throw
  - 예외 회피
- while
  - 예외 복구
- catch 아래에 throw new 
  - 예외 전환