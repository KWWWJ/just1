package c230831;

public class Main { //항상 Object를 상속받고 있음. extends Object
	public static void main(String[] args) throws Exception{ // throws Exception은 오류를 처리한다. System.in.read();에 사용함
		System.out.println("오늘 확인");
		//지금까지 써온 클래스
		//String, System, Math
		//위처럼 알아서 가져오는 것들을 기본 모듈이라 볼 수 있다.
		//java.lang에서 가져온다.
		//Scanner
		//java.util에 포함되어있다.
		//우리가 따로 다운받거나 설치하지 않은 모듈을 표준모듈이라 한다.
		//java.lang > Object, StringBuilder, Class등이 포함된다.
		
		//우리는 항상 Object를 써왔다.
		//Object는 최상위 클래스다.
		
//		Object obj = new Object();
//		Main main = new Main();
//		main.
		
		EqualsTest et1 = new EqualsTest(22, "test");
		EqualsTest et2 = new EqualsTest(22, "test");
		EqualsTest et3 = et1;
		EqualsTest2 et4 = new EqualsTest2("test");
		System.out.println(et1.equals(et2));
		System.out.println(et1.equals(et3));
		System.out.println(et1.equals(et4));
		
		System.out.println(et1.hashCode()); //메모리 주소값이라 볼 수 있다.
		System.out.println(et2.hashCode());
		System.out.println(et1.name.hashCode());
		System.out.println(et2.name.hashCode());
		
		System.out.println(et1.toString());
		System.out.println(et2.toString());
		
		RecordTest recordTest = new RecordTest(1, "카페라때");
		RecordTest recordTest2 = new RecordTest(1, "아메리카노");
		
		System.out.println(recordTest.hashCode());
		System.out.println(recordTest2.hashCode());
		System.out.println(recordTest.toString());
		System.out.println(recordTest2.toString());
		System.out.println(recordTest.num());//프라이빗이라 get으로 빼옴
		System.out.println(recordTest2.name());
		
		//위는 Object
		
		//System
		System.out.print("");
		System.out.println(""); //line의 약자가 붙음. 한 줄을 출력한다.
		//출력
		
//		System.in; //키보드를 입력받는다
		int keyInput = 0;
		while(true) {
//			keyInput = System.in.read();
//			System.out.println(keyInput);
//			//7을 입력했을 때 		55,    		13, 10
//			//8을 입력했을 때 		56,     	13, 10
//			//a를 입력했을 때 		97,     	13, 10
//			//          	 아스키코드  줄바꿈 \n  \r
			
			break;
		}
		
		System.currentTimeMillis(); //현제 시간을 m/s 단위로 받아온다.
		System.nanoTime(); // 나노 단위의 시간을 받아온다.
		System.out.println(System.currentTimeMillis());
		//1693449477.674s
		//28,224,158 m
		//470,402 h + 37m
		//19,600 d + 2h
		//53 y 255 d
		//2023 y 8 m 31 d
		//0년이 아닌 1970년을 기준으로 시간을 체크한다.
		//GMT 그리니치 시간 : 영국이 GMT + 0 // 한국 GMT + 9
		//UTC, m/s 단위
		//Date type으로 저장한다.
		
//		System.exit(0);//0 = 문제가 없이 종료된다. 1 = 문제가 생겼다. 시스템 자체를 종료시킨다.
		
		System.out.println("Java Version : "+System.getProperty("java.specification.version"));
		System.out.println("JDK Directory : "+System.getProperty("java.home"));
		System.out.println("OS : "+System.getProperty("os.name"));
		System.out.println("user : "+System.getProperty("user.home"));
		System.out.println("user Directory : "+System.getProperty("user.home"));
		System.out.println("directory : "+System.getProperty("user.dir"));
	}
	
}
class EqualsTest2 {
	String name;
	EqualsTest2(String name){
		this.name = name;
	}
}