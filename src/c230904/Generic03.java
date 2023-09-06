package c230904;

//class Apple{}
//class Pencil{}
//
//class Goods<T extends Fruit> //만약 Apple의 상위 클래스로 fruit이 존재한다면 Apple만 들어올 수 있다.

//class A{}
//class B extends A{}
//class C extends B{}
//class D<T extends B>{ //B가 상속받고 있는 A에 대해서는 접근 할 수 없다.
//	private T t;
//	
//	public T Get() {
//		return t;
//	}
//	public void Set(T t) {
//		this.t = t;
//	}
//}


//제네릭 클래스의 타입 제한
//접근 지정자 calss 클래스명 <T extends 최상위클래스 / 인터페이스명>

//제네릭 메서드의 타입제한
//접근 지정자<T extends 최상위 클래스 / 인터페이스> T 메서드(T t){}

class GenericMethod01{
//	public<T> void test(T t) {
//		//char c = t.charAt(0); 얘는 안되는데
//	}
//	public<T extends String>void method2(T t) {
//		char c = t.charAt(0); //얘는 된다
//	}
	
	public <T extends Number> void Method1(T t) {
		System.out.println(t.intValue()); //
	}
}
interface MyInterface{
	public abstract void print();
}
class B{
	public <T extends MyInterface> void Method01(T t) { //최상위를 인터페아스로 지정
		t.print();
	}
}
public class Generic03 {
	
	
	
	public static void main(String[] args) {
		
		//D<A> d1 = new D<>(); 이미 제네릭 타입 제한을 받는다.
//		D<B> d2 = new D<>();
//		D<C> d3 = new D<>();
		
		GenericMethod01 g = new GenericMethod01();
		g.Method1(5.5);
		
		B b = new B();
		b.Method01(new MyInterface() {
			@Override
			public void print() {
				System.out.println("Print 구현");
			}
		});
	}
}
