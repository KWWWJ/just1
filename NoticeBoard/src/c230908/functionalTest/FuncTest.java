package c230908.functionalTest;

public class FuncTest {
	public static void test() {
//		PrintTest t = new PrintTest() {
//			@Override
//			public void print() {
//				System.out.println("인터페이스로 클래스를 바로 생성한다.");
//			}
//		};
//		t.print();
		
		acttion((name)->{ //선언한 인터페이스에 내용을 넣는다.
			//매서드가 public이면 하나에만 넣을 수 있다.(여러개면 어디에 넣어야 할지 알 수 없음)
			System.out.println(name+", "+"람다 테스트");
		});
		//acttion(print); 직접 메서드 때려박는건 안된다.
		acttion(new FuncTest() :: print); //:: = 참조한다.
		acttion(name->{ //같은 인터페이스를 가져와도 다르게 써먹을 수 있다.
			System.out.println("아무개1");
		});
	}
	
	private static void acttion(PrintTest printTest) {
		printTest.print("아무개");
	}
	private static void acttion1(PrintTest printTest) {
		printTest.print("아무개");
	}
	
	private void print(String name) { //static을 쓰지 않아도 new를 사용해 참조하면 따로 만들 수 있다.
		System.out.println(name+", "+"람다 테스트");
	}
}
