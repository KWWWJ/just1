package c230831;

public record RecordTest(int num, String name) { //프라이빗 설정
	//get이 알아서 만들어져 있다.
	//set은 없다.
	public String toString() {
		return "손에는 커피가 "+num+"잔 들려있다. 커피의 이름은 "+name+"(이)다";
	}
}
