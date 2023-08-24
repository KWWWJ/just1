package Test01;

	class Card {
	public int damage = 0;
	public int cost = 0;
	public int itemRate = 0;
	public String name = " ";
	protected String description = " ";
	
}

class AttackCard extends Card
{
	public void attackCard1()
	{
		damage = 1;
		cost = 1;
		name = "공격카드";
		description = "상대에게 1의 대미지를 줍니다.";	
		//System.out.println("여긴 돈다 1");
	}
	public void attackCard2()
	{
		name = "공격카드";
		description = "상대에게 2의 대미지를 줍니다.";		
		damage = 2;
		cost = 2;
		//System.out.println("여긴 돈다 2");
	}
	public void attackCard3()
	{
		name = "공격카드";
		description = "상대에게 3의 대미지를 줍니다.";		
		damage = 3;
		cost = 3;
		//System.out.println("여긴 돈다 3");
	}
	public void attackCard4()
	{
		name = "공격카드";
		description = "상대에게 4의 대미지를 줍니다.";		
		damage = 4;
		cost = 4;
		//System.out.println("여긴 돈다 4");
	}
}

class DefenceCard extends Card
{
	public void defenceCard1()
	{
		name = "방어카드";
		description = "받는 대미지를 1만큼 막습니다.";		
		damage = -1;
		cost = 1;
		//System.out.println("여긴 돈다 5");
	}
	public void defenceCard2()
	{
		name = "방어카드";
		description = "받는 대미지를 2만큼 막습니다.";		
		damage = -2;
		cost = 2;
		//System.out.println("여긴 돈다 6");
	}
	public void defenceCard3()
	{
		name = "방어카드";
		description = "받는 대미지를 3만큼 막습니다.";		
		damage = -3;
		cost = 3;
		//System.out.println("여긴 돈다 7");
	}
}

class EvasionCard extends Card
{
	public void evasionCard1()
	{
		name = "회피카드";
		description = "받는 대미지를 회피합니다.";
		cost = 3;
		//System.out.println("여긴 돈다 8");
	}
}

class AppeasementCard extends Card
{
	public void appeasement1()
	{
		name = "회유카드";
		description = "상대와 협상합니다. 33%확률로 아이템을 얻습니다.";
		cost = 2;
		itemRate = 33;
		//System.out.println("여긴 돈다 9");
	}
	public void appeasement2()
	{
		name = "회유카드";
		description = "상대와 협상합니다. 66%확률로 아이템을 얻습니다.";
		cost = 2;
		itemRate = 66;
		//System.out.println("여긴 돈다 10");
	}
}

class TheatCard extends Card
{
	public void theat()
	{
		name = "협박카드";
		description = "상대를 협박합니다. 99%확률로 아이템을 얻습니다. 1%확률로 반격 당합니다.";
		cost = 5;
		itemRate = 99;
		//System.out.println("여긴 돈다 11");
	}
}