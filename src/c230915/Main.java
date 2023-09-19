package c230915;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DataBaseInsert dbi = new DataBaseInsert();
		
		while(true) {
			dbi.insert();
			System.out.println("입력을 완료했다면 1, 아니라면 0을 입력하세요.");
			int stop = scan.nextInt();
			if(stop == 1)break;
		}
	}
}
