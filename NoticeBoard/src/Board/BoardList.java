package Board;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardList {
	
	private Date d = new Date();
	private SimpleDateFormat  sdf = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss a");
	protected String now = sdf.format(d);
	protected int titleNum;
	
	protected ArrayList<BoardItem> itemList = new ArrayList<>();
	
	public void add(String now, String title, String content) {
		BoardItem temp = new BoardItem(now, title, content);
		itemList.add(temp);
	}
	public void set(int titleNum, String now, String title, String content) {
		BoardItem temp = new BoardItem(now, title, content);
		itemList.set(titleNum, temp);
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		int result = itemList.size();
		while(result>count) {
			for(BoardItem item : itemList) {
				sb.append("\n"+ ++count+".");
				sb.append(item.toString());
			}
		}
		return sb.toString();
	}
	public String toString1() { //제목에 대한 목록
		StringBuilder sb = new StringBuilder();
		int count = 0;
		int result = itemList.size();
		while(result>count) {
			for(BoardItem item : itemList) {
				sb.append("\n"+ ++count+".");
				sb.append(item.toString1());
			}
		}
		return sb.toString();
	}
//	public void test() {
//		add(now+"\n", "제목1 \n", "내용1 \n");
//		add(now+"\n", "제목2 \n", "내용2 \n");
//		add(now+"\n", "제목3 \n", "내용3 \n");
//		add(now+"\n", "제목4 \n", "내용4 \n");
//		System.out.println("===================");
//		System.out.println(itemList);
//		System.out.println("===================");
//		System.out.println(this);
//	}
	
}
 