package PixyHands.Charater;

import PixyHands.stage.*;

public class Monster extends BasicSheet {
	BasicStage stage = new BasicStage();
	public String[] selectCard = new String[] {};
	public void commonMonster1()
	{
		if(stage.stageCount == 0 || stage.stageCount%2 == 0 && stage.stageCount%3 != 0)
		{
			name = "픽시";
			description = "그것은 쥐와 사람이 섞인듯 기괴한 모양새의 괴물이다."
					+ " 당신은 검을 겨눴다.";
			healthPoint = 10+(stage.stageCount*3);
			cost = 3;
			System.out.println("어둠 속에서 "+name+"이/가 모습을 드러냈다."+
								"\n"+"["+name+"]"+
								"\n"+"["+description+"]"+
								"\n"+"["+"Hp : "+healthPoint+"]"+
								"\n"+"["+"Cost : "+cost+"]");
		}
	}
	public void commonMonster2()
	{
		if(stage.stageCount >= 2 && stage.stageCount%3 == 0 && stage.stageCount%2 != 0)
		{
			name = "난쟁이";
			description = "정리하지 않은 기다란 머리카락이 봉두난발된 노인을"
					+ " 그대로 줄여놓은듯 한 그것은 굶주린듯 핏발선 눈으로 당신을 노려본다.";
			healthPoint = 10+(stage.stageCount*3);
			cost = 3;
			System.out.println("어둠 속에서 "+name+"이/가 모습을 드러냈다."+
					"\n"+"["+name+"]"+
					"\n"+"["+description+"]"+
					"\n"+"["+"Hp : "+healthPoint+"]"+
					"\n"+"["+"Cost : "+cost+"]");
		}
	}
	public void elite1()
	{
		if(stage.stageCount >= 10 && stage.stageCount%7 == 0 && stage.stageCount%2 != 0 && stage.stageCount%3 != 0)
		{
			name = "듀라한";
			description = "머리 없이 목에서부터 타오르는 푸른 불꽃은 보는것 만으로도 "
					+ "기이한 공포를 끄집어낸다."
					+ "그것은 이가 닳고 깨진 검을 당신의 목을 향해 겨누었다.";
			healthPoint = stage.stageCount*5;
			cost = 5;
			System.out.println("어둠 속에서 "+name+"이/가 모습을 드러냈다."+
					"\n"+"["+name+"]"+
					"\n"+"["+description+"]"+
					"\n"+"["+"Hp : "+healthPoint+"]"+
					"\n"+"["+"Cost : "+cost+"]");
		}
	}
	public void boss()
	{
		if(stage.stageCount == 30)
		{
			name = "주 시 자";
			description = "'나'는 끝이 도래했음을 알았다. 커다란 하나의 눈이 오색빛으로 영롱하게 빛을 발하고"+
			"\n"+"나무의 줄기가 엉킨듯 뭉퉁하게 자란 6개의 팔은 색색의 꽃들로 가득했다."+
			"\n"+"땅에 박힌 다리에서는 붉은 액체가 흐르고 고여 바닥을 적신다."+
			"\n"+"현실인지 환각인가는 이제 더이상 중요치 않았다. '저것'을 쓰러트리면 모든 것은 원래대로 돌아올 것이라 굳게 믿을 뿐이였다.";
			healthPoint = 100;
			cost = 10;
			System.out.println("어둠 속에서 "+name+"이/가 모습을 드러냈다."+
					"\n"+"["+name+"]"+
					"\n"+"["+description+"]"+
					"\n"+"["+"Hp : "+healthPoint+"]"+
					"\n"+"["+"Cost : "+cost+"]");
		}
	}
}
