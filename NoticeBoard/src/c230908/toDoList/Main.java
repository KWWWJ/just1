package c230908.toDoList;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		ToDoItem temp = new ToDoItem(1, "리스트 작성", "입력을 받아서 아이템 작성"); //1차적으로 아이템을 만들었다.
//		System.out.println(temp);
//		ToDoItem[] arr = new ToDoItem[] {temp, new ToDoItem(3, "테스트", "테스트를 먼저하나?")};
//		for(ToDoItem item : arr) {
//			System.out.println(item.toList());
//		}
		
		ToDoList list = new ToDoList();
//		list.test();
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println(list);
			
		}
		
	}
}