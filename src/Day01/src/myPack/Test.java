package myPack;
//이것은 주석이다.
//자바에서 모은 코드는 반드시 클래스 안에 존재해야 한다.

public class Test {
   
	
	//main 메서드의 선언. 미리 약속된 부분이다. 반드시 항상 있어야 돔.
	//entry point임. 진입점이다.
	//처음 프로그래밍 할때 가장 많이 실수 하는것.
	//1.오타
	//2.세미콜론, 중괄호 미스매칭
	public static void main(String[] args) {
		
		//이거슨 출력
		//println- 개행(줄바꿈)
		System.out.println("지옥으로 온걸 환영한다.");
		//문자열에서+기호는 문자열을 결합한다
		System.out.println("출력"+"해라");	
		System.out.println(1);//정수(숫자)
		System.out.println(5.1);//실수
		System.out.println('1');//1이라는 문자가 출력
		//6+문장열
		
		
		System.out.println(1+5+"오늘날씨 겁나덥네");
        System.out.println(1234);
		System.out.println(1+5+"오늘날씨 겁나덥네");
	    System.out.print("나는 줄바꿈을 하지 않는다.");
		System.out.print(1234);
		System.out.print("진짜로 줄바꿈을 하지 않는다\n");
		//printf
		System.out.printf("정수 : %d", 42);
		System.out.printf("원주율 : %.3f\n",3.141592);  //     \n은 줄바꿈 기능
		System.out.printf("이름 : %s","거꾸로 해도 이효리\n");
		
		
		System.out.println("=========신상정보=========");
		System.out.println("이름 : 손민수");
		System.out.println("나이 : 30");
		System.out.println("취미 : 게임");
		System.out.println("가족관계 : 부모님,동생");
	    System.out.println("거주지 : 일산");
			
		
		
		
		
		
		
		
		
		
	
	}
	
	
	
	
}
