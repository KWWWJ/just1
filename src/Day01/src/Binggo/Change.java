package Binggo;

class Change {
	
	int change()
	{
		for (int i=0; i<Board.board.length; i++)
		{
			if(Board.board[i]==35)
			{
				System.out.print((char)Board.board[i]+"\t");
			}
			else
			{
				System.out.print(Board.board[i]+"\t");
			}
			if((i+1)%5==0)
				{
					System.out.print("\n\n");					
				}
		}
		return 0;
	}

}
