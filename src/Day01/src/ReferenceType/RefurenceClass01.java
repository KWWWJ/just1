package ReferenceType;

public class RefurenceClass01 {
	public static void main(String[] agrs) {
		
		// 1차원 배열	
		//	int[] number=new int[4]; 1차원 배열
			
		// 2차원 배열(다중 배열) 1차원 배열을 하나로 묶은 것.
		//  int[][] number=new int[][];	
		// 	int number[][]=new int[][];
		//  int[] number[]=new int[][];
			
			//4행3열 형식의 2차원 배열
			//int[][] score=new int[4][3];		
			
			//2차 배열도 생성과 동시에 초기화가능
			//int[][] number=new int[][]{{1,2,3}, {4,5,6}}
			//new 키워드 생략가능
			//int[][] number={
			//               {1,2,3},
			//               {4,5,6}
			//                  }
			
			//테이블 형태의 데이터를 코드로 작성하면
			//int[][] number={
			//                {100,100, 100},
	        //                {20,20,20},
	        //                {30,30,30},
	        //                {40,40,40},
			//                {50,50,50}
			//                           }; 행은 5, 열은 3.
			
			//for문을 통한 초기화
			//int[][] num=new int[4][3];
			//for (int i=0; i<num.length; i++){
			//      for (int=0 i<num[i].length; i++){
			//           num[i][j]=n; 모든 변수를 n으로 초기화.
			//        }
			//        }
			
			
			int[][] number={
			               //국어  영어  수학
			                {100, 100, 100},
	                        {20,  20,  20},
	                        {30,  30,  30},
	                        {40,  40,  40},
			                {50,  50,  50}
			                            };
			
			int plus=0;
			int slash=0;
			int allPlus=0;
			int allSlash=0;
			String subject=" ";
			String student=" ";
			
			
			for (int i=0; i<number.length; i++) 
			{
				for(int j =0; j<number[i].length; j++) 
				{
					
					student="학생"+(i+1);
					plus+=number[i][j];
					slash=plus/number[i].length;
				}
				
				System.out.println(student+"의 총점은 "+plus+"점이다.");
				System.out.println("       평균은 "+slash+"점이다.");
				System.out.println();
				
				plus=0;
				slash=0;
				allPlus=0;
				allSlash=0;
			}
			
			
			for (int i=0; i<number[i].length; i++) 
			{
				for(int j =0; j<number.length; j++) 
				{
					allPlus+=number[j][i];
					allSlash=allPlus/number[j].length;
				}
				if(i==2) 
			    {
				subject="국어";
			    System.out.println(subject+"의 총점은 "+allPlus+"점이다");
				System.out.println("      평균은 "+allSlash+"점이다.");
				System.out.println();
					if(subject=="국어") 
					{
					subject="영어";
				    System.out.println(subject+"의 총점은 "+allPlus+"점이다");
					System.out.println("      평균은 "+allSlash+"점이다.");
					System.out.println();
					   if(subject=="영어") 
					   {
					   subject="수학";
				       System.out.println(subject+"의 총점은 "+allPlus+"점이다");
					   System.out.println("      평균은 "+allSlash+"점이다.");
					   System.out.println();
					   }
					}
			    }
			    
		   }
		
		
			

			
			//for문 변형
			//int[] number={1,2,3,4,5}; 가 있을 때.
			//for (int i : number) {} 형태로 입력할 수 있다. 
			
			//이중for문의 경우 중첩하여 
			//for (int[] temp : number) { number의 요소(1타원 배열의 주소)를 temp에 저장.
			// for(int i : temp) { //이걸로 접근한 주소에 있는 배열 요소들을 꺼내 읽는다.
			//}
			//}
			//배열, 컬랙션에 사용할 때 읽는 용도로만 사용. (내부 값을 수정 및 변경 할 수 없다.)
			//기본적인 for문은 인덱스를 통해 요소를 변경하거나 건너 뛸 수 있는 등의 명령이 가능하지만 위의 것은 불가능 하다.
		
		
	}
}
