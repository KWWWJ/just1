package ControlSTamement;

import java.util.Scanner;



public class ifrps {
	
	
	public static void main(String[] agrs) {
		
		int user =0;
		int rps=0;
		String result=" ";
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			int k=(int)(Math.random()*3);
			rps=k;
		
			System.out.println("가위(0),바위(1),보(2)선택해라");
			user = scanner.nextInt();
			
			if(user==0)//유저 가위
			{
				if(rps==0)//가위
				{
					result = "무승부";
				}
				else if(rps==2)//보
				{
					result="승리";
				}
				else if(rps==1)//바위
				{
					result = "패배";
				}
			 }
			if(user==1)//유저 바위
			 {
				if(rps==1) 
				{
					result = "무승부";
				}
				else if(rps==0)
				{
					result="승리";
				}
				else 
				{
					result="패배";
				}
			}
			if(user==2)//유저 보
			{
				if(rps==2) 
				{
					result= "무승부";	
				}
				else if(rps==0)
				{
					result="패배";
				}
				else 
				{
					result="승리";
				}
			}
				System.out.println("유저 :"+user);
				System.out.println("컴퓨터 : "+rps);
				System.out.println("결과 :"+result);
				scanner.close();
				}
	}
	
		
	}
		
