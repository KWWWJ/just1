package ClassPractis;

class Add
{
	double a;
	double b;
	double plus;
	double minus;
	double divide;
	double multiply;
	
	static double plus(double a, double b)
	{
		double plus=a+b;
		return plus;
	}
	static double minus(double a, double b)
	{
		double minus=a-b;
		return minus;
	}
	static double divide(double a, double b)
	{
		double divide=a/b;
		return divide;
	}
	static double multiply(double a, double b)
	{
		double multiply=a*b;
		return multiply;
	}
}

public class Test 
{
	public static void main(String[] agrs)
	{
		Add.plus(3, 4);
		System.out.println(Add.minus(3, 4));
	}
}
