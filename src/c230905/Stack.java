package c230905;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Type<T> {
	List<T> arrList = new ArrayList<>();
}

public class Stack{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 타입을 지정하기 - 1.String, 2.Integer");
		int inputType = scan.nextInt();
		if(inputType == 1) {
			Type<String> type = new Type<>();
			
			System.out.println("원하는 만큼 입력한 뒤에 stop를 입력하면 저장됩니다.");
			for(int i=0; i>=0; i++) {
				String input = scan.next();
				type.arrList.add(i, input);
				switch(input) {
				case "stop":
					type.arrList.remove("stop");
					System.out.println("=============================");
					System.out.println("입력한 데이터 : ");
					for (int j =0; j<type.arrList.size(); j++) {
						System.out.println(type.arrList.get(j));
					}
					System.out.println("=============================");
					System.out.println("제거한 데이터 : ");
					for(int j=(type.arrList.size()-1); j>=0; j--) {
						System.out.println(type.arrList.get(j));
						type.arrList.remove(j);
					}
					break;
				}
			}
			
		}
		if(inputType == 2) {
			Type<Integer> type = new Type<>();
			
			System.out.println("원하는 만큼 입력 한 뒤에 999를 입력하면 역순으로 처리합니다.");
			for(int i=0; i>=0; i++) {
				int input = scan.nextInt();
				if(input == 999)break;
				type.arrList.add(i, input);
			}
			System.out.println("=============================");
			System.out.println("입력한 데이터 : ");
			for(int arr : type.arrList) {
				System.out.println(arr);
			}
			
			System.out.println("=============================");
			System.out.println("제거한 데이터 : ");
			for(int i=(type.arrList.size()-1); i>=0; i--) {
				System.out.println(type.arrList.get(i));
				type.arrList.remove(i);
			}
		}
		scan.close();
	}
}
