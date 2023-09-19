package c230911.stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class OptionTest {
	public static void test() {
		int[] arr = {1, 3, 5, 7};
		int[] arr1 = {2, 4, 5, 8, 9};
		
		System.out.println("filter (count)");
		System.out.println
		(Arrays.stream(arr).filter(item->item%3 == 0).count());
		System.out.println
		(Arrays.stream(arr1).filter(item->item%3 == 0).count());
		System.out.println("============");
		System.out.println("sum");
		System.out.println
		(Arrays.stream(arr).sum());
		System.out.println
		(Arrays.stream(arr1).sum());
		System.out.println("============");
		System.out.println("average");
		System.out.println
		(Arrays.stream(arr).average().getAsDouble()); //출력을 변환(타입은 그대로고 보이는 형식만 달라진다.)
		System.out.println
		(Arrays.stream(arr1).average().getAsDouble()); //getAsDoublie안붙이면 앞에 수시거 붙는다.
		System.out.println("============");
		System.out.println("max, min");
		System.out.println
		(Arrays.stream(arr).max().getAsInt());
		System.out.println
		(Arrays.stream(arr1).min().getAsInt());
		System.out.println("============");
		
		int[] arr2 = {};
		try {
			System.out.println("emty average");
			System.out.println(Arrays.stream(arr2).average());
			//배열이 비어있으면 문제가 생긴다. try-catch 문으로 잡아준다
			OptionalDouble od = Arrays.stream(arr2).average();
			System.out.println("============");
			if(od.isPresent()) {
				System.out.println(od.getAsDouble());
			}
			else {
				System.out.println("emty average");
				System.out.println("none");
				System.out.println("============");
			}
			System.out.println("if arr has any num,  average");
			System.out.println(Arrays.stream(arr)
					.average()
					.orElse(0.0));
			System.out.println(Arrays.stream(arr2)
					.average()
					.orElse(0.0));
			System.out.println("============");
			
			System.out.println("if not emty arr, average");
			Arrays.stream(arr)
			.average()
			.ifPresent(item->System.out.println("예외 : "+item));
			Arrays.stream(arr2)
			.average()
			.ifPresent(item->System.out.println("예외 : "+item));
			System.out.println("============");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("if not emty arr, calculation");
		System.out.println(	Arrays.stream(arr).reduce(0, (a, b)->a+b / 2+1));
		System.out.println("============");
		//StringBuilder로 만든 객체를 0의 자리에 넣고 뒤에 수식을 넣으면 계속해서 더할 수 있다. 
		//ArrayList로 객체를 만들고 뽑아낼 수도있다.
		//1, 3, 5, 7, 9
		//0.5 int 0 / 1.5 int 1/ 이런식이라 본래라면 위의 식으로는 12가 나와야 하지만 소실되어 10이 되었다.
	}
}
