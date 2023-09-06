package c230901;

public class StrBuilderTest {
	public static void  strBuilderTest() {
		String str1 = "abc";
		str1 = str1 + "defg"; //새롭게 메모리를 소모해 합쳐진 공간을 만든다.
		System.out.println(str1);
		
		StringBuilder sb = new StringBuilder(); //필요하면 기존의 메모리를 더 늘린다.
		str1 = str1.replace("b", "z");
		String str2 = sb.append("글자를 추가한다.").toString();//타입을 맞추기 위해 toString으로 변환
		System.out.println(str2);
		// 글 자 를 [ 추  가]  한 다 .
		//0	1  2 3[4  5  6]  7  8 9
		System.out.println(sb.delete(4, 6).toString());
		System.out.println(sb.replace(4, 4, "수정").toString());
		System.out.println(sb.replace(4, 6, "치환").toString());
		System.out.println(sb.append("글자를 추가한다.").toString());
		str1.substring(5);
	}
}
