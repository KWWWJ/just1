package Board;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BoardList list = new BoardList();
		BoardComment bc = new BoardComment();
		//	list.test();
		
		System.out.println("게시판");
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int titleNum = 0;
		int count =0;
		String writingTitle = " ";
		String writingContent = " ";
		String reWritingTitle = " ";
		String reWritingContent = " ";
		String comment = " ";
		while(true) {
			System.out.println("=========================");
			System.out.println(list.getTitle());
			System.out.println("\n\n원하시는 메뉴를 선택해주세요. \n"+"1.글쓰기 \n"+"2.게시물 확인하기 \n"+"3.수정하기 \n"+"4.댓글달기 \n");
			int select = scan1.nextInt();
			switch(select){
			case 1:
				System.out.println("제목을 입력해주세요.");
				writingTitle = scan2.nextLine();
				System.out.println("내용을 입력해주세요.");
				writingContent = scan2.nextLine();
				list.addList(list.now, writingTitle, writingContent);
				System.out.println("글이 저장되었습니다.");
				break;
			case 2:
				System.out.println("확인할 글의 번호를 선택해주세요.");
				titleNum = scan1.nextInt()-1;
				if(list.getIndex(titleNum) == false) {
					break;
				}
				System.out.println(list.itemList.get(titleNum).getListAll());
				System.out.println();
				System.out.println(bc.getListAll()); //인덱스 범위 지정해서 count증가 할때마다 불러올 수 있는 범위도 들어나게 작성
				break;
			case 3:
				System.out.println("수정할 글의 번호를 선택해주세요.");
				titleNum = scan1.nextInt()-1;
				if(list.getIndex(titleNum) == false) {
					break;
				}
				System.out.println("제목을 입력해주세요.");
				reWritingTitle = scan2.nextLine();
				System.out.println("내용을 입력해주세요.");
				reWritingContent = scan2.nextLine();
				list.setList(titleNum, list.now, reWritingTitle, reWritingContent);
				System.out.println("글이 저장되었습니다.");
				break;
			case 4:
				System.out.println("댓글을 작성할 게시물을 선택해주세요.");
				titleNum = scan1.nextInt()-1;
				if(list.getIndex(titleNum) == false) {
					break;
				}
				System.out.println("글을 작성해주세요.");
				comment = scan2.nextLine();
				bc.setComment(count, list.now, comment);
				count++;
				break;
			default:
				System.out.println("잘못된 접근입니다.");
				break;
			}
		}
	}
}
