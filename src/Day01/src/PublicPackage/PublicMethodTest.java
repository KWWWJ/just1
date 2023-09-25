package PublicPackage;

import Object.Exam; //해당 인스턴스나 클래스를 불러오려면 그걸 public으로 만들어야 함

public class PublicMethodTest {
	public static void main(String[] agrs)
	{
		Exam exam=new Exam();
		exam.publicMethod();
	}

}
