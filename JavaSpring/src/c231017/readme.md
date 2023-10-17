# 컴퓨터를 조립한다.
## 생각 요소
  - 메인보드, CPU, Power, GPU, RAM, HDD/SD 하드디스크, 케이스, 사운드 카드, 키보드&마우스, 모니터
 1. CPU || GPU
 2. GPU || CPU
 3. 메인보드
 4. power || 케이스
 5. RAM
 6. HDD/SSD 하드디스크
 7. 키보드 마우스 모니터
 8. 사운드카드
  - 생각은 플로우, 선택은 용도애 맞춰 우선순위를 바꾸는 것이 전략패턴

# 디자인 패턴(약 20가지)

## 생성 패턴
- 싱글톤
- 팩토리 메서드

## 구조 패턴

## 행동 패턴
- 전략
- 템플릿 메서드
- 상태(State)

# MVC
- MVC 패턴 혹은 MVC 모델이라 부른다. 프로그램 디자인 패턴 중 하나.(소프트웨어 공학에서의 디자인 패턴)
- 데이터를 다루는 내용에서의 이야기
- 파일이 커져도 하나의 Controller만 사용할 수 있기 떄문에 복잡해진다.

## M
- Model
- 저장한다. => DB, FileServer, 자바 상에서는 DAO
- DB
  - 코드 알 수 없음.
  - 어떻게 보이는지 알 수 없음.
  -입력한 데이터는 모두 저장.
- 조건
  - 사용자가 사용(편집)하길 원하는 모든 데이터를 저장해야한다.
  - View나 Controller를 알 수 없다.
  - 바뀌면 Controller로 알려야한다.(때에 따라 View도 포함)

## V
- View
- 보여준다. => Front-End / HTML
- 조건
  - Model이나 Controller에 대해 알 수 없다.
  - Model에 저장된 데이터를 저장하면 안된다.
  - 바뀌면 Controller에 알려야한다.

## C
- Controller 
- 조작한다. => Front, Back-End
- 조건
  - 전부 알아야한다.(모니터링한다)
  
  
# MVP

## P
- Presenter << 진행자
- View와 Model 사이에서 조절한다.

## MVVM
- Model View View Model
- Controller 없이 서로 연결
- React에서 다시 등장 예정(React는 프레임워크가 아닌 라이브러리이다. 즉 View 포지션에 해당함)
  -Redux
  -Controller << BackEnd에서 따로 관리한다.
  
  
# Test
- 단위 테스트 : Unit Test
- User 패키지 내에서 몇가지의 기능을 돌아가며 테스트하는 것 등의 테스트
- 스프링 내에서 어떠한 기능을 만들어 그 기능만 테스트 하게된다.
- JUnit : 테스트 프래임워크

## TDD
- Test Driven Development
- 테스트 주도 개발
- 기능별 모든 테스트를 진행하고 조립해서 사용한다. 
- 하나의 기능 개발에 시간이 오래걸린다






