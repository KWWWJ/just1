package ControlSTamement;



//import java.util.Scanner;
public class LoopClass {

	
	
	
	public static void main(String[] args) {
		System.out.println("덥다");
		
		/////////////////////
		////반복문///////
		//1.어떤 작업이 반복적으로 수행하도록 만들때 사용한다.
		//2.for, while, do-while
		//3.for문이나 while문에 속한 코드들은 조건에따라
		//한번도 수행되지않을수 있다.  do-while은
		//최소한번은 수행이 보장된다.
		//////////////////////////////
		
		//for
		//초기식 : for문이 시작될때 딱 한번만 실행된다.
		//조건식 : 조건이false가 될때까지 계속반복
		//증감식 : 다음 반복을위해 이동하는 위치로 매회반복이 될때마다 호출된다.
	/*r(초기값; 조건식 ; 증감식) 
		{
			//반복시킬코드-> 조건식이 true인 동안 반복ㄱㄱ
		}
	*/
	
		/*
		System.out.println("반복시킨다");
		System.out.println("반복시킨다");
		System.out.println("반복시킨다");
		
		System.out.println("뽀문을 이용한 출력");
		System.out.println();
		for(int i = 0; i<3; i+=2)
		{
			System.out.println("반복시킨다");
		}
		
		
		for(int i =0; i<5; i++)
		{
			System.out.println(i);
		}
		
		int  k;
		
		for (k=0; k<5; k++)
		{
			System.out.printf("k변수의 데이터 : %d\n",k)
			
		}
		
		
		//실습
		//1. 1부터 100까지 합을 구해라
		//출력 : 1~100까지의 합 : ??????
		
	
		//누적시켜 저장할 변수가 필요함		
		/*
		int zero = 0;//0부터 더해주기 위한 수
		for(int k = 1; k <100; k++)	
		{
			zero += k;//0부터 100까지의수를 더한다
			System.out.println("1부터 100까지의합 : " +zero);
		}
		
		int dan =2;
		
		for(int k = 0; k <=9; k++)
		{
			System.out.println(dan+" * "+k+" = "+(dan*k));
		}
		*/
		//실습
		//입력을 받는다.
		//ex) 출력 : 3을입력하면 3단이 나온다
		
		/*
		int x =3;
		String result = "  ";
		Scanner scanner = new Scanner(System.in);
		System.out.println("3단이 나온다 :");
		x = scanner.nextInt();
		for(int k = 0; k <=9; k++)
		{
			System.out.println(x*k);
		}
		    System.out.println(" 3단 :"+(x*k));
		
		    
		    scanner.close();
		*/
		/*
		int k =3;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		k = scanner.nextInt();
		for(int k = 3; k <=3; k++)
			{
			for(int j = 1; j <=9; j++)
			{	System.out.println(k + " x " + j + " = " + k * j);
			}
			}
		System.out.println();
		*/
		/*
				for(int i = 1; i  <=10; i++)
					{
					if(i%2==0) 
					{
						System.out.println(i+" ");
					}
					}
				////////////////////
				/////중첩 for문
				////////////////////
				
				for(int i =0; i< 3; i++)
				{
					for(int j = 0; j < 3 j++)
					{
						System.out.println(i+" , "+j);
					}
					}
				for(int i =2; i <=9; i++)
				 {
					for(int j = 1; j <=9; j++)
				 	{
				 	System.out.println(i + " k " +  + " = " + i * j);
					}
					System.out.println();
					}
					*/
					
					
					int num = 5;
					for(int i =1; i <=num; i++)
						{
							for(int j = 5; j >= i; j--)
							{
								System.out.print(" * ");
							
							}//j for문
								System.out.println();
						}	//i for문
				
	}//end of 
	
}
