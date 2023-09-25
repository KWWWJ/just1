package Object;

class Car01
{
	//생성자도 다른 생성자를 호출할 수 있다.
	//같은 클래스의 맴버들 간에 서로 호출 할 수 있듯, 생성자 끼리도 가능
	//1. 생성자의 이름으로 클래스 이름대신 this 키워드를 사용해야 한다.
	//2. 한 생성자에서 다른 생성자를 호출할 때는 반드시 한번단 가능.
	String color;
	String name;
	int price;
	
	Car01()
	{
		this("하양이", "모닝", 5);
	}
	Car01(String color)
	{
		//생성자 내에서 초기화 작업 도중 다른 생성자를 호출하면
		//호출한 생성자 내에서도 맴버 변수의 값을 초기화하기 때문에 첫줄 사용
		//Car01(String color, String name, int price)를 호출
		this(color, "a", 5);
		
		
		color = "dd";
		//	Car01(color, "a", 5); //그냥 쓰면 에러가 뜸
		//  this(color, "a", 5); //첫불에만 호출가능
	}
	Car01(String color, String name, int price)
	{
		this.color=color; //this는 참조변수.
						  //instance 자기 자신을 가리키는 참조변수.(instance의 주소가 담겨있다.)
						  //instance method가 아니면 사용 불가.
		this.name=name;
		this.price=price;
	}
	//생성자를 이용한 인스턴스 복사
	//참고 -Object클래스가 있는데, 거기에 정의된 clone 메서드를 사용하면 간편하게 복사 할 수 있다.
	Car01(Car01 c)
	{
		color=c.color;
		name=c.name;
		price=c.price;
	}
//	Car01(Car c)
//	{
//		this(c.color, c.name, c.price); //인스턴스 생성자를 복사하기 위함은 이게 더 깔끔함
//	}
}

public class Constructor01 
{
	public static void main(String[] agrs)
	{
		Car01 c1=new Car01();
		Car01 c2=new Car01("파랑이");
		
		System.out.println(c1.color+" , "+c1.name+" , "+c1.price);
		System.out.println(c2.color+" , "+c2.name+" , "+c2.price);
		
//		Car01 c1=new Car01();
//		//car01의 복사본 car02를 생성한다.
//		Car01 c2=new Car01(c1); //그러나 복사가 된 이후에는 독립적으로 메모리를 차지 하기 때문에 이후 c1을 바꿔도 영향을 받지 않음
//		System.out.println(c1.color+" , "+c1.name+" , "+c1.price);
//		System.out.println(c2.color+" , "+c2.name+" , "+c2.price);
//		
//		c1.price=599;
//		System.out.println(c1.color+" , "+c1.name+" , "+c1.price);
//		System.out.println(c2.color+" , "+c2.name+" , "+c2.price);
		
		//과제.
		//오늘 한거 정리
		
		//Rectangle Class만들기
		//사각형은 가로와 세로 길이를 지닌다.
		//면적과 둘래를 계산하는 메서드가 포함되어야 함.
		//결과 출력
	
		//Calculator Class만들기
		//사칙연산 메서드 포함. 이거를 활용한 프로그램 만들기
		//사칙연산 메서드는 오버로딩 구현할 것.
		
		//Stubent Class만들기
		//이름, 학번, 아니 등등 저장
		//생성자를 이용하여 객체를 초기화할 때 필요한 정보를 전달 할 수 있도록
	}

}
