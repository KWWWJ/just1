package Board;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	BoardList list = new BoardList();
//	list.test();
	
	System.out.println("게시판");
	Scanner scan1 = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	while(true) {
		System.out.println("=========================");
		System.out.println("\n\n원하시는 메뉴를 선택해주세요. \n"+"1.글쓰기 \n"+"2.게시판 확인하기 \n"+"3.수정하기 \n");
		int select = scan1.nextInt();
		switch(select){
		case 1:
			System.out.println("제목을 입력해주세요.");
			String writingTitle = scan2.nextLine();
			System.out.println("내용을 입력해주세요.");
			String writingContent = scan2.nextLine();
			list.add(list.now, writingTitle, writingContent);
			System.out.println("글이 저장되었습니다.");
			break;
		case 2:
			System.out.println("글 목록을 불러옵니다.");
			System.out.println(list.toString1());
			break;
		case 3:
			System.out.println("수정할 글의 번호를 선택해주세요.");
			int num = scan1.nextInt();
			int titleNum = num-=1;
			if(titleNum>=list.itemList.size()) {
				System.out.println("존재하지 않는 글입니다.");
				break;
			}
			System.out.println("제목을 입력해주세요.");
			String reWritingTitle = scan2.nextLine();
			System.out.println("내용을 입력해주세요.");
			String reWritingContent = scan2.nextLine();
			list.set(titleNum, list.now, reWritingTitle, reWritingContent);
			System.out.println("글이 저장되었습니다.");
			break;
		default:
			System.out.println("잘못된 접근입니다.");
			break;
		}
	}
	}
}
