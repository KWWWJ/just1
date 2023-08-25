package PixyHands.Character;

public class Monster extends BasicCharacter{
	public int[] monster = new int[4];
	public String[] comSelect = new String[] {};
	public void monster()
	{
		for(int i = 0; i<monster.length; i++)
		{
			int k = (int)(Math.random()*4);
			int temp = monster[i];
			monster[i] = monster[k];
			monster[k] = temp;
		}
			
		if(monster[0] == 0)
		{
			nameChar = "["+"픽시"+"]";
			description = "쥐와 사람을 합친듯한 외형. 장난치길 좋아한다."+"]";
			healthPoint = 10;
			fullCost = 3;
		}
		if(monster[0] == 1)
		{
			nameChar = "["+"난쟁이"+"]";
			description = "["+"노인을 아이의 크기로 줄여놓은 듯한 모양새. 보기와 달리 근력은 성인 남성과 비슷하다."+"]";
			healthPoint = 25;
			fullCost = 4;
		}
		if(monster[0] == 2)
		{
			nameChar = "["+"환각나비"+"]";
			description = "["+"크기가 1.5m에 달하는 거대한 나비. 날개에서 특수한 가루를 날려보내는 것으로 대상을 환각에 빠트린다."+"]";
			healthPoint = 14;
			fullCost = 8;
		}
		if(monster[0] == 3)
		{
			nameChar = "["+"듀라한"+"]";
			description = "["+"죽음에서 돌아온 머리없는 기사. 목에서 뿜어내는 푸른 귀화에 의해 상대하면 제대로 힘을 쓰지 못한다."+"]";
			healthPoint = 30;
			fullCost = 3;
		}
		
	}
	
	public void bossMonster()
	{
		
		nameChar = "["+"주시자";
		description = "["+"나무 줄기를 역어 만든 듯한 6개의 팔과 형형색색의 만개한 꽃들이 뒤덮고있는 하체, 생물의 것이라고는 믿기지 않는 붉은 보석의 눈"+"]"
				+ "\n"+"["+"그는 항상 무언가를 주시하고 있다. 주 대상은 영혼 없는 자."+"]";
		healthPoint = 10;
		fullCost = 3;
	}

}
