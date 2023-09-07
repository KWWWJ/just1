package c230907;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		//데이터에 이름을 붙여준다.
		
		map.put("아무개1", 7);
		map.put("아무개2", 8);
		map.put("아무개3", 23);
		map.put("아무개4", 3);
		map.put("아무개5", 7);
		System.out.println(map.size());
		
		System.out.println(map.get("아무개1"));
		map.put("아무개1", 13);
		System.out.println(map.size());
		System.out.println(map.get("아무개1"));
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		System.out.println(iterator.next()+" : "+map.get(iterator.next()));
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		keySet.clear();
		System.out.println(keySet.size());
	}
}
