package NumberPuzzleOOP;

public class Moving {
	protected Player player;
	
	public void setPlayer(Player player) //이동시킬 주체
	{
		this.player = player; //플레이어 위치
	} //이거 가져다 쓰면 편함
	
	protected boolean movePlayer(int[][] puzzle, int direction) //퍼즐 판과 움직일 위치, 움직임이 우선이라 getIs를 붙이지 않는다.
	{
		int playerX = player.getX(); //한줄마다 힙을 뺐다 쓰면 메모리가 많이 쓰임 그러니 치환
		int playerY = player.getY();
		int movingPlayerX = playerX;
		int movingPlayerY= playerY;
		switch(direction) 
		{
		case 2 :
			movingPlayerY++;
			break;
		case 4 :
			movingPlayerX--;
			break;
		case 6 :
			movingPlayerX++;
			break;
		case 8 :
			movingPlayerY--;
			break;
		default:
			break;
		}
		if(getIsCanMovingPlayer(puzzle, movingPlayerY, movingPlayerX)) return false;
		
		Shuffle.changeArray(puzzle, playerX, playerY, movingPlayerX, movingPlayerY);
//		int temp = puzzle[playerY][playerX]; //위에거 들가면 필요없음
//		puzzle[playerY][playerX] = puzzle[movingPlayerY][movingPlayerX]; 
//		puzzle[movingPlayerY][movingPlayerX] = temp;
		player.setPosition(movingPlayerX, movingPlayerY); 
		return true;
	}
	
	protected void movePlayer(int[][] puzzle, String direction) {};
	
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








