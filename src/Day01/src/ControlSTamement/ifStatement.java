package ControlSTamement;

import java.util.Scanner;

public class ifStatement {

	public static void main(String[] agrs) {
	     System.out.println("월요일이다.");
	     /*
	     //조건문
	     //동작조건이 true이면
	     if(condition) //->요기가 true이면
	     {
	    	//condition(조건식)의 자리를 실행해라=>조건식이 true일때만
	        // true가 여러개일때는 순차적으로 다나온다.
	    	 //실행시킬코드가한줄만 실행할거면 {}가 자동으로 삽입된다.
	    	 }
	
	     //////////////////////
	     //if~else
	     ////////////////////
	     
	     if(조건식) {//참이면 여기를 실행하고
	     }
	     //else의 특징은 단독으로 사용할수없다.
	     else {//거짓이면 여기를 실행한다.
	     }
	     
	     
	     if() {}
	     if() {}
	     else {}//이렇게 3문장이잇으면 바로 위에꺼만 가능하다.
	     
	///////////////////////////////
	/////////if~else    if~else
	     /////////////////////////////
	     if() {}
	     else if(조건식) {}
	     else if(조건식) {}
	     else if(조건식) {}
	     else{} 
	     
	     //
	     //1.
	     if(조건식) {}
	     if(조건식) {}
	     if(조건식) {}
	     //2.
	     if(조건식) {}
	     else if(조건식) {}
	     else if(조건식) {}
	     // if 부터 순차적으로 아래쪽으로 비교해서 그 중 참이 되는 
	     //경우에 있는 블록만 실행하고 바로 if문을 빠져나옵니다.
	     */
	  /*  
	     if(10<3) {
	    	 System.out.println("위 조건이 맞으면 여기가 실행되고");
	     }
	     else {
	    	 System.out.println("아니면 여기를 실행한다.");
	     }
	     
	     
	     int number =17;
	     if(number %2==0) {
	    	 System.out.println(number + "는 짝수임");
	     }
	     else {
	    	 System.out.println(number + "는 홀수임");
	     }
	
	     
	     int height = 150;
	     if(height>=140) {
	    	 System.out.println("놀이기구 탑승가능");
	     }
	    	 else {
	    		 System.out.println("놀이기구 탑승불가");
	}
	int a =85;
	if(a>=90) {
		System.out.println("A학점");
	}
	else if(a>=80) {
		System.out.println("B학점");
	}
	else if(a>=70) {
		System.out.println("C학점");
	}
	else {
		System.out.println("F학점");
	}
	     int score =0;
	     char grade = ' ';
	     
	     System.out.println("점수를 입력해라");
	     Scanner scanner = new Scanner(System.in);
	     
	     //화면을 통해 입력박은 숫자를 score에 저장한다
	     score = scanner.nextInt();
	     if(score>=90) {
	    	 grade = 'A';
	     }
	     else if(score>=80) {
	    	 grade = 'B';
	     }
	     else if(score>=70) {
	    	 grade = 'C';
	     }
	     else {
	    	 grade = 'D';
	     }
	     
	     System.out.println("너님의 학점은"+ grade+"이다");
	     
	     scanner.close();
	    
	     /*
	    if(조건식1) 
	    {
	    	//조건식1이 true일때 실행될 코드를 기재
	    	if(조건식2) 
	    	{
	    		//조건식1,조건식2가 모두 true일때 실행될 코드를 기재
	    	}else 
	    	{
	    	    //조건식1이 true 조건식 2가 false일때 실행된 코드를 기재	
	    	}
	    }
	    else 
	    {
	    	//조건식1이 false일때 실행
	    }	
	    	
	    */
	    	 
	     //실습
	     //score90점보다 같거나 크면 A학점
	     //90점 이상에서도 98점 이상은 A+
	     //94점 미만이면 A-
	     
	     //B학점도 마찬가지
	     // 위조건이 전부 아니면C
	     int score =0;
	     char grade =' ';
	     char opt = ' ';
	     System.out.println("점수를 입력해라 : " );
	     Scanner scanner = new Scanner(System.in);
	     score = scanner.nextInt();
	     
	     System.out.printf("내 점수는 %d이다. \n",score);
	     
	     //score가 90점 보다 같거나 크면 A
	     if(score>=90) {
	    	 grade = 'A';
	    	 if(score>=98) {
	    		 opt = '+';
	    	 }
	    	  if (score<94) {
	    		 opt = '-'; 
	    	 }	 
			  	   
	     }
	     System.out.println("학점은 : "+grade+opt +"이다");
	     if(score==80) {
	    	 grade = 'B';
	    	 if(score>=98) {
	    		 opt = '+';
	    	 }
	    	  if (score<70) {
	    		 opt = '-'; 
	    	 }	 
			  	   
	     }
	     System.out.println("학점은 : "+grade+opt +"이다");
	     
	     scanner.close();
		  
	}
		  
	    		}
	
