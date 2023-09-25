package myPack;

public class variable {

	public static void main(String[] args) {
		
		
		
		//변수?
		//프로그래밍에서 가장 기본적인 동작은 데이터를 저장,
		//저장된 데이터 값을 읽어온다.
		
		//데이터를 저장하려면 메모리에 값을 저장할 공간을 생성한다.
		//이름을 부여해야한다.
		
		//사물함이 여러개 있을때 물건을 보관하고 번호를 매겻다면?
		//사물함이 메모리, 사물함의 번호가 변수라고보면된다.
		
		//단 하나의 값을 저장 할수있는 메모리 공간임.
		//1,2,3,4 ->정수형
		//3.14,...->실수형
		//a,b,한,->문자
		//안녕, 여긴지옥-> 무자열
		
		
		
		
		//정수형
		//데이터 타입, 변수
		
		
		//==================
		//변수 선언 방법
		//자료형변수명;=>int num;
		
		//데이터를 저장하기 위해 생성하는 메모리 공간은
		//목적에 따라 크기와 특징이 다른데 이를 자료형(date type)이라고 부른다.
		//====================
		
		//변수를 사용하기 전에 반드시 자료형을 선언
		
		int num=10;
		System.out.println("정수형 타입의 변수 num에 저장된 값 : "+num);
		//a=1;데이터 타입이 명시 되지 않았으므로 Error
		
		//변수 초기화 방법
		//초기화는 변수의 어떠한 값을 대입하는것이 초기화다.
		
		//1.변수의 선언과 동시에 초기화
		int number = 5;
		System.out.printf("변수 number에 저장된 값 : %d", number);
		System.out.println();
		//2.변수는 선언후 초기화
		int player;  //선언하고
		player = 100;//초기화
		
		System.out.printf("변수 player에 저장된 값 : %d", player);
		
		//변수이름을 지을때 반드시 지켜야 하는 사항
	/*
	    1. 대소문자가 구분되며 길이에 제한은 없다.
		 int abCaguig;
		int abc;
		int ABC;
		2.특수문자는 언더바(_),$도 사용가능 달러는 잘 안씀
		int _abc;
		int ab_c;
		3.한글변수 가능하나 사용X
		4.아라비아 숫자도 사용가능(처음에는 올수 없다.)
		int a1;
		int 1a;//에러
		5.예약어를 사용할 수없다.(정해져있는 변수는 사용불가능)
		int int;
		int break;
		int public;
		
		-변수명을 지을때는 반드시 지켜야 할것
		1.영문 소문자로 시작
		int average;
		int name;
		
		2.영문단어를 2개이상 결합할때는 새로운 단어의 첫글자를 대문자로시작(카멜표기법)
		int maxValue;
  		
		
		*/
		
		
		
		//=========================
		//        자료형의 종류
		//==========================
		
		/*(기본 자료형)
		  분류 					타입                 크기(byte)
		  정수형					byte					1
              					short					2
	           					int						4
	           					long					8
		  
		  실수형					float					4
		       					double 					8
		  
		  논리형					boolean					1
		  
		  문자(정수)				char					2
		  
		  
		  * */
		
		boolean isCheck = false;//(참 아니면 거짓)
		byte flag = 1;
		int count = 10;
		short index = 2;
		long phoneNumber = 123456;
		float temperature = 1.0005f;
		double pi = 3.141591234;
		char grade = 'A';
		
		System.out.println(isCheck);
		System.out.println(flag);
		System.out.println(count);
		System.out.println(index);
		System.out.println(phoneNumber);
		System.out.println(temperature);
		System.out.println(pi);
		System.out.println(grade);
		
		
		//실수형
		float f1 = 1.0000001f;
		System.out.println("f1에 저장된 값 : "+f1);
		float f2 = 1.00000012f;
		System.out.println("f2에 저장된 값 : "+f2);
		double d1 = 1.000000000000005;
		System.out.println("d1에 저장된 값 : "+d1);
		double d2 = 1.0000000000000056;
		System.out.println("d2에 저장된 값 : "+d2);
		
		//float f1;->재선언 불가능
		
		f1 = 5.44444f;//재할당은 가능
		
		
		
		//상수(고정되어 있는 변하지 않는 수)(무조건 대문자로만 써야한다)
		//변수와마찬가지로 값을 저장할수 있지만 한번 저장하면
		//다름값으로 변경 할수없다.
		
		//final int MAXSPEED = 10;
		//MAXSPEED = 20;//에러 =>상수선언을 했기때문에 재할당불가
		
		//final int MOVE;
		//System.out.println(MOVE);
		//int triangleArea = (20*10)/2;    //(나누기 보다는 곱하기가 빠르다)
		//int rectangleArea = 20*10;
		
		//System.out.println(triangleArea);
		//System.out.println(rectangleArea);
		
		//상수로 변경
		//다른값으로 계산할때도 여러곳을 수정 할 필요없이 상수값
		//변경해주면 된다.
		final int WIDTH = 20;//폭
		final int HEIGHT = 10;//높이
		@SuppressWarnings("unused")
		int triangleArea = (WIDTH*HEIGHT)/2;
	    @SuppressWarnings("unused")
		int rectangleArea = WIDTH*HEIGHT;
	    
	    //자료형을 이용해서
	    //본인의 전화번호, 나이,키, 몸무게 등등을 출력해라
	    //
	    
	    long ponNumber = 1096339306;
	    System.out.println("전화번호 : 0"+ponNumber);
	    byte age = 30;
	    System.out.println("나이 : "+age);
	    int height = 175;
	    System.out.println("키 : "+height);
	    int kg = 70;
	    System.out.println("몸무게 : "+kg);
		
	    //개행
	    System.out.printf("\n");
	    System.out.printf("안녕/안녕");
	    
	    int date = 10;
	    //10->2진수
	    System.out.println(Integer.toBinaryString(date));
	    //10진수->8진수
	    System.out.println(Integer.toOctalString(date));
	    //10진수->16진수
	    System.out.println(Integer.toHexString(date));
	    
	    
	    //2진수 1010을 ->10진수로
	    System.out.println(Integer.parseInt("1010" ,2));
	    
	    
		
		
	}
	
	
	
	
	
}
