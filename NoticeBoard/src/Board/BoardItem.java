package Board;



public class BoardItem {
	//제목, 글, 시간
	private String now;
	private String title;
	private String content;
	
	public BoardItem(String now, String title, String content) {
		this.now = now;
		this.content = content;
		this.title = title;
	}
	public BoardItem(String now, String title) {
		this.now = now;
		this.title = title;
	}
	@Override
	public String toString() {
		return "제목 : "+title+"\n내용 : "+content+"\n저장일 : "+now;
	}
	public String toString1() { //제목만 따로 출력
		return "제목 : "+title;
	}
}
