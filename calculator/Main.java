package c230829.calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.println("첫번째 숫자 입력");
	 	double input1 = scan.nextDouble();
	 	while(true) {
		 	System.out.println("계산 연산자 입력[+, -, *, /, %(나머지), ^(제곱), s(종료)]");
			String input = scan.next();
			if (input == "s") return;
		 	System.out.println("두번째 숫자 입력");
			double input2 = scan.nextDouble();
			double result = calc.calculate(input, input1, input2);
			System.out.println(result);
			input1=result;
	 	}
	}
}
