package c230829.calculator;

public interface MinusInterface {
	default double minus(double num1, double num2) {
		return num1-num2;
	}
}
