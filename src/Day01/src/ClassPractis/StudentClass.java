package ClassPractis;

class Student {
	String name="";
	int studentId=0;
	int age=0;
	int phoneNumber=0;
	
	Student(String n, int i, int a, int p)
	
	{
		name=n;
		studentId=i;
		age=a;
		phoneNumber=p;
	}
	
	boolean outPut()
	{
		System.out.println
		("이름 : "+name+"\n"+" 학번 : "+studentId+"\n"+" 나이 : "+age+"\n"+"전화번호"+phoneNumber);
		return true;
	}
}
public class StudentClass 
{
		public static void main(String[] ages)
		{
			//Student Class만들기
			//이름, 학번, 아니 등등 저장
			//생성자를 이용하여 객체를 초기화할 때 필요한 정보를 전달 할 수 있도록
			Student student=new Student("권원준", 2023011, 22, 66802488);
			System.out.println(student.outPut());
		}

}
