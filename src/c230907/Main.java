package c230907;

public class Main {
	public static void main(String[] args) {
//		Exception e; //error발생시 해당 에러를 예외처리
		//배열에 있어 인덱스 버퍼 없을 때 << 개발자 입장
		//로그인 시 없는 아이디나 비밀번호등을 입력하는 경우.
		//if 입력 뭐 받았냐 => 재대로 입력 안되면else "다시 입력하라"
		//Exception => 컴파일, 런타임을 진행하면서 오류가 발생했다. 혹은 발생할 확률이 있다.
		
		//예외처리의 상위 클래스 > Throwable 그 아래로 Exception, error가 있다.
		//Exception 종류
		//ClassNotFoundException, InterruptedException, RuntimeEeception...
		//Runtime = 실행환경
		//RuntimeEeception아래에 ArrayIndexOutOfBoundsException, NullPointerException...
		
		try{
			ExceptionTest.test();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			throw new Exception("예외처리중");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
