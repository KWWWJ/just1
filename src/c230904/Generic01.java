package c230904; //제네릭


//데어터 사용에 있어 발생하는 오류를 컴파일시에 발견할 수 있고, 다양한 데이터 타입에 대해 재사용이 가능하다.


class Apple{} //오브젝트로 묶어 사용할 수 있지만 제네릭을 사용할 수도 있다.
//class Goods1{
//	private Apple apple = new Apple();
//	
//	public Apple GetApple() {
//		return apple;
//	}
//	public void SetApple(Apple apple) {
//		this.apple = apple;
//	}
//}

class Pencil{}
//class Goods2{ 
//private Pencil pencil = new Pencil();
//	
//	public Pencil GetPencil() {
//		return pencil;
//	}
//	public void SetPencil(Pencil pencil) {
//		this.pencil = pencil;
//	}

//}

//위 코드를 봤을때 새롱누 상품이 생길 때 마다 새롭게 클래스를 생성해야한다.
//해결방안
//1. 오브젝트 객체를 저장하고 관리하는 클래스를 생성하면 새로운 상품을 저장하거나 읽어들일 수 있다.

class Goods3{
	private Object object = new Object();
	
	public Object Get() {
		return object;
	}
	public void Set(Object object) {
		this.object = object;
	}
}

// 제네릭 클래스와 제네릭 인터페이스
/*
제네릭 클래스
접근 지정자 class 클래스명<T>{
                  제네릭타입
}
                  
접근 지정자 class 클래스명<K, T>{ 제네릭타입 변수가 2개

} 

접근 지정자 interface 클래스명<T>{
	
}

접근 지정자 interface 클래스명<K, T>{

}
 */
//제네릭 클래스의 객체생성
//객체 생성과정을 일반 클래스의 객체 생성과 비슷하다
//단, 클래스명 다음에 <실제 제네릭 타입>을 삽입한다
//즉. 객체를 생성할 때 제네릭타입 변수에 실제 타입을 대입한다.

//클래스명<실제제네릭타입> 참조변수 명 = new 클래스명<실제제네릭타입>();
//클래스명<실제제네릭타입> 참조변수 명 = new 클래스명<>(); 이미 선언해서 타입은 적용된다

class MyClass<T>{
	
	private T t;
	public T Get() {
		return t;
	}
	public void Set(T t) {
		this.t=t;
	}
}

class KeyValue<K, V> {
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}

class CharacterFactory<T>{
	private T character;
	
	public CharacterFactory(T character) {
		this.character = character;
	}
	public void Introduce() {
		System.out.println(" 나는 "+character.getClass().getSimpleName()+"character");
	}												//클래스의 간단한 이름을 문자열로 리턴
													//매서드체인 기법(여러 매서드를 연결해서 한줄로 표현)
//	String reString = inputString.trim().toUppercase().subString(0.5);
//  문자열 앞뒤 공잭 제거하고 대문자로 변환한 후 처음 다섯긇자만 출력
	
	public T getCharacter() {
		return character;
	}
}
class Knight{
	private String name;
	
	public Knight(String name) {
		this.name = name;
	}
	public void Attack() {
		System.out.println(name+"칼 휘두름");
	}
}
class Wizard{
	private String name;
	
	public Wizard(String name) {
		this.name = name;
	}
	public void Skill() {
		System.out.println(name+"화이어볼 발사");
	}
}

public class Generic01 {
	
	public static void main(String[] agrs) {
		//제네릭generic(클래스와 메서드의 형태) - 일반화 프로그램 > 컬랙션을 사용할 때 연관된다.
		
		//Object 예시
		Goods3 goods3 = new Goods3();
		goods3.Set(new Apple());
		
		Apple apple = (Apple)goods3.Get();
		System.out.println(apple);
		//들어갈때는 마음대로지만 꺼내올때는 typeCasting으로 타입도 object 타입(set당시에 지정한 타입)으로 변경해줘야 한다.
		//필드 자체가 Object타입이라 Get으로 가져오는 타입 또한 항상 Object타입이기 때문.
		//그래서 Get을 할 떄는 Set을 한 타입으로 형변환 해야함.
		
		
		//제네릭 예시
		MyClass<String> mc1 = new MyClass<>();
		mc1.Set("안녕"); //String타입으로 꺼내 올 수 있는 객체지정
		System.out.println(mc1.Get());
		
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.Set(1234); //Integer타입으로 꺼내 올 수 있는 객체지정
		System.out.println(mc2.Get());
		//제네릭은 클래스를 선언하는 순간 타입을 지정하는 것이 아니라 객체를 생성하는 시점에 타입을 설정하는 것.
		//때문에 다양한 유형의 타입을 사용할 수 있다.
		
		//제네릭 변수가 2개인경우
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		kv1.setKey("원숭이");
		kv1.setValue(12345);
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		System.out.println("key : "+key1+" value : "+value1);
		
		//만약 두째 타입을 지정하지 않겠다면 해당타입에 Void를 넣어준다.
		KeyValue<String, Void> kv2 = new KeyValue<>();
		kv2.setKey("키값만 사용하겠음");
//		kv2.setValue(12345); 지정불가
		
		//////////////////////////////////////////////////
		
		CharacterFactory<Knight> knightFactory = new CharacterFactory<>(new Knight("홍길동"));
		CharacterFactory<Wizard> wizardFactory = new CharacterFactory<>(new Wizard("ㅇㅇㅇ"));
		
		knightFactory.Introduce();
		Knight knight = knightFactory.getCharacter();
		knight.Attack();
		
		wizardFactory.Introduce();
		Wizard wizard = wizardFactory.getCharacter();
		wizard.Skill();
	}
}
