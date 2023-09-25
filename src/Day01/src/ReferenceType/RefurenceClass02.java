package ReferenceType;
//import java.util.Scanner;
public class RefurenceClass02 {
public static void main(String[] agrs) {
		
		//jagged Array 가변배열
		//in[][] a=new int[4][3]; 고정배열
		//int[][] jaggedArr=new int[3][]; 뒤의 차수의 길이를 지정하지 않고 나중에 지정.
		//2차원 이상의 다중 배열에서 타원의 크기가 서로 다를때 사용.
		/*
		int[][] jaggedArr=new int[4][];
		
		jaggedArr[0]=new int[] {1,2,3};
		
		jaggedArr[1]=new int[] {4,5};
		
		jaggedArr[1]=new int[] {7};
		
		for (int i = 0; i< jaggedArr.length; i++) 
		{
			for (int j = 0; i<jaggedArr[i].length; j++) 
			{
				System.out.print(jaggedArr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		//명시 하지 않고도 가능
		int[][] jaggedArr1= {
				{1,2,3},
				{4,5},
				{6,7,8,9}
		};
		*/
		/*
		int[][] grades= {
				{90,85,73},
				{59,89,75,61},
				{35,91,45}
		};
		
		for(int i=0; i<grades.length; i++) 
		{
			System.out.println("못난이"+(i+1)+"의 성적");
			
			for(int grade : grades[i]) 
			{
				System.out.println(grade+" ");
			}
			System.out.println();
		}
		
		int count=1;
		for(int[] sutdentGrade : grades) 
		{
			System.out.println("못난이"+count+"의 성적");
			
			for (int grade : sutdentGrade) 
			{
				System.out.print(grade+" ");
			}
			count++;
			System.out.println();
		}
		*/
		
		//입력
		//1.학생수 입력
		//학생수 입력 받는 변수
		
		//2.과목수 입력
		//과목 수 입력받는 변수
		
		//입력을 하기 위한 녀석
		/*
		Scanner input=new Scanner(System.in);
		
		System.out.print("학생 수를 입력하라");
		int studentCount=input.nextInt();
		input.nextLine();
		int[][] grades=new int[studentCount][];
		
		for (int student=0; student<studentCount; student++) 
		{
			System.out.println("못난이"+(student+1)+"의 과목수를 입력하라.");
			
			int subjectCount=input.nextInt();
			input.nextLine();
			
			grades[student]=new int[subjectCount];
			
			for (int subject = 0; subject<subjectCount; subject++) 
			{
				System.out.print("못난이"+(student+1)+"의 과목"+(subject+1)+"성적을 입력하라");
				grades[student][subject]=input.nextInt();
				input.nextLine();
			}
		}
		
		
		int studentNumber=1;
		for (int[] studentGrades : grades)   foreach를 사용할 수 있으면 사용.
		{
			System.out.print("못난이"+studentNumber+"성적");
			for (int grade : studentGrades)
			{
				System.out.print(grade+" ");
				studentNumber++;
		
			}
			input.close();
		}
		*/
		
		//long 변수를 선언하고 변수=System.cuttentTinmeMillis();를 사용하면 시작시간과 끝시간을 뽑을 수 있다.
	    //초로 출력할 때는 /1000.0으로 출력
		
		
		////////////////////////////////
		//주말 과제
		///////////////////////////////
		//특정 숫자를 입력하면 그 숫자를 변화시켜라. 아스키코드 35(샵)
		//매칭되는 타입을 변환시켜 바꾸기.
		
		//빙고가 완성되면 빙고가 표시되도록 코딩
		//오른쪽으로 내려가는 대각선은 6씩, 왼쪽으로 내려가는 대각선은 4씩
		
		
//		System.out.println("빙고시작");
//
//		int[] number = new int[25];
//		int bingoCount = 0;
//		int inputNum = 0;
//
//		Scanner scanner = new Scanner(System.in);
//
//		//배열 초기화
//
//		for(int i = 0; i<number.length;i++)
//		{
//			number[i] = i+1;
//		}
//
//		//셔플
//
//		for(int i = 0; i <number.length;i++)
//
//		{
//			int k=(int)(Math.random()*25);
//			int temp = number[i];
//			number[i]=number[k];
//			number[k]=temp;
//	
//		} 
//
//		//루프
//
//		//1. 입력받은 숫자를 특수기호로 변환
//		//2. 나머지 부분 계산
//		//3. 3줄이 되면 끝
//
//		while(true)
//		{
//			System.out.println("빙고 카운트 : " + bingoCount);
//			for(int i = 0; i< number.length;i++)
//			{
//				if(number[i]==35) 
//				{ //문자형으로 변환
//					System.out.print((char)number[i]+"\t");
//				}
//					else
//					{
//						System.out.print(number[i]+"\t");
//					}//나머지 출력
//				if((i+1)%5==0)
//				{
//					System.out.print("\n\n");
//				}
//			}
//
//			// 빙고 3개 정지
//	
//			if(bingoCount==3) 
//			{ //3회 반복시 탈출
//				break;
//			}
//	
//			bingoCount = 0; 
//			System.out.print("숫자를 입력해주세요." );
//			inputNum=scanner.nextInt();
//			for(int i =0; i<25; i++) 
//			{
//				if(inputNum==number[i])
//	
//				{
//					number[i] = 35;
//				}
//	
//			}
//	
//			//겹치면 변환
//	
//			 
//	
//			for(int i = 0; i<5; i++) //가로세로 빙고
//			{
//				int width = 0;
//			//가로 확인
//				for(int j = 1; j<5;j++)
//				{
//					if(number[5*i]==number[5*i+j])
//					{
//						width++;
//						if(width==4) 
//						{
//							bingoCount++;
//						}
//					}
//				}
//	
//			//세로 확인
//	
//				int heigth = 0;
//				for(int j =1; j<5; j++) 
//				{
//					if(number[i]==number[i+j*5]) //5씩 증가
//					{
//						heigth++;
//						if(heigth==4) 
//						{
//							bingoCount++;
//						}
//					}
//				}
//			}
//	
//			// 대각선 확인
//	
//				int slash =0;
//				int reverseSlash =0;
//				// 슬레쉬
//				for(int i = 1; i < 5; i++)
//				{
//					if(number[0]==number[6*i])//다음 대각선까지 6씩 증가
//					{
//						slash++;
//						if(slash==4)
//						{
//							bingoCount++;
//						}
//					}
//				}
//	
//			// 역슬레쉬
//	
//				for(int i = 1; i < 5; i++)
//				{
//					if(number[4]==number[4+4*i])//다음 대각선까지 4씩 증가
//					{
//						reverseSlash++;
//						if(reverseSlash==4)
//						{
//							bingoCount++;
//						}
//					}
//				}
//		}

		
		////////////////////
		//만들어진 빙고판에 숫자를 입력하는 것으로 숫자를 움직인다.(빙고판과 별개로 만들기)
		//셔플을 사용해 인덱스값을 바꿔 움직이는 것 처럼 보이게 한다.(인덱스가 얼마나 변하냐에 따라 어느정도 변하는지 확인)
	
		
		//String 추가
		//trim - 문자열의 앞뒤 공백을 제거해준다.
		String textString=" Hello, World ";
		String trimText=textString.trim();
		System.out.println(trimText);
		//사이트 이용자가 공백 포함 글을 쓸 떄 저장을 trim으로하면 편할 것 같다.
		
		//toCharArray - 문자여를 문자 배열로 변환
		String text="Hello, World";
		char[] charArray=text.toCharArray();
		
		for(char c:charArray)
		{
			System.out.print(c+" ");
		}
		
		//문자열 내 대소문자 변환하기
		
		String originalText="Hello, World";
		
		char[] charArr=originalText.toCharArray();
		
		for (int i=0; i<charArr.length; i++)
		{
			if(Character.isUpperCase(charArr[i])) //대문자 UpperCase
			{                                                //is -> to
				charArr[i]=Character.toLowerCase(charArr[i]); //소문자 LowerCase
			}
			else if(Character.isLowerCase(charArr[i]))
			{
				charArr[i]=Character.toUpperCase(charArr[i]);
			}
		}
		
		//문자배열을 문자열로 만들기
		String trans=new String(charArr);
		
		System.out.println(originalText);
		System.out.println(trans);
	}
}
