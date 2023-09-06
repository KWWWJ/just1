package c230829.calculator;

public interface SquareInterface {
		default double square(double num1, double num2) {
			double num3 = num1;
			for(int i=1; i<num2; i++) {
				num1*=num3;
			}
			return num1;
		}
}
