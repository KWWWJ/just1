package PixyHands.Card;

public class TheatCard extends BasicCard {
	
	private String nameCard;
	private String description;
	private String giveItem[] giveItem; 
	private int damage;
	private int cost;
	
	public void theat()
	{
		nameCard = "협박카드";
		description = "99%의 확률로 아이템을 가져옵니다. 1%의 확률로 반격당합니다.";		
		damage = 0;
		cost = 5;
		//System.out.println(nameCard+"\n"+"효과 : "+description+" / 코스트 : "+cost);
	}

}
