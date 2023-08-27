package PixyHands.Card;

public class AttackCard extends BasicCard{
	
	private String nameCard;
	private String description;
	private String giveItem[] giveItem; 
	private int damage;
	private int cost;
	
	public void AttackCard1()
	{
		nameCard = "공격카드";
		description = "상대에게 대미지를 1만큼 줍니다.";		
		damage = 1;
		cost = 1;
		//System.out.println("여긴 돈다 1");
		//System.out.println(nameCard+"\n"+"효과 : "+description+" / 코스트 : "+cost);
	}
	public void AttackCard2()
	{
		nameCard = "공격카드";
		description = "상대에게 대미지를 2만큼 줍니다.";		
		damage = 2;
		cost = 2;
		//System.out.println("여긴 돈다 2");
		//System.out.println(nameCard+"\n"+"효과 : "+description+" / 코스트 : "+cost);
	}
	public void AttackCard3()
	{
		nameCard = "공격카드";
		description = "상대에게 대미지를 3만큼 줍니다.";		
		damage = 3;
		cost = 3;
		//System.out.println("여긴 돈다 3");
		//System.out.println(nameCard+"\n"+"효과 : "+description+" / 코스트 : "+cost);
	}
	public void AttackCard4()
	{
		nameCard = "공격카드";
		description = "상대에게 대미지를 4만큼 줍니다.";		
		damage = 4;
		cost = 4;
		//System.out.println("여긴 돈다 3");
		//System.out.println(nameCard+"\n"+"효과 : "+description+" / 코스트 : "+cost);
	}
}
