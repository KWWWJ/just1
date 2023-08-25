package PixyHands.stage;

import PixyHands.Deck;
import PixyHands.Card.*;
import PixyHands.Charater.*;

public class Event extends BasicStage {
	Deck deck = new Deck();
	TheatCard theat = new TheatCard();
	AttackCard attack = new AttackCard();
	Player player = new Player();
	protected boolean positiveEvent = true;
	private int[] eventRate = new int[100];
	
	public void EventRate()
	{
		for(int i=0; i<getEventRate().length; i++)
		{
			getEventRate()[i]=i;
		}
		for(int i=0; i<100; i++)
		{
			int k = (int)(Math.random()*100);
			int temp = getEventRate()[i];
			getEventRate()[i] = getEventRate()[k];
			getEventRate()[k] = temp;
		}
		if(getEventRate()[50]<=49)
		{
			positiveEvent = true;
		}
		else
		{
			positiveEvent = false;
		}
	}
	public int[] getEventRate() {
		return eventRate;
	}


	public void setEventRate(int[] eventRate) {
		this.eventRate = eventRate;
	}
	
	
	public void eventStage()
	{
		if (stageType == false);
		stageCount++;
		stageName = "이벤트 발생";
		stageDescription = stageCount+"번 스테이지";
		System.out.println(stageName+"\n"+stageDescription);
		if(positiveEvent == true)
		{
			System.out.println("왠지 저쪽으로 가야만 할 것 같다.");
			if(getEventRate()[50]<=15)
			{
				positiveEvent1();
			}
			if(getEventRate()[50]<=30&&getEventRate()[50]>15)
			{
				positiveEvent2();
			}
			if(getEventRate()[50]<=40&&getEventRate()[50]>30)
			{
				positiveEvent3();
			}
			if(getEventRate()[50]<=49&&getEventRate()[50]>40)
			{
				positiveEvent4();
			}
		}
		if(positiveEvent == false)
		{
			System.out.println("왠지 저쪽으로 가야만 할 것 같다.");
			if(getEventRate()[50]<=65&&getEventRate()[50]>49)
			{
				negativeEvent1();
			}
			if(getEventRate()[50]<=75&&getEventRate()[50]>65)
			{
				negativeEvent2();
			}
			if(getEventRate()[50]<=90&&getEventRate()[50]>75)
			{
				negativeEvent3();
			}
			if(getEventRate()[50]<=99&&getEventRate()[50]>90)
			{
				negativeEvent4();
			}
		}
	}

	public void positiveEvent1()
	{
		if(stageCount<13)
		{
			System.out.println("작은 덩치의 누군가가 보입니다."+"\n"+"등에는 보따리를 매고 있습니다.");
			System.out.println("오, 이런곳에 손님이라니 아무튼 좋습니다. 이런건 어떻습니까?."+"\n"+"체력 회복 물약과 코스트 회복 물약을 구매했습니다");
		}
		else
		{
			System.out.println("작은 덩치의 보부상이 보입니다."+"\n"+"보따리가 더 커진 것 같습니다.");
			System.out.println("또 손님입니까? 여긴 어째 사람이 너무 적은 것 같습니다."+"\n"+"체력 회복 물약과 코스트 회복 물약을 구매했습니다");
		}
	}
	public void positiveEvent2() //카드 뽑을 때 재 등장
	{
		if(stageType = false)
		{
			System.out.println("무심코 올려다본 바위 벽 틈 사이에 황금으로 된 두꺼비가 보입니다."+"\n"+"\n"+"다음 카드가 협박카드로 고정됩니다.");
		}
			if(stageType = true)
		{
			for(int i=0; i<5; i++)
			{
				System.out.println("황금 두꺼비의 기묘한 힘이 당신을 감싸는 것을 느낍니다.");
				BasicCard[] deck = new BasicCard[] {theat, theat, theat, theat, theat};
				theat.theat();
			}
		}
	}
	public void positiveEvent3()
	{
		System.out.println("조금 더 걸어간 당신의 눈에 먹물같이 검은 호수가 들어옵니다."+"\n"+"체력이 회복됩니다.");
		player.healthPoint += 5;
		System.out.println("HP : "+player.healthPoint);
	}
	public void positiveEvent4()
	{
		System.out.println("신비한 조각상과 조우했습니다. 왠자 모르게 몸에 힘이 들이찬느 느낌입니다."+"\n"+"체력이 전부 회복됩니다.");
		player.healthPoint = ((stageCount/3)*5)+30;
		System.out.println("HP : "+player.healthPoint);
	}
	public void negativeEvent1()
	{
		System.out.println("!!! 어둠속에서 날아온 화살이 팔을 스쳤다.");
		player.healthPoint -= 5;
		System.out.println("HP : "+player.healthPoint);
	}
	public void negativeEvent2() 
	{
		//아이템 클래스 만들고 다시 채우기
		//아이템이 있다면 아이템 배열을 렌덤 돌리고 0번째의 것을 제거
	}
	public void negativeEvent3()
	{
		//마찬가지.
		//소비 아이템 배열을 모두 null로 초기화
	}
	public void negativeEvent4() //카드 뽑을 때 재 등장
	{
		if(stageType = false)
		{
			System.out.println("어둠 속의 미지의 존재가 당신을 들여다 본다. 전의가 깍여나간다."+"\n"+"다음 공격력이 1만큼 감소된다.");
		}
		if(stageType = true)
		{
			System.out.println("공포로 인해 반응하지 못했다.");
			player.healthPoint -= 10;
		}
	}

}
