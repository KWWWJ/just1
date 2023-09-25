package StaticClass;

interface InterfacePhone{ //인터페이스만 보여준다.
	String SIMNUMBER = "파이널만 들감";
	//public static final이 기본 설정
	public void installApp(String appName);
	void call(String otherOwner);
}

	public abstract class Phone implements InterfacePhone{
	//abstract는 추상 / 변수는 추상화가 힘듦
	public String number; //프로젝트 내에서 공용
	//퍼블릭 변수는 잘 사용하지 않음
	//Static(정적) 변수 이외에 거의 쓰지 않는다.
	//객체지향적 특징 중 캡슐화를 위해 외부에서 마음대로 건들일 수 없어야 하기 때문.
	//리턴 메서드로 사용할 수 있게 만들어준다.
	private String owner;
	protected String operater = "lg"; //같은 패키지 내에서만 공용
	//public static String model = "갤럭시"; //클래스 변수이기 떄문에 클래스 자체에서 바로 뽑아온다
	public final String MANUFACTURE = "삼성";//수학적으로 상수, 즉 변하지 않는 변수를 의미한다. 이후 변경 불가능
	//대게 pi가 3.14인것과 같이 약속되어있는 경우 public static final을 붙여 쓴다.
	
	//super - 부모클래스 참조변수
	//super() - 부모클래스의 생성자 메서드를 사용한다.
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
		//setter
	}

	
	public String getOwner() {
		return owner;
		//getter
	}
	
	public void tackAPicture()
	{
		System.out.println("사진을 찍었습니다.");
	}
	@Override
	public void call(String ohterOwner) {
		System.out.println(owner+"가 "+ohterOwner+"에게 전화를 건다.");
	}
	@Override
	public void installApp(String appName) {} //폰마다 다름
	//값이 없으므로 추상화 가능

}

class GalaxyPhone extends Phone{ //상속받으면
	public final static String MANUFACTURE = "삼성";
	public GalaxyPhone(String owner, String number) { //매개변수 지정 후
		super(owner);//부모클래스의 생성자를 지정한다.
	//	this.owner; //자신은 owner를 지니지 않으므로 불가능하다.
		this.number = number;
		this.operater = "kt";
	}
	@Override //주석을 달아둔다. 부모가 없을 떄 붙이면 빨간줄
	public void installApp(String appName) {
		System.out.println("구글 스토어에서 "+appName+"을/를 다운받는다.");
		//오버라이딩
	}
}
class IPhone extends Phone{ //상속받으면
	public final static String MANUFACTURE = "애플";
	public IPhone(String owner, String number) { //매개변수 지정 후
		super(owner);//부모클래스의 생성자를 지정한다.
	//	this.owner; //자신은 owner를 지니지 않으므로 불가능하다.
		this.number = number;
		this.operater = "kt";
	}
	@Override
	public void installApp(String appName) {
		System.out.println("앱스토어에서 "+appName+"을/를 다운받는다.");
	}
}

class Player{
	private String nickName;
	public Player(String nickName) {
		this.nickName = nickName;
	}
	public String getNicName() {
		return nickName;
	}
}