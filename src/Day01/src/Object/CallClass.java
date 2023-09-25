package Object; //소프트웨서 엔지니어링 시작하기 - 프로그래밍 언어 활용

class Data
{
	int x;
}

public class CallClass 
{
	public static void main(String[] agrs)
	{
//		Data d=new Data();
//		d.x=10;
//		System.out.println("메인에서의 x : "+d.x);
//		
//		Change(d.x); //끝나면 스택상에서 복사된 데이터가 삭제
//		//call by value 값을 부른다.
//		System.out.println("Change(d.x) 이후");
//		System.out.println("메인에서의 x : "+d.x);
//		System.out.println("===============================");
//		
//		//call by reference는 참조 주소를 복사해와서 원본 데이터도 변함 
//		Change(d);
//		System.out.println("Change(d)이후");
//		System.out.println("메인에서의 x : "+d.x);
		
		Data c=new Data();
		
		c.x=10;
		
		Data c2=copy(c);
		//1. copy메서드를 호출하면서 참조변수 d의 주소가 매개변수 d에 복사.
		//2. 새로운 객체를 생성한 다음 d.x에 저장된 값을 temp.x에 복사.
		//3. copy메서드가 종료되면서 리턴한 temp의 값은 참조변수 c2에 저장.
		//4. copy메서드는 종료되어 temp는 사라졌지만 c2로 새로운 객체를 사용할 수 있음. 
		System.out.println("c의 값 : "+c.x);
		System.out.println("c2의 값 : "+c2.x);
	}
	static void Change(int x) //매개변수는 스택에 저장.
	{
		x=100; //대입이 아닌 복사, 복사된 데이터를 100으로 변경했기 때문에 본래있는 10에는 이상이 없다.
		System.out.println("Change메서드의 x : "+x);
	}
	static void Change(Data d)  //참조형 데이터의 주소를 복사해 가져온다.
	{
		d.x=100; //같은 객체를 가리키고 있기에 변경하면 원본 데이터가 같이 변경된다.
		System.out.println("Change메서드의 x : "+d.x);
	}
	static Data copy(Data d) //리턴타입이 참조형
	{
		Data temp=new Data(); //새로운 객체 temp를 생성
		temp.x=d.x; //d.x의 값을 temp.x에 복사 
		return temp; //참조형으로 리턴 , 리턴이 없으면 참조가 사라져 적용되지 않는다.
	}
}
