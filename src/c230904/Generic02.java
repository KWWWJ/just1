package c230904;



//제네릭메서드는 호출되는 시점에 실제 제네릭 타입을 지정한다.
//1. 제네릭 타입 변수명이 1개일때
//접근 지정자<T> T메서드 이름(T t)
//2,두개일 경우
//접근 지정자<T, V> T메서드 이름(T t, V v)
//3.매개변수에만 제네릭이 사용된 경우
//접근지정자<T> void 메서드 이름(T t){}
//4.리턴차입에만 사용된 경우
//접근지정자<T> T 메서드 이름 (int a){}

class GenericMethod{
	public <T> T method(T t) {
		return t;
	}
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2); //타입이 정해져 있지 않기 때문에 최상위 클래스인 Object밖에 사용하지 못함
	}
	public <K, V> void method3(K k, V v) {
		System.out.println(k+" : "+v);
	}
}


class A{
	public <T> void method(T t) {
		System.out.println(t.equals("안녕"));
		//정의시점에서 어떤 타입읜지 알 수도 없고 자바의 모든 클래스는 Object클래스가 상위이므로 어쩐 제약도 받지 않는 
		//Object메서드만 사용가능하다.
//		System.out.println(t.length()); 사용 불가
	}
}

public class Generic02 {
	
	public static <T> void Swap(T[] array, int index1, int index2) { //두 값을 서로 바꾸기
		T temp = array[index1];
		array[index1]=array[index2];
		array[index2]=temp;
	}
	
	public static void main(String[] args) {
		//제네릭 메서드
		//입력 변수를 제네릭 타입 변수로 선언
		//호출되는 시점에 타입을 지정
		
		GenericMethod gm = new GenericMethod();
		String str1 = gm.<String>method("안녕");
		
		String str2 = gm.method("안녕2"); //제네릭 타입 자체를 인지 할 수 있다면 타입을 뺴도 된다.
		
		System.out.println(str1);
		System.out.println(str2);
		
		boolean b1 = gm.method2(2.5, 2.5);
		System.out.println(b1);
		
		gm.<String, Integer> method3("국어", 10);
		gm.method3("수학", 20);
		
	}
}
