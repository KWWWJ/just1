package Board;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	BoardList list = new BoardList();
//	list.test();
	
	System.out.println("게시판");
	Scanner scan1 = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	int titleNum = 0;
	int num = 0;
	String writingTitle = " ";
	String writingContent = " ";
	String reWritingTitle = " ";
	String reWritingContent = " ";
	String comment = " ";
	while(true) {
		System.out.println("=========================");
		System.out.println(list.toString1());
		System.out.println("\n\n원하시는 메뉴를 선택해주세요. \n"+"1.글쓰기 \n"+"2.게시물 확인하기 \n"+"3.수정하기 \n"+"4.댓글달기 \n");
		int select = scan1.nextInt();
		switch(select){
		case 1:
			System.out.println("제목을 입력해주세요.");
			writingTitle = scan2.nextLine();
			System.out.println("내용을 입력해주세요.");
			writingContent = scan2.nextLine();
			list.add(list.now, writingTitle, writingContent, comment);
			System.out.println("글이 저장되었습니다.");
			break;
		case 2:
			System.out.println("확인할 글의 번호를 선택해주세요.");
			num = scan1.nextInt();
			titleNum = num-=1;
			if(titleNum>=list.itemList.size()) {
				System.out.println("존재하지 않는 글입니다.");
				break;
			}
			System.out.println(list.itemList.get(titleNum));
			break;
		case 3:
			System.out.println("수정할 글의 번호를 선택해주세요.");
			num = scan1.nextInt();
			titleNum = num-=1;
			if(titleNum>=list.itemList.size()) {
				System.out.println("존재하지 않는 글입니다.");
				break;
			}
			System.out.println("제목을 입력해주세요.");
			reWritingTitle = scan2.nextLine();
			System.out.println("내용을 입력해주세요.");
			reWritingContent = scan2.nextLine();
			list.set(titleNum, list.now, reWritingTitle, reWritingContent, comment);
			System.out.println("글이 저장되었습니다.");
			break;
		case 4:
			System.out.println("댓글을 작성할 게시물을 선택해주세요.");
			num = scan1.nextInt();
			int titleNum1 = num-=1;
			if(titleNum1>=list.itemList.size()) {
				System.out.println("존재하지 않는 글입니다.");
				break;
			}
			System.out.println("글을 작성해주세요.");
			comment = scan2.nextLine();
			list.set(titleNum, list.now, reWritingTitle, reWritingContent, comment);
			break;
		default:
			System.out.println("잘못된 접근입니다.");
			break;
		}
	}
	}
}
