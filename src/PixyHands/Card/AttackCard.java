package PixyHands.Card;

public class AttackCard extends BasicCard {
	int cardCount = 0;
	
	public void attackCard1()
	{
		damage = 1;
		cost = 1;
		name = "공격카드";
		description = "상대에게 1의 대미지를 줍니다.";	
		//System.out.println("여긴 돈다 1");
		cardCount++;
	}
	public void attackCard2()
	{
		name = "공격카드";
		description = "상대에게 2의 대미지를 줍니다.";		
		damage = 2;
		cost = 2;
		//System.out.println("여긴 돈다 2");
		cardCount++;
	}
	public void attackCard3()
	{
		name = "공격카드";
		description = "상대에게 3의 대미지를 줍니다.";		
		damage = 3;
		cost = 3;
		//System.out.println("여긴 돈다 3");
		cardCount++;
	}
	public void attackCard4()
	{
		name = "공격카드";
		description = "상대에게 4의 대미지를 줍니다.";		
		damage = 4;
		cost = 4;
		//System.out.println("여긴 돈다 4");
		cardCount++;
	}
}
