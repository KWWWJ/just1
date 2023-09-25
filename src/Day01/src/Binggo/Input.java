package Binggo;
import java.util.Scanner;
class Input {
	Scanner scanner=new Scanner(System.in);
	int input=0;
	int input()
	{
		System.out.println("숫자를 입력해라.");
		input=scanner.nextInt();
		if(input>25)
		{
			return 0;
		}

		for(int i=0; i<Board.board.length; i++)
		{
			if(Board.board[i]==input)
			{
				Board.board[i]=35;
			}
		}
		return input;
	}
}
