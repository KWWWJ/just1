package PixyHands.stage;

import PixyHands.Charater.*;
import PixyHands.Deck;

public class Battle extends BasicStage {
	BasicSheet sheet = new BasicSheet();
	Player player = new Player();
	Monster monster = new Monster();
	Deck deck = new Deck();
	
	public void battleStage()
	{
		if (stageType == true);
		stageCount++;
		stageName = "전투돌입";
		stageDescription = stageCount+"번 스테이지";
		System.out.println("["+stageName+"]"+"\n"+"["+stageDescription+"]");
	}
	
	public void startBattle()
	{
		if(stageCount <= 30)
		{
			player.descriptionOfYou();
			monster.commonMonster1();
			monster.commonMonster2();
			monster.elite1();
			monster.boss();
		}
	}
}
