package c230829;

public non-sealed class YellowRace extends Person {
	// 봉인 해제                                          
	int[] skinColor;
	
	YellowRace()
	{
		super();
		skinColor = new int[] {255, 255, 255, 1};// 251, 206, 177 
	}
}
