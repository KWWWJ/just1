package ControlSTamement;

import java.util.Scanner;

public class fight {

	
	public static void main(String[] agrs)
	{
		int result =(int)(Math.random()*100)+1;
		int zero =0;//입력한숫자
		Scanner scanner = new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("1~100중에 맞추기 :");
			zero = scanner.nextInt();
				if(zero>result)//입력한숫자보다작으면
				{
				System.out.println("입력한 숫자보다 작습니다.");
				}
				else if(zero<result)//입력한숫자보다크면
				{
				System.out.println("입력한 숫자보다 큽니다.");
				}
				else if(zero==result)//입력한숫자와같으면
				{
				System.out.println("입력한 숫자와 같습니다.");
				break;
				}
		        
		}
		
				
				scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
