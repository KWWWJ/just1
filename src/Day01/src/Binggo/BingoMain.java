package Binggo;

public class BingoMain 
{
	public static void main(String[] agrs)
	{
		Board board=new Board();
		board.board();
		while(true)
		{
			if(Cheak.bingoCount==3)
				{
					System.out.println("3빙고!");
					break;
				}
			Change change=new Change();
			change.change();
			Input input=new Input();
			input.input();
			Cheak.bingoCount=0;
			Cheak cheak=new Cheak();
			cheak.cheak();
		}
	}

}
