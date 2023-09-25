package ControlSTamement;

import java.util.Scanner;

public class Choice {

	
	public static void main(String[] agrs) {
		
		
		int userInput = 0;
		int result =(int)(Math.random()*3+1);
        Scanner scanner = new Scanner(System.in);
		System.out.println("가위(1),바위(2),보(3)");
		userInput = scanner.nextInt();
		//컴퓨터 랜덤값이 0,1,2 로있는거 보다 1,2,3으로 만드는게 안헷갈릴것같음
		
		switch(result) { //컴퓨터 랜덤값이 들어오고
		case 1:  //랜덤값이 1인경우(컴퓨터 가위)
			switch(userInput){ //유저가 입력한 Input값
				
			case 1: //유저1이면 =>가위
			System.out.println("유저 :"+"가위");
			System.out.println("컴퓨터 :"+"가위");
			System.out.println("결과 :" +"무승부");
			break;
			case 2://유저2이면 =>바위
			System.out.println("유저 :"+"바위");
			System.out.println("컴퓨터 :"+"가위");
			System.out.println("결과 :"+ "승리");
			break;
			case 3://유저3이면 =>보
			System.out.println("유저 :"+"보");
			System.out.println("컴퓨터 :"+"가위");
			System.out.println("결과 :"+"패배");
			break;
			}
			break;
		
		case 2:
			switch(userInput){
			case 1:
				System.out.println("유저 :"+"가위");
				System.out.println("컴퓨터 :"+"바위");
				System.out.println("결과 :" +"패배");
				break;
			case 2:
				System.out.println("유저 :"+"바위");
				System.out.println("컴퓨터 :"+"바위");
				System.out.println("결과 :"+ "무승부");
				break;
			case 3:
				System.out.println("유저 :"+"보");
				System.out.println("컴퓨터 :"+"바위");
				System.out.println("결과 :"+"승리");
				break;
				}
				break;
		case 3:
			switch(userInput)
			{
		case 1:
			System.out.println("유저 :"+"가위");
			System.out.println("컴퓨터 :"+"보");
			System.out.println("결과 :" +"승리");
			break;
		case 2:
			System.out.println("유저 :"+"바위");
			System.out.println("컴퓨터 :"+"보");
			System.out.println("결과 :"+ "패배");
			break;
		case 3:
			System.out.println("유저 :"+"보");
			System.out.println("컴퓨터 :"+"보");
			System.out.println("결과 :"+"무승부");
			break;
			}	
			default:
				System.out.println("userInput+paper+Scissors중 눌러라");
				break;
		}
				
		

		
	scanner.close();
	///==============================
	
	
	
	
	
		
}
		
		}
		

	

