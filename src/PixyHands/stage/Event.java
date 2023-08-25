package PixyHands.stage;

import PixyHands.Character.*;

public class Event extends BasicStage {
	Map map = new Map();
	Player player = new Player();
	public int[] event = new int[4];
	public void event()
	{		
		randomMap();
		System.out.println("["+stageCount+"번째 스테이지"+"]");
		for(int i = 0; i<event.length; i++)
		{
			int k = (int)(Math.random()*4);
			int temp = event[i];
			event[i] = event[k];
			event[k] = temp;
		}
		if(event[0] == 0)
		{
			System.out.println("["+"숨겨진 성소를 발견했다."+"]");
			player.healthPoint += 5;
			System.out.println("["+"충분히 휴식을 취해 체력이 회복됐다."+"]"+"\n"+"현재Hp : "+player.healthPoint);
		}
		if(event[0] == 1)
		{
			System.out.println("["+"광활한 호수를 발견했다. 신비에 대한 두려움과 경오심이 차오르는 것 같다.."+"]");
			player.healthPoint = player.healthPoint+((stageCount/3)*5);
			System.out.println("["+"경치를 보며 쉬었더니 체력이 완벽하게 회복됐다."+"]"+"\n"+"현재Hp : "+player.healthPoint);
		}
		if(event[0] == 2)
		{
			System.out.println("["+"모퉁이를 돌다가 누군가 설치한 함정에 다리가 상했다."+"]");
			player.healthPoint -= 5;
			System.out.println("["+"지혈은 됐지만 출혈탓에 피곤해진 듯 하다."+"]"+"\n"+"현재Hp : "+player.healthPoint);
		}
		if(event[0] == 3)
		{
			System.out.println("["+"숨을 죽이고 접근한 픽시에게 등을 찔렸다."+"]");
			player.healthPoint -= 10;
			System.out.println("["+"치명적인 피해를 입었다.."+"]"+"\n"+"현재Hp : "+player.healthPoint);
		}
	}
}
