package Object;

class Card
{
	String kind;//인스턴스 변수
	int number;
	
	static int width=100; //클래스 변수
	static int height=200;
	
	void Print()
	{
		@SuppressWarnings("unused")
		int num; //지역변수는 강제로 초기화가 안되서 오류난다.
	}
}

public class Class02 
{
	
//	class Variables
//	{
//		int instanceVariable; //인스턴스 변수
//		static int classVariable; //클래스 변수
//	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] agrs)
	{
		//변수 이름		선언위치			생성시기
		//클래스 	변수  	클래스 영역			클래스가 메모리에 올라갈 떄
		//인스턴스	변수 		클래스 영역			인스턴스가 생성되었을 때
		//지역 	변수   	클래스 영역 이외 모두	변수 선언문이 시행되었을 때
		
		//필드영역에서 맴버 번수를 제외한 모든 변수들이 지역 변수다.
		//클래스와 인스턴스 변수의 차이는 static이 붙냐 안붙냐의 차이다.
//		Variables.classVariable=20; //객체의 인스턴스와는 무관하게 독립적으로 존재함. 
//		System.out.println(Variables.classVariable);
		
		System.out.println("card의 폭 : "+Card.width);
		System.out.println("card의 폭 : "+Card.height);
		
		Card c1=new Card(); //선언하려변 외부 클래스필요
		c1.kind="#";
		c1.number=7;
		
		Card c2=new Card();
		c2.kind=("&");
		c2.number=5;
		
		System.out.println
		("c1은"+c1.kind+","+c1.number+"이고 사이즈는("+c1.width+","+c1.height+")");
		System.out.println
		("c1은"+c2.kind+","+c2.number+"이고 사이즈는("+c2.width+","+c2.height+")");
		
		System.out.println("c1의 width와 height를 변경");
		c1.width=20;
		c1.height=20;
		
		System.out.println
		("c1은"+c1.kind+","+c1.number+"이고 사이즈는("+c1.width+","+c1.height+")");
		System.out.println
		("c1은"+c2.kind+","+c2.number+"이고 사이즈는("+c2.width+","+c2.height+")");
		System.out.println
		("c1은"+c2.kind+","+c2.number+"이고 사이즈는("+Card.width+","+Card.height+")");
		//클래스 변수는 다이렉트로 써주는게 가장 혼동이 없다. 바로 위가 가장 좋은 형태.	
		
	}
}
