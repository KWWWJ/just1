package ReferenceType;
//import java.util.Arrays;
import java.util.Scanner;


public class ArrayClass {
	public static void main(String[] agrs)
	{
		//Arrays
		//배열을 다루는 유용한 매서드들을 제공하는 클레스
		//1.Sort(자주사용함)
		/*
		int[]numberArr= {5,3,10,11,2};
		
		//System.out.print("정렬된 배열");
		
		Arrays.sort(numberArr);
		for (int i : numberArr)
		{
			//System.out.print(i+" ");
		}
		
		//Random random=new Random();
		int[] numbers=new int[10];
		for(int i=0; i<numbers.length; i++) 
		{
			
		}
		System.out.println();
		for (int number : numbers)
		{
			Arrays.sort(numbers);
			//System.out.print(number+" ");
		}
		*/
		//2.copyOf 배열 복사 매서드
		//배열을 지정된 길이러 복사
		//원본보다 큰 길이로 복사히면 0 혹은 null로 채워준다.
		
//		int[] iArr= {1,2,3,4,5};
//		int[] newArr=Arrays.copyOf(iArr, 3); //복사할 것의 길이를 설정
//		System.out.println();
//		System.out.println("원본배열"+Arrays.toString(iArr));
//		System.out.println("새로운배열"+Arrays.toString(newArr));
//		
//		//배열 크기기가 꽉 찼을 떄만 두배로 늘리고 싶을 떄.
//		
//		int[] originalArr=new int[5]; //초기배열
//		//현재 배열의 크기를 나타내는 변수
//		int size=0;
//		
//		for(int i=0; i<10; i++)
//		{
//			if(size==originalArr.length)
//			{
//				//배열이 꽉 찼을 경우 크기를 두배로 늘린다.
//				int[] nArr=Arrays.copyOf(originalArr, originalArr.length*2);
//				originalArr=nArr;//새로운 배열을 원래 배열로 설정하여 참조변경
//			}
//			originalArr[size]=i; //데이터를 배열에 추가
//			size++;//배열크기증가
//		}
//		//출력
//		
//		for(int i=0; i<size; i++)
//		{
//			System.out.print(originalArr[i]+" ");
//		}
//		//3.equals
//		//두 1차원 배열리 동일한지를 길이와 요소를 비교해 true와 false를 리턴한다.
//		int[] arr1= {1,2,3,4,5};
//		int[] arr2= {1,2,3,4,5};
//		int[] arr3= {5,4,3,2,1};
//		
//		boolean isEquals=Arrays.equals(arr1, arr2);
//		boolean isEquals1=Arrays.equals(arr1, arr3);
//		
//		System.out.println(isEquals);
//		System.out.println(isEquals1);
//		
//		//2차원 이상의 배열을 비교할때 사용
//		int[][] array1= {{1,2},{3,4}};
//		int[][] array2= {{1,2},{3,4}};
//		int[][] array3= {{3,4},{5,6}};
//		
//		boolean isEqauls2=Arrays.deepEquals(array1, array2);
//		boolean isEqauls3=Arrays.deepEquals(array2, array3);
//		
//		System.out.println(isEqauls2);
//		System.out.println(isEqauls3);
//		
//		
//		//그외....
//		//fill(채움), binarySearch(정렬된 배열에서 특정 값을 검색한다.), copyOfRange. 
//		//프로그래밍 언어에 국한되지 않고 많이 사용하는 참조자료형에는 String이 있다.
//		
//		
//		//String 클래스의 매서드
//		//1.length() : 문자열의 길이 리턴타입은 int
//		//2.charAT() : 문자열에서 특수한 위치의 인덱스에 위치해 있는 문자를 확인할때. 리턴타입은 char
//		//3.indexOf() : 문자열에서 특정 문자나 특정 문자열을 앞에서부터 찾아 위치값을 알아낸다. 리턴타입은 integer
//		
//		//charAT()
//		String text="hello, wolrd";
//		int idx=7;
//		char character=text.charAt(idx);
//		
//		System.out.println("character의 idx : "+idx+": "+character);
//		
//		String word="java";
//		String reverseString="";
//		
//		//문자열의 인덱스는 0부터 시작하므로 길이가 n이라면 인덱스 범위는 n-1임.
//		for(int i=word.length()-1; i>=0; i--) //word의 문자열을 역순으로 나열
//		{
//			reverseString+=word.charAt(i);//문자열을 계속해서 새로 생성하기 때문에 String builder를 사용하는 것을 더 권장함.
//		}
//		System.out.println(reverseString);
		
		//4.subString
		//주어진 시작 인덱스부터 끝 인덱스까지 부분 문자열을 반환
//		String text="Hello, world";
//		int idx=7;
//		
//		String subText=text.substring(idx); //함수가 같으나 매개변수가 다른 것을 함수 오버로딩이라 한다.
//		
//		System.out.println(subText);
//		
//		String number="941023-1234567";
//		
//		String birth=number.substring(0, 6);//0=startindex 7=endindex(주어진 인덱스의 -1만큼을 표기. 즉 실제로는 인덱스 6까지 표현한다.)
//		System.out.println(birth);
		
		//5.indexOf 
		//문자열에서 특정 문자나 문자열이 처음으로 등장하는 인덱스를 반환한다.
		//찾지 못하면 -1을 리턴한다.
		
//		String text="Hello, world";
//		
//		char target='w';
//		
//		int index=text.indexOf(target);
//		
//		if(index !=-1)
//		{// 찾았다면
//			System.out.println("찾았다."+index);
//		}
//		else
//		{
//			System.out.println("없다.");
//		}
		
//		String text="java programming";
//		String target="programming";
//		int index=text.indexOf(target);
//		if(index !=-1)
//			{// 찾았다면
//				System.out.println("찾았다."+index);
//			}
//			else
//			{
//				System.out.println("없다.");
//		}
		
		//6.isEmpty
		//문자열이 비어있냐? 길이가 0인지 확인. 비어있으면 true 아니면 false.
		
//		Scanner scanner=new Scanner(System.in);
//		
//		System.out.println("문자열을 입력해라.");
//		
//		String input=scanner.nextLine();
//		if(input.isEmpty())
//			{// 찾았다면
//				System.out.println("비어있다.");
//			}
//			else
//			{
//				System.out.println(input);
//			}
//		
//		scanner.close();
//		String[] strArr= {"Hello", "", "Java", " ", "World",""};//" "도 엄연히 한 공간을 먹고있다.
//		int count=0;
//		for (String string: strArr)
//		{
//			if (string.isEmpty())
//			{
//				count++;
//			}
//		}
//		System.out.print(count);
		
		//7.split
		//문자열리 주어지면 문자열을 특정 구문자를 기준으로 분리한다음 문자열 배열로 반환
		
//		String text="Hello, World! Java programming";
//		String[] words=text.split(" ");//공백을 구분자로 사용하여 분리한다는 뜻
//		
//		for(String word: words)
//		{
//			System.out.println(word);
//		}
//		
//		String data="apple,banana;mango|test";//구분자를 여러개 사용할 수도 있다.
//		String[]items=data.split("[,;|]");//대괄호 안에 구분자로 사용할 녀석들을 넣는다
//
//		for(String item:items)
//		{
//			System.out.println(item);
//		}
		//입력받은 문장의 단어가 몇 개인가를 공백으로 구분
		//input : I am a boy라면 4개가 나와야 함.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("입력해라 : ");
		String input=" ";
		int count=0;
		input=scanner.nextLine();
		String[] words=input.split(" ");
		for(String word : words)
		{
			if(!word.isEmpty())//input.split(word) != null
			{
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
		
	}

}
