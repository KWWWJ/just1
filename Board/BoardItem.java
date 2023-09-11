package Board;



public class BoardItem {
	//제목, 글, 시간
	private String now;
	private String title;
	private String content;
	private String comment;
	
	public BoardItem(String now, String title, String content) {
		this.now = now;
		this.content = content;
		this.title = title;
	}
	public BoardItem(String now, String comment) {
		this.comment = comment;
		this.now = now;
	}
	public String getListAll() {
		return "제목 : "+title+"\n내용 : "+content+"\n저장일 : "+now;
	}
	public String getTitle() { //제목만 따로 출력
		return "제목 : "+title;
	}
	public String getComment() {
		return "댓글 : "+comment+" ["+now+"]";
	}
}
