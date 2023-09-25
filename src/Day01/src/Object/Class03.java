package Object;

class Example
{
	void Print() //리턴타입 없음
	{
		System.out.println("Print함수 호출");
	}
	int num() //여기서 함수 만들어두고 밑에서 가져가 돌리기. class아래에 만들어도 상관은 없다.
	{
		return 3;
	}
	int sum(int a, int b)
	{
		return a+b;
	}
	void PrintMonth(int num)
	{
		if(num<0||num>12)
		{
			System.out.println("잘못된 입력");
			return; //함수 종료. for같은 경우 완전히 벗어나 버림
		}
		else
		{
			System.out.println(num+"임");
		}
	}
}

class MyMath
{
	int a;
	int b;
	
	int add()
	{
		return a+b; // 인스턴스 변수 사용
	}
	int sudStract()
	{
		return a-b;
	}
	static int add(int a, int b) //인스턴스 변수와는 상관없이 매개변수로만 처리
	{
		return a+b;
	}
}
public class Class03 
{
	//method
	//반환타입 메서드 이름(매개변수이기 때문에 있을 수도 있고 없을 수도 있다.)
	//선언부{구현부}
	
//	int add(int a, int b)
//	{
//		int result=a+b;
//		return result; //int 타입으로 반환해라.
//		//return a+b;
//	}
//	void Print(int a)
//	{
//		System.out.println(a); //void형이라 반환 타입이 없어 바로 프린트하는 등의 행위만 가능
//	}
	
	
	//접근제한지정자   타입  메서드
	public static void main(String[] agrs) //mein 메서드
	{
		Example example=new Example();
		
		example.Print();
		example.PrintMonth(10); //매개변수 넣어야 작동, 얘는 하나만 먹음
		example.PrintMonth(20);
		int number=example.num(); //리턴하는 타입에 맞게 바꿔줘야 함. 지금은 정수니 int타입
		System.out.println(number);
		int result=example.sum(3,4); //마찬가지
		System.out.println(result);
		
		//실습
		//사칙연산을 메서드로 구현하고 호출하기.
	}
}

//static method, instance method
/*
 1. 메서드 앞에 static이 있으면 클래스 메서드, 없으면 인스턴스 메서드.
 2. 클래스 메서드는 클래스 이름.메서드 이름으로 호출 가능. 인스턴스 메서드는
   객체를 생성해야만 호출가능
 3. 인스턴스 메서드는 인스턴스 변수와 관련된 작업을 한다.
    ㄴ작업을 수행하는데 인스턴스 변수를 필요로하는 메서드
 4. 클래스 메서드는 인스턴스 메서드와는 관계가 없는 것을 정의한다.  
 5. 클래스 메서드는 인스턴스 변수를 사용할 수 없다.
    ㄴ클래스 변수는 인스턴스가 존재하지 않아도 사용할 수 있지만 그 역은 성립되지 않으므로 막혀있다.
    ㄴ인스턴스 변수를 끌어다 사용해야 하면 인스턴스 변수를 사용하지만 그렇지 않으면 그냥 static을 붙이자.
    ㄴ굉장히 미미한 차이지만 static 메서드의 실행이 더 빠르다.   
 */
