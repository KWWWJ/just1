package Object;

public class Exam
{
	void packageprivateMethod() //자바에서는 void앞에 뭘 안붙이면 패키지 프라이빗으로 설정된다.
	{
		System.out.println("나는 packageprivateMethod!!");
	}
	static void staticMethod()
	{
		System.out.println("나는 staticMethod로 호출 가능");
	}
	@SuppressWarnings("unused")
	private void PrivateMethod() //오로지 나만 아는 코드
	{
		System.out.println("나는 packageprivateMethod!!");
	}
	@SuppressWarnings("unused")
	private static void staticPrivateMethod() //못부름
	{
		System.out.println("나는 staticPrivateMethod로 호출 가능");
	}
	public void publicMethod() //어디서든 호출 가능
	{
		System.out.println("publicMethod");
	}
}

//public class Class04 
//{
//	public static void main(String[] agrs)
//	{
//		Exam exam=new Exam();
//		exam.packageprivateMethod();
//		//exam.PrivateMethod(); 얘는 못가져옴
//		exam.staticMethod();
//	}
	//1.packagePrivate(default)는 같은 패키지 내에서만 사용가능 
	//2.private 키워드가 붙으면 어디서도 접근 할 수 없다.
	//3.public이 없고 static만 붗어있늘 경우 packagePrivate와 같다.
	//4.public이 붙은 메서드는 외부 패키지 어디서든지 접근 가능하다.

	//빙고를 클래스로 만들기.
//}
