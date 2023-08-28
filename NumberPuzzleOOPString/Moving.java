package NumberPuzzleOOPString;

public class Moving {
	protected Player player;
	
	public void setPlayer(Player player) //이동시킬 주체
	{
		this.player = player; //플레이어 위치
	} //이거 가져다 쓰면 편함
	
	
	protected boolean movePlayer(int[][] puzzle, String direction) 
	{
		int playerX = player.getX(); //한줄마다 힙을 뺐다 쓰면 메모리가 많이 쓰임 그러니 치환
		int playerY = player.getY();
		int movingPlayerX = playerX;
		int movingPlayerY= playerY;
		switch(direction) 
		{
		case "s" :
			movingPlayerY++;
			break;
		case "a" :
			movingPlayerX--;
			break;
		case "d" :
			movingPlayerX++;
			break;
		case "w" :
			movingPlayerY--;
			break;
		default:
			break;
		}
		if(getIsCanMovingPlayer(puzzle, movingPlayerY, movingPlayerX)) return false;
		
		Shuffle.changeArray(puzzle, playerX, playerY, movingPlayerX, movingPlayerY);
		player.setPosition(movingPlayerX, movingPlayerY); 
		return true;
	};
	
	private boolean getIsCanMovingPlayer(int[][] arr, int movingPlayerY, int movingPlayerX) // int directionint 
	{
		if(
				movingPlayerX < 0 ||
				movingPlayerX > arr[0].length - 1 ||
				movingPlayerY < 0 ||
				movingPlayerY > arr.length - 1
				) return true;
		return false;
	}
}








