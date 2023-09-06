package c230901;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("23년 9월 1일");
		
//		Week week = Week.FRIDAY;
////		week = 1; 열거형 타입으로 정의한 변수는 해당 열거형의 데이터 타입으로만 입력할 수 있다.]
//		week = Week.SUNDAY;
//		switch(week) {
//			case SUNDAY:
//				System.out.println("일요일이다.");
//				break;
//		}
		
		int num = 1;
		int studentNum = 1; //카멜형 띄어쓰기가 불가능하기 때문에 뒤에 오는 단어는 대문자로 시작한다.
		int StudentNum = 1; //카멜형 + 파스칼 형
		int student_num = 1; //스네이크형
		//int syudent-num 타언어에서 하나의 변수로 취급하는 케밥형
		//int IntStudentNum 헝가리안 표기법 이제 안쓴다
		System.out.println(num);
		StringTest test = new StringTest();
		test.stringTest();
		StrBuilderTest strBT = new StrBuilderTest();
		strBT.strBuilderTest();
		MathTest test1 = new MathTest();
		test1.test();
		Wrapper test2 = new Wrapper();
		test2.test();
		DateTest test3 = new DateTest();
		test3.test();
	}
}
