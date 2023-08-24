package Test01;

public class test {
	public static void main(String[] args)
	{
		Card card = new Card();
		AttackCard attack = new AttackCard();
		DefenceCard defence = new DefenceCard();
		EvasionCard evasion = new EvasionCard();
		AppeasementCard appeasement = new AppeasementCard();
		TheatCard theat = new TheatCard();
	
		
		Card[] deck = new Card[] {attack , defence, evasion, appeasement, theat};
		attack.attackCard1();
		attack.attackCard2();
		attack.attackCard3();
		attack.attackCard4();
		defence.defenceCard1();
		defence.defenceCard2();
		defence.defenceCard3();
		evasion.evasionCard1();
		appeasement.appeasement1();
		appeasement.appeasement2();
		theat.theat();
		
//		for (int i = 0; i<deck.length; i++)
//		{
//			int k = (int)(Math.random()*11);
//			Card temp = deck[i];
//			deck[i] = deck[k];
//			deck[k] = temp;
//			//System.out.println(deck[0].name);
//			for(int j = 0; j<5; j++)
//			{
//				System.out.println(deck[j]);
//			}
//		}
		
	}

}
