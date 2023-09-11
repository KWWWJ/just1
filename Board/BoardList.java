package Board;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardList {
	
	private Date d = new Date();
	private SimpleDateFormat  sdf = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss a");
	protected String now = sdf.format(d);
	protected int titleNum;
	private int index;
	
	protected ArrayList<BoardItem> itemList = new ArrayList<>();
	
	public void add(String now, String title, String content, String comment) {
		BoardItem temp = new BoardItem(now, title, content, comment);
		itemList.add(temp);
	}
	public void set(int titleNum, String now, String title, String content, String comment) {
		BoardItem temp = new BoardItem(now, title, content, comment);
		itemList.set(titleNum, temp);
	}
	public boolean getIndex(int index) {
		this.index = index;
		if(index > itemList.size()) {
			System.out.println("존재하지 않는 글입니다.");
			return false;
		}
		return true;
	}
	public String getListAll() {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		int result = itemList.size();
		while(result>count) {
			for(BoardItem item : itemList) {
				sb.append("\n"+ ++count+".");
				sb.append(item.getListAll());
			}
		}
		return sb.toString();
	}
	public String getTitle() {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		int result = itemList.size();
		while(result>count) {
			for(BoardItem item : itemList) {
				sb.append("\n"+ ++count+".");
				sb.append(item.getTitle());
			}
		}
		return sb.toString();
	}
	
}
 