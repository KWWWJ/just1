package c230906;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;





class Stack<T>{
	//스텍 풀이
	
	private List<T>elemList;
	public Stack() {
		elemList = new ArrayList<>();
	}
	public void push(T item) {
		elemList.add(item);
	}
	public T pop() {
		if(!isEmpty()) {
			throw new EmptyStackException();
		}
		int top = elemList.size();
		
		T item = elemList.get(top);
		elemList.remove(top);
		
		return item;
	}
	public boolean isEmpty() {
		return elemList.isEmpty();
	}
	public int size() {
		return elemList.size();
	}
	
}

public class ListCollection {
	
	public static void main(String[] args) {
	 
		 //LinkedList 연결된 리스트
		 //인덱스의 개념이 없다. (노드끼리 포인터를 사용해 서로를 가리켜 연결한다.)
		 //중간에 데이터를 insert, delete하기에 유용하다.
		 //하지만 특정 위치에 빠르게 엑세스를 하려면 순차적으로 탐색해야하는 단점이 있다.
		 
		 //node : 데이터와 다음 데이터를 가르키는 포인터가 들어간다.
		 //single / double
		 
		 //single : node의 pointer가 가리키는 방식이 단방향이다
		 //[ node ]-pointer->[ node ]
		 
		 //double : pointer가 이전 데이터까지 가리키는 양방향 연결이다.
		 //[ node ]<-pointer->[ node ]
		 
		 //데이터를 node 사이에 넣고 싶다면 새로운 노드를 만들어
		 //기존에 서로를 가르키던 pointer를 때내 새로만든 노드에 붙여준다.
		
		List<String> linkedList=new LinkedList<>();
		linkedList.add("사과");
		linkedList.add("바나나");
		linkedList.add("체리");
		
		System.out.println("링크드 리스트 순회하기");
		for(String fruit : linkedList) {
			System.out.println(fruit);
		}
		linkedList.add(1,"오랜지");
		linkedList.remove("바나나");
		
		String elem=linkedList.get(2);
		System.out.println("2번째 : "+elem);
		
		System.out.println("사이즈 : "+linkedList.size());
		
		
		boolean isApple=linkedList.contains("사과");
		System.out.println(isApple);
		
		
		Object[] array = linkedList.toArray();
		for (Object object : array) {
			System.out.println(object.toString());
		}
		
		
		linkedList.clear();
		System.out.println("비어있나? : "+linkedList.isEmpty());
	}
}