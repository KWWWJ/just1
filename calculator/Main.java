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
		 	System.out.println("\n계산 연산자 입력[+, -, *, /, %(나머지), ^(제곱)]");
			String input = scan.next();
		 	System.out.println("두번째 숫자 입력[100000 입력 시 종료] \n");
			double input2 = scan.nextDouble();
			if(input1 == 100000) {
				System.out.println("종료");
				break;
			}
			double result = calc.calculate(input, input1, input2);
			System.out.printf("결과 : %.2f",result);
			input1=result;
			
			
	 	}
	}
}
