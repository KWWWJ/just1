package c230908.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	public static void test() {
		Set<String> set = new HashSet<>();
		set.add("아무개1");
		set.add("아무개2");
		set.add("아무개3");
		set.add("아무개4");
		set.add("아무개5");
		set.add("아무개6");
		set.add("아무개7");
		set.add("아무개8");
		set.add("아무개9");

//		set.toArray(); //오브젝트타입으로 변환되어 클래스를 넣으면 클래스의 메서드를 사용할 수 없다.
		
		Stream<String> stream = set.stream(); //한번 쓰면 끝. 다시 사용하는게 불가능하다.
		stream.forEach(item->System.out.println(item)); //스트림이 배열, 포이치가 포를 가르키니 받을 타입과 변수를 입력한다.
		
		List<String> list = new ArrayList<>();
		list.add("아무개1");
		list.add("아무개2");
		list.add("아무개3");
		list.add("아무개4");
		list.add("아무개5");
		list.add("아무개6");
		list.add("아무개7");
		list.add("아무개8");
		list.add("아무개9");
		Stream<String> stream1 = list.stream();
		stream1.forEach(item->System.out.println(item));
		
		Set<Student> students = new HashSet<>(); //Set이 인터페이스이기 때문에 new를 사용할 수 없다.
		students.add(new Student("권원준", 85));
		students.add(new Student("임현규", 98));
		students.add(new Student("김동선", 90));
		students.add(new Student("이민규", 80));
		students.add(new Student("김남균", 90));
		students.add(new Student("송성민", 70));
		students.add(new Student("박정완", 75));
		students.add(new Student("한상윤", 100));
		students.add(new Student("임주환", 80));
		Stream<Student> stream2 = students.stream();
		IntStream scores = stream2.mapToInt(item->item.getScore());//.map(i ->- i).sorted().map(i ->- i);
//		stream2.forEach(item->System.out.println(item));
		double avg = scores.average().getAsDouble();
		System.out.println("avg : "+avg);
//		scores.forEach(item->System.out.println(item));//정수만 뽑는 타입
		System.out.println("=============");
		
		IntStream scoresDis = students.stream().mapToInt(item->item.getScore()).distinct();//중복처리
//		int[] temp = scoresDis.toArray(new int[0]); //만약 int가 아니라면 int로 바꾼다.
		scoresDis.forEach(item->System.out.print(item+", "));
		System.out.println();
		System.out.println("=============");
		
		Stream<Student> stream3 = students.stream().sorted(Comparator.reverseOrder());//이거 쓰려면 compareTo작성해줘야 함
		stream3.forEach(item->System.out.println(item));
		System.out.println("=============");
		
		Stream<Student> stream4 = students.stream().filter(item->{return item.getScore() > avg;});
		stream4.forEach(item->System.out.println(item));
		
	}
}
