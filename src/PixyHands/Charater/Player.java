package PixyHands.Charater;

import java.util.Scanner;
import PixyHands.stage.*;

public class Player extends BasicSheet{
	BasicStage stage = new BasicStage();
	Scanner scan = new Scanner(System.in);
	public String[] selectCard = new String[] {};
	String input = " ";
	public int healthPoint = 30;
	public int cost = 5; //5스테이지마다 1씩 증가
	
	public void descriptionOfYou()
	{
		System.out.println("이름을 입력하라.");
		input = scan.next();
		name = input;
		System.out.println("당신의 이름이 정해졌다.");
		if(stage.stageCount==1)
		{
			description = "["+"당신은 던전이 발견되었다는 소식에 찾아온 용병이다."+"]"+ "\r\n"
					+"["+ " 당신은 아픈 동생을 치료하기 위한 돈을 마련할 생각으로 일주일에 걸처 던전이 있는 장소까지 도달했다."+"]"+ "\r\n"
					+"["+ " 어째서인지 던전은 소문에 비해 한산해보였지만 망설일 틈따위는 없었다.\r\n"
					+"["+ " 던전에 발을 들인 순간, 당신은 주위가 횃불로도 밝혀지지 않을만큼 이질적인 어둠으로 가득하다는 것을 느꼈다."+"]"+"\r\n"
					+"["+ " 깊은 어둠이 등골을 오싹하게 만든다."+"]"+"\r\n"
					+"["+ " 몸을 움찔거리면서도 천천히 걸음을 옮기던 당신은"+"]"+"\r\n"
					+"["+ " 곧 이전에 들어본적도 없는 기괴한 이 가는 소리와 썩은 살점의 고약한 악취가 흘러오는 것을 알아차렸다."+"]"+"\r\n"
					+ "\r\n"
					+ "\r\n"
					+"["+ "오, 세상에..."+"]"+"\r\n"
					+ "\r\n"
					+ "\r\n"
					+"["+ " 그것의 정체는  악마였다."+"]"+"\r\n"
					+"["+ " 기이할 정도로 굽은 등에 쭉 뻗은 주둥이에서는 걸쭉한 피가 주륵 흘러내리고, 날카로운 이빨 사이에 걸린 덩어리가 마치 그의 미래를 보여주는 듯 역겨웠다."+"]"+"\r\n"
					+"["+ " 당신은 당장이라도 돌아서서 도망치고 싶었지만 이제 시간이 얼마 남지 않았다."+"]"+"\r\n"
					+"["+ " 떨리는 손으로 허리춤에 찬 브로드 소드를 뽑아들고 이를 굳게 다문 당신은, 이윽고 악마에게 돌진했다."+"]";
			System.out.println(description);
		}
		if(stage.stageCount<10)
		{
			description = "["+"당신은 한치 앞도 보이지 않는 어둠을 뚫고 나아간다."+"]";
			System.out.println(description);
		}
		if(stage.stageCount>10&&stage.stageCount<20)
		{
			description = "["+"당신은 끈적이는 시선을 느낀다."+"]";
			System.out.println(description);
		}
		if(stage.stageCount>20&&stage.stageCount<22)
		{
			description = "["+"들릴 수 없는 소리가 들려오는 것만 같다."+"]";
			System.out.println(description);
		}
		if(stage.stageCount==22)
		{
			description = "["+"누군가 지나간듯한 기척이 들려온다."+"]";
			System.out.println(description);
		}
		if(stage.stageCount==23)
		{
			description = "["+"희끄무래한 형체가 천장에 매달려 천천히 흔들리는 듯 하다."+"]";
			System.out.println(description);
		}
		if(stage.stageCount==24) //확정 전투(정예 구상중)
		{
			description = "["+"휙! 하는 소리에 저도 모르게 고함이 터져나왔다. "+"거기서 나와!"+"]";
			System.out.println(description);
		}
		if(stage.stageCount==25)
		{
			description = "["+"어둠 속에서 타오르는 듯한 불길이 치솟는 것 같다."+"]";
			System.out.println(description);
		}
		if(stage.stageCount==26)
		{
			description = "["+"불길 속에서 누군가가 미동도 없이 나를 응시하고있다."+"]";
			System.out.println(description);
		}
		if(stage.stageCount==27)
		{
			description = "["+"그것은 새카맣게 타버린 사람의 시체였다. 시체의 목에는 어딘가 익숙한 목걸이가 걸려있었다."+"]";
			System.out.println(description);
		}
		if(stage.stageCount==28)
		{
			description = "["+"나는 머리가 지끈거리는 것을 느꼈다. 검을 굳게 쥔 손아귀가 떨리고 어둠 속 단 하나의 빛이였던 렌턴이 바닥을 굴렀다."+"]";
			System.out.println(description);
		}
		if(stage.stageCount==29)
		{
			description = "["+"몸이 이상할 정도로 가볍게 느껴졌다."+"]"+"/n"
					+ "["+"마치 무게가 존재 하지 않는 것 처럼 깃털보다 가볍게 돌진한다."+"]";
			System.out.println(description);
		}
		if(stage.stageCount==30)
		{
			description = "["+"...끝이 다가왔다."+"]";
			System.out.println(description);
		}
	}
}
