package c230908.toDoList;

public class ToDoItem {
	// 우선도, 제목, 내용
	private int priority; //rank;
	private String title;
	private String content;
	
	public ToDoItem(int priority, String title, String content) {
		this.content = content;
		this.priority = priority;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "제목 : "+title+"\n우선도 : "+priority+"\n내용 : "+content;
	}
	// =============================================밑은 출력 변환
	public String toList() {
		return title + " : "+priority;
	}
}
