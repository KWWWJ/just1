package c230907;

public class ExceptionTest {
	public static void test()throws Exception{
		try {//시도하고 
			//가장 기본적인 예외처리 방법
			//try catch finally: 어떤 언어든 다 있다.
			int[] arr = new int[] {1};
			System.out.println(arr[1]);
//			arr[0] = 3;
//			System.out.println(arr[0]);
		}catch(Exception e) {//parent asdf = new Child(); UpCasting
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}finally {
			System.out.println("무조건 실행");
		}
		System.out.println("무조건 실행111"); //finally랑 크게 차이는 없다.
		
		new ExceptionTest().printLength("asdf");
	}
	
	public void printLength(String str) {
		int result = str.length();
		System.out.println("str의 길이 : "+result);
	}
}
