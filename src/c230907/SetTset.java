package c230907;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTset {
	//자료구도상에서 중복데이터를 체크
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(); //기본적으로 length에서 지원해주지 않아서 import해줘야 함.
		set.add(1);
		System.out.println(set.size());
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		set.remove(3);
		set.add(4);
		System.out.println(set.size()); //해쉬코드가 같으면 중복으로 처리해 넣지 않는다.(랜덤크래스로 해쉬코드를 바꿔주면 들어간다.)
		//배열이 아니라 [0]를 쓸 수 없다
		
		Iterator<Integer> iterator = set.iterator(); //주소. pointer개념
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		set.clear();
		System.out.println(set.size());
	}
}
