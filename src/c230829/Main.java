package c230829;

interface InterfaceTest
{
	//interface는 class에 여러 조건 달면 만들어지는 것.
	
	int NUMBER = 1; //final이 들어가 있기 때문에 값을 지정해야 함
	//애는 왜 다중 상속이 가능할까? << 이름밖에 없어서
	void methodTest();
	
	static void staticMethodTest() 
	{
		System.out.println("정적 메서드 가능");
		//인스턴스와 클레스의 차이로 인해 가능함.
		//static은 클레스 안에 저장되기 때문에 클레스가 저장될 때 닽이 저장된다.
		//인스턴스에는 따로 들어가지 않음.
		//인터페이스는 상속을 할 뿐 인스턴스를 생성 할 수 없다.
		//따라서 static또한 인터페이스 자체에 저장되기 때문에 사용하는게 가능하다.
		privatestaticMethodTest();
	}
	
	private static void privatestaticMethodTest()
	{//static으로 선언하면 같은 인터페이스 내의 다른 static 안에도 들갈 수 있다.
		System.out.println("private 메서드 호출 가능");
	}
	private void privateMethodTest()
	{//static으로 선언하면 같은 인터페이스 내의 다른 static 안에도 들갈 수 있다.
		System.out.println("private 메서드 호출 가능");
	}
	default void defaultMethodTest()
	{
		privateMethodTest();
	}
	
}

class ClassTest implements InterfaceTest
{
	@Override
	public void methodTest()
	{
		
	}
//	@Override
//	public void defaultMethodTest()
//	{
//		InterfaceTest.super.defaultMethodTest();
//	}
}

public class Main {
	public static void main(String[] args)
	{
		InterfaceTest.staticMethodTest();
		YellowRace JKH = new YellowRace();
		JKH.move();
//		JKH.skinColor
		Person[] people = new Person[] {JKH, new WhiteRace()};
//		people[0].skin  불가능. 타입이 Person으로 변경되었다.
		//자바에서는 변수의 추상화가 불가능하다.
		people[0].move();
	}
}
