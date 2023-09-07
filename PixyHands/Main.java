package PixyHands;

import java.util.Scanner;
import PixyHands.Card.*;
import PixyHands.Character.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		AttackCard attack1 = new AttackCard();
		AttackCard attack2 = new AttackCard();
		AttackCard attack3 = new AttackCard();
		AttackCard attack4 = new AttackCard();
		DefenceCard defence1 = new DefenceCard();
		DefenceCard defence2 = new DefenceCard();
		DefenceCard defence3 = new DefenceCard();
		EntenteCard entente1 = new EntenteCard();
		EntenteCard entente2 = new EntenteCard();
		EvasionCard evasion = new EvasionCard();
		TheatCard theat = new TheatCard();
		BasicCard[] card = new BasicCard[] {attack1, attack2, attack3, attack4, defence1, defence2, defence3, entente1, entente2, evasion, theat};
		attack1.AttackCard1();
		attack2.AttackCard2();
		attack3.AttackCard3();
		attack4.AttackCard4();
		defence1.defenceCard1();
		defence2.defenceCard2();
		defence3.defenceCard3();
		entente1.AppeasementCard1();
		entente2.AppeasementCard2();
		evasion.evasionCard1();
		theat.theat();
		
		Player player = new Player();
		Monster monster = new Monster();
		int input = 0;
		
		//System.out.println(card[0]);
		System.out.println("이번 턴의 카드 : ");
		for(int i = 0; i<card.length; i++)
		{
			int k = (int)(Math.random()*11);
			BasicCard temp = card[i];
			card[i] = card[k];
			card[k] = temp;
		}
		for(int i=0; i<5; i++)
		{
			System.out.println(card[i].nameCard+"\n"+"효과 : "+card[i].description+" / 코스트 : "+card[i].cost);
		}
		System.out.println("카드 선택 :");
		for(int i=0; i<5; i++)
		{
			input = scan.nextInt();
			player.mySelect[i] = card[input].toString();
			System.out.println("남은 코스트 : "+player.fullCost);
		}
		
	}
}
