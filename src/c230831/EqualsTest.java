package c230831;

public class EqualsTest { //데이터를 편하게 쓸 수 있는 새로운 예약어에 기본적으로 포함된다.
	String name;
	int num;
	EqualsTest(int num, String name){
		this.num = num;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
//		if(num == ((EqualsTest)obj).num &&  //별로 보기 좋지않음
//				obj instanceof EqualsTest) { //타입이 같은지 확인하는 것.
//			if(((EqualsTest)obj).name.equals(name)) {//String은 참조형이지만 이미 오버라이딩이 되어있기 때문에 비교가 가능하다.
//			//(((EqualsTest)obj).name == name)은 참조형일 떄 오류 발생의 위험이 있다.
//				//> 자바는 메모리 영역에서 같은 내용을 알아서 연결해주기 때문에 가능
//				return true;
//			}
//		}
//		if(obj instanceof EqualsTest &&
//				((EqualsTest)obj).name.equals(name)) { //타입이 같은지 확인하는 것.
//			return true;
//		}
//		return false;
		if(!(obj instanceof EqualsTest)) return false;
		
		if(!((EqualsTest)obj).name.equals(name)) return false;
		
		if(num != ((EqualsTest)obj).num) return false;
		
		return true; //이쪽이 보기 좋음. 회원가입갗이 아이디의 생성, 비밀번호의 생성에 있어 걸리는 여러 조건들을 설정할 수 있다.
	}
	
	@Override
	public int hashCode() {
		return num+name.hashCode(); //이거 쓰면 내부 조소도 같아짐
		//hashMap - 자료구조를 다룰 때 데이터를 효율적으로 다룰 수 있게 만들어주는 기능이다.
	}
	
	@Override
	public String toString() { //대부분의 언어에서 지원한다. 문자열로의 변환을 의미
		return "제 이름은"+name+"입니다. 나이는 "+num+"살입니다.";
	}
}
