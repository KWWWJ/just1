package c230901;

public class StringTest {
	public void stringTest() throws Exception {
//		String = 문자열, 문장 = 문자(char)의 배열
		char[] tempstr = new char[10]; // 영어는 2당 한글자, 한글은 더 많이 필요하다.
		tempstr[0] = '가';
		tempstr[1] = '나';
		tempstr[2] = '다';
		tempstr[3] = '라';
		tempstr[4] = '마';
		tempstr[5] = '바';
		tempstr[6] = '사';
		tempstr[7] = '아';
		tempstr[8] = '자';
		tempstr[9] = '차';
		for(char temp : tempstr) {
			System.out.println(temp);
		}
		//UTF-8에 맞춰 돌아가기 때문에 문제 없이 작동한다.
		//다만 설정해주지 않으면 메모리 기반으로 돌아가기 떄무넹 짤리거나 제대로 작동하지 않는다.
		String str1 = "test";
		String str2 = new String("test");
		byte[] bytes = new byte[] {'t', 'e', 's', 't'};
		String str3 = new String(bytes);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		byte[] strBytes = str1.getBytes(); //String과 byte를 왔다갔다 할 수 있다.
		for(byte temp : strBytes) {
			System.out.println((char)temp);
		}
		byte[] arrEUCKR = str1.getBytes("EUC-KR");
		String strEUCKR = new String(arrEUCKR,"EUC-KR");
		//2350 << 완성형 한글의 수 / 아래한글같이 인식할 수 없는 글자들이 나타나 EUC-KR이 만들어짐
		//UTF-8은 조합형 문자. 
	}
}
