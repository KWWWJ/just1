package c230911.stream;

import java.util.Arrays;

public class MatchTest {
	public static void test() {
		int[] arr = {1, 3, 5, 7};
		int[] arr1 = {2, 4, 5, 8, 9};
		
		System.out.println("allMatch");
		System.out.println(Arrays.stream(arr).allMatch(item->item%2 == 0));
		System.out.println(Arrays.stream(arr1).allMatch(item->item%2 == 0));
		System.out.println("============");
		System.out.println("anyMatch");
		System.out.println(Arrays.stream(arr).anyMatch(item->item%2 == 0));
		System.out.println(Arrays.stream(arr1).anyMatch(item->item%2 == 0));
		System.out.println("============");
		System.out.println("noneMatch");
		System.out.println(Arrays.stream(arr).noneMatch(item->item%2 == 0));
		System.out.println(Arrays.stream(arr1).noneMatch(item->item%2 == 0));
		System.out.println("============");
	}
}
