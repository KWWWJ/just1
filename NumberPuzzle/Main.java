package NumberPuzzle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		int playerX = 4;
		int playerY = 4;
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]= i * 5 + j + 1; //전체 +1
			}
		}
		arr[playerY][playerX] = 0; //마지막 인덱스 값을 0으로 설정
		
//		for (int i=0; i<100; i++)
//		{
//			int num1 = (int)(Math.random()*5);
//			int num2 = (int)(Math.random()*5);
//			int num3 = (int)(Math.random()*5);
//			int num4 = (int)(Math.random()*5);
//			
//			int temp = arr[num1][num2];
//			arr[num1][num2] = arr[3][4];
//			arr[3][4] = temp;
//		}
		
		for(int i=0; i<1; ++i)
		{
			int temp = ((int)(Math.random() * 4) + 1) * 2; //방향 숫자를 지정
			int[] playerPosition = Main.move(arr, playerY, playerX, temp); //바뀐거 확인
			playerX = playerPosition[0];
			playerY = playerPosition[1]; //바뀐거 확인
//			if(isShuffle)
//			{
//				switch(temp)
//				{
//				case 2 :
//					playerY = playerY + 1;
//					break;
//				case 4 :
//					playerX -= 1;
//					break;
//				case 6 :
//					playerX++;
//					break;
//				case 8 :
//					--playerY;
//					break;
//				default:
//					break;
//				}
//			}
		}
		System.out.println("게임 시작");
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] == 0)
				{
					System.out.print("p\t"); //p로 변환
				}
				else
				{
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.print("\n\n");
		}
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			boolean isEnding = true; //맞췃을 때 게임 끝내기
			for(int i = 0; i<arr.length; i++)
			{
				if(isEnding == false) break;
				for(int j=0; j<arr[i].length; j++)
				{
					if(i == 4 && j == 4)break;
					if(arr[i][j] != i * 5 + j + 1) {
						isEnding = false;
					}
				}
			}
			if (isEnding)
			{
				System.out.println("탈출");
				break;
			}
			
			System.out.println("p를 이동해 퍼즐을 맞춰라.");
			System.out.println("상 : 8 / 하 : 2 / 좌 : 4 / 우 : 6");
			int input = scan.nextInt();
			int[] playerPosition = Main.move(arr, playerY, playerX, input); //바뀐거 확인
			playerX = playerPosition[0];
			playerY = playerPosition[1];
			//			if(isShuffle)
//			{
//				switch(input)
//				{
//				case 2 :
//					playerY = playerY + 1;
//					break;
//				case 4 :
//					playerX -= 1;
//					break;
//				case 6 :
//					playerX++;
//					break;
//				case 8 :
//					--playerY;
//					break;
//				default:
//					break;
//				}
//			}
			
			for(int i = 0; i<arr.length; i++)
			{
				for(int j=0; j<arr[i].length; j++)
				{
					if(arr[i][j] == 0)
					{
						System.out.print("p\t"); //p로 변환
					}
					else
					{
						System.out.print(arr[i][j] + "\t");
					}
				}
				System.out.print("\n\n");
			}
		}
	}
	
	public static boolean shuffle(int[][] arr, int idx1, int idx2, int direction)
	{
		//direction => 8 : 위 / 4 : 좌 등등
		int temp = arr[idx1][idx2];
		switch(direction) 
		{
		case 2 :
			if(idx1 == 4) return false;
			arr[idx1][idx2] = arr[idx1 + 1][idx2];
			arr[idx1 + 1][idx2] = temp;
			return true;
		case 4 :
			if(idx2 == 0) return false;
			arr[idx1][idx2] = arr[idx1][idx2 - 1];
			arr[idx1][idx2 - 1] = temp;
			return true;
		case 6 :
			if(idx2 == 4) return false;
			arr[idx1][idx2] = arr[idx1][idx2 + 1];
			arr[idx1][idx2 + 1] = temp;
			return true;
		case 8 :
			if(idx1 == 0) return false;
			arr[idx1][idx2] = arr[idx1 - 1][idx2];
			arr[idx1 - 1][idx2] = temp;
			return true;
		default:
			return false;
		}
		
	}
	public static int[] move(int arr[][], int playerY, int playerX, int temp)
	{
		boolean isShuffle = Main.shuffle(arr, playerY, playerX, temp); //바뀐거 확인
		if(isShuffle)
		{
			switch(temp)
			{
			case 2 :
				playerY = playerY + 1;
				break;
			case 4 :
				playerX -= 1;
				break;
			case 6 :
				playerX++;
				break;
			case 8 :
				--playerY;
				break;
			default:
				break;
			}
		}
		return new int[] {playerX, playerY}; //두개의 수를 보내야 하기 때문에 배열을 사용
	}
	
}
