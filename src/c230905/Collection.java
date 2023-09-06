package c230905;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		//컬렉션(지료구조 = 대이터를 관리하는 정형화된 구조)
		//배열또한 자료구조에 속하나 컬렉션을 사용하면 저장 공간의 크기가 동적으로 변한다.
		//동일한 데이터 타입을 묶어 관리하는 자료구조
		//컬렉션 프레임워크(기능의 알고리듬을 구조화해놓은 것)가 존재한다.
		
		//1.List(ArrayList, Vector, LinkedList)
		//배열과 비슷하나 차이점이라고 한다면 저장공간이 고정적이냐 동적이냐의 차이다.
		//또한 List는 인터페이스로 구현이되어있고 ArrayList는 List의 하위 항목이다.
		
		//1-1. ArrayList
		//List인터페이스를 구현한 클래스중 하나.(상속)
		//동적배열로 구현되어 크기를 동적으로 조절가능
		//인덱스를 통한 빠른 요소 접근성, 추가하거나 제거하는게 가능하다.
		//중간삽입은 느리다.
		
		//List는 인터페이스로서 리스트 동작을 정의.
		
		//알아야할 것:ArrayList와 Array의 차이
		
		String[] arrStrings = new String[] {"가", "나", "다", "라", "마"};
		arrStrings[1] = null; //데이터를 사용하지 않을 때
		arrStrings[2] = null;
		
		for (int i = 0; i<arrStrings.length; i++) {
			System.out.println(arrStrings[i]);
		}
		
		List<String> arrList = new ArrayList<>();
		
		System.out.println(arrList.size());
		
		arrList.add("가");
		arrList.add("나");
		arrList.add("다");
		arrList.add("라");
		arrList.add("마");
		arrList.add("바");
		arrList.add("사");
		arrList.add("아");
		System.out.println("데이터 추가 : "+arrList.size());
		
		for(String string : arrList) {
			System.out.println(string);
		}
		arrList.remove("바");
		arrList.remove("다");
		
		System.out.println("======================");
		
		for(String string : arrList) {
			System.out.println(string);
		}
		System.out.println("데이터 삭제후 : "+arrList.size());
		
		System.out.println("======================");
		
		arrList.add("경일");
		for(String string : arrList) {
			System.out.println(string);
		}
		
		int index = 2;
		
		String element = arrList.get(index);
		System.out.println("인덱스 : "+index+"\r"+"요소 : "+element);
		
		String target = "경일";
		boolean contains=arrList.contains(target);
		if(contains) {
			System.out.println(target+"을/를 찾았다.");
		}
		else {
			System.out.println("없다.");
		}
		
		//add : 요소 추가(가장 후열 혹은 지정된 인덱스로 추가 가능)
		//remove : 요소 삭제(지정된 인덱스로 지정 가능)
		//clear : 모든 데이터 삭제
		
		//get : 인덱스의 에이터를 리턴
		//indexOf : 첫번쨰 위치 리턴
		//lastIndexOf : 마지막 위치를 리턴
		//contains : 있냐 없냐
		
		//size : 길이
		//isEmty : 비어있냐?
		//trimToSize : 데이터 사이즈를 조절
		
		//sort : 정렬
		//reverse : 반전
		
		//선언시
		
		List<String> myList = new ArrayList<>(); //더 유연하고 일반적이다.
		//List인터페이스가 정의한 타입만 사용 가능
		//이후에 LinkedList따위로 바꾸고 싶을 떄 
		//List<String> myList = new LinkedList<>();
		//로 초기화 할 수 있다.
		
		//ArrayList<String>MyList1 = new ArrayList<>();
		//기능은 같다. 
		
		
		
		
		
		
		
		}
}
