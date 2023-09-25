package CardGame;

class Card {
	static int[][] card=new int[4][13];
	int[][] card()
	{
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<13; j++)
			{
				card[i][j]=j+1;
			}
		}
		for(int i=0; i<4; i++)
		{
			while(true)
			{
				for(int j=0; j<13; j++)
				{
					int random=(int)(Math.random()*13);
					int temp=card[i][j];
					card[i][j]=card[i][random];
					card[i][random]=temp;
					if(card[i][random]==13)continue;
				}
				break;
			}
		}
		return card;
	}
}
