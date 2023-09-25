package Binggo;
class Board {
	static int[] board=new int[25];
	
	int[] board()
	{
		for (int i=0; i<Board.board.length; i++)
		{
			Board.board[i]=i+1;
		}
		for (int i=0; i<Board.board.length; i++)
		{
			int r=(int)(Math.random()*25);
			int temp=Board.board[i];
			Board.board[i]=Board.board[r];
			Board.board[r]=temp;
		}
		return board;
	}
}
