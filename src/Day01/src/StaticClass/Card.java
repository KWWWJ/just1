package StaticClass;

public class Card {
			protected String description = " ";
			protected int damage = 0;
			protected int itemRate = 0;
			protected int cost = 0;
			protected String[] hands = new String[11];
			protected int[] random = new int[100]; 
		 void cardSet() // 대미지가 계속 바뀌는중
		 {
			for(int i = 1; i<11; i++)
			{
				if(i<=3)
				{
					damage=i;
					cost=i;
					hands[i]="공격카드 : 상대에게 "+damage+"대미지를 줍니다."+"\n"+cost+"코스트";
				}
				if(i>=4&&i<=7)
				{
					damage=-(i-3);
					cost=i-3;
					hands[i]="방어카드 : 상대가 공격카드라면 "+-damage+"대미지를 막아냅니다."+"\n"+cost+"코스트";
				}
				if(i==8)
				{
					damage=0;
					hands[i]="회피카드 : 모든 대미지를 회피합니다."+"\n"+"3코스트";
				}
				if(i>=9&&i<=10)
				{
					damage=0;
					cost=i-7;
					itemRate = 33*(i-8);
					hands[i]="회유카드 : "+itemRate+"%확률로 아이템 휙득. 전투를 즉시 종료합니다."+"\n"+cost+"코스트";
				}
				System.out.println(damage);
//				if(i==11)
//				{
//					damage=0;
//					itemRate = 99;
//					hands[i]="협박카드 : "+itemRate+"%확률로 아이템 휙득, 1%확률로 7대미지의 반격을 당한다."+"\n"+"5코스트";
//					for(int j=0; j<100; j++)
//					{
//						int k = (int)(Math.random()*100);
//						int temp = random[j];
//						random[j] = random[k];
//						random[k] = temp;
//						if (random[0]==0)
//						{
//							damage=7;
//							//hp-=7;
//							System.out.println("반격당했습니다!"+"\n"+"현제 Hp :");
//						}
//					}
//				}
				System.out.println(hands[i]);
			}
		 }
		 public static void main(String[] args)
		 {
			 Card card = new Card();
			 card.cardSet();
		 }
}

