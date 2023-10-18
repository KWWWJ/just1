package c230926.board;

public class BoardVO {
	private int id;
	private String name;
	private String title;
	private String content;
	private String createAt;
	
	public BoardVO(int id, 
			String name,
			String title,
			String content,
			String createAt
			) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.content = content;
		this.createAt = createAt;
		
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public String getcontent() {
		return content;
	}
	public String getCreateAt() {
		return createAt;
	}


}
