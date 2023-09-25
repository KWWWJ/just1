package ControlSTamement;

import java.util.Scanner;


public class LoopClass01 {

	public static void main(String[] agrs)
	{
		//while
		//while(조건식){
		//
		//}
		/*
		int number =0;
		while(true)
		{
				//반복적으로 실행시킬 코드
				//단, 종료조건이 반드시 있어야되;ㄴ다.
				//if(뭐뭐라면)break;
			number++;//1씩증가
			System.out.println(number);//출력
			
			if(number==10)break;//number가10이면 해당 while문을 빠져나와라
			
			
		}
		
		
		int count =10;
		while(count!=0) //0이아닐때까지 ->0이될때까지
		{
			count--;
			System.out.println(count);
		}
		int sum=0;//합계용 변수
		int num;
		boolean flag =true;
		Scanner input = new Scanner(System.in);
		
		
		while(flag)
		{
			System.out.println(">>");
			
			String temp=input.nextLine();
			num=Integer.parseInt(temp);
			
			
			if(num!=0)//입력이 0이 아니라면
			{
				sum+=num;//내가 입력한 정수를 계속해서 더하고
			}
			else//입력이0이면
			{
				flag = false;//flag=>false
			}
			System.out.println("합계 : "+sum);
		}//end while
		input.close();
		
		//1.가위바위보 업그레이드
		//->10판만 할수있다, 그리고 배팅금액이 올인되면 종료
		//->플레이어는 소지금표기
		//->배팅금액 표기(100원)
		//->판수 표기
		//->플레이어가 이기면 배팅금액에*2
		//->비겼다면 배팅금액만큼만 소모
		//->졌으면 배팅금액만*2만큼 소모
		
		//2.랜덤 숫자 맞추기
		//->컴퓨터가 랜덤한 숫자를 생성한다.1~100까지
		//->플레이어는 랜덤한 숫자를 맞춘다.
		//->단, 컴퓨터는 플레이어가 낸 숫자에대해서 범위를 알려준다.
		//=>ex) 50 -> 80 -> 더 작은 수를 입력해라
		
		//3.별찍기 ->우선 1번만
		*/
		/*
		int pan =10;//판수
		int bat = 100;//배팅금액
		int point = 1000;//플레이어 소지금
		int user = 0;
		Scanner scanner = new Scanner(System.in);
		int rps =(int)(Math.random()*3);
		String result = " ";
		while(true)
		{
			
		System.out.println("배팅을 시작합니다: ");
		bat = scanner.nextInt();
		System.out.println("배팅금액 : "+bat+'원');
		System.out.println("가위(0),바위(1),보(2)선택해라");
		user = scanner.nextInt();
	
		
		
		
			if(user==0)
			{ 
				if(rps==0)
				{
					result = "무승부";
					point= point-bat;
					pan= pan-1;
					System.out.println("배팅금액 : "+bat+"원");
					System.out.println("남은 판수 :"+pan);
					System.out.println("총 소지금액 :"+point);
					System.out.println("유저  :"+ user);
					System.out.println("컴퓨터 : "+rps);
					System.out.println("결과  :"+result);
				}
				else if(rps==2)
				{
					result = "승리";
					point= point+(bat*2);
					pan= pan-1;
					System.out.println("배팅금액 :"+bat+"원");
					System.out.println("남은 판수 :"+pan);
					System.out.println("총 소지금액 :"+point);
					System.out.println("유저  :"+ user);
					System.out.println("컴퓨터 : "+rps);
					System.out.println("결과  :"+result);
				}
				else
				{
					result = "패배";
					point = point-(bat*2);
					pan= pan-1;
					System.out.println("배팅금액 :"+bat+"원");
					System.out.println("남은 판수 :"+pan);
					System.out.println("총 소지금액 :"+point);
					System.out.println("유저  :"+ user);
					System.out.println("컴퓨터 : "+rps);
					System.out.println("결과  :"+result);
				}
			}	
				if(user==1)
				 {
					if(rps==1) 
					{
					result = "무승부";
					point= point-bat;
					pan= pan-1;
					System.out.println("배팅금액 :"+bat+"원");
					System.out.println("남은 판수 :"+pan);
					System.out.println("총 소지금액 :"+point);
					System.out.println("유저  :"+ user);
					System.out.println("컴퓨터 : "+rps);
					System.out.println("결과  :"+result);
					}
					else if(rps==0)
					{
					result="승리";
					point= point+(bat*2);
					pan= pan-1;
					System.out.println("배팅금액 :"+bat+"원");
					System.out.println("남은 판수 :"+pan);
					System.out.println("총 소지금액 :"+point);
					System.out.println("유저  :"+ user);
					System.out.println("컴퓨터 : "+rps);
					System.out.println("결과  :"+result);
					}
					else 
					{
					result="패배";
					point = point-(bat*2);
					pan= pan-1;
					System.out.println("배팅금액 :"+bat+"원");
					System.out.println("남은 판수 :"+pan);
					System.out.println("총 소지금액 :"+point);
					System.out.println("유저  :"+ user);
					System.out.println("컴퓨터 : "+rps);
					System.out.println("결과  :"+result);
					}
				}
				if(user==2)
				{
					if(rps==2) 
					{
					result= "무승부";	
					point= point-bat;
					pan= pan-1;
					System.out.println("배팅금액 :"+bat+"원");
					System.out.println("남은 판수 :"+pan);
					System.out.println("총 소지금액 :"+point);
					System.out.println("유저  :"+ user);
					System.out.println("컴퓨터 : "+rps);
					System.out.println("결과  :"+result);
					}
					else if(rps==0)
					{
					result="패배";
					point = point-(bat*2);
					pan= pan-1;
					System.out.println("배팅금액 :"+bat+"원");
					System.out.println("남은 판수 :"+pan);
					System.out.println("총 소지금액 :"+point);
					System.out.println("유저  :"+ user);
					System.out.println("컴퓨터 : "+rps);
					System.out.println("결과  :"+result);
					}
					else
					{
					result="승리";
					point= point+(bat*2);
					pan= pan-1;
					System.out.println("배팅금액 :"+bat+"원");
					System.out.println("남은 판수 :"+pan);
					System.out.println("총 소지금액 :"+point);
					System.out.println("유저  :"+ user);
					System.out.println("컴퓨터 : "+rps);
					System.out.println("결과  :"+result);
					}	
				}
				if (pan==0)
				{
					System.out.println("게임을 종료합니다");
					break;
				}
				if (point<=0)
				{
					System.out.println("게임을 종료합니다");
					break;
				}
				
				
				
				
					
		}
		
	
	
		
		scanner.close();
		
		*/	
		
		//if(조건)continue;//아래에있는 연산은 건너뛰고 위로 올라간다
		
		int menu =0;
		
		Scanner foodInput =new Scanner(System.in);
		
		while(true)
		{
			System.out.println("(1)햄버거");
			System.out.println("(2)탕수육");
			System.out.println("(3)육개장");
			System.out.println("오늘 점심에 먹을 메뉴를 골라라 종료는0");
			
			String temp = foodInput.nextLine();
			
			menu= Integer.parseInt(temp);
			
			if(menu==0)
			{
				System.out.println("프로그램을종료합니다");
				break;
			}
			else if(!(1<=menu&&menu==3))
			{
				System.out.println("메뉴를 잘못 선택함. 재입력해라");
				continue;
			}//밑으로 쓰는건 어차피 안나오고 위로 올라감
				System.out.println("123");
		}
		
		foodInput.close();
		
		
		
		
		
		
	
	}
	
}
