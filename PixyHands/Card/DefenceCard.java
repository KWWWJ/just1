package PixyHands.Card;

public class DefenceCard extends BasicCard {
	
		public void defenceCard1()
		{
			nameCard = "방어카드";
			description = "받는 대미지를 1만큼 막습니다.";		
			damage = -1;
			cost = 1;
			//System.out.println("여긴 돈다 5");
			//System.out.println(nameCard+"\n"+"효과 : "+description+" / 코스트 : "+cost);
		}
		public void defenceCard2()
		{
			nameCard = "방어카드";
			description = "받는 대미지를 2만큼 막습니다.";		
			damage = -2;
			cost = 2;
			//System.out.println("여긴 돈다 6");
			//System.out.println(nameCard+"\n"+"효과 : "+description+" / 코스트 : "+cost);
		}
		public void defenceCard3()
		{
			nameCard = "방어카드";
			description = "받는 대미지를 3만큼 막습니다.";		
			damage = -3;
			cost = 3;
			//System.out.println("여긴 돈다 7");
		//	System.out.println(nameCard+"\n"+"효과 : "+description+" / 코스트 : "+cost);
		}

}
