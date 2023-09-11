package Board;



public class BoardItem {
	//제목, 글, 시간
	private String now;
	private String title;
	private String content;
	private String comment;
	
	public BoardItem(String now, String title, String content, String comment) {
		this.now = now;
		this.content = content;
		this.title = title;
		this.comment = comment;
	}

	public String getListAll() {
		return "제목 : "+title+"\n내용 : "+content+"\n댓글 : "+comment+"\n저장일 : "+now;
	}
	public String getTitle() { //제목만 따로 출력
		return "제목 : "+title;
	}
}
