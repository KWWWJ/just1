package ControlSTamement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] agrs) {
		
		
		///////////////////////
		/////switch
		//////////////////////
		/*
		switch (key)(변수 또는 표현식) {               //데이터가 드러옴
		case value(값1):       //if					//여기서 비교하고
			//값1에 해당하는 실행할 코드					//실행
			break;									//1.break를 만나면
		case 값2:				//else if
			//값2에 해당하는 실행할 코드
			break;
		case 값3:				//else if
			//값3에 해당하는 실행할 코드
			default:
			break;
													//2.여기로 빠져나온다.
			*/
		/*
			int a = 8;
			switch (a) {
			case 10:
				break;
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");		//여기서 탈출
				break;
			case 7:
				System.out.println("C");
			break;
			default:
				System.out.println("D");
			break;
			}
			
			if(a>=9) {
				System.out.println("A");
			}
			else if(a==8) {
				System.out.println("B");		//여기서 탈출
			}
			else if(a==7) {
				System.out.println("C");
			}
			else {
				System.out.println("D");
			}
			
			int num , result =0;
			
			final int ONE =1;
			
			
			
			switch(result) {
			case '1': //된다 .문자리터럴(정수 상수인 49와동일)
			
			break;
			
			case ONE : //된다. 상수
				break;
			case num:	//error 변수 불가
				break;
			case 3.5: //실수불가 error
				default:
					break;
				
				
				
				
			}
			
			*/
//		char seasonCode ='A';
//		
//		switch(seasonCode) {
//		case'S' :
//			System.out.println("봄");
//			break;
//		case'U':
//			System.out.println("여름");
//			break;
//		case'A' :
//			System.out.println("가을");
//			break;
//		case'W' :
//			System.out.println("겨울");
//			break;
//			default:
//				System.out.println("잘못된 코드임");
//		}
//		
//		int inputNum=0;
//		Scanner scanner = new Scanner(System.in);
//		
//		inputNum = scanner.nextInt();
//		switch(inputNum) {
//		case 1:
//			System.out.println("너가 입력한 숫자는: "+inputNum);
//			break;
//		case 2:
//			System.out.println("너가입력한 숫자는 :"+inputNum);
//			break;
//		case 3:
//			System.out.println("너가 입력한 숫자는 :"+inputNum);
//			break;
//			default:
//				System.out.println("1~3중에 하나만 눌러라");
//				break;
//		}
//		
//		
//		int random = (int)(Math.random()*3)+2;
//		
//		scanner.close();
			
			
		
	
		
		Scanner scan = new Scanner(System.in);
		int[] number = new int[3];    //랜덤 숫자가 들어갈 배열
		int[] answer = new int[3];    //도전해볼 숫자가 들어갈 배열
		int ball = 0; //볼의 개수
		int strike = 0;    //스트라이크 개수
     
		//랜덤함수 만드는 반복문
		for(int i=0; i<3; i++)
		{
			number[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) //중복숫자가 나오지 않게 하기위함
			{   
				if(number[i] == number[j])
				{
					i--;
					break;
				}
			}
		}   
		for(int x=0; x<10; x++)//도전할 숫자 입력
		{
			for(int i=0; i<3; i++)
			{
				answer[i] = scan.nextInt();
			}
			for(int i=0; i<3; i++)//숫자와 자리가 맞다면 스트라이크+1, 숫자는 맞고 자리가 틀리면 볼+1
			{
				for(int j=0; j<3; j++)
				{
					if(number[i] == answer[j])
					{
						if(i == j)
						{
							strike++;
						}
							else
							{
                        	ball++;
							}
					}
				}
			}
                     
         if(ball == 0 && strike == 0)
         { //모든 숫자가 틀렸을 경우
             System.out.println("OUT!");
         }
         else if(ball == 0 && strike != 0)
         {    
             if(strike==3)
             {    //정답을 맞춘 경우
                 System.out.println("맞췄습니다. 승리했습니다!");
                 break;
             }
             else
             {
                 System.out.println(strike + "Strike");
             }
         }
         else if(ball != 0 && strike == 0)
         {
             System.out.println(ball + "Ball");
         }
         else
         {
             System.out.println(strike + "Strike  " + ball + "Ball");
         }
         
         //한판이 끝나고 볼과 스트라이크 초기화 후 다시도전
         ball = 0;
         strike = 0;
         
         //10번안에 답을 못맞췄을 경우
         if(x==9){
             System.out.print("패배했습니다. 답은 ");
             for(int y=0; y<3; y++){
                 System.out.print(number[y]);
             }
             System.out.println("입니다.");
             scan.close();
         }
     }
 
 }

}
		
		
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	

