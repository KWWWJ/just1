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
	public BoardItem(String now, String title) {//set으로 내용 수정시 사용
		this.now = now;
		this.title = title;
	}
	@Override
	public String toString() {
		return "제목 : "+title+"\n내용 : "+content+"\n댓글 : "+comment+"\n저장일 : "+now;
	}
	public String toString1() { //제목만 따로 출력
		return "제목 : "+title;
	}
}
