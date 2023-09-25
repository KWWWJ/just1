package ReferenceType;

import java.util.Scanner;

public class RefurenceClass {
	
public static void main(String[] arge) {
		
		//array배열 - 매우 자주 사용함.
		//같은 타입의 변수variable를 하나로 묶어 하나의 데이터 처리해는 것.
		/*
		int a1;
		int b2;
		int c3;
		int d4;
		*/
		//.... 수많은 변수를 선언하는 것은 시간도 시간이거니와 사용하는데 충돌이 발생 할수 있다.
		
		//배열 선언하기. - 생성은 아직임. 동적할당 연산자(new)로 메모리를 잡아줘야 함.
		//배열을 선언하는 것은 참조변수를 위한 공간준비.(Stack영역에 생성)
		
		//1. 타입[] 변수이름; 
		//int[] score;
		//String[] name;
		
		//2. 타입 변수이름[];
		//int score[];
		//String name[]

		//배열 생성하기.(생성 할 때나 이후에야 값을 지정할 수 있다.)
		//new를 사용해 배열의 타입과 길이를 지정한다.
		
		//타입[] 변수이름; 의 형태로 선언했다면
		//변수이름 = new 타입[숫자형태로 길이 넣기] - 실재 데이터가 저장될 공간.
		//int[] score; int타입의 배열을 다루기 위한 score 참조변수 선언
		//score = new int[5]
		
		
		//실제 사용(선언과 생성을 동시에)
		//int[] score = new int[5];
		//생성된 배열의 요소를 elemental이라 부르고 자동적으로 default값인 0으로 초기화
		//대입 연산자 =에 의해 배열의 주소가 int형 배열 참조변수인 score에 저장
		//유효한 범위를 벗어나는 index를 사용하는 것은 컴파일러로도 잡을 수 없어 주의 해야한다.
		
		//생성된 배열에 각 저장 공간을 요소, 배열의 요소마다 붙여진 번호를 index, index를 통해 각 배열의 요소에
		//접근 할 수 있다.
		
		/*
		int[] score = new int[5];
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		
		score[0]=10;
		score[1]=20;
		score[2]=30;
		score[3]=40;
		score[4]=50;
		
		System.out.println("score[0]에 저장된 데이터 : "+score[0]);
		
		
		System.out.println("===================================================");
		
		int k=1;
		score[k+1] =30; //score[2]=30;과 동일
		
		
		for (int i=0; i<5; i++) {
			System.out.printf("score[%d] :%d", i, score[i]);
		}
		
		System.out.println("===================================================");
		
		int temp = score[k+2]+score[4];
        System.out.println(temp);
        
        
        for(int i=0; i<score.length; i++) {
        	System.out.printf("score[%d] : %d\n",i,score[i]);
        }
        
        
        int[] number=new int[10];
        
        for (int i=0; i<number.length; i++) { //number의 각 인덱스에 i만큼의 값 데이터를 대입.
        	number[i] = i;
        }
        
        for (int i=0; i<number.length; i++) {
        	System.out.println(number[i]);
        }
        
		
        int[] arr=new int[] {10, 20, 30, 40, 50}; //길이가 5. 잘 사용은 안한다.
        
        
        //new를 제외하고 배열만들기
        int[] arr1= {100, 50, 123, 564};
        
        
        
        System.out.println("============================================");
        
        
		//실습. 4개의 과목.
        //사용자가 점수를 입력하면 점수를 배열에 저장하도록 한다.
        //배열에 저장된 점수의 함과 평균을 구하라.
        
        
        Scanner point = new Scanner(System.in);
       
        int myScore1 =0;
        int myScore2 =0;
        int myScore3 =0;
        int myScore4 =0;
        int oder =0;
       
      
        int[] inputScore = new int[4];
        int allPuls=0;
        int slash=0;
 
        
       
        	System.out.println("첫번째 과목의 점수를 입력하세요.");
        	myScore1 = point.nextInt();
        	inputScore[0]=myScore1;
        	System.out.println(inputScore[0]+"점");
        	System.out.println("두번째 과목의 점수를 입력하세요.");
        	myScore2 = point.nextInt();
        	inputScore[1]=myScore2;
        	System.out.println(inputScore[1]+"점");
        	System.out.println("세번째 과목의 점수를 입력하세요.");
        	myScore3 = point.nextInt();
        	inputScore[2]=myScore3;
        	System.out.println(inputScore[2]+"점");
        	System.out.println("마지막 과목의 점수를 입력하세요.");
        	myScore4 = point.nextInt();
        	inputScore[3]=myScore4;
        	System.out.println(inputScore[3]+"점");
        	
        	
        	for(int i =0; i<inputScore.length; i++) {
        		
        	allPuls+=inputScore[i];
        	slash=allPuls/inputScore.length;
            }
        
        	System.out.println("과목의 총점은 "+allPuls+"점 입니다.");
        	System.out.println("과목의 평균 점수는 "+slash+"점 입니다.");
            
           */
		/*
		final int NUM=4; 
		int[] scores=new int[NUM];
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
				
				for (int i=0; i<NUM; i++) {
					System.out.println(" 과목 "+(i+1)+"의 점수를 입력하라.");
					scores[i]=scanner.nextInt();
					sum+=scores[i];
				}
				scanner.close();
				
				double average =sum/NUM;
				
				System.out.println("합계 : "+sum);
				System.out.println("평균 : "+average);
				*/
		
		
		//배열의 복사
		//기본적으로 배열은 한번 생성하면 그 길이를 변결할 수 없음
		//더 많은 공간이 필요하면 큰 배열을 새로 만들어서 기존 배열로부터 copy해야  함.
		
		
		//for 문을 이용한 copy
		/*
		int[] arr=new int[5];
		
		int[] temp=new int[arr.length*2]; //새로운 int타입 배열은 arr 길이의 두배
		
		for (int i =0; i<arr.length; i++) {
			temp[i]=arr[i]; //arr[i]의 값을 temp[i]에 저장
		}
		arr=temp; //참조변수 arr이 temp의 배열을 가지키게한다. >본래 있던 arr 주소가 가리키던 배열은 GC가 처리
		*/
		
		//배열복사
		/*
		int[] arr=new int[5];
		
		for (int i = 0; i< arr.length; i++) {
			arr[i]=i+1;
			
		}
		System.out.println("[변경전]");
		System.out.println("arr의 길이 :"+arr.length);
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		
		int[] temp=new int[arr.length*2];
		
		for (int i =0; i<arr.length; i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		System.out.println("[변경후]");
		System.out.println("arr의 길이 :"+arr.length);
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] :"+arr[i]);
		}
		
		*/
		
		
		//과제.
		//1. 배열의 요소 중에서 제일 큰 값과 제일 작은 값을 찾는다.
		//ex)78, 10, 5, 100. 98
		//결과 (최대값), (최솟값) 
		
		
		int[] arr=new int[5];
		int max=0;
		int least=1000;
		
		arr[0]=84;
		arr[1]=55;
		arr[2]=21;
		arr[3]=9;
		arr[4]=76;
		
		for (int i =0; i<arr.length; i++) {
			if (max<arr[i]) {
				max=arr[i];
		}
			else if (max>arr[i]) {
				continue;
			}
		
		}
		for (int i =0; i<arr.length; i++) {
			if (least>arr[i]) {
				least=arr[i];
			}
			else if (least<arr[i]) {
				continue;
			}
		}
		System.out.println("배열의 최대값 : "+max+"  최소값 : "+least);
		
		System.out.println("======================================");

		
		
		
		
		//2. 숫자야구 게임
		//스트라이크와 볼이 있다.
		//컴퓨터는 임의의 수 1~9까지 난수를 발생을 시키고, 3개의 숫자를 배열에 저장한다.
		//플레이어는 해당 숫자를 맞춘다.
		//이 때 숫자와 자리가 모두 같을 때는 n스트라이크, 숫자나 자리 중 하나만 맞았을 때는 n볼, 틀리면 아웃으로 간주한다.
		//종료 조건 : 10판째, 전부 정답
		
		System.out.println("게임을 시작합니다.");
	
		int[] player=new int[3];
		int[] base=new int[5];
		
		int random=0;
		
		Scanner game = new Scanner(System.in);
		
		
		int match=0;
		
		for(int i =2; i<5; i++) {
			while(true) {
				random = (int)(Math.random()*9)+1;
				base[i]=random;
				if((base[i-1]!=base[i])&(base[i-2]!=base[i])) { 
			    break;
		}
		}
		}
	
		
		
		while (true) {
		
				int strike=0;
				int ball=0;
				
				
				for(int i=0; i<=2; i++) {
					System.out.println(i+1+"번째 숫자를 입력하세요");
					player[i]=game.nextInt();
					
					
				if (player[i]==base[i+2]) {
					strike+=1;
				}
					
			    else if(player[i]==base[4]||player[i]==base[3]||player[i]==base[2]) {
						ball+=1;
				    }
				    }
			        
				System.out.println(strike+"스트라이크");
				System.out.println(ball+"볼");
				System.out.println("===============================");
				match+=1;
				
				if (strike==3) {
					System.out.println("정답입니다.");
					break;
				}
				if(match==10)break;
				
}

 System.out.println("게임이 종료되었습니다.");
 System.out.println("정답은 : "+base[2]+" "+base[3]+" "+base[4]+"이였습니다");
		
      
        
        game.close();
        
        /*
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
        
         */
	

	}

}
