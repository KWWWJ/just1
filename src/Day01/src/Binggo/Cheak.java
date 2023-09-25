package Binggo;

class Cheak {
	static int bingoCount=0;
	int cheak()
	{
		for(int i=0; i<5; i++)
		{
			int width=0;
			for(int j=0; j<5; j++)
			{
				if(Board.board[5*i]==Board.board[5*i+j])
				{
					width++;
					if(width==5) 
					{
						bingoCount++;
					}
				}
			}
			int height=0;
			for(int j=0; j<5; j++)
			{
				if(Board.board[i]==Board.board[i+j*5])
				{
					height++;
					if(height==5) 
					{
						bingoCount++;
					}
				}
			}
		}
		int slash=0;
		int reverseSlash=0;
		for(int i=0; i<5; i++)
		{
			if(Board.board[0]==Board.board[6*i])
			{
				slash++;
				if(slash==5) 
				{
					bingoCount++;
				}
			}
		}
		for(int i=0; i<5; i++)
		{
			if(Board.board[4]==Board.board[4+4*i])
			{
				reverseSlash++;
				if(reverseSlash==5) 
				{
					bingoCount++;
				}
			}
		}
		System.out.println("빙고카운트 : "+bingoCount);
		
		return 0;
	}

}
