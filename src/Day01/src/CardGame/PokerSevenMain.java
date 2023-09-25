package CardGame;

public class PokerSevenMain 
{
	@SuppressWarnings("static-access")
	public static void main(String[] agrs)
	{
		String heart="Heart";
		String diamond="Diamond";
		String clover="Clover";
		String spede="Spede";
		Card card=new Card();
		card.card();
		
		
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<13; j++)
			{
				if(card.card[i][j]==1)
				{
					card.card[i][j]='A';
				}
				if(card.card[i][j]==11)
				{
					card.card[i][j]='Q';
				}
				if(card.card[i][j]==12)
				{
					card.card[i][j]='J';
				}
				if(card.card[i][j]==13)
				{
					card.card[i][j]='K';
				}
				if(i==1)
				{
				System.out.print(heart+card.card[i][j]+"\t");
				}
				if(i==2)
				{
					System.out.print(diamond+card.card[i][j]+"\t");
				}
				if(i==3)
				{
					System.out.print(clover+card.card[i][j]+"\t");
				}
				else
				{
					System.out.print(spede+card.card[i][j]+"\t");
				}
			}
		}	
	}
}
