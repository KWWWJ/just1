package c230907;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

class MyList<T>{
	TreeSet<T> list = new TreeSet<>();
}

class WhatDo {
	MyList<String> ml = new MyList<>();
	
	public String add(String ranking, String myDo) {
		Integer thisRanking = Integer.valueOf(ranking); //벗어난 숫자 입력하면 변환 오류발생.
		String Add = thisRanking+"."+myDo;
		return Add;
	}
}

public class ToDoList{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyList<String> myList = new MyList<>();
		WhatDo wd = new WhatDo();
		
		String inputRanking;
		String inputMydo = null;
		
		System.out.println("스케쥴을 작성합니다. 99를 입력하면 저장합니다.");
		while(true) {
			System.out.println("순번 입력 :");
			inputRanking = scan.next();
			Integer count = Integer.valueOf(inputRanking);
			if(count == 99) {
				System.out.println("저장되었습니다.");
				break;
			}
			System.out.println("할 일 입력 :");
			inputMydo = scan.next();
			Iterator<String> iterator = myList.list.iterator();
			for(int i=0; i<myList.list.size(); i++) {
				if(iterator.next() == inputRanking+"."+inputMydo) {
					System.out.println("이미 입력한 스케쥴입니다."); //동작하지 않음
					inputRanking = null;
					inputMydo = null;
				}
				else {
					System.out.println("동작");
				}
			}
			myList.list.add(wd.add(inputRanking, inputMydo));
			
			
		}
		System.out.println("오늘의 스케쥴은");
		for(String schedule : myList.list) { //10을 넘어가면 10이 아닌 1_0으로 취급해 1보다 상위에 위치함.
			System.out.println(schedule);
		}
		System.out.println("입니다.");
	}
}