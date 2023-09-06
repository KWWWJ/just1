package c230829.calculator;

public interface MultipiyInterface {
	default double multiply(double num1, double num2) {
		return num1*num2;
	}
}
