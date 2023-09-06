package c230829;

interface Human
{
	//추상화를 극한으로 다루는 것.
	//API = Application Programming Interface
	//프로그램과 프로그램 사이에 데이터를 전달해주는 기능
	//Wed API / API 문서 *** (프론트 앤드와 백앤드 사이에서 어떤식으로 연결할지 규칙을 정하는 것)
	//interface는 어떠한 무언가와 어떠한 무언가를 연결하여 중간 과정에서 통신을 처리한다.
	//간단히 말하면 서로간에 대화를 가능게 해준다.
	//추상클래스의 상속을 받은 클래스들의 메서드들을 가져와 사용할 수 있는지의 여부를 결정한다.
	//컴파일을 한줄씩 실행하는 것은 인터프리터 언어라 하고 미리 체크를 하고 기계어로 번역하는 것이 컴파일언어이다.
	//JVM을 통해 기계어로 번역되는 코드들은 모두 bin폴더에 저장된다.
	
	void move();
}

interface Animal
{
	void eat();
}

public sealed class Person 
	implements Human, Animal 
	permits YellowRace, WhiteRace { //두 개 이상의 인터페이스를 사용하려면 오버드라이브로 재정의 해줘야 한다.
//       상속의 봉인, 자식 클래스의 봉인은 풀거나 같이 봉인 해야한다.
//	public static final int NUMBER = 1;
	String species;
	Person()
	{
		species = "human";
	}
	
	@Override
	public void move() //interface에서 확실하게 인지 시키기 위해서 public을 붙여준다.
	{
		System.out.println("사람이 이동한다.");
	}
	
	@Override
	public void eat()
	{
		
	}	
}