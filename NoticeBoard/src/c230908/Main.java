package c230908;

import c230908.functionalTest.FuncTest;
import c230908.stream.StreamTest;

public class Main {
	public static void main(String[] args) {
		// Lambda
		// 람다식 : 메서드 그 자체
		// 이름이 따로 없다.
		// 타입도 없다.(식 자체에는 타입을 적지 않는)
		// ()->{}
		// 매개변수 받을 수 있다.
		// 코드도 있다.
		// 어따 쓸까? 
		//		- Functional Programming(함수형 프로그래밍)
		//  	- main(()->{}) 람다식을 내부적으로 실행한다.
		//  	- for(int i : arr){} << forEach
		// 		- forEach((int i)->{i * 2})  = for(int i : arr){i * 2}
		//	- 람다식을 매개변수로 받는 매서드를 만들 수 있어야 한다.
		//	- Interface(추상화)를 사용해서 미리 내용을 선언해둔다.
		//	- forEach((i)->{i * 2}) Interface로 선언하면 타입을 붙일 필요가 없다.
		
		// Stream
		//	- 유튜브로 치면 라이브, 녹화된 영상, 동영상 파일을 다운받지 않고 실시간으로 조각된 파일을 재생하는 영상
		//	- 하나의 데이터 => (변수, 메서드, 클래스 = 하나로 나눌 수 있다.), 스트링, 인터페이스, (배열, 셋, 맵 = 스트림)
		
		
		// ToDoList
		// 애플리케이션
		FuncTest.test();
		
		StreamTest.test();
	}

}
