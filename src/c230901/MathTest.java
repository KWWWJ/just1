package c230901;

import java.util.Random;

public class MathTest {
	public static void test() {
		System.out.println(Math.abs(-5)); //abs = 절대값
		System.out.println(Math.abs(-5.5));
		
		System.out.println(Math.ceil(5.1)); // 소수점이 있으면 무조건 올린다.
		System.out.println(Math.ceil(5.00000001));
		
		System.out.println(Math.floor(5.1)); // 소숫점이 있다면 내린다.
		System.out.println(Math.floor(5.9));
		
		System.out.println(Math.max(4, 7)); //최댓값
		System.out.println(Math.min(4, 7)); //최솟값
		
		System.out.println(Math.round(5.1)); //반올림
		System.out.println(Math.round(5.9));
		
		Random rd = new Random();
		System.out.println(rd.nextInt(9)+1);
		Random rd1 = new Random();
		System.out.println(rd1.nextInt(9)+1);
		Random rd2 = new Random(1); //매개변수로 랜덤에 대한 참조값을 전달 할 수 있다. 이런 참조값을 종자값(seed)이라고 말한다.
		System.out.println(rd2.nextInt(9)+1);
		System.out.println(rd2.nextInt(9)+1);
		System.out.println(rd2.nextInt(9)+1);
		Random rd3 = new Random(1);
		System.out.println(rd3.nextInt(9)+1);
		System.out.println(rd3.nextInt(9)+1);
		System.out.println(rd3.nextInt(9)+1);
		
	}
}
