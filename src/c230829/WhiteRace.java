package c230829;

public final class WhiteRace extends Person{
	// 여기서 상속을 멈춤
	int[] skinColor;
	
	WhiteRace()
	{
		super(); //부모 생성자는 자식 생성자에 무조건 포함되어야 함.
		skinColor = new int[] {255, 255, 255, 1};//RGB+투명도
//		String tempColor = "ffffff"; // 16진수 
		// 11 3 / 111 7 / 1111 15 / 0~1111 16개  컴퓨터가 인식하는 것
	}
}
