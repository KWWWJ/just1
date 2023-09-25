package StaticClass;

public class Main {
	public static void main(String[] args)
	{
//		Phone myPhone = new Phone("나");
//		String myPhoneNumber;
//		myPhone.number = "010-1234-6789";
//		System.out.println(myPhone.number);
//	
//		System.out.println(myPhone.getOwner());
//		
//		System.out.println(myPhone.operater);
		
		//System.out.println(Phone.model); //클래스 자체에서 뽑아온다.
		GalaxyPhone myPhone1 = new GalaxyPhone("나", "010-1234-5678");
		System.out.println(myPhone1.getOwner());
		
		System.out.println(GalaxyPhone.MANUFACTURE);
		System.out.println(IPhone.MANUFACTURE);
		
		IPhone myPhone2 = new IPhone("나", "010-1234-5678");
		myPhone2.installApp("카카오톡"); //오버라이딩 하지 않으면 각각으로 선언해야함 
		
		Phone[] myPhones = new Phone[] {myPhone1, myPhone2};
		
		myPhones[0].installApp("카메라");
		myPhones[1].installApp("카메라");
		//UpCasting 위의 클래스로 타입을 바꿨다.
		//상속관계에서만 사용할 수 있다.
		
		myPhone2.installApp("카메라");
		short temp = 1;
		@SuppressWarnings("unused")
		int temp1 = temp; //타입 변환
	}
}
