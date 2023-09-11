package Board;

import java.util.ArrayList;

public class BoardComment {
	
	private int index;
	
	protected ArrayList<BoardItem> commentList = new ArrayList<>();
	public void addComment(String now, String comment) {
		BoardItem temp = new BoardItem(now, comment);
		commentList.add(temp);
	}
	public void setComment(int titleNum, String now, String comment) {
		BoardItem temp = new BoardItem(now, comment);
		commentList.set(index, temp);
	}
	public String getListAll() { 
		StringBuilder sb = new StringBuilder();
		int count = 0;
		while(commentList.size()>count) {
			for(BoardItem item : commentList) {
				sb.append("\n"+ ++count+".");
				sb.append(item.getComment());
			}
		}
		return sb.toString();
	}
}
