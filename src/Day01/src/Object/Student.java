package Object;

import java.util.Scanner;

//학생이라는 클래스를 만들어서 이름String, 나이int, 학번int, 키float, 전화번호int or String 있고
//학생정보를 출력하는 메서드를 만들어서 출력하라.

class StudentInformation
{
	String name;
	int age;
	int studentId;
	float stature;
	String bloodTpye;
	String phoneNumber;
}
	
public class Student {
	public static void main(String[] agrs)
	{
		StudentInformation studentInfo =new StudentInformation();
//		studentInfo.name="아무개";
//		studentInfo.age=22;
//		studentInfo.studentId=1234567;
//		studentInfo.stature=175;
//		studentInfo.phoneNumber=1066802488;
//		System.out.println("이름 : "+studentInfo.name+"\n"+
//						   "나이 : "+studentInfo.age+"세"+"\n"+
//						   "학번 : "+studentInfo.studentId+"\n"+
//						   "신장 :"+studentInfo.stature+"cm"+"\n"+
//						   "전화번호 : 0"+studentInfo.phoneNumber);
      //콘솔로 정보 입력
		Scanner scanner=new Scanner(System.in);
		Scanner number=new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		studentInfo.name=scanner.nextLine();
		System.out.println("나이를 입력해주세요.");
		studentInfo.age=scanner.nextInt();
		System.out.println("학번을 입력해주세요.");
		studentInfo.studentId=scanner.nextInt();
		System.out.println("신장(cm)을 입력해주세요.");
		studentInfo.stature=scanner.nextFloat();
		System.out.println("혈액형을 입력해주세요.");
		studentInfo.bloodTpye=number.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		studentInfo.phoneNumber=number.nextLine();
		System.out.println("이름 : "+studentInfo.name+"\n"+
						   "나이 : "+studentInfo.age+"세"+"\n"+
						   "학번 : "+studentInfo.studentId+"\n"+
						   "신장 : "+studentInfo.stature+"cm"+"\n"+
						   "혈액형 : "+studentInfo.bloodTpye+"형"+"\n"+
						   "전화번호 : "+studentInfo.phoneNumber);
		System.out.println("저장되었습니다.");
		scanner.close();
		number.close();
	}
}
