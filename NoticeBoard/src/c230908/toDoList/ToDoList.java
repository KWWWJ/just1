package c230908.toDoList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ToDoList {
	//아이템 목록 출력 방법 : "제목 : 우선도"
	ToDoItem[] temp; //그냥으로는 중복체크가 어렵다
	//중복처리 => Set => 제목을 기준으로 중복처리 << Set은 값만있다.
	//2개로 데이터를 다ㅣ룬다 => Map +> 키와 값 => 키 : 제목, 값 : Item
	private Map<String, ToDoItem> hashList = new HashMap<>();
	//순서를 만들 수 있는 , 정렬할 수 있는 => 정렬해주는 녀석이 무엇이냐?
	//TreeSet, HashSet, HashMap, TreeMap?
	private Map<Integer, List<ToDoItem>> treeList = new TreeMap<>(Comparator.reverseOrder());//여러개의 아이템을 넣고 싶으면 배열로 처리
	
	public void add(int priority, String title, String content) { //throws Exception
		//매개변수로 ToDoItem item으로 넣으면 매인에서 새로 만들어야 한다.
		if(hashList.get(title) != null) {
			System.out.println("제목있음");
//			throw new Exception("제목있음");
			return;
		}
		
		List<ToDoItem> list = treeList.get(priority);
		if(list == null) {
			list = new ArrayList<ToDoItem>();
			treeList.put(priority, list);
		}
		ToDoItem temp = new ToDoItem(priority, title, content);
		hashList.put(title, temp);
		list.add(temp);
	}
	
	public ToDoItem getItem(String title) {
		return hashList.get(title);
	}
	
	@Override
	public String toString() { //출력 형식
		StringBuilder sb = new StringBuilder();
		
		Iterator<Integer> treeIt = treeList.keySet().iterator();
		int count = 0;
		while(treeIt.hasNext()) {
			List<ToDoItem> tempList = treeList.get(treeIt.next());
			for(ToDoItem item : tempList) {
				sb.append("\n"+ ++count+ ". ");
				sb.append(item.toList());
			}
		}
		
		return sb.toString();
	}
	
	public void test() {
		add(1, "te", "st");
		add(1, "asdf", "ghjk");
		add(2, "te", "st");
		add(2, "qwer", "tyui");
		System.out.println("===================");
		System.out.println(hashList);
		System.out.println("===================");
		System.out.println(treeList);
		System.out.println("===================");
		
		System.out.println(this);
		
		System.out.println(getItem("te"));
	}
}
