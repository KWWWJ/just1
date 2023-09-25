package myPack;

import java.util.Scanner;

public class operator {

	
	  @SuppressWarnings("unused")
	public static void main(String[] agrs) {
		  
		  
		  //=====================================
		  // 연산자 
		  //====================================
		  
		  
		  /*
		   * 종류
             산술연산자 : + , - , * , / , % (%나머지연산)(나누기보다는 곱하기가 빠르다)
		   * 증감연산자 : ++ , --(++값이 1씩증가 또는 --감소) 
		   * 비교연산자 : < , > , <= , >= , == , !=(부정 a와b는 같지않다)
		   * 비트연산자 : & , | , ~ , ^
		   * 논리연사잔 : && , || , !
		   * 대입연산자 : =
		   * 복합대입연산자 : += , -= , *= , /=.......
		   * 시프트연산자 : << , >> (옆으로 이동시킨다)
		   * 삼항연산자 : (true or false) ? a:b      (참이면 a 틀리면b)
		   * 
		   * 
		   */
		  
		  int a =10;
		  int b =5;
		  int result =a+b;
		  int minus =a-b;
		  int multip =a*b;
		  int divi = a/b;
		  
		  
		  
		  System.out.println("덧셈 결과 : " +result);
		  System.out.println("뺄셈 결과 : " +minus);
		  System.out.println("곱셈 결과 : " +multip);
		  System.out.println("나누셈 결과 :" +divi);
		  
		  //증감연산자
		  //전위 연산자와 후위 연산자로 나뉨
		  int num =3;
		  ++num;
		  
		  System.out.println("전위 증가 연산 : "+num);
		  
		  int number =5;
		  number++;
		  System.out.println("후위 증가 연산 : "+number);
		  //위의 결과는 동일하다.
		  
		  
		  
		  int value =5;
		  int preIncrementValue = ++value;
		  System.out.println("전위 증가 연산 결과 : " +preIncrementValue);
		  System.out.println("Value의 값 : " + value);
		  
		  value =5;
		  int postIncrementValue =value++;
		  System.out.println("후위 증가 연산 결과 : "+postIncrementValue);
		  System.out.println("Value의 값 : " + value);
		  
		  
		  int num1 =7;
		  int num2 =7;
		  @SuppressWarnings("unused")
		int result1;
		  int result2;
		  
		  result1 = --num1+4;
		  result2 = num2--+4;
		  
		  System.out.println(result2);
		  
		  
		  int x=10;
		  int y= x-- + 5 + --x;
		  //변수y의 수행되는 연산의 순서를 작성해라
		  //x--=9 + 5 + --x=9  연산값은 23, 결과값은 23
		  //x-- + 5 (10+5를 한다음에15 를하고 --는 x를9로차감)+ --x(8)=23
		  System.out.println(y);
		  
		  
		 char c1 ='a';
		 char c2 =c1;
		 char c3 =' ';  //공백으로 초기화
		 
		 int i =c1+1;
		 System.out.println(i);
		 c2++;
		 System.out.println(c2);
		 c3 = (char)(c1+1);
		 System.out.println(c3);
		 
		 //비교 연산
		 //두 피연산자의 값의 크기를 비교하고 참이면 true, 거짓이면 false 반환한다
		 
		 System.out.println(5<2);
		 System.out.println(5>2);
		 System.out.println(5<=2);
		 System.out.println(5>=2);
		 System.out.println(5!=2);
		  
		 
		 
		 int number1 =5;
		 int number2 =2;
		 @SuppressWarnings("unused")
		int number3 = 5;
		 
		 //== , !=
		 System.out.println(number1==number2);
		 
		 String str1 = new String("Hello");
		 String str2 = new String("Hello");
		 System.out.println(str1==str2);
		 
		 //지금 해볼것.
		 //국어, 영어, 수학, 과학,국사 5개 과목의점수
		 //총점과 평균을 구해라.
		 
		 int krean = 80;
		 int enl = 70;
		 int math = 90;
		 int scien = 95;
		 int national = 85;
		 
		 System.out.println("총점 : " +(krean + enl + math + scien + national));
		 System.out.println("평균 : " +(krean + enl + math + scien + national)/5);
		 
		 int total = krean + enl + math + scien + national;
		 int average = total/5;
		 
		 System.out.println("총점 : " +total);
		 System.out.println("평균 : " +average);
		 
		 //비트연산자
		 //&(and) , |(or) , ~(not) , ^(xor)
		
		 
		 
		 /*
		   a	b		&	|	^					~
		   											0	1(0들어오면1)
		   0	0		0	0	0					1	0(1들어오면0)
		   0	1		0	1	1	
		   1	0		0	1	1	
		   1	1		1	1	0	
		   
		   
		  */
		 
		 
		 int bitNum1 =5;     //0000 0101
		 int bitNum2 =3;     //0000 0011
		 
		 int resultAnd = bitNum1 & bitNum2;
		 
		 //0000 0101
		 //0000 0011
		 //-----------
		 //0000 0001
		 System.out.println("&연산 결과 : "+resultAnd);
		 
		 
		 int resultor = bitNum1 | bitNum2;
		  
		 //0000 0101
		 //0000 0011
		 //-----------
		 //0000 0111
		 System.out.println("|연산 결과 : "+resultor);
		 
		 int leftShift =bitNum1<<2;
		 //0000 0101
		 
		 System.out.println("왼쪽 쉬프트 연산 결과 : "+leftShift);
		 //0001 0100
		 int rightShift =leftShift>>1;
		//0001 0100
		 System.out.println("오른쪽 쉬프트 연산 결과 : "+rightShift);
		//0000 1010
		 //비트를 하나씩 옮길때마다 곱하기2만큼상승한다.
		 //위에서 알수 있듯이 비트를 왼쪽, 오른쪽 하나씩 옮길때마다*2, /2만큼 변경되는걸 알수있음
		 
		 
		 //대입연산자
		 //= , += , -=......
		 @SuppressWarnings("unused")
		int palyerHp = 100;
		 @SuppressWarnings("unused")
		int potion = 50;
		 System.out.println("포션 섭취");
		 //palyerHp+= potion;
		 //palyerHp = palyerHp+potion; 와 같다.
		 
		 int maxValue =3;
		 maxValue = maxValue+3;
		 System.out.println("대입연산결과 : " + maxValue);
		 
		 //복합대입 연산자
		 int maxValue1 = 5;
		 maxValue1+=10; //maxValue1 = maxValue1+10과같다
		 System.out.println("결과 : "+ maxValue1);
		 
		 
		 //삼항연산자
		 @SuppressWarnings("unused")
		int Value2 =(true)?1:2;
		 System.out.println(Value2);
		 
		 
		 int number5 =10;
		 int number6 =20;
		 int res = (number5>number6)?number5:number6;
		 System.out.println("변수 2개중 큰수는? : "+res);
		 
		 
		 int number7 =30;
		 int number8 =15;
		 boolean isCheck = (number7-number8>10)?true:false;
		 System.out.println("두수의 차이가 10보다 크냐? : " +isCheck);
		 
		 int number9 = 2;
		 
		 
		 String sRes=(number9%2==0)?"짝수" :"홀수";
		 System.out.println("홀짝 결과는? : "+sRes);
		 
		 
		 //논리연산자
		 //&& , || , ! 
		 //x>3 && x<5    //x>3와 x<5 참 일경우에만 참
		 //x>3 || x<5    //x>3와 x<5 둘중 하나만 참이여도 참
		 
		 //(x>3 && x<5)  x>3 || x<5  (x>3 && x<5)  ||마지막결과값
		 
		 
		 boolean isHuman = true;
		 boolean isMale = false;
		 
		 System.out.println("isHuman && isMale -> " +(isHuman && isMale));
		 System.out.println("isHuman || isMale -> " +(isHuman || isMale));
		 System.out.println("isHuman -> " +!(isHuman));
		 
		 
		 
		 int v;
		 if(5<4) {
		     v = 50;
		 }else {
		     v = 40;
		 }
		 System.out.println(v); //결과 = 40 
		 
		 int m = (5 < 4) ? 50 : 40; 
		 System.out.println(m); //결과 = 40
		 
		 
		 
		 
		 int k = 10;

		    System.out.println("첫번째 : " + (++k * 10));
		    System.out.println("두번째 : " + (k-- * 5));
		    System.out.println("세번째 : " + (--k * 2));
		    System.out.println("네번째 : " + (++k * 4));
		    //첫번째는 k가 10으로 시작되었고, 1을 증가 시킨 후 10을 곱했으니, 11 * 10이 돼서 110이 된다. 
		    //두번째는 k가 11인 상황에서 5를 곱한 후, k의 값을 1 감소시켰으니, 55가 된다.
		    //세번째는 k의 값이 10인 상태에서 전위 감소로 9가 된 후 2를 곱했으니 18이 된다.
		    //네번째는 9에서 다시 전위 증가로 10이 된 상태에서 4를 곱했으니 40이 된다.
		 
		 //출력
		 //입력
		    
		    //@SuppressWaarings("resource")를쓰면	=> 무시 Scanner.close();   
		    //스캐너 클래스 객체를 생성
		    Scanner Scanner = new Scanner(System.in);
		    
		    //입력받은 내용을 strInput에 저장
		    //입력을 하고 입력한 내용이 문자열로 반환
		    String strInput=Scanner.nextLine();
		    //parseInt(strInput)=>입력받은 내용을 int타입으로 변환
		    int convertInput = Integer.parseInt(strInput);
		    
		    //int input = Scanner.nextInt();
		    
		 
		  Scanner.close();//import java.util.Scanner; 이안에 속해 있다
		  
		  
		  
	  }
}
