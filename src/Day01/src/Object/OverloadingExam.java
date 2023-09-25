package Object;

import java.util.Arrays;

public class OverloadingExam {
	public static void main(String[] agrs)
	{
		//오버로딩
		//한 클래스 내에서 같은 이름의 메서드를 여러개 정의하는 것
		//1. 메서드 이름이 같아야함.
		//2. 매개변수 개수 혹은 타입이 달라야 함.
		//ㄴ메서드 이름이 같아도 매개변수가 다르면 구별될 수 있기 때문에 오버로딩 가능.
		System.out.println();//얘도 오버로딩임.
		//f3을 사용하면 해당 명령어가 어떻게 오버로딩이 되어있는지 알 수 있다.
		//ㄴ만약 만들었는데 없다면 위치를 표기하기도 함.
		
		PrintArray(new int[] {1,2,3,4});
		
		int[] arr= {1,2,3,4,5,6};
		PrintArray(arr);//매개변수로 전달해서 출력
		
		int sum=calcuLateSum(arr);
		System.out.println(sum);
		
	}
	//매개변수의 이름만 다르고 매개변수의 타입이 같기 때문에 오버로딩X
//	int add(int a, int b) 
//	{
//		return a+b;
//	}
//	int long(int x, int y) 
//	{
//		return x+y;
//	}
	//매개변수의 타입이 중복이여도 순서가 다르면 문제가 생기지 않는다.
	//호출될 때 매개변수 같이 구분되므로 오버로딩으로 간주한다.
//	long add(int a, long b)
//	{
//		return a+b;
//	}
//	long add(long a, int b)
//	{
//		return a+b;
//	}

	int sum(int a, int b)
	{
		return a+b;
	}
	long sum(long a, long b)
	{
		return a+b;
	}
	int sum(int[] arr) //참조형을 사용하는 경우가 많아 중요함.

	{
		int res=0;
		for(int i=0; i<arr.length; i++)
		{
			res+=arr[i];
		}
		return res;
	}


	static void PrintArray(int[] a)
	{
		System.out.println(Arrays.toString(a));
	}
	static int calcuLateSum(int[]arr)
	{
		int sum=0;
		for(int num : arr) {
			sum+=num;
		}
		return sum;
	}
	//배열최댓값 구하기
	static int findMaxValue(int[] arr)
	{
		int max=arr[0];
		for(int num:arr)
		{
			if(num>max)
			{
				max=num;
			}
		}
		return max;
	}
	//배열의 평균구하기
	static double Average(double[] arr)
	{
		double sum=0;
		for(double value : arr)
		{
			sum+=value;
		}
		return sum/arr.length;
	}
	//짝수 구하기.
	static int EvenNumber(int[]arr)
	{
		int count =0;
		for (int num:arr)
		{
			if (num%2==0)
			{
				count++;
			}
		}
		return count;
	}
	
	//특정 값이 든 인덱스 찾기
	static int findIndexOfvalue(double[]arr, double target)
	{
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]==target) //현재 요소다 타겟과 같다면
			{
				return i; //해당 값을 뱉어라
			}
		}
		return -1;
	}
	}
