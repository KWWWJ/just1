package NumberPuzzleOOP;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		PuzzleBoard puzzle = new PuzzleBoard();
		Player player = new Player();
		
		puzzle.setPlayer(player);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("퍼즐 크기 지정");
		System.out.println("가로열 : ");
		int count1 = scan.nextInt();
		System.out.println("세로열 : ");
		int count2 = scan.nextInt();
		
		puzzle.setPuzzleBoard(count1, count2);
		puzzle.print();
		
		while(true)
		{
			if(puzzle.getIsEnd()) break;
			System.out.println("p를 옮겨서 1 ~ "+(count1 * count2 -1)+ "순서를 맞춰라");
			System.out.println("상 : 8 / 하 : 2 / 좌 : 4 / 우 : 6 / 종료 : 0 / 리셋 : 5");
			int direction = scan.nextInt();
			if(direction == 0)break;
			if(direction == 5)puzzle.shuffle();
			else puzzle.movePlayer(direction);
			puzzle.print();
		}
		System.out.println("끝");
	}
}