package Object;
class Operations
{
	void Print()
	{
		System.out.println("함수 호출");
	}
	int plus(int a, int b)
	{
		return a+b;
	}
	int minus(int a, int b)
	{
		return a-b;
	}
	int multiply(int a, int b)
	{
		return a*b;
	}
	int divide(int a, int b)
	{
		return a/b;
	}
}
public class FourArithmeticOperations {
	public static void main(String[] agrs)
	{
		Operations count=new Operations();
		count.Print();
		int puls=count.plus(10, 10);
		System.out.println(puls);
		int minus=count.minus(10, 5);
		System.out.println(minus);
		int multiply=count.multiply(puls, minus);
		System.out.println(multiply);
		int divide=count.divide(multiply, puls);
		System.out.println(divide);
		
	}

}
