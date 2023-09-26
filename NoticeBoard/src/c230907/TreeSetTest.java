package c230907;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		
		tree.add(6);
		tree.add(12);
		tree.add(7);
		tree.add(1);
		System.out.println(tree.size());
		System.out.println("=====================");
		for(Integer i : tree) {
			System.out.println(i); //순서대로 나온다.
		}
		System.out.println("=====================");
		System.out.println("처음은 "+tree.first());
		System.out.println("마지막은 "+tree.last());
		System.out.println("7 미만은 "+tree.lower(7));
		System.out.println("7 초과는 "+tree.higher(7));
		System.out.println("7 이하는 "+tree.floor(7));
		System.out.println("7 이상은 "+tree.ceiling(7));
		System.out.println("=====================");
		
		NavigableSet<Integer> descendingTreeSet = tree.descendingSet();
//		for (Integer i : descendingTreeSet) { //내림차순
			System.out.println(descendingTreeSet); //아마 배열처리가 되어있는듯?
//		}    
		System.out.println("=====================");
		System.out.println("7이상");
		NavigableSet<Integer> rangeTreeSet = tree.tailSet(7, true); //true면 이상, false는 초과
		for (Integer i : rangeTreeSet) {
			System.out.println(i);
		}
		System.out.println("=====================");
		System.out.println("7이하");
		NavigableSet<Integer> rangeTreeSet2 = tree.headSet(7, true); 
		for (Integer i : rangeTreeSet2) {
			System.out.println(i);
		}
		System.out.println("=====================");
		System.out.println("1초과, 12미만");
		NavigableSet<Integer> rangeTreeSet3 = tree.subSet(1, false, 12, false); 
		for (Integer i : rangeTreeSet3) {
			System.out.println(i);
		}
		
	}
}
