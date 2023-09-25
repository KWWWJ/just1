package ClassPractis;

import java.util.Scanner;

class SwitchOperations 
{
	Operrator operator=new Operrator();
	
	Scanner scan1=new Scanner(System.in);
	Scanner scan2=new Scanner(System.in);
	char input1=' ';
	double input2=0;
	double input3=0;
	double plus=0;
	double minus=0;
	double divide=0;
	double multiply =0;
	double count=0;
	
	public int SwitchOperations()
	{
			System.out.println("계산 시작");
			input2=scan1.nextDouble();
			char input1=scan2.nextLine().charAt(0);
			int number=(int)input1;
			
			if(input1=='+')
			{
				number=43;
			}
			else if(input1=='-')
			{
				number=45;
			}
			else if(input1=='/')
			{
				number=47;
			}
			else if(input1=='*')
			{
				number=42;
			}
			
			switch(number)
			{
			case 43:
			{
				input3=scan1.nextDouble();
				System.out.println(Operrator.plus(input2, input3));
				count+=plus;
				break;
			}
			case 45:
			{
				input3=scan1.nextDouble();
				System.out.println(Operrator.minus(input2, input3));
				count+=minus;
				break;
			}
			case 47:
			{
				input3=scan1.nextDouble();
				System.out.println(Operrator.divide(input2, input3));
				count+=divide;
				break;
			}
			case 42:
			{
				input3=scan1.nextDouble();
				System.out.println(Operrator.multiply(input2, input3));
				count+=multiply;
				break;
			}
			}
			scan1.close();
			scan2.close();
			return 0;
	}
}
