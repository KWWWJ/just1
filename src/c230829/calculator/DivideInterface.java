package c230829.calculator;

public interface DivideInterface {
	default double divide(double num1, double num2) {
		return num1/num2;
	}
}
