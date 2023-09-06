package c230901;

public class Wrapper {
	public static void test() {
		//지금까지 한거 String, System, StringBuilder등
		//Wrapper는 클래스들의 통칭이다. 원시타입을 클래스로 묶어준다.
		//Integer(int) / Byte(byte) / Double(double) / Float(float)
		//Short(short), Long(long), Charater(char) / Boolean(boolean)
		Integer wrappedInt = 1000;
		System.out.println(wrappedInt);
		int unwrappedInt = wrappedInt;
		int unwrappedInt2 = wrappedInt.intValue();
		
		Integer wrappedInt2 = 1000; //1을 넣으면 같은데 1000을 넣으면 달라진다. 일정 범위 내에서만 해쉬코드가 같기 때문
		System.out.println(wrappedInt == wrappedInt2);
		// == 을 사용해 비교할 경우 일정 범위 내에서만 같다는 결과가 나온다.
		//boolean은 크기가 너무 작아 범위 내다.
		//byte의 최댓값 : 128 / 최솟값 : -128
		//short의 최댓값 : 32767 / 최솟값 : -32767
		//int의 최댓값 : 21억 / 최솟값 : -21억
		//byte, short, int는 -128부터 128까지 ==으로 비교 가능하다.
		byte temp = 127;
		System.out.println(++temp);
		System.out.println(--temp);
		//unsigned 숫자 앞에 붙여서 .이나 -같은 기호를 없앤다. > uInt
		//1byte = 8bit = 2진수로 8자리 1111 1111(255)이 최댓값
		//1byte당 255개의 숫자를 표기할 수 있다. byte temp는 1byte를 사용한다. 즉 숫자 255개 출력가능
		//여기서 앞에 unsigned를 붙이면 -가 사라지므로 255까지 표기 할 수 있게된다.
		System.out.println(wrappedInt.equals(wrappedInt2));
	}
}
