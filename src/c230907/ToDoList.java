package c230907;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

class MyList<T>{
	TreeSet<T> list = new TreeSet<>(); //TreeSet LinkedList로 구현
}

class WhatDo {
	public String add(String ranking, String myDo) {//매개변수  String으로 받기
		Integer thisRanking = Integer.valueOf(ranking); //벗어난 숫자 입력하면 변환 오류발생.
		String Add = thisRanking+"."+myDo; //변환한 정수와 문자열을 String 타입으로 묶어주기
		return Add; //String타입 반환하기
	}
}

public class ToDoList{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyList<String> myList = new MyList<>(); //String 타입으로 받기
		WhatDo wd = new WhatDo(); //add매서드 받기
		
		String inputRanking; //스캐너 사용 변수
		String inputMydo; //동일
		
		System.out.println("스케쥴을 작성합니다. 99를 입력하면 저장합니다.");
		while(true) {
			System.out.println("순번 입력 :");
			inputRanking = scan.next(); //int 타입으로 변환할 입력
			Integer count = Integer.valueOf(inputRanking); //스캐너에 99를 입력하면 종료
			if(count == 99) {
				System.out.println("저장되었습니다.");
				break;
			}
			System.out.println("할 일 입력 :");
			inputMydo = scan.next(); // 스캐쥴 내용
			Iterator<String> iterator = myList.list.iterator(); //저장된 노드의 데이터 불러오기
			for(int i=0; i<myList.list.size(); i++) {
				if(iterator.next() == inputRanking+"."+inputMydo) {
					System.out.println("이미 입력한 스케쥴입니다."); //조건 수정 필요
					inputRanking = null; //입력한 데이터 초기화
					inputMydo = null;
				}
				else {
//					System.out.println("동작"); //동작 확인
				}
			}
			myList.list.add(wd.add(inputRanking, inputMydo)); //입력한 데이터 노드에 저장
			
			
		}
		System.out.println("오늘의 스케쥴은");
		for(String schedule : myList.list) { //10을 넘어가면 10이 아닌 1_0으로 취급해 1보다 상위에 위치함.
			System.out.println(schedule); //순서대로 정렬
		}
		System.out.println("입니다.");
	}
}