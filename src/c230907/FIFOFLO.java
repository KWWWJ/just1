package c230907;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class FIFOFLO {
	//first in first out => Queue (클래스에서 내부데이터 저장할때, 혹은 LinkedList나 tree구조)
	//first in last out => Stack (메서드 호출시 사용)
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>(); //Array, LinkedList, ArrayList
		
		System.out.println(q.isEmpty());
		
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		System.out.println(q.isEmpty());
		System.out.println(q);
		System.out.println(q.poll());//빼낸 데이터를 리턴한다.
		System.out.println(q);//앞에서부터 빠진다.
		
		System.out.println("=====================");
		
		Stack<Integer> s = new Stack<>();
		
		System.out.println(s.isEmpty());
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s.isEmpty());
		System.out.println(s);
		System.out.println(s.pop());//빼낸 데이터를 리턴한다.
		System.out.println(s);//마지막부터 빠진다.
	}
}
