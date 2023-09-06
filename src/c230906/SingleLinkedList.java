package c230906;

import java.util.Scanner;

class Node<T>{
	T data;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
}
class SLLStack<T>{
	private Node<T>top;
	private Node<T>floor;
	private int size = 0;
	
	public SLLStack() {
		this.top = null;
	}
	private Node<T> search(int index){
		
		Node<T> start = floor;
		
		for (int i=0; i<index; i++) {
			start = start.next;
		}
		return start;
	}
	public void floor(T push) {
		Node<T> newNode = new Node<>(push);
		newNode.next = floor;
		floor = newNode;
		size++;
		
		if(floor.next == null) {
			floor = top;
		}
		
	}
	public void add(T push) {
		Node<T> newNode = new Node<>(push); 
			if(size == 0) {
				floor(push);
				return;
			}
			top.next = newNode;
			top = newNode;
			size++;
	}
	
	public T remove(int index) {
		
		Node<T> prevNode = search(index - 1);
		Node<T> removeNode = prevNode.next;
		Node<T> nextNode = removeNode.next;
		
		T element = removeNode.data;
		
		prevNode.next = nextNode;
		
		if(prevNode.next == null) {
			top = prevNode;
		}
		
		removeNode.next = null;
		removeNode.data = null;
		size--;
		return element;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public T get(int index) {
		
		return search(index).data;
	}
	
}

public class SingleLinkedList {
	//LinkedList로 Stack 구현
	//제네릭 형식
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SLLStack<Integer> stack = new SLLStack<>();
		
		int input;
		
		System.out.println("추가할 데이터를 입력");
//		for(int i=0; i>=0; i++) {
			input = scan.nextInt();
			stack.add(input);
//		}
		System.out.println("저장");
		
//		for(int i=0; i<stack.get(i); i++) {
//			System.out.println(stack.get(i));
//		}
		System.out.println(stack.get(0));
		System.out.println("=====================");
		System.out.println("차감순");
			
	}
	
}
