package NumberPuzzleOOPString;

public class PuzzleBoard extends Moving {
	
	private int[][] puzzle;
	
	public void setPuzzleBoard(int x, int y)
	{
		puzzle = new int[y][x];
		
		for(int i = 0; i<y; i++)
		{
			for(int j=0; j<x; j++)
			{
				puzzle[i][j]= i * x + j + 1;
			}
		}
//		puzzle[player.getX()][player.getY()] = 0; //둘다 가능
		puzzle[y-1][x-1] = 0;
		player.setPosition(x-1, y-1); //플레이어의 시작 지점 설정
	
		shuffle();
	}
	
	public void shuffle()
	{
		for(int i = 0; i< 30;)
		{
			String move = " ";
			int temp = ((int)(Math.random() * 4) + 1) * 2; //방향 숫자를 지정
			if(temp == 2)
			{
				move = "s";
			}
			if(temp == 4)
			{
				move = "a";
			}
			if(temp == 6)
			{
				move = "d";
			}
			if(temp == 8)
			{
				move = "w";
			}
			if(movePlayer(puzzle, move)); i++; //섞일 때 direction이 외부로 나가는 것이라면 카운트 하지 않는다.
		}
	}
	
	public boolean getIsEnd()
	{
		for(int i = 0; i<puzzle.length; i++)
		{
			for(int j=0; j<puzzle[0].length; j++)
			{
				if(i == puzzle.length - 1 && j == puzzle[0].length - 1)return true;
				
				if(puzzle[i][j] != i * puzzle[0].length + j + 1) 
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public void movePlayer(String direction)
	{
		super.movePlayer(puzzle, direction);
	}

	public void print()
	{
		for(int i = 0; i<puzzle.length; i++)
		{
			for(int j=0; j<puzzle[0].length; j++)
			{
				if(puzzle[i][j] == 0)
				{
					System.out.print("p\t"); //p로 변환
				}
				else
				{
					System.out.print(puzzle[i][j] + "\t");
				}
			}
			System.out.print("\n\n\n");
		}
	}
}
