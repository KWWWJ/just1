package PixyHands;

import java.util.Scanner;

import PixyHands.Card.AppeasementCard;
import PixyHands.Card.AttackCard;
import PixyHands.Card.BasicCard;
import PixyHands.Card.DefenceCard;
import PixyHands.Card.EvasionCard;
import PixyHands.Card.TheatCard;
import PixyHands.Charater.*;

public class Deck {
		public static void main(String[] args)
		{
			//BasicCard card = new BasicCard();
			AttackCard attack = new AttackCard();
			DefenceCard defence = new DefenceCard();
			EvasionCard evasion = new EvasionCard();
			AppeasementCard appeasement = new AppeasementCard();
			TheatCard theat = new TheatCard();
			Player player = new Player();
			Scanner scan = new Scanner(System.in);
			int playerSelect = 0;
			int count = 0;
		
			
			BasicCard[] deck = new BasicCard[] {attack , defence, evasion, appeasement, theat};
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
			
			System.out.println("이번턴의 카드는");
			
			for (int i = 1; i<deck.length+1; i++)
			{
				count++;
				int k = (int)(Math.random()*5);
				BasicCard temp = deck[i];
				deck[i] = deck[k];
				deck[k] = temp;
				//System.out.println(deck[0].name);
				System.out.println(count+". "+deck[i].name+" : "+deck[i].description);
			}
			playerSelect = scan.nextInt();
			System.out.println("["+deck[playerSelect]+"]");
		}
	}

