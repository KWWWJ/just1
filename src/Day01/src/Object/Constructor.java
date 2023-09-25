package Object; //Data class와 연

//생성자
//인스턴스가 생성될 때 호출
//인스턴스 변수의 초기화 작업에 주로 사용.
//클래스 내에 선언, 구조도 메서드와 유사함
//리턴값이 없지만 void는 안붙인다.
//인스턴스를 생성할 떄는 클래스 내의 생성자가 하나 이상 정의 되어있어야 한다.(모든 클래스에는 생성자가 정의되어 있어야 함.)
class Student1
{
	Student1(){}
	//생성자
	Student1(String str, int number){} 
	//생성자 오버로딩
}
class Data3 
{
	int value;
}
class Data1
{
	int value1;
	//매개변수가 있는 생성자.
	Data1(int n)
	{
		value1=n;
	}
}

class Car
{
	String color;
	String name;
	String type;
	int price;
	
	
	Car(){}
	
	Car(String c, String n, String t, int p)
	{
		color=c;
		name=n;
		type=t;
		price=p;
	}
}
public class Constructor//생성자 - 인스턴스 생성시 변수 초기화 작업에 줄로 사용.
{
	public static void main(String[] args)
	{
		//Student student=new Student();//()얘가 생성자.
		//생성자가 존재하지 않으면 컴파일러가 소스파일을 확인하고 알아서 default 생성자를 호출한다.
		//default 생성자에는 아무런 내용도 없다.
		Data3 data=new Data3();
		data.value=5;
		System.out.println(data.value);
		
		Data1 data1=new Data1(1);
		System.out.println(data1.value1);
		
		//Data1 data4=new Data1();    //Data1(){} 이런 형태가 정의 되지 않아서 에러
		//한 번 만들었으면 이후의 같은 클래스를 사용할 떄도 그 생성자를 사용하게 된다.
		
		
		Car hyundai=new Car();
		hyundai.color="검정";
		hyundai.name="그랜저";
		hyundai.type="auto";
		hyundai.price=5000;
		
		Car kia=new Car("빨강","모닝","auto",1000);
		
		System.out.println
		("현대 색상 : "+hyundai.color+"이름 : "+hyundai.name+"가격 : "+hyundai.price+"타입 : "+hyundai.type);
		System.out.println
		("현대 색상 : "+kia.color+"이름 : "+kia.name+"가격 : "+kia.price+"타입 : "+kia.type);
		
		
		
		
		
	}
}
